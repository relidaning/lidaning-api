package xyz.lidaning.random;

import lombok.Data;

@Data
public class Student {

    @Random({"1", "2", "3"})
    String id;

    @Random({"Mike", "Rock", "Hansome", "John", "Kate"})
    String name;

    @Random({"female", "male"})
    String sex;

    @Random({"19", "20", "21", "22", "23", "24"})
    String age;

    @Random({"Haidian Beijing", "Washington DC.", "Toroto", "England", "Ukuran"})
    String address;

}
