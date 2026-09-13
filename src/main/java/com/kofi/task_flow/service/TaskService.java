package com.kofi.task_flow.service;

import com.kofi.task_flow.model.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {

    private final Map<Long, Task> tasks = new HashMap<>();

}
