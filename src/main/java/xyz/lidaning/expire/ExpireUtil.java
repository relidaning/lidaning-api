package xyz.lidaning.expire;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Slf4j
public class ExpireUtil {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, 
            InterruptedException, ParseException {
        Demo expireBean = new Demo();
        Demo noneOfThisBusinessBean = new Demo();
        expireBean.setDate(new Date());
        noneOfThisBusinessBean.setDate(new Date());
        ExpireUtil.watch(expireBean);

        Thread.sleep(1000*60*5);
        log.debug("expireBean: {}", expireBean);
        log.debug("expireBean: {}", noneOfThisBusinessBean);

    }

    public static void watch(Object o) throws IllegalAccessException, NoSuchMethodException, 
                    InvocationTargetException, ParseException {
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now=new Date();
        long expire_delay=0l;
        for (Field field : fields) {
            if(!field.isAnnotationPresent(Expire.class))
                continue;
            Expire anno = field.getAnnotation(Expire.class);
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
//            Method getter = o.getClass().getMethod("get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1), null);
            Method setter = o.getClass().getMethod("set"+fieldName.substring(0, 1).toUpperCase()+
                fieldName.substring(1), fieldType);
//            Object fileVal = getter.invoke(o, null);
//            log.debug("[x] field name: {}, value: expired time: {}", fieldName, fileVal, anno.value());
            if(anno.in()!=0){
                expire_delay=anno.in()*(anno.type().equals(ExpireType.SECONDS)?1000:
                    (anno.type().equals(ExpireType.MINITES)?60000:anno.type().equals(ExpireType.HOURS)?3600000:
                    (anno.type().equals(ExpireType.DAYS)?86400000:1)));
            }else if(!anno.at().equals("")){
                Date expire_date = sdf.parse(anno.at());
                if(expire_date.before(now)) expire_delay=0l;
                else expire_delay = expire_date.getTime()-now.getTime();
            }else continue;
            Timer timer = new Timer();
            TimerTask task=new TimerTask() {
                @SneakyThrows
                @Override
                public void run() {
                    Object nullObj=null;
                    setter.invoke(o, nullObj);
                    log.info("[x] ExpireUtil cleared {}.{} @{}", aClass, fieldName, new Date());
                }
            };
            timer.schedule(task, expire_delay);
            
        }
    }
}

@Data
class Demo{
    @Expire(at="2025-02-21 23:00:00")
    private Date date;
    @Expire(in=10, type=ExpireType.SECONDS)
    private String name;

    @Override
    public String toString(){
        return this.date+","+this.name;
    }
}
