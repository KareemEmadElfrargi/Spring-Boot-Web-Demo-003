package com.kareem.Spring_Boot_Web_Demo_003.pojo;

public class Student {
    private int id;
    private String name;
    private String major;
    private int age;
    private String email;
    private boolean honor;

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHonor() {
        return honor;
    }

    public void setHonor(boolean honor) {
        this.honor = honor;
    }


}