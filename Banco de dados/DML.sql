--DML (Linguagem de Manipulação de Dados) - Inserem, Editam ou Removem Dados

/*
	INSERT (INSERIR DADOS)
	UPDATE (MODIFICAR DADOS)
	DELETE (REMOVER DADOS)
*/

--Adicionar Dados
INSERT INTO clinica.medico(nome, especialidade, crm) VALUES ('Fulano da Silva', 'otorrinolaringologia', '145690'), ('Cicrano dos Santos', 'Cardiologia','456123'), ('Pedro Pedro Pedro','Ortopedia', '789123');
INSERT INTO clinica.paciente(nome, idade, data_de_nascimento, email, cpf) VALUES ('Jorgin Pastenelli', '33', '1991-09-15', 'jj@emiala.com', '85698745628'), ('Pablo Escobar', '67', '1968-05-08', '', '46815312588');
INSERT INTO clinica.clinica(nome, endereco, descricao) VALUES ('Clinica antropologica', 'Rua dos bobos, 0', '');
INSERT INTO clinica.consulta (data_consulta, valor, id_medico, id_clinica, id_paciente) VALUES ('2025-08-28 23:30:00-03', 168.00, 1, 1, 1), ('2025-08-28 21:30:00-03', 2008.00, 1, 1, 1);

--Atualizar Dado
UPDATE clinica.consulta SET valor = 348.72 WHERE id_consulta = 1; --Foi alterado a coluna valor onde o id_consulta é 1
UPDATE clinica.consulta SET valor = 530 WHERE valor > 500; -- Aqui usamos o maior para alterar todos os valores acima de 500 para 538
UPDATE clinica.consulta SET valor = 530 WHERE valor > 500 AND valor < 1000;-- Aqui usamos uma condicional como parametro para alterar todo valor tambem poderia usar OR (ou).

--Excluir Dados
DELETE FROM clinica.consulta WHERE id_consulta = 2; -- apagamos o registro que tem id 2, 