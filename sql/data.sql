
use yellow;

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

insert into aziende (nome, longitudine, latitudine, password) values ('Gino' , 0272, 9837 , 'huhu'), ('pino', 7483, 7266, 'snsjsb') ;



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

insert into domanda_offerta (azienda_id, materiale_id, quantità, scarto) values
	(1,2 ,2, true),
	(2,1,3,false), 
	(3,4,2, true), 
	(1,5,3, false),
	(1,2,6,true);
	

commit;

--
--

--
