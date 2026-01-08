
DROP DATABASE IF EXISTS Sales;
CREATE DATABASE Sales;
USE Sales;



CREATE TABLE IF NOT EXISTS training(
   t_id INT AUTO_INCREMENT,
   t_name VARCHAR(250) NOT NULL,
   t_description TEXT,
   t_time INT NOT NULL,
   t_modality ENUM('presentiel', 'distanciel') NOT NULL,
   t_price DECIMAL(10,2),
   PRIMARY KEY(t_id)
) ENGINE=InnoDB;


INSERT INTO `training` (`t_name`, `t_description`, `t_time`, `t_modality`, `t_price`) VALUES
('Initiation informatique', 'Bases informatique, utilisation ordinateur et des logiciels courants', 5, 'presentiel', 450.00),
('Developpement Web HTML & CSS', 'Creation de sites web statiques avec HTML5 et CSS3', 4, 'distanciel', 380.00),
('Programmation Java Debutant', 'Introduction POO avec Java', 10, 'presentiel', 1200.00),
('Bases de donnees relationnelles', 'Conception et interrogation de bases de donnees SQL', 6, 'distanciel', 650.00),
('Gestion de projet', 'Methodes et outils pour piloter un projet efficacement', 5, 'presentiel', 800.00),
('Python pour debutants', 'Apprendre les bases du langage Python', 7, 'distanciel', 700.00),
('Cybersecurite fondamentaux', 'Sensibilisation aux risques informatiques et aux bonnes pratiques', 3, 'presentiel', 500.00),
('Analyse de donnees', 'Exploitation et analyse de donnees avec des outils statistiques', 8, 'distanciel', 950.00),
('Reseaux informatiques', 'Principes des reseaux, protocoles et architecture', 6, 'presentiel', 850.00),
('Bureautique avancee', 'Maitrise avancee des outils Word, Excel et PowerPoint', 4, 'distanciel', 400.00);




