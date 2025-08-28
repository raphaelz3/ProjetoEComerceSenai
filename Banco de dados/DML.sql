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
INSERT INTO clinica.consulta (data_consulta, valor, id_medico, id_clinica, id_paciente) VALUES ('2025-08-28 20:30:00-03', 158.00, 1, 1, 1);