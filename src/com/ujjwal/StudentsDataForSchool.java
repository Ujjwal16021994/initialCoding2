package com.ujjwal;

public class StudentsDataForSchool {
    public static void main(String[] args) {

        Student Ram = new Student();
        Ram.age = 23;
        System.out.println(Ram.age);
        Ram.name = "Ram Chandra";
        Ram.name();
        Ram.age();
    }
}

class Student {
    String name;
    int age;
    char gender;
    String fathers_name;

    public void age() {
        System.out.println(this.age);
    }
    public void name() {
        System.out.println(this.name);
    }
}