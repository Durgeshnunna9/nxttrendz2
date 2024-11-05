create TABLE if not exists category(
    categoryId INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255)
);

create TABLE if not exists product(
    productId INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    description varchar(255),
    price DOUBLE,
    categoryId INT,
    FOREIGN KEY(categoryId) REFERENCES category(categoryId)
);