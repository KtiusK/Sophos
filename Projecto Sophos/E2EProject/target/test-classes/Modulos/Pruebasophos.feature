

 @tag1
 Feature: Realizar busqueda en Google
  Scenario: Realizar validacion de busqueda en google de: Sophos solutions
    Given Abrir el navegador web chrome
    When El usuario ingresa Sophos solutions 
    And Se espera que realice la busqueda
    Then La pagina de google retorna los resultados
     And Se realiza el cierre del navegador web 

