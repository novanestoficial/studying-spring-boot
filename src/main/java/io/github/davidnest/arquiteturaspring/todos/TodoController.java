package io.github.davidnest.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo) {
        return service.save(todo);
    }

    @PutMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        service.updateStatus(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }


}

