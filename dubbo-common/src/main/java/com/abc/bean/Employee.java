package com.abc.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
public class Employee implements Serializable {
    protected static final long serialVersionUID = 5454155825314635342L;
    private Integer id;
    private String name;
    private int age;
}
