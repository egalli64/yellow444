SELECT * FROM yellow.materiali;

delete from materiali where Materiale_id between 6 and 17;
insert into materiali (tipo) values ('truciolato');

<<<<<<< HEAD
update materiali set materiale_id = 5 where tipo = 'truciolato';
=======
-- cleanup
Drop table if exists domanda_offerta;
Drop table if exists aziende;
Drop table if exists materiali;





--
--
create table aziende(
	azienda_id integer primary key auto_increment,
 	nome varchar (30),
	longitudine integer,
	latitudine integer,
	password varchar(10)
);

insert into aziende (nome, longitudine, latitudine, password) values ('EPaper' , 44.330609, 10.712453 , 'Fuffy'), ('Vecchio', 44.229132,10.574866
 , 'Roma') , ('Vetropro',41.543783,14.476636,'password'),('LegnoItaly', 40.499435, 15.893872, 'dicembre'),('D.U.C.', 40.516141,9.126294, 'sminchi');



commit;

--
--

create table materiali(
	Materiale_id integer primary key auto_increment,
	tipo varchar(35) not null

);

insert into materiali (tipo) values ('legno'), (' vetro');

commit;


create table domanda_offerta(
	azienda_id integer,
	materiale_id integer,
	quantità integer,
	scarto boolean,

     primary key(azienda_id, materiale_id),
	 foreign key(azienda_id) references aziende(azienda_id),
	 foreign key(materiale_id) references materiali(materiale_id)
 );

insert into domanda_offerta (azienda_id, materiale_id, quantità, scarto) values (1,2 ,2, true),(2,1,3,false);
	

commit;

--
--

--
>>>>>>> branch 'master' of https://github.com/egalli64/yellow444.git
