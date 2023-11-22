/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Thiago_mafra
 * Created: 21/11/2023
 */



create table coleta(
id serial primary key,
nome varchar(50) not null,
cidade varchar(50)not null,
email varchar(50)not null,
tipoResiduo varchar(50)not null,
latitude float(50)not null,
latitude float(50)not null	
)

select * from coleta