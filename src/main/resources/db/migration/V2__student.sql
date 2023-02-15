create table IF NOT EXISTS  Student(
    id int auto_increment primary key,
    iin int not null,
    name varchar(50) not null,
    grade int not null,
    teacher_id int references Teacher(id)
);