﻿/*******bd_computador*******/

create table computadores 
(
	idComputador serial not  null,
	fornecedorComputador varchar (30),
	precoComputador numeric,
	ssdComputador numeric,
	ramComputador numeric,
	constraint pk_computador primary key  (idComputador)
);
