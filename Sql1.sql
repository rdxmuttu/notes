create database ust_db;
use ust_db;
create table employee(emp_id numeric(5),
emp_name varchar(50),
email varchar(50),
salary numeric(10,2));
-- How to see all the tables in a database
show tables;							
show databases;
-- How to see the description of a table

desc employee;
insert into employee values(1001,'Joseph','joseph@annan.com',25000,'2023-03-20');
insert into employee values(1002,'Vivek','vivek@coder.com',27000);
insert into employee values(1003,'Divya','divya@ji.com',25500);
insert into employee values(1004,'Anagha','anagha@ammayi.com',24999);
insert into employee values(1005,'Tony','tony@maaman.com',25050);
select * from employee;

alter table employee add hireDate date;
-- Change the data type to numeric(9,2) for salary column
alter table employee modify salary numeric(9,2);
-- add a primary key
alter table employee add primary key(emp_id);
-- delete the column
alter table employee drop hireDate;
-- drop table employee; (delete table employee)
-- truncate table employee; (delete data in table employee)
update employee set hireDate='2023-03-20' where emp_id=1001;
update employee set hireDate='2023-05-15' where emp_id=1002;
update employee set hireDate='2023-04-24' where emp_id=1003;
update employee set hireDate='2022-12-22' where emp_id=1004;
update employee set hireDate='2022-08-10' where emp_id=1005;
-- delete from employee where emp_id=1001;
select * from employee where emp_id=1002;
select * from employee where salary>25000;
-- select * from employee where salary>=25000 and salary<26000;
select * from employee where salary between 25000 and 26000;
-- select * from employee where emp_id=1002 or emp_id=1003 or emp_id=1005;
select * from employee where emp_id in (1002,1003,1005);
select * from employee order by salary desc;
select emp_id,emp_name,salary from employee; 
truncate table employee;
insert into employee values(1001,'Sooraj','sooraj@gmail.com',65000,'2020-04-27'),
(1002,'Mohit','mohit@gmail.com',52000,'2021-04-20'),
(1003,'Gaurav','gaurav@gmail.com',55000,'2020-10-15'),
(1004,'Harsh','harsh@gmail.com',68000,'2019-02-10'),
(1005,'Javed','javed@gmail.com',85000,'2015-05-02');
select * from employee;
insert into employee values(2001,'Priyanka','priyanka@yahoo.com',75000,'2018-05-20'),
(2002,'Karan','karan@yahoo.com',72000,'2019-10-20');
alter table employee add jobrole varchar(50);
update employee set jobrole = 'Clerk' where emp_id =1001;
update employee set jobrole = 'Salesman' where emp_id =1002;
update employee set jobrole = 'Analyst' where emp_id =1003;
update employee set jobrole = 'Clerk' where emp_id =1004;
update employee set jobrole = 'Manager' where emp_id =1005;
update employee set jobrole = 'Analyst' where emp_id =2001;
update employee set jobrole = 'Analyst' where emp_id =2002;
-- Find the unique jobs available in the employee table
select distinct jobrole from employee;
-- Find the annual salary of each employee
select emp_name, salary, salary*12 as "annual salary" from employee;
-- Find all the salesman
select * from employee where jobrole='Salesman';
-- find the analysts earning more than 60000
select * from employee where jobrole='Analyst' and salary>60000;

-- update the salary of each employee by 15%
update employee set salary = salary*1.15 where emp_id in(1001,1002,1003,1004,1005,2001,2002);

-- increase salary of each clerk by 2000 Rs

