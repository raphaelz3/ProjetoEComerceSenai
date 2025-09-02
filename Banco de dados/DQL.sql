
--DQL (Linguagem de Consulta de Dados) - Visualização de Dados
SELECT * FROM clinica.medico;
SELECT * FROM clinica.paciente;
SELECT * FROM clinica.consulta;
SELECT * FROM clinica.clinica;

--JOIN
--Join, serve para juntar tabelas, usando a chave estrangeira
-- AS, serve para mudar visualmente um resultado

SELECT nome FROM clinica.consulta JOIN clinica.medico ON clinica.consulta.id_medico = clinica.medico.id_medico;