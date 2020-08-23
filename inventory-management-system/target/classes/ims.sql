-- This file contains the db script for inventory system


DROP DATABASE imsDb;

CREATE DATABASE imsDb;

USE IMSDb;


CREATE TABLE items(
icode int primary key,
title varchar(20) not null,
packageDate date not null,
fragile boolean default false,
unit varchar(10) not null,
costprice decimal not null,
sellingPrice decimal not null
);

INSERT INTO items VALUES
(1,"pen Stand","2020-02-01",false,"piece",100,200),
(2,"pen","2020-02-01",false,"piece",100,200),
(3,"bench","2020-02-01",false,"piece",100,200),
(4,"stool","2020-02-01",false,"piece",100,200),
(5,"pen set","2020-02-01",true,"piece",100,500),
(6,"pen tool","2020-02-01",false,"piece",100,800),
(7,"tand","2020-02-01",false,"piece",100,200)
;

-- This file contains the db script for
-- Inventory Management System Database

DROP DATABASE CoronaDb;

CREATE DATABASE CMSDb;

USE CMSDB;

CREATE TABLE VisitorKit(
	id integer primary key,
	PersonName varchar(10) not null,
	email varchar(30) not null,
 ContactNumber varchar(10) not null,
 totalAmount decimal not null,
	DeliveryAddress varchar(30) not null,
	OrderDate date not null,
	OrderFinalized boolean default false
	);

INSERT INTO Coronakit VALUES
(9008798765,"Amstradam","xy_g@c.com",101,"2020-02-01",false,"MARK",7000),
(9008798765,"pettburg","uv_g@a.com",102,"2020-02-01",false,"DON",6000),
(9008798765,"paris","j_g@b.com",103,"2020-02-01",false,"MASK",9000);

CREATE TABLE kitDetail(
id integer primary key,
personName integer not null,
amount decimal not null,
coronaKitId integer NOT NULL,
quantity integer not null
);
id,personName,email,contactNumber,totalAmount,deliveryAddress,orderDate,orderFinalized
INSERT INTO ProductMaster VALUES
(1,"Pen Stand","harry",200),
(2,"Pen Stand","harry",200),
(3,"Pen Stand","harry",200);


CREATE TABLE OrderSummary(	
id integer not null,
coronaKitId integer NOT NULL,
	kitDetails varchar(10) not null,
	coronaKit varchar(10) not null
);

CREATE TABLE ProductMaster (
 id integer primary key,
ProductDescription varchar(10) not null,
 ProductName varchar(10) not null,
 Cost decimal not null);

);