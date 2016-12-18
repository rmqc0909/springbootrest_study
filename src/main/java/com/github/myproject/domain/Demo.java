package com.github.myproject.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xiedan on 2016/12/17.
 */
@XmlRootElement
public class Demo {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
