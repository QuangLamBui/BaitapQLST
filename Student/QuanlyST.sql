--create database Sinhvien
go 
use Sinhvien
go
create table Student(
    idSt int primary key,
    nameSt nvarchar(30) not null,
	age int not null,
)
create table Class(
    idClass int  primary key,
	Namecl nvarchar(50) not null unique,	
)
create table Student_class(
	idstc int primary key,
    idClass int foreign key references Class(idClass),
	idSt int foreign key references Student(idSt),
)
create table Dayoff(
    idDay int  primary key,
	idSt int foreign key references Student(idSt),
	dayOff date,
)
create table Dayoff_Class(
    idDay int foreign key references Dayoff(idDay),
	idSt int foreign key references Student(idSt),
	idClass int foreign key references Class(idClass),
)
insert into  Student(idSt,nameSt,age)
values ('1001','Le Van A','19')
insert into  Student(idSt,nameSt,age)
values ('1002','Le Van B','19')
insert into Class(idClass,Namecl)
values('1102','Java 01')
insert into Class(idClass,Namecl)
values('1103','Csdl')
insert into Class(idClass,Namecl)
values('1101','Toan cao cap')
