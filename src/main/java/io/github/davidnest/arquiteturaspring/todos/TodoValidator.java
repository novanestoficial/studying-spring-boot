package io.github.davidnest.arquiteturaspring.todos;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {


    private TodoRepository repository;

        public TodoValidator(TodoRepository repository) {
            this.repository = repository;
        }

    public void validate(TodoEntity todo) {
        if(existTodoWithSameDescription(todo.getDescription().toString())) {
            throw new IllegalArgumentException("Já existe uma TODO com a mesma descrição");
        }
    }

    private boolean existTodoWithSameDescription(String description) {
        return repository.existsByDescription(description);
    }

}
