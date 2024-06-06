SELECT d.dname, max(s.gpa), d.campus 

FROM student s 

JOIN dept d ON s.deptno = d.deptno 

GROUP BY d.dname 

HAVING avg(s.gpa) > 2.5; 