update employee set salary = salary+2000 where emp_id between 1001 and 2002 and jobrole ='Clerk';
-- add a new coulmn dept with data-type numeric(3)
alter table employee add dept numeric(3);
update employee set dept = 10 where emp_id =1001;
update employee set dept = 20 where emp_id =1002;
update employee set dept = 30 where emp_id =1003;
update employee set dept = 20 where emp_id =1004;
update employee set dept = 10 where emp_id =1005;
update employee set dept = 20 where emp_id =2001;
update employee set dept = 10 where emp_id =2002;
-- find all the employees belonging to dept 10
select * from employee where dept=10;
-- find the analysts is dept 20
select * from employee where dept=20 and jobrole='Analyst';
-- find all the employees who are either clerk or analyst
select * from employee where jobrole in ('Analyst','Clerk');
-- sort the employees based on dept no asc and salary desc
select * from employee order by dept asc ,salary desc;
-- Find the average salaries based on job
select jobrole,avg(salary) as 'average salary' from employee group by jobrole order by salary desc;
-- Find total no of employees in each dept
select dept,count(*) as "total employees" from employee group by dept;
select sum(salary) as 'total salary' from employee;

 -- find max,min,avg,total employee count base on job
select jobrole,count(*) as "total employees",avg(salary) as 'average salary',max(salary),min(salary) from employee group by jobrole;
-- find the average salary of dept no 20
select dept,avg(salary) as 'average salary' from employee where dept=20;
-- find the dept with more than 3 employees
select dept,count(*) as "total employees" from employee  group by dept having count(*)>2;
-- find the year of joining of each employee
select emp_name, extract(year from hireDate) as 'joining year' from employee;
-- find the total experience of each employee
select emp_name, datediff(curdate(), hireDate)/365 as 'Total experience' from employee;
-- total exp with month
select emp_name, round(datediff(curdate(),hireDate)/365,0) as 'Years' ,
		floor(mod(datediff(now(),hireDate),365)/30) as 'months'
		from employee;

select emp_name, extract(year from now())-extract(year from hireDate) as 'Total experience' from employee order by 2 desc; -- 2 is the second column






create table Dept (dept numeric(3),deptName varchar(50),location varchar(50));
insert into Dept values(10,'IT','Bangalore'),(20,'Accounts','Trivandrum'),
(30,'Sales','Chennai'),(40,'Management','Kolkata');
select * from Dept;
-- Joins

-- Inner Join 
-- selects all the common data from two tables

-- find all the employees with dept details

select emp_id,emp_name,e.dept,deptName,location from employee e join Dept d on e.dept=d.dept; -- OR on using(dept) ON MYSQL
-- find all the employees wrking in Trivandrum
select emp_name,location from employee e join Dept d on e.dept=d.dept where location='Trivandrum';
select d.dept,deptName,location, count(*) as "total employees" from employee e join Dept d on e.dept=d.dept group by d.dept;
-- find the dept with highest employees
select d.dept,deptName,count(*) as "total employees" from employee e join Dept d on e.dept=d.dept group by d.dept having count(*)>2;
SELECT e.dept, COUNT(*) AS employee_count
FROM employee e
JOIN Dept d ON e.dept = d.dept
GROUP BY e.dept
ORDER BY employee_count DESC
LIMIT 1;
-- or
SELECT d.dept, d.deptName, COUNT(e.dept) AS "total employees"
FROM Dept d
JOIN employee e ON e.dept = d.dept
GROUP BY d.dept, d.deptName
HAVING COUNT(e.dept) = (
    SELECT MAX(empCount)
    FROM (
        SELECT COUNT(dept) AS empCount
        FROM employee
        GROUP BY dept
    ) AS deptCount
);

-- or
select Department.dept,deptName,count(employee.dept) as "total" from employee join Department  using(dept)
group by Department.dept order by total desc limit 1;
-- or
SELECT Department.dept,deptName, count(*) as "total"
FROM employee
JOIN Department USING (dept)
GROUP BY deptName order by total desc limit 2;





select * from employee where email like '%gmail.com';

select * from employee where extract(year from hireDate)=2020;
select * from employee where emp_name like 'P%'or emp_name like'J%';
update employee set hireDate='2018-01-20' where emp_id =2001;
select * from employee where extract(month from hireDate)=01;
select * from employee where extract(month from hireDate)<=6;
select * from employee where dayofweek(hireDate)=2;

drop table Dept;
create table Dept (dept numeric(3) primary key ,deptName varchar(50) unique not null ,location varchar(50));
insert into Dept values(10,'IT','Bangalore'),(20,'Accounts','Trivandrum'),
(30,'Sales','Chennai'),(40,'Management','Kolkata');
alter table employee add constraint  fk_dept foreign key(dept) references Dept(dept);
insert into employee values(2005,'Umesh','umesh@yahoo.com','Clerk',65000,'2020-04-27',80);

-- find dept with no employees
select d.dept,deptName,location from employee e right join Dept d on e.dept=d.dept where e.emp_id is null;
-- display the dept information along with employee count
select d.dept,d.deptName, count(e.dept) as "total employees" from  Dept d right join employee e on e.dept=d.dept group by d.dept;
-- find the dept with highest employees
select d.dept,d.deptName, count(e.dept) as "total employees" from  Dept d left join employee e on e.dept=d.dept group by d.dept order by 3 desc ;
-- find all the employees working in Trivandrum 
-- SUB QUERY
select * from employee where dept=(select dept from Dept where location='Trivandrum');
select * from employee;
-- TCL commands
set autocommit=false;
use ust_db;
savepoint p1;
delete from Dept where dept=40; 
select * from Dept;-- we cannot delete dept 10 as its foreign key
rollback to p1;



-- Create two tables: “Employees” and “Departments.” The “Employees” table contains employee information, and the “Departments” table contains department information. The tables are related by the “DepartmentID” column.
use ust_db;
show tables;
select * from employee;

create table Department (dept numeric(3),deptName varchar(50),location varchar(50));
insert into Department values(10,'IT','Bangalore'),(20,'Accounts','Trivandrum'),
(30,'Sales','Chennai'),(40,'Management','Kolkata');
select * from Department;

-- Retrieve a list of employees along with their corresponding department names
select emp_id,emp_name,e.dept,deptName from employee e join Department d on e.dept=d.dept; -- OR on using(dept) ON MYSQL
select emp_id,emp_name,deptName from employee  join Department  using(dept);
select emp_id,emp_name,Department.dept,deptName from employee  join Department  where employee.dept=Department.dept;


-- Retrieve the total number of employees in each department
select  deptName,count(emp_id) from employee join Department  using(dept)
 -- where employee.dept=Department.dept
 group by Department.dept;

-- Retrieve the highest salary in each department
select  deptName,max(salary) from employee join Department  using(dept) group by Department.dept;
-- Retrieve the average salary for employees in each department
select  deptName,avg(salary) from employee join Department  using(dept) group by Department.dept;
-- Retrieve the average salary for employees in Sales department
select  deptName,avg(salary) from employee join Department  using(dept) group by Department.dept having deptName='Sales';

create database exam_db;
use exam_db;

CREATE TABLE DEPARTMENT(DEPT_ID int(10) PRIMARY KEY, DEPT_NAME VARCHAR(50));

CREATE TABLE EMPLOYEE(
  EMP_NO int(10) PRIMARY KEY,
  EMP_NAME VARCHAR(50),
  HIRE_DATE DATE,
  EMP_SALARY int(10),
  DEPT_ID int(10)
);
INSERT INTO DEPARTMENT VALUES (13, 'IT'),(12, 'Sales'),(15, 'HR');
INSERT INTO EMPLOYEE VALUES (101, 'Ram', '2020-10-11',1000,13),
    (102, 'John', '2020-11-11',4500,15),
    (103, 'Vipul', '1990-10-11',90,13);
    
select * FROM EMPLOYEE;
select * FROM DEPARTMENT;
    
SELECT D.DEPT_NAME, COUNT(E.EMP_NO)
FROM DEPARTMENT D
JOIN EMPLOYEE E ON D.DEPT_ID = E.DEPT_ID GROUP BY D.DEPT_NAME
HAVING COUNT(E.EMP_NO) > (
    SELECT COUNT(*) 
    FROM EMPLOYEE 
    WHERE HIRE_DATE = '2020-11-11'
);   