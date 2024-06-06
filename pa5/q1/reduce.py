#!/usr/bin/python3
import sys
import statistics as s

# student(sid, firstname, lastname, year, deptno, gpa) 
# dept(deptno, dname, campus, building) as follows. 

#TODO: Consider when student has dept not in dept

gpa_map = {}
name_campus_map = {}

for line in sys.stdin:
    line = line.strip()
    attrs = line.split(',')
    if (attrs[1] == "student"):
        deptno, _, gpa = attrs

        if deptno not in gpa_map:
            gpa_map[deptno] = []
        gpa_map[deptno].append(gpa)

    elif (attrs[1] == "dept"):
        deptno, _, dname, campus = attrs

        name_campus_map[deptno] = (dname, campus)
    else:
        exit(-1)

for deptno in gpa_map.keys():
    # Skip if student's department doesn't exist
    if deptno not in name_campus_map.keys():
        continue

    gpas = [float(gpa) for gpa in gpa_map[deptno]]
    avg_gpa = s.mean(gpas)
    # Skip if average gpa <= 2.5
    if avg_gpa <= 2.5:
        continue

    max_gpa = max(gpas)
    dname, campus = name_campus_map[deptno]
    print(f"{dname}, {max_gpa}, {campus}")
