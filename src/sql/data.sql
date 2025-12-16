insert into Dish (name, dish_type) values
    ('Salade fraîche', 'START'),
    ('Poulet grillé', 'MAIN'),
    ('Riz aux légumes', 'MAIN'),
    ('Gâteau au chocolat', 'DESSERT'),
    ('Salade de fruits', 'DESSERT');

insert into Ingredient (id, name, price, category, id_dish) values
    (1, 'Laitue', 800.00, 'VEGETABLE', 1),
    (2, 'Tomate', 600.00, 'VEGETABLE', 1),
    (3, 'Poulet', 4500.00, 'ANIMAL', 2),
    (4, 'Chocolat', 3000.00, 'OTHER', 4),
    (5, 'Beurre', 2500.00, 'DAIRY', 4);