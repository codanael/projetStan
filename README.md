# projetStan
 Projet à faire dans le cadre du cours de web services
 
 Objectif : deux serveurs avec chacun une base de données, et un client web qui se sert des deux serveurs 
 
 Avancement : 
 Une base de données utilisateurs avec une table utilisateur(id, nom, prenom, dateDeNaissance)
 
 Une base de données bus_stan avec 4 tables :
 - Lignebus(id, numero)
 - Arrets(id, nom)
 - Horraires(id, heureDeDebut, frequence, heureDeFin)
 - bus -> ne sert plus pour l'instant.
 
Il y a aussi des tables intermédiaires entre LigneBus, Arrets, et Horraires, afin par exemple d'associer un arret à une ligne grâce à leurs id.

Il reste à faire le/les clients PHP
