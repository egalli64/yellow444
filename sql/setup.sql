drop user if exists yellow;
drop schema if exists yellow;


create user yellow identified by 'password';
create schema yellow;

grant all privileges on yellow.* to yellow;
grant alter routine on yellow.* to yellow;