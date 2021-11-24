use master

create database RopaSu

use RopaSu

create table lote(
	
	codigo varchar(10) primary key,
	proceso int
);

create table prendas(
	
	codigo varchar(10) primary key,
	nombre varchar(30),
	cantidad int,
	clasi varchar(30),
	codigoLote varchar(10) foreign key references lote(codigo)
);

create table proeevedor(
	codigo varchar(10) primary key,
	nombre varchar(30)
);

create table materia_prima(
	codigo varchar(10) primary key,
	nombre varchar(30),
	codigoPrenda varchar(10) foreign key references prendas(codigo),
	codigoProeevedor varchar(10) foreign key references proeevedor(codigo)
);

	insert into lote values('A1',1);
	insert into lote values('A2',2);

	insert into prendas values('0B1','Blusa',50,'Lujo','A1');

create table empleado(
	codigo varchar(10) primary key,
	nombre varchar(30),
	apellido varchar(30)
);

create table operario(
	ocupacion varchar(30),
	codigoEmpleado varchar(10) foreign key references empleado(codigo) primary key
);

create table supervisor(
	codLote varchar(10) foreign key references lote(codigo),
	codigoEmpleado varchar(10) foreign key references empleado(codigo) primary key
);


create table loteOperador(
	codLote varchar(10) foreign key references lote(codigo),
	codigoEmpleado varchar(10) foreign key references operario (codigoEmpleado)

	primary key(codLote, codigoEmpleado)
);
