package xyz.lidaning.random;

import lombok.Data;

import java.util.Date;

@Data
public class Student {

    @Random(integers = {1, 2, 3})
    private int id;

    @Random({"Mike", "Rock", "Hansome", "John", "Kate"})
    private String name;

    @Random({"female", "male"})
    private String sex;

    @Random(integers={19, 20, 21, 22, 23, 24})
    private int age;

    @Random({"Haidian Beijing", "Washington DC.", "Toroto", "England", "Ukuran"})
    private String address;

    @Random(dates={"2012-05-21", "2022-12-12", "1989-07-03", "1996-06-11", "1975-11-09"})
    private Date birthday;
}
