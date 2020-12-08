@tag
Feature: Ajouter un membre
  En tant qu administrateur, je voudrai que chaque membre créé possède le nom et l age 
  que je lui assigne
  
  @tag1
  Scenario Outline: Ajouter un membre qui existe
    Given la creation d un membre <nom>
    When l utilisateur valide la creation
    Then le systeme ne valide pas avec le <messageErreur> si l utilisateur existe deja.

    Examples: 
      | nom  					 | messageErreur 							|
      | "David Gilmur" | "L'utilsateur existe deja" |

  @tag2
  Scenario Outline: Refus d age negatif
    Given la creation d un membre <nom> et d age <age>
    When l utilisateur valide la creation
    Then le systeme refuse avec le <messageErreur>

    Examples: 
      | nom  					 | age	 	| messageErreur |
      | "David Gilmur" |     -5 | "Age Negatif" |

