package xyz.lidaning.random;

import lombok.Data;

@Data
public class Student {

    @Random({"1", "2", "3"})
    private int id;

    @Random({"Mike", "Rock", "Hansome", "John", "Kate"})
    private String name;

    @Random({"female", "male"})
    private String sex;

    @Random({"19", "20", "21", "22", "23", "24"})
    private String age;

    @Random({"Haidian Beijing", "Washington DC.", "Toroto", "England", "Ukuran"})
    private String address;
}
