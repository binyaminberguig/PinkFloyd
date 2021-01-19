#Author: Farouk

@tag
Feature: US3 Fan des PinkFloyd Marque un but
En tant que fan des PinkFloyd, je serai Ègalement joueur de foot , je dois v√©rifier si mon compteur de but augmente
  
  Scenario: Doit ajouter un but au compteur si le fan marque
  Given un fan des PinkFloyd  
  When  marque
  Then  Son nombre de but augmentera
  
  Scenario: Doit prendre un carton rouge si le fan commet deux fautes 
  Given un fan des PinkFloyd  
  When  le fan commet deux fautes
  Then  le fan prend un carton rouge
