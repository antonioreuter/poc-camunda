insert into poc_camunda.category (name, description) values('Entrega', 'Motivos de Entrega');
insert into poc_camunda.category (name, description) values('Duvidas', 'Motivos de Duvidas');
insert into poc_camunda.category (name, description) values('Operações', 'Motivos de Operações com o Pedido');


insert into poc_camunda.reason (name, description, category_id, process_id) values ('Atraso na Entrega', 'A entrega do cliente esta atrasado', 1, 0);
insert into poc_camunda.reason (name, description, category_id, process_id) values ('Entrega extraviada', 'A entrega do cliente foi extraviada', 1, 0);
insert into poc_camunda.reason (name, description, category_id, process_id) values ('Esqueci meu login', 'O cliente esqueceu o seu login de acesso', 2, 0);
insert into poc_camunda.reason (name, description, category_id, process_id) values ('Dúvidas sobre o pedido', 'O cliente deseja saber sobre o andamento da sua entrega', 2, 0);
insert into poc_camunda.reason (name, description, category_id, process_id) values ('Cancelar o pedido', 'O cliente deseja cancelar o seu pedido', 3, 0);
insert into poc_camunda.reason (name, description, category_id, process_id) values ('Troca de produto', 'O cliente deseja efetuar uma troca', 3, 0);

commit;
