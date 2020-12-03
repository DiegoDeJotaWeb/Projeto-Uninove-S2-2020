create database barbearia;
use barbearia;

create table user(
idUser INT AUTO_INCREMENT PRIMARY KEY,
userUser varchar(200),
senhaUser varchar(200)
);

create table cliente(
idCliente INT AUTO_INCREMENT PRIMARY KEY,
nomeCliente varchar(255),
cpfCliente varchar(12)
);

create table servico(
idServico INT AUTO_INCREMENT PRIMARY KEY,
nomeServico varchar(255),
valorServico varchar(100)
);

create table agenda(
idAgenda INT AUTO_INCREMENT PRIMARY KEY,
dataAgenda date,
horaAgenda time,
observacao text,
servico_id INT,
cliente_id INT
);


