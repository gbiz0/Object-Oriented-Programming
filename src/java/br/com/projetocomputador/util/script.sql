/*******bd_computador*******/

create table computador 
(
	idComputador serial not  null,
	fornecedorComputador varchar (30),
	precoComputador numeric (11),
	ramComputador varchar (7),
	ssdComputador varchar (7),
	constraint pk_computador primary key  (idComputador)
);

