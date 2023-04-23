package com.todo.todolist.service;

import com.todo.todolist.model.Task;
import com.todo.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }
    public List<Task> findAll(){
        return this.todoRepository.findAll();
    }
    public Task saveTask(Task task){
        return this.todoRepository.save(task);
    }
    public Task updateTask(Long id, Task task){
        Task updateT=todoRepository.findById(id).get();
        updateT.setName(task.getName());
        updateT.setDescription(task.getDescription());
        return this.todoRepository.save(updateT);
    }

}
