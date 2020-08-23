CREATE DATABASE sales;
USE sales;
CREATE table enquiry(
enquiryid int not null AUTO_INCREMENT,
Customername varchar(30) not null,
mobile Double not null,
vehicletype varchar(20) not null,
budgetForm varchar(30) not null,
Status varchar(20) not null,
tobudget varchar(20) not null,
frombudget varchar(20) not null,
PRIMARY KEY (enquirydi)
);


INSERT INTO enquiry (Customername,mobile,vehicletype,budgetForm,Status,tobudget,frombudget) VALUES
("xyz",98494049040,"sedan","dljfjkfjdkjf","open","khdj","dfjl"),
("abc",984940440,"sedan","fjdkjf","open","khdj","dfjl"),
("xyz",98494049040,"sedan","dljfjkfjdkjf","open","khdj","dfjl"),
("xyz",98494049040,"sedan","dljfjkfjdkjf","open","khdj","dfjl"),
("xyz",98494049040,"sedan","dljfjkfjdkjf","open","khdj","dfjl")
;