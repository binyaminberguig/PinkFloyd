#Author: l'équipe yoyo

Feature: US1 Gestion du match
En tant qu'\arbitre je dois gerer le score et le nombre de fautes du match
  
  Scenario: Doit ajouter un but au score si l'equipe un marque un but
  Given une premiere equipe  
  And   une deuxieme equipe
  And   creation du match
  When  equipe un marque un but
  Then  le score change
  
  Scenario: Doit ajouter une faute au total de fautes si une equipe commet une faute
  Given une premiere equipe  
  And   une deuxieme equipe
  And   creation du match
  When  equipe un commet une faute
  Then  le nombre de fautes change
