$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Katiusca/eclipse-workspace/Sophos Solutions/com.MyCucumber.Project/src/test/java/Modulos/Pruebasophos.feature");
formatter.feature({
  "line": 4,
  "name": "Realizar busqueda en Google",
  "description": "",
  "id": "realizar-busqueda-en-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Realizar validacion de busqueda en google de: Sophos solutions",
  "description": "",
  "id": "realizar-busqueda-en-google;realizar-validacion-de-busqueda-en-google-de:-sophos-solutions",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Abrir el navegador web chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "El usuario ingresa Sophos solutions",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Se espera que realice la busqueda",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "La pagina de google retorna los resultados",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Se realiza el cierre del navegador web",
  "keyword": "And "
});
formatter.match({
  "location": "metodos.abrir_el_navegador_web_chrome()"
});
formatter.result({
  "duration": 42119699200,
  "status": "passed"
});
formatter.match({
  "location": "metodos.el_usuario_ingresa_Sophos_solutions()"
});
formatter.result({
  "duration": 86700,
  "status": "passed"
});
formatter.match({
  "location": "metodos.se_espera_que_realice_la_busqueda()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
formatter.match({
  "location": "metodos.la_pagina_de_google_retorna_los_resultados()"
});
formatter.result({
  "duration": 27000,
  "status": "passed"
});
formatter.match({
  "location": "metodos.se_realiza_el_cierre_del_navegador_web()"
});
formatter.result({
  "duration": 30700,
  "status": "passed"
});
});