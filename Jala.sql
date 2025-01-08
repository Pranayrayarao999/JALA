create database if not exists jala;
use jala;

create table Customers(
id int primary key,
name varchar(50) not null,
Date date not null,
locate varchar(50)
);
describe Customers;
select * from Customers;

insert into Customers values
(1,"Raju","2025-01-07","INDIA"),
(2,"Stephan Mcmohan","2024-12-31","USA"),
(3,"Vladimir Putin","2019-03-23","RUSSIA");

INSERT INTO Customers Values
(4,"Khanna","2020-03-21","INDIA");

create table Employees(
numbers int,
fname varchar(50) not null,
salary double not null,
company varchar(60),
foreign key(numbers) references Customers(id) 
);
describe Employees;
select * from Employees;

INSERT INTO Employees values
(2,"Rusio malkito",23450.34,"Google"),
(1,"Anand Reddy",12000.00,"Samsung"),
(3,"Trump",19500.87,"LG");

update Employees
set fname = "Russio Malkitto"
where numbers = 2;

select * from Employees
where salary > 15000;

select * from Employees
where fname = "Russio Malkitto";

select * from Employees
where company like '%g';

select * from Employees
where company like 'g__%';

select * from Employees
order by fname desc;

select * from Employees
order by fname desc
limit 2;

SELECT * FROM Employees
where numbers in (2,3);

create view ManagerView as 
select * from Employees
where numbers = 1;
select * from ManagerView;

create index FastIndex1
on Employees(company);

select reverse(fname) from Employees
where numbers = 2;
select lower(fname) from Employees
where numbers = 2;
select upper(fname) from Employees
where numbers = 2;

SELECT name,id FROM Customers
group by name;

select sum(salary) from Employees;
select avg(salary) from Employees;
select max(salary) from Employees;
select concat(fname,company) from Employees;

select * from Employees
inner join Customers
on Customers.id = Employees.numbers;

select * from Employees
left join Customers
on Customers.id = Employees.numbers;

select * from Employees
right join Customers
on Customers.id = Employees.numbers;

select * from Customers
cross join Employees
on Employees.numbers = Customers.id;
