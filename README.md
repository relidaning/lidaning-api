# Springboot util
A common api of web application 

## Functions
### Yaml loader
yaml properties resource factory, read .yaml configration file
### Json result
json result, a web responsive utility
### DBUtil
dbUtil, a simple encapsulation for jdbc template
### Random
random, return a random instance of any class in an annotated way

*Usages:*
```java
public class User{
  @Random(value={"Shake", "It", "Baby"})
  private String username;
}

RandomObject r = new RandomObject(User.class);
User u = (User) r.random();
```
   
4. expired, use java timer, annotation and reflection, expire properties of an instance 
