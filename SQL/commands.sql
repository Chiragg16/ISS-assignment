create table EMP (empid int PRIMARY KEY, name varchar(20), salary int, deptid int);
create table DEPT (deptid int UNIQUE, name varchar(20));
insert into EMP values (1, 'Shubham', 10000, 1);
insert into EMP values (2, 'Chirag', 20000, 2);
insert into EMP values (3, 'Arun', 30000, 2);

-- update query
UPDATE EMP SET salary = 15000 WHERE empid = 1;

-- delete query
DELETE FROM EMP WHERE empid = 1;

-- select query
SELECT * FROM EMP;

-- select query with where clause
SELECT * FROM EMP WHERE salary > 15000;

--join query with where clause
SELECT * FROM EMP, DEPT WHERE EMP.deptid = DEPT.deptid AND EMP.salary > 15000;

--alter table
ALTER TABLE EMP ADD COLUMN age int;

--drop table
DROP TABLE EMP;
