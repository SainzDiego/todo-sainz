package com.example.diego.todosainz.ports.primary;

import com.example.diego.todosainz.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TodoRepository extends JpaRepository <Task,Long>{
}
