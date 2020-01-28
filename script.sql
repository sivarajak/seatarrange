drop table dbo.EMPLOYEE
create table dbo.EMPLOYEE (EMP_ID int primary key, EMP_NAME nvarchar(50) not null, EMP_GENDER char not null, 
EMP_DESIGNATION nvarchar(100), EMP_TEAM nvarchar(100))

insert into dbo.EMPLOYEE values(1957, 'Sivaraja Kani', 'M', 'Senior Software Analyst', 'South Africa')
insert into dbo.EMPLOYEE values(1958, 'Uday ', 'M', 'Senior Software Analyst', 'South Africa')
insert into dbo.EMPLOYEE values(1959, 'Pakesh', 'M', 'Software Analyst', 'South Africa')
insert into dbo.EMPLOYEE values(1960, 'Rani', 'F', 'Software Analyst', 'South Africa')

CREATE TABLE [dbo].[LOCATION](
	[LOC_ID] [int] PRIMARY KEY,
	[LOC_NAME] [nvarchar](50) ,
	[LOC_POSX] int NOT NULL,
	[LOC_POSY] int NULL)

ALTER TABLE [dbo].[LOCATION]
    ADD  FOREIGN KEY (LOC_ID) REFERENCES dbo.employee(emp_id)
    	ON DELETE CASCADE
    	ON UPDATE CASCADE
go