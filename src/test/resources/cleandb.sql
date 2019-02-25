# TODO set up a cleandb.sql
SET foreign_key_checks = 0;
delete from users;
INSERT INTO users VALUES (1, 'username', 'password', 'email'), (2, 'testuser', 'testpassword', 'notanemail@gmail'), (3, 'testuser2', 'testpassword2', 'email@gmail');
SET foreign_key_checks = 1;