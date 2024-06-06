#!/usr/bin/python3
import sys

# student(sid, firstname, lastname, year, deptno, gpa) 
# dept(deptno, dname, campus, building) as follows. 
for line in sys.stdin:
    line = line.strip()
    attrs = line.split(',')

    if len(attrs) == 6:
        # student table
        sid, firstname, lastname, year, deptno, gpa = attrs
        print(f"{deptno},student,{gpa}")
    elif len(attrs) == 4:
        # dept table
        deptno, dname, campus, building = attrs
        print(f"{deptno},dept,{dname},{campus}")
    else:
        exit(-1)

