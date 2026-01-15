import java.util.*;
import java.time.*;
import java.io.*;

public class TaskReminderApp {

    static class Task {
        String name;
        LocalDate date;

        Task(String name, LocalDate date) {
            this.name = name;
            this.date = date;
        }
    }

    static final String FILE_NAME = "tasks.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        LocalDate today = LocalDate.now();

        // 🔹 Load tasks from file at start
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner fileSc = new Scanner(file);
                while (fileSc.hasNextLine()) {
                    String line = fileSc.nextLine();
                    String[] parts = line.split(",");
                    tasks.add(new Task(parts[0], LocalDate.parse(parts[1])));
                }
                fileSc.close();
            }
        } catch (Exception e) {
            System.out.println("Error loading tasks from file.");
        }

        while (true) {

            // 🔔 Show today reminders
            for (Task t : tasks) {
                if (t.date.equals(today)) {
                    //System.out.println("🔔 Reminder: " + t.name + " is due today!");
                    System.out.println("[REMINDER] " + t.name + " is due today!");

                }
            }

            System.out.println("\n--- Automated Task Reminder ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            // 1️⃣ Add Task
            if (choice == 1) {

                System.out.print("Enter task name: ");
                String name = sc.nextLine();

                System.out.print("Enter date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(sc.nextLine());

                tasks.add(new Task(name, date));

                try {
                    FileWriter fw = new FileWriter(FILE_NAME, true);
                    fw.write(name + "," + date + "\n");
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error saving task.");
                }

                System.out.println("Task Added Successfully!");
            }

            // 2️⃣ View Tasks
            else if (choice == 2) {

                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).name + " → " + tasks.get(i).date);
                    }
                }
            }

            // 3️⃣ Delete Task
            else if (choice == 3) {

                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else {
                    System.out.println("Select task number to delete:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).name);
                    }

                    int del = sc.nextInt();
                    sc.nextLine();

                    if (del >= 1 && del <= tasks.size()) {
                        tasks.remove(del - 1);

                        try {
                            FileWriter fw = new FileWriter(FILE_NAME);
                            for (Task t : tasks) {
                                fw.write(t.name + "," + t.date + "\n");
                            }
                            fw.close();
                        } catch (IOException e) {
                            System.out.println("Error updating file.");
                        }

                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }
            }

            // 4️⃣ Exit
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
