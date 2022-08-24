DROP TABLE IF EXISTS CASA;
DROP TABLE IF EXISTS COR;

CREATE TABLE COR (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	NOME VARCHAR(32),
	R INT,
	G INT,
	B INT
);

INSERT INTO COR (NOME, R, G, B) VALUES 
	('Azul', 0, 0, 255),
	('Verde', 0, 255, 0),
	('Vermelho', 255, 0, 0),
	('Rosa', 255, 0, 128),
	('Amarelo', 255, 255, 0),
	('Laranja', 255, 128, 0),
	('Magenta', 255, 0, 255),
	('Roxo', 128, 0, 255);

CREATE TABLE CASA (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	IDCOR INT,
	NUMEROQUARTOS INT,
	NUMEROBANHEIROS INT,
	POSSUIGARAGEM VARCHAR(1),
	FOREIGN KEY (IDCOR) REFERENCES COR (ID)
);

INSERT INTO CASA (IDCOR, NUMEROQUARTOS, NUMEROBANHEIROS, POSSUIGARAGEM) VALUES
	(1, 2, 2, 'S'),
	(2, 3, 2, 'S'),
	(3, 1, 1, 'N'),
	(3, 2, 1, 'N'),
	(4, 4, 2, 'S');