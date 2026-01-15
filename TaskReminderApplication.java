package com.task.taskreminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling   // <-- This is required for @Scheduled to work
public class TaskReminderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskReminderApplication.class, args);
    }
}
