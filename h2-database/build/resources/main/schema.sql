create table trainer(
    id_trainer bigint auto_increment,
    name_trainer varchar(50) not null,
    age int not null,
    primary key(id_trainer));

create table pokemon(
    id_pokemon bigint auto_increment,
    name_pokemon varchar(50) not null,
    type varchar(30) not null,
    level int not null,
    primary key(id_pokemon));
