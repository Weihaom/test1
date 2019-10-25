package com.whm.employee;

public class People {
    private String name;
    private int age;
    public final int sex;



    public People(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Employee other){
        return this.name.equals(other.getName());
    }
}
