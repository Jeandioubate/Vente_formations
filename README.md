# Eval Java
## Application de vente de Formations

# Projet Trainings Sales

## Description

**Trainings Sales** est une application Java en console permettant de consulter et rechercher des formations commerciales stockées dans une base de données MariaDB.

Le projet est structuré selon une architecture en couches afin de séparer les responsabilités :

* **Entity** : représentation des données métier
* **DAO** : accès aux données (JDBC)
* **Business** : logique métier et contrôles
* **Application** : interface utilisateur en console

## Fonctionnalités

L'application permet à l'utilisateur de :

* afficher la liste de toutes les formations
* rechercher des formations par mot-clé
* filtrer les formations selon leur modalité (présentiel ou distanciel)
* quitter l'application

## Technologies utilisées

* Java (JDK 8 ou supérieur)
* JDBC
* MariaDB
* Architecture DAO / Business
* Application console

fr.ldnr
  application (Main.java)
  business (BusinessTraining.java)
  dao (TrainingDao.java; TrainingDaoImpl.java)
  entity (Training.java)

## Prérequis

Avant de lancer l'application, il est nécessaire de disposer de :

* Java JDK installé
* Une base de données **MariaDB** active
* Un outil de développement (Eclipse, IntelliJ IDEA, VS Code, etc.)

## Configuration de la base de données

L'application se connecte à une base MariaDB avec les paramètres suivants :

* **URL** : `jdbc:mariadb://localhost:3308/Sales`
* **Utilisateur** : `root`
* **Mot de passe** : `fms2025`

La table `training` doit contenir au minimum les colonnes suivantes :

* `t_id` (int)
* `t_name` (varchar)
* `t_description` (varchar)
* `t_time` (int)
* `t_modality` (varchar)
* `t_price` (double)

## Lancement de l'application

1. Ouvrir le projet dans votre IDE Java
2. Vérifier que le connecteur JDBC MariaDB est bien ajouté au projet
3. Vérifier que la base de données est active
4. Lancer la classe :

```
fr.ldnr.application.Main
```

5. Le menu s'affiche dans la console

## Utilisation

Dans la console, l'utilisateur peut saisir :

* `1` : afficher toutes les formations
* `2` : rechercher une formation par mot-clé
* `3` : filtrer par modalité (1/présentiel ou 2/distanciel)
* `0` : quitter l'application
