drop database Friends_Of_Man;
create database Friends_Of_Man;
use Friends_Of_Man;
create table dogs (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);
create table cats (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);
create table humsters (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);
create table horses (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);
create table camels (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);    
create table donkeys (
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(30),
    commands VARCHAR(30),
    date_of_birth DATE);

insert into dogs (animal_name, commands, date_of_birth)
values ('atom', 'run', '2017-02-15'),
		('dino', 'go', '2021-03-16'),
        ('tobi', 'jump', '2019-04-18');
insert into cats (animal_name, commands, date_of_birth)
values ('sonia', 'run', '2019-05-12'),
		('luna', 'come_up', '2021-05-13'),
        ('ledi', 'jump', '2017-01-14');
insert into humsters (animal_name, commands, date_of_birth)
values ('busia', 'run', '2019-05-10'),
		('homa', 'stop', '2021-04-09'),
        ('zaya', 'jump', '2017-01-19');
insert into horses (animal_name, commands, date_of_birth)
values ('apola', 'run', '2019-05-21'),
		('nika', 'stand_up', '2021-08-20'),
        ('fonza', 'sump', '2017-01-22');
insert into camels (animal_name, commands, date_of_birth)
values ('agata', 'run', '2019-05-23'),
		('lida', 'stop', '2022-06-24'),
        ('tvist', 'jump', '2017-01-25');
insert into donkeys (animal_name, commands, date_of_birth)
values ('bin', 'run', '2019-05-29'),
		('dick', 'trup', '2021-10-28'),
        ('fin', 'jump', '2017-01-27');

truncate table camels;
select animal_name, commands, date_of_birth from horses
union
select animal_name, commands, date_of_birth from donkeys;

create table young_animals (id INT PRIMARY KEY AUTO_INCREMENT)
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from dogs
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year)
union
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from cats
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year)
union
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from humsters
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year)
union
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from horses
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year)
union
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from camels
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year)
union
select animal_name, commands, date_of_birth, timestampdiff(month, date_of_birth, now()) as age_in_months
from donkeys
where date_of_birth > date_sub(now(), interval 3 year) 
and date_of_birth <= date_sub(now(), interval 1 year);
select* from young_animals;

create table all_animals (id INT PRIMARY KEY AUTO_INCREMENT)  
select animal_name, commands, date_of_birth from dogs
union all
select animal_name, commands, date_of_birth from cats
union all
select animal_name, commands, date_of_birth from humsters
union all
select animal_name, commands, date_of_birth from horses
union all
select animal_name, commands, date_of_birth from camels
union all
select animal_name, commands, date_of_birth from donkeys;
select * from all_animals;