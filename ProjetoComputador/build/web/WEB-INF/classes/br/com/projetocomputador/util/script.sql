/*******bd_computador*******/

create table produto(
	idProduto serial not null,
	fornecedorProduto varchar (40),
	precoProduto integer,
	constraint pk_produto primary key (idproduto) 
);

create table computadores 
(
	idComputador serial not  null,
	fornecedorComputador varchar (30),
	precoComputador integer,
	ssdComputador integer,
	ramComputador integer,
	idproduto integer,
	constraint pk_computador primary key  (idComputador),
	constraint fk_computador_produto foreign key (idproduto) references produto (idproduto)
);



