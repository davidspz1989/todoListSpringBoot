package com.todo.todolist.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
}
