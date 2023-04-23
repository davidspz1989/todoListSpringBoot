package com.todo.todolist.repository;

import com.todo.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TodoRepository extends JpaRepository<Task, Long> {
}
