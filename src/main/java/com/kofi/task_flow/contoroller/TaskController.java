package com.kofi.task_flow.contoroller;

import com.kofi.task_flow.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {


    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return  ResponseEntity
                .status(201)
                .body(task);
    }

    @GetMapping
    public ResponseEntity<Task> getTask(String id) {
        return ResponseEntity.ok().body(new Task());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok().body(new Task());
    }

}
