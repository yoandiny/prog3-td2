create type dish_type as enum ('START', 'MAIN', 'DESSERT');

create table Dish (
    id serial primary key,
    name varchar(255) not null ,
    dish_type dish_type not null
);

create type ingredient_category as enum ('VEGETABLE', 'ANIMAL', 'MARINE', 'DAIRY', 'OTHER');

create table Ingredient (
    id serial primary key,
    name varchar(255) not null ,
    price numeric(10, 2) not null ,
    category ingredient_category not null ,
    id_dish int references Dish(id)
);