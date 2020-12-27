package com.sample;

public class SampleObject {
    private String name;
    private Integer age;

    public SampleObject(String name, Integer age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }  public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public void doSomething()
    {
        System.out.println("This is "+ name+ ". I'm "+age+" years old.");
    }
}
