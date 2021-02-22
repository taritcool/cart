CREATE TABLE IF NOT EXISTS ITEM (
  id INT PRIMARY KEY auto_increment,
  itemname VARCHAR(20),
  price FLOAT,
  sellingprice FLOAT
);

CREATE TABLE IF NOT EXISTS USERS (
  id INT PRIMARY KEY auto_increment,
  user_id VARCHAR(20),
  firstname VARCHAR(20),
  lastname VARCHAR(20),
  contact INT
);

CREATE TABLE IF NOT EXISTS CART_ITEM (
  id INT PRIMARY KEY auto_increment,
  user_id INT ,
  item_id INT ,
  FOREIGN KEY (user_id) REFERENCES USERS(id),
  FOREIGN KEY (item_id) REFERENCES ITEM(id)  
);