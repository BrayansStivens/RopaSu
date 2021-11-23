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
	stock int,
	costo money,
	estado varchar(20),
	precio money,
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
