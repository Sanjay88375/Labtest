use sanjay;
create table company(company_id int, company_name varchar(30),company_city varchar(30));
insert into company values(1,"Dominos","Los Angeles");
insert into company values(2,"Pizza Hut","San Francisco");
insert into company values(3,"Papa johns","San Diego");
insert into company values(4,"Ah Pizz","Fremont");
insert into company values(5,"Nino Piza", "LasVegas");
insert into company values(6,"Pizzeria","Boston");
insert into company values(7,"Chuck e Cheese","Chicago");
describe company;
create table Items(Item_id int, Item_Name varchar(30), unitsSold int, Company_id int);
insert into items values(1,"Large Pizza",5,2);
insert into items values(2,"Garlic Knots",6,3);
insert into items values(3,"Large Pizza",3,3);
insert into items values(4,"Medium Pizza",8,4);
insert into items values(5,"Breadsticks",7,1);
insert into items values(6,"Medium Pizza",11,1);
insert into items values(7,"Small pizza",9,6);
insert into items values(8,"Small Pizza",6,7);
select items.Item_Name,company.company_city,Items.unitsSold
from Items
inner join company 
where company.company_id = items.company_id;
