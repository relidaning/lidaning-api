package xyz.lidaning.expired;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Slf4j
public class ExpiredUtil {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InterruptedException {
        Demo bean = new Demo();
        bean.setDate(new Date());
        log.debug("bean.astring: {}", bean.getDate());
        ExpiredUtil.watch(bean);
        Thread.sleep(1000*6);
        Date aString = bean.getDate();
        log.debug("bean.astring: {}", aString);

    }

    public static void watch(Object o) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            if(!field.isAnnotationPresent(ExpiredAt.class))
                continue;
            ExpiredAt anno = field.getAnnotation(ExpiredAt.class);
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
//            Method getter = o.getClass().getMethod("get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1), null);
            Method setter = o.getClass().getMethod("set"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1), fieldType);
//            Object fileVal = getter.invoke(o, null);
//            log.debug("[x] field name: {}, value: expired time: {}", fieldName, fileVal, anno.value());
            if(anno.value()==0)
                continue;
            Timer timer = new Timer();
            TimerTask task=new TimerTask() {
                @SneakyThrows
                @Override
                public void run() {
                    Object nullObj=null;
                    setter.invoke(o, nullObj);
                    log.info("[x] task excuted @{}", new Date());
                }
            };
            timer.schedule(task, anno.value());
        }
    }
}

@Data
class Demo{
    @ExpiredAt(1000*5)
    private Date date;
}
