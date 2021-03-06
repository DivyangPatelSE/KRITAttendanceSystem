# KRITAttendanceSystem

KRITAttendanceSystem is an idea to take attendance on system and make it instantly available for student to check it. But, Adding to
this functionality, I have added Grade and Schedule part in system to add grade and schedule by instructor and can be 
checked easily by student online by loging into their account. Its small but can be useful in colleges to maintain attendance sheets and
grades easily on college server.

## Technology

My concentration is to learn SpringBoot and be a Java Developer. So, I tried to use SpringBoot at the back-end. And AngularJS at Front-End.
* Back-End : 
1. SpringBoot
2. Maven
* Database : 
1. MySQL
* Front-End : 
1. AngularJS

## How it works 

* First page of this application is Login page which is created using AngularJS. Where User enter his/her login information and selects 
his/her role as Student or Instructor. Then this request is processed by AngularJS by fatching data from database. It requests to
SpringBoot repository to get all data about users. Repository gets data from database and return back to AngularJS. 
* After Login, It will show dashboard with sidebar options like MyProfile, Schedule, Attendance and Grade for Student. However, It will
be different for an Instructor and will provide more options like MyProfile, CourseActivity(to select Activities like assignment, projects,
exam in course and credit for that activity), Attendance(to take attendance of students) and Grade(to grade students).
* By clicking on that option, it will call its relevant repository and that repository get data from database and return data to front-end.

## Functions
* Student
1. Login       - finished
2. Dashboard   
3. MyProfile   
4. Schedule    - finished
5. Attendance  - finished
6. Grade       - finished

* Instructor
1. Login
2. Dashboard
3. MyProfile
4. Add CourseActivity
5. Add Attendance
6. Add Grade

## Application Diagram

https://www.gliffy.com/go/share/si9lk3jw8tqlau3dhyi9

## Screenshots

* Student
Login

![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/Login.png)

Dashboard

![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/Dashboard.png)

Course Schedule

![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/CourseSchedule.png)

Grade

![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/Grade.png)

Attendance

![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/Attendance.png)


![image](https://github.com/DivyangPatelSE/KRITAttendanceSystem/blob/local_change/KritAttendanceSystem/src/main/resources/static/resource/img/Attendance-2.png)
