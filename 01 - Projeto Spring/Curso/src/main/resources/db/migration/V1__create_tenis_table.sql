CREATE TABLE Tenis01 (
  id bigint not null auto_increment,
  nome varchar(100) not null,
  tamanhous int not null,
  tamanhobr int not null,
  cabedal varchar(20) not null,
  tipo varchar(10),
  transportadora varchar (20),
  primary key (id)
);