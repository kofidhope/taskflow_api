package com.kofi.task_flow.service;

import com.kofi.task_flow.model.Task;
import com.kofi.task_flow.model.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    private final Map<Long, Task> tasks = new HashMap<>();

    public Task createTask(Task task) {
        tasks.put(task.getId(), task);
        return task;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTaskById(Long id) {
        return tasks.get(id);
    }

    public Task updateTaskStatus(Long id, TaskStatus status) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setStatus(status);
        }
        return task;
    }

}
