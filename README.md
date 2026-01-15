# Automated Task Reminder Application ⏰

📌 **Project Overview**  
This is a Java-based Task Reminder Application designed to help users efficiently manage tasks. Users can create tasks, set due dates, receive reminders, track completion, and export reports. It uses **Java Collections, Timers, JDBC**, and **Spring Boot REST APIs** for reliability and scalability, without relying on heavy frameworks.

---

## 🎯 **Key Outcomes**
- Reliable task scheduling using Java concurrency  
- Accurate tracking of completed and pending tasks  
- Exportable task reports in CSV format  
- API-driven access for integration with frontends  

---

## 🧩 **Modules Implemented**

### 1️⃣ Task Management Engine
- Create, update, and list tasks using Java Collections  
- Persist tasks using JDBC (MySQL / H2)  
- REST APIs:  
  - `POST /tasks/add`  
  - `GET /tasks/list`  
  - `PUT /tasks/{id}`  

### 2️⃣ Scheduling System
- Schedule reminders using `ScheduledExecutorService`  
- Handle concurrent reminders and notifications  
- REST APIs:  
  - `POST /schedule/set`  
  - `GET /reminders/{taskId}`  

### 3️⃣ Reporting & CSV Export
- Generate task summaries and reports  
- Export to CSV format  
- REST APIs:  
  - `GET /reports/overview`  
  - `POST /reports/export`  

### 4️⃣ Completion Tracker
- Mark tasks as completed  
- View task status insights  
- REST APIs:  
  - `PUT /completion/mark`  
  - `GET /status/{taskId}`  

---

## 🛠️ **Technologies Used**
- Java (Core, Collections, Concurrency)  
- Spring Boot & Spring MVC (REST APIs)  
- JDBC (MySQL / H2 Database)  
- CSV File Handling  
- Maven  

---

## 📆 **Project Milestones**
- **Week 1–2:** Setup Java, database, and Spring Boot environment; design Task model  
- **Week 3–4:** Implement Task Management Engine & REST APIs  
- **Week 5–6:** Implement Scheduling, Reporting, and CSV export  
- **Week 7–8:** Completion Tracker, end-to-end testing, and deployment  

---

## ▶️ **How to Run the Project**
1. Clone the repository:  
```bash
git clone https://github.com/shaiksuhana2424/AutomatedTaskReminderProject.git
