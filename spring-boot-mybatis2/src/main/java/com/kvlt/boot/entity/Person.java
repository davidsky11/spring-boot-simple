package com.kvlt.boot.entity;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Person
 *
 * @author KVLT
 * @date 2017-12-19.
 */
public class Person implements Serializable {

    private Integer id;

    @Size(max = 8, min = 2)  // 使用JSR-303注解来校验
    private String name;
    private Integer age;
    private String sex;
    private String nation;
    private String address;

    public Person() {}

    public Person(String name, Integer age, String sex, String nation, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nation = nation;
        this.address = address;
    }

    public Person(Integer id, String name, Integer age, String sex, String nation, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nation = nation;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
