use adlister_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;
CREATE TABLE users (
     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
     username VARCHAR(50) NOT NULL,
     email VARCHAR(50) NOT NULL,
     password VARCHAR(50) NOT NULL,
     PRIMARY KEY(id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(100) NOT NULL,
    description text NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) references users(id)
);