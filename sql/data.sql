SELECT * FROM yellow.materiali;

delete from materiali where Materiale_id between 6 and 17;
insert into materiali (tipo) values ('truciolato');

update materiali set materiale_id = 5 where tipo = 'truciolato';