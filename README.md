# Automated Task Reminder System ⏰

📌 **Project Overview**  
The Automated Task Reminder System is a **Java-based application** designed to help users efficiently manage their daily tasks. Users can create tasks, schedule reminders, track progress, and generate reports. The system uses **Java Collections, Timers, JDBC**, and **Spring Boot REST APIs** to ensure reliable and scalable task management.

This project emphasizes **productivity, simplicity, and accuracy** without relying on heavy frameworks or AI.

---

## 🚀 **Key Features**
- Create, view, update, and delete tasks  
- Schedule reminders for tasks using Java concurrency  
- Track completed and pending tasks  
- Export task summaries as CSV  
- REST APIs for integration with front-end applications  

---

## 🧩 **Main Modules**

### 1️⃣ Task Management
- Manage task creation and updates  
- Persist tasks using JDBC (MySQL / H2)  
- REST APIs:  
  - `POST /tasks` — Add a new task  
  - `GET /tasks` — List all tasks  
  - `PUT /tasks/{id}` — Update a task  
  - `DELETE /tasks/{id}` — Remove a task  

### 2️⃣ Reminder Scheduler
- Schedule notifications for pending tasks  
- Uses Java’s `ScheduledExecutorService` for concurrency  
- REST APIs:  
  - `POST /reminders/{id}` — Set a reminder  
  - `GET /reminders` — List all upcoming reminders  

### 3️⃣ Reporting & CSV Export
- Generate task summary reports  
- Export reports to CSV format  
- REST APIs:  
  - `GET /reports` — View report summary  
  - `POST /reports/export` — Export CSV  

---

## 🛠 **Technologies Used**
- Java (Core, Collections, Concurrency)  
- Spring Boot & Spring MVC (REST APIs)  
- JDBC (MySQL / H2 Database)  
- CSV File Handling  
- Maven  

---

## 📦 **How to Run the Project**
1. **Clone the repository**  
```bash
git clone https://github.com/shaiksuhana2424/AutomatedTaskReminderProject.git
