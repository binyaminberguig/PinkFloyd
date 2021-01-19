#Author: l'équipe yoyo

Feature: US0 Marquer un but
En tant que joueurs de foot , je dois vérifier si mon compteur de but augmente
  
  Scenario: Doit ajouter un but au compteur si le joueurs marque  
  Given un joueur  
  When  il marque un but
  Then  Son nombre de but augmente
  
  Scenario: Doit prendre un carton rouge si il commet deux fautes 
  Given un joueur  
  When  il commet deux fautes
  Then  il prend un carton rouge