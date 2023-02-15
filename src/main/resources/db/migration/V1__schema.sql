Create table IF NOT EXISTS  Teacher(
    id int auto_increment primary key,
    name varchar(50) NOT NULL,
    subject varchar(50) NOT NULL
);

insert into Teacher values(Null, 'Marat', 'ICT');
insert into Teacher values(Null, 'Bakytzhan', 'Math');
insert into Teacher values(Null, 'Kanat', 'PE');

create table IF NOT EXISTS  Student(
                                       id int auto_increment primary key,
                                       name varchar(50) not null,
                                       grade int not null,
                                       teacher_id int references Teacher(id)
);

insert into Student values(Null, 'Abay', 3, 2);
insert into Student values(Null, 'Erasyl', 4, 1);
insert into Student values(Null, 'Ersultan', 1, 3);
insert into Student values(Null, 'Alibek', 2, 1);
insert into Student (name, grade, teacher_id) values ('Hector', 4, 7);
insert into Student (name, grade, teacher_id) values ('Pet', 3, 1);
insert into Student (name, grade, teacher_id) values ('Bryna', 3, 15);
insert into Student (name, grade, teacher_id) values ('Artie', 2, 23);
insert into Student (name, grade, teacher_id) values ('Gaby', 1, 15);
insert into Student (name, grade, teacher_id) values ('Oliver', 2, 4);
insert into Student (name, grade, teacher_id) values ('Philbert', 1, 19);
insert into Student (name, grade, teacher_id) values ('Philomena', 1, 19);
insert into Student (name, grade, teacher_id) values ('Lucie', 1, 21);
insert into Student (name, grade, teacher_id) values ('Orazio', 1, 16);
insert into Student (name, grade, teacher_id) values ('Cordy', 3, 20);
insert into Student (name, grade, teacher_id) values ('Myriam', 1, 12);
insert into Student (name, grade, teacher_id) values ('Tarah', 4, 17);
insert into Student (name, grade, teacher_id) values ('Gussie', 4, 1);
insert into Student (name, grade, teacher_id) values ('Bartlet', 2, 5);
insert into Student (name, grade, teacher_id) values ('Darcy', 4, 10);
insert into Student (name, grade, teacher_id) values ('Antonella', 2, 11);
insert into Student (name, grade, teacher_id) values ('Rachelle', 1, 8);
insert into Student (name, grade, teacher_id) values ('Herold', 3, 19);
insert into Student (name, grade, teacher_id) values ('Carey', 4, 21);
insert into Student (name, grade, teacher_id) values ('Philippine', 3, 14);
insert into Student (name, grade, teacher_id) values ('Isabelle', 3, 19);
insert into Student (name, grade, teacher_id) values ('Benedetto', 1, 22);
insert into Student (name, grade, teacher_id) values ('Ailey', 1, 14);
insert into Student (name, grade, teacher_id) values ('Ivett', 1, 19);
insert into Student (name, grade, teacher_id) values ('Rosemonde', 4, 6);
insert into Student (name, grade, teacher_id) values ('Desmund', 4, 24);
insert into Student (name, grade, teacher_id) values ('Inesita', 2, 14);
insert into Student (name, grade, teacher_id) values ('Anette', 2, 13);
insert into Student (name, grade, teacher_id) values ('Bucky', 4, 13);
insert into Student (name, grade, teacher_id) values ('Kylie', 1, 15);
insert into Student (name, grade, teacher_id) values ('Rickey', 2, 13);
insert into Student (name, grade, teacher_id) values ('Cosme', 3, 8);
insert into Student (name, grade, teacher_id) values ('Morgan', 4, 20);
insert into Student (name, grade, teacher_id) values ('Bartlet', 4, 21);
insert into Student (name, grade, teacher_id) values ('Lani', 3, 7);
insert into Student (name, grade, teacher_id) values ('Cathe', 2, 8);
insert into Student (name, grade, teacher_id) values ('Paxon', 2, 4);
insert into Student (name, grade, teacher_id) values ('Hall', 1, 22);
insert into Student (name, grade, teacher_id) values ('June', 3, 2);
insert into Student (name, grade, teacher_id) values ('Curcio', 2, 19);
insert into Student (name, grade, teacher_id) values ('Brendan', 4, 23);
insert into Student (name, grade, teacher_id) values ('Hasty', 4, 9);
insert into Student (name, grade, teacher_id) values ('Edgard', 1, 21);
insert into Student (name, grade, teacher_id) values ('Kristy', 1, 1);
insert into Student (name, grade, teacher_id) values ('Tallia', 3, 3);
insert into Student (name, grade, teacher_id) values ('Susann', 4, 9);
insert into Student (name, grade, teacher_id) values ('Gert', 3, 22);
insert into Student (name, grade, teacher_id) values ('Helsa', 3, 1);
insert into Student (name, grade, teacher_id) values ('Emmey', 1, 2);


