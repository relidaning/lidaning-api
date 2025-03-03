package xyz.lidaning.random;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

@Slf4j
public class RandomObjectUtil{


    public static <T> T randomInstance(Class<T> t) throws Exception{
        T o = t.getDeclaredConstructor().newInstance();
        Field[] fields = t.getDeclaredFields();
        java.util.Random random=new java.util.Random();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Field f: fields){
            String setter="set"+f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1);
            Method set = o.getClass().getMethod(setter, f.getType());

            Annotation[] annos = f.getDeclaredAnnotations();
            Object value = null;
            for(Annotation anno: annos){
                if(anno instanceof Random){
                    Random ran = (Random) anno;
                    try{
                        if(ran.value().length>0 && !ran.value()[0].equals("")){
                            String[] values = ran.value();
                            value = values[random.nextInt(values.length)];
                        }else if(ran.integers().length>1||(ran.integers().length==1&&ran.integers()[0]!=0)){
                            int[] integers = ran.integers();
                            value = integers[random.nextInt(integers.length)];
                        }else if(ran.dates().length>0 && !ran.dates().equals("")){
                            String[] dateStrings = ran.dates();
                            value = sdf.parse(dateStrings[random.nextInt(dateStrings.length)]);
                        }
                        set.invoke(o, value);
                    } catch(IllegalArgumentException e){
                        log.error("IllegalArgumentException, clazz: "+ o.getClass() +", field: "+f+", anno: "+ 
                            anno +", value:" + value);
                        throw e;
                    }
                }
            }
        }
        return o;
    }

    public static void main(String[] args) throws Exception {
        Student random1 = RandomObjectUtil.randomInstance(Student.class);
        Student random2 = RandomObjectUtil.randomInstance(Student.class); 
        Student random3 = RandomObjectUtil.randomInstance(Student.class); 
        Student random4 = RandomObjectUtil.randomInstance(Student.class); 
        log.info("Student:"+random1);
        log.info("Student:"+random2);
        log.info("Student:"+random3);
        log.info("Student:"+random4);
    }
}
