create database mini_dish_db;
create user mini_dish_db_manager;
grant connect on database mini_dish_db to mini_dish_db_manager;
grant create, update, delete, insert, select on all table to mini_dish_db_manager;
