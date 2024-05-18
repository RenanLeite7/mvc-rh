
insert into funcionarios (id, nome_funcionario, data_entrada)
values (nextval('funcionarios_seq'), 'Pelé', '1950-12-31');

insert into funcionarios (id, nome_funcionario, data_entrada)
values (nextval('funcionarios_seq'), 'ABC', '1990-07-30');

insert into funcionarios (id, nome_funcionario, data_entrada)
values (nextval('funcionarios_seq'), 'Re', '1999-02-03');


insert into departamento(id, nome) values (nextval('departamentos_seq'), 'RH');
insert into departamento(id, nome) values (nextval('departamentos_seq'), 'Tecnologia da informação');
insert into departamento(id, nome) values (nextval('departamentos_seq'), 'Financeiro');

