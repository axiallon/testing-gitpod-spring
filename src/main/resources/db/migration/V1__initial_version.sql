create table contact (
    id serial primary key,
    first_name varchar(200) not null,
    last_name varchar(200) not null
);

insert into contact (first_name, last_name) values ('John', 'Doe');
insert into contact (first_name, last_name) values ('Bill', 'Johnson');
insert into contact (first_name, last_name) values ('Sarah', 'Williams');
