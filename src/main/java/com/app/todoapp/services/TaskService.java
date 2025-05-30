package com.app.todoapp.services;
import org.springframework.stereotype.Service;
import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;
import java.util.List; // Add this import
 


    @Service
    public class TaskService {
        private final TaskRepository taskRepository;

        public TaskService(TaskRepository taskRepository) {
            this.taskRepository = taskRepository;
        }

        public List<Task> getAllTasks() {
            return taskRepository.findAll();
        }

        public void createTasks(String title) {
            Task task = new Task();
            task.setTitle(title);
            task.setCompleted(false);
            taskRepository.save(task);
        }

        public void deleteTasks(Long id) {
            taskRepository.deleteById(id);
        }

        public void toggleTasks(Long id) {
            Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Task id"));
            task.setCompleted(!task.isCompleted());
            taskRepository.save(task);
        }

    }

 