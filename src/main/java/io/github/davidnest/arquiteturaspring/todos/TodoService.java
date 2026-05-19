package io.github.davidnest.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity save(TodoEntity newTodo) {
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo) {
        repository.save(todo);
    }

    public TodoEntity findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Todo não encontrado"));
    }

}
