package io.github.davidnest.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender) {
        this.mailSender = mailSender;
        this.validator = validator;
        this.repository = repository;
    }

    public TodoEntity save(TodoEntity newTodo) {
        validator.validate(newTodo);
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getCompleted() == Boolean.TRUE ? "Completed": "Not Completed";
        mailSender.send("Todo of code: " + todo.getDescription() + " ", "Status updated", "the status : " + status);
    }

    public TodoEntity findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Todo não encontrado"));
    }



}
