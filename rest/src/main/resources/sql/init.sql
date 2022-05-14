drop schema if exists test_json cascade;
create schema test_json;

create table test_json.person (
    id bigint PRIMARY KEY,
    name varchar(255),
    age int,
    mate json
);