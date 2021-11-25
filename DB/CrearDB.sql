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
	tiempo varchar(30) default null,
	precio money default null,
	codigoLote varchar(10) foreign key references lote(codigo)
);

--Insertar lote insert into lote values(codigo ,proceso);
	insert into lote values('A1',1);
	insert into lote values('A2',2);
--Insertar prendas insert into prendas values(codigo, nombre, cantidad, clasificacion, codigoLote);
	insert into prendas values('0B1','Blusa',50,'Lujo', 'Proceso', 55000,'A1');
-- consutar prendas por codigo select * from prendas where codigo= codigo
	select * from prendas where codigo='0B1'
-- consutar lote por codigo select * from lote where codigo= codigo
	select * from lote where codigo='A2'


create table empleado(
	codigo varchar(10) primary key,
	nombre varchar(30),
	apellido varchar(30),
	ocupacion varchar(30),
	tipo varchar(30)
);

--Insertar empleado insert into empleado values(codigo, nombre, apellido, ocupacion, tipo);
--consutar empleado por codigo select * from empleado where codigo= codigo


create table proeevedor(
	codigo varchar(10) primary key ,
	nombre varchar(30)
);

-- Insertar proeevedores insert into proeevedor values('codigo', 'nombre')
insert into proeevedor values('P1', 'Hilos SAS'), ('P2', 'Botones SAS'), ('P3', 'Tela SAS')

create table materia_prima(
	codigo varchar(10) primary key,
	nombre varchar(30),
	costos money,
	codigoPrenda varchar(10) foreign key references prendas(codigo),
	codigoProeevedor varchar(10) foreign key references proeevedor(codigo)
);

--Insertar materia_prima insert into materia_prima values(codigo, nombre, costos, codigoPrenda, codigoProeevedor)
insert into materia_prima values('H1', 'Hilo Rosado', 500000, '0B1', 'P1');
--Consultar costos select m.costos, pr.nombre, p.nombre  from materia_prima as m inner join prendas as  pr  on m.codigoPrenda=pr.codigo inner join proeevedor as p on m.codigoProeevedor=p.codigo where m.codigo=codigo
select m.costos, pr.nombre, p.nombre  from materia_prima as m inner join prendas as  pr  on m.codigoPrenda=pr.codigo inner join proeevedor as p on m.codigoProeevedor=p.codigo where m.codigo='H1'

--Actualizar tiempo prenda update prendas set tiempo = tiempo where codigo = codigo
--Consultar tiempo prenda select tiempo from prendas where codigo = codigo
--Actualizar precio prenda update prendas set precio = precio where codigo = codigo
--Consultar precio prenda select precio from prendas where codigo = codigo


