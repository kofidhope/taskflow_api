package com.kofi.task_flow.contoroller;

import com.kofi.task_flow.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public ResponseEntity<Task> getTask(String id) {
        return ResponseEntity.ok().body(new Task());
    }

}
