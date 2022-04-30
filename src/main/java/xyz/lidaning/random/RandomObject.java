package xyz.lidaning.random;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Slf4j
public class RandomObject<T>{

    Class<T> t;

    public RandomObject(Class<T> t){
        this.t = t;
    }

    public T random() throws IllegalAccessException, InstantiationException {
        Object o = t.newInstance();
        Field[] fields = t.getDeclaredFields();
        outer:
        for(Field f: fields){
            Annotation[] annos = f.getAnnotations();
            inner:
            for(Annotation anno: annos){
                if(anno instanceof Random){
                    String[] values = ((Random) anno).value();
                    java.util.Random random=new java.util.Random();
                    f.set(o, values[random.nextInt(values.length)]);
                    break;
                }
            }
        }
        return (T) o;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        RandomObject randomObject = new RandomObject(Student.class);
        Student random1 = (Student) randomObject.random();
        Student random2 = (Student) randomObject.random();
        Student random3 = (Student) randomObject.random();
        Student random4 = (Student) randomObject.random();
        log.info("Student:"+random1);
        log.info("Student:"+random2);
        log.info("Student:"+random3);
        log.info("Student:"+random4);
    }
}
