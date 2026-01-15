import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.*;
import java.io.*;

public class TaskReminderGUI extends JFrame {

    static class Task {
        String name;
        LocalDate date;

        Task(String name, LocalDate date) {
            this.name = name;
            this.date = date;
        }
    }

    ArrayList<Task> tasks = new ArrayList<>();
    JTextArea taskArea;
    JTextField nameField, dateField;
    static final String FILE_NAME = "tasks.txt";

    public TaskReminderGUI() {
        setTitle("Automated Task Reminder");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel
        JPanel top = new JPanel(new GridLayout(3, 2));
        top.add(new JLabel("Task Name:"));
        nameField = new JTextField();
        top.add(nameField);

        top.add(new JLabel("Task Date (YYYY-MM-DD):"));
        dateField = new JTextField();
        top.add(dateField);

        JButton addBtn = new JButton("Add Task");
        JButton delBtn = new JButton("Delete Selected");
        top.add(addBtn);
        top.add(delBtn);

        add(top, BorderLayout.NORTH);

        // Center
        taskArea = new JTextArea();
        add(new JScrollPane(taskArea), BorderLayout.CENTER);

        // Load tasks
        loadTasks();
        showTasks();
        showTodayReminder();

        // Add Button Action
        addBtn.addActionListener(e -> addTask());

        // Delete Button Action
        delBtn.addActionListener(e -> deleteTask());

        setVisible(true);
    }

    void addTask() {
        try {
            String name = nameField.getText();
            LocalDate date = LocalDate.parse(dateField.getText());

            tasks.add(new Task(name, date));
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(name + "," + date + "\n");
            fw.close();

            showTasks();
            nameField.setText("");
            dateField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input!");
        }
    }

    void deleteTask() {
        try {
            int line = taskArea.getLineOfOffset(taskArea.getCaretPosition());
            tasks.remove(line);

            FileWriter fw = new FileWriter(FILE_NAME);
            for (Task t : tasks)
                fw.write(t.name + "," + t.date + "\n");
            fw.close();

            showTasks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Select a task to delete.");
        }
    }

    void showTasks() {
        taskArea.setText("");
        for (int i = 0; i < tasks.size(); i++) {
            taskArea.append((i + 1) + ". " + tasks.get(i).name +
                    " → " + tasks.get(i).date + "\n");
        }
    }

    void loadTasks() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String[] p = sc.nextLine().split(",");
                    tasks.add(new Task(p[0], LocalDate.parse(p[1])));
                }
                sc.close();
            }
        } catch (Exception e) {}
    }

    void showTodayReminder() {
        LocalDate today = LocalDate.now();
        for (Task t : tasks) {
            if (t.date.equals(today)) {
                JOptionPane.showMessageDialog(this,
                        "Reminder: " + t.name + " is due today!");
            }
        }
    }

    public static void main(String[] args) {
        new TaskReminderGUI();
    }
}
