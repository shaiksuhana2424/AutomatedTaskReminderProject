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

## ▶️ How to Run the Project
1️⃣ Clone the repository:
```bash
git clone https://github.com/shaiksuhana2424/AutomatedTaskReminderProject.git

2️⃣ Configure Database

Update application.properties with H2 (easy) or MySQL setup.

3️⃣ Build & Run

mvn spring-boot:run


4️⃣ Access APIs

Open in browser or Postman:

http://localhost:8080

📌 Future Enhancements

Role-based authentication (JWT / OAuth)

Frontend UI using React or Angular

Push notifications for tasks

Analytics dashboard

👤 Author

Shaik Suhana
Final Year B.Tech Student
Java & Spring Boot Developer

📄 License

MIT License
Copyright (c) 2026 Shaik Suhana

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
