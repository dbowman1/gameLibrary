# TODO set up a cleandb.sql
SET foreign_key_checks = 0;
delete from users;
delete from roles;
delete from games;
delete from game_user;
INSERT INTO users VALUES (1, 'username', 'password', 'email'), (2, 'testuser', 'testpassword', 'notanemail@gmail'), (3, 'testuser2', 'testpassword2', 'email@gmail');
INSERT INTO games VALUES (1, 12345);
INSERT INTO game_user VALUES (1, 1);
SET foreign_key_checks = 1;