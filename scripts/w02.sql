DROP DATABASE IF EXISTS w02;
CREATE DATABASE w02;
use w02;

CREATE TABLE Students (
    sid CHAR(20) PRIMARY KEY,
    sname CHAR(20),
    age INTEGER,
    gpa REAL
);
CREATE TABLE Enrolled (
    sid CHAR(20),
    cid CHAR(20),
    grade CHAR(2)
);
CREATE TABLE Courses (
    cid CHAR(20) PRIMARY KEY,
    cname VARCHAR(32),
    credit INTEGER,
    dept VARCHAR(8)
);

INSERT INTO Students VALUES (101, "Alice", 21, 3.2);
INSERT INTO Students VALUES (102, "Bob", 22, 3.9);
INSERT INTO Students VALUES (103, "Charlie", 23, 3.87);
INSERT INTO Students VALUES (104, "David", 21, 3.65);
INSERT INTO Students VALUES (105, "Erin", 22, 3.5);
INSERT INTO Students VALUES (106, "Frank", 23, 3.68);
INSERT INTO Students VALUES (107, "Grace", 24, 3.7);

INSERT INTO Courses VALUES ("C01", "C Programming", 3, "CS");
INSERT INTO Courses VALUES ("C02", "Discrete Math", 2, "Math");
INSERT INTO Courses VALUES ("C03", "Databases", 4, "CS");
INSERT INTO Courses VALUES ("C04", "Artificial Intelligence", 3, "CS");
INSERT INTO Courses VALUES ("C05", "Data Mining", 3, "CS");

SELECT * FROM Students;
SELECT * FROM Courses;
SELECT * FROM Enrolled;
SELECT * FROM Courses WHERE credit >= 3;
