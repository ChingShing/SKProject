package com.example.demo;

import java.io.Serializable;

/**
 * Created by Sophie on 2017/6/26.
 */
public class Student implements Serializable{

    private static final long serialVersionUID = 2120869894112984147L;

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

    // 节省文章长度，get set 方法省略
    public Student(){}

    public Integer getId() {return id; }
    public void setId(Integer id) {this.id = id; }

    public String getName() {return name; }
    public void setName(String name) {this.name = name; }

    public String getSumScore() {return sumScore; }
    public void setSumScore(String sumScore) {this.sumScore = sumScore; }

    public String getAvgScore() {return avgScore; }
    public void setAvgScore(String sumScore) {this.avgScore = avgScore; }

    public Integer getAge() {return age; }
    public void setAge(Integer age) {this.age = age; }

}
