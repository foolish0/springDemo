drop table if exists t_menu;
create table t_menu(
    id INTEGER not null auto_increment,
    name varchar(50) UNIQUE,
    price BIGINT,
    create_time timestamp,
    update_time timestamp,
    PRIMARY key(id)
);


drop table if exists user;
create table user(
    id INTEGER not null auto_increment,
    username varchar(100),
    password varchar(500),
    fail_times INTEGER,
    locked_flag BOOLEAN,
    locked_time TIMESTAMP,
    PRIMARY KEY(id)
);