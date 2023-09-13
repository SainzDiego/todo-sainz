package com.example.diego.todosainz;

import com.example.diego.todosainz.Model.Task;
import com.example.diego.todosainz.adapters.primary.TodoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoControllerTest {
        @Test
        public void saveTask(){
            Task task = new Task();
            task.setTitle("Pruebas");
            task.setDescription("Test de registro");
            TodoController todoController = new TodoController();
            String resul = todoController.saveTask(task);
            Assertions.assertEquals("Saved task",resul);
        }
}
