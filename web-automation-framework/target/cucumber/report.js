$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Servicios_Agile1.feature");
formatter.feature({
  "line": 1,
  "name": "Servicios Mesa Agil",
  "description": "",
  "id": "servicios-mesa-agil",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 85,
  "name": "Validar Servicio RM3__getUnifiedResourceDetails_3",
  "description": "",
  "id": "servicios-mesa-agil;validar-servicio-rm3--getunifiedresourcedetails-3",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 84,
      "name": "@RM1UnifiedResourceServices_3"
    }
  ]
});
formatter.step({
  "line": 87,
  "name": "Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails_Value",
  "keyword": "Given "
});
formatter.examples({
  "line": 89,
  "name": "",
  "description": "",
  "id": "servicios-mesa-agil;validar-servicio-rm3--getunifiedresourcedetails-3;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 90,
      "id": "servicios-mesa-agil;validar-servicio-rm3--getunifiedresourcedetails-3;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 91,
      "id": "servicios-mesa-agil;validar-servicio-rm3--getunifiedresourcedetails-3;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12264805500,
  "status": "passed"
});
formatter.before({
  "duration": 151061500,
  "status": "passed"
});
formatter.scenario({
  "line": 91,
  "name": "Validar Servicio RM3__getUnifiedResourceDetails_3",
  "description": "",
  "id": "servicios-mesa-agil;validar-servicio-rm3--getunifiedresourcedetails-3;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 84,
      "name": "@RM1UnifiedResourceServices_3"
    }
  ]
});
formatter.step({
  "line": 87,
  "name": "Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails_Value",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    },
    {
      "val": "3",
      "offset": 48
    }
  ],
  "location": "steps_servicios.seVerificaElAPIRMUnifiedResourceServicesRM__getUnifiedResourceDetails_Value(int,int)"
});
formatter.result({
  "duration": 5300923300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.tsoft.bot.frontend.utility.CallerSOAP_RM3getUnifiedResourceDetails_Value.detailResponse(CallerSOAP_RM3getUnifiedResourceDetails_Value.java:112)\r\n\tat com.tsoft.bot.frontend.utility.CallerSOAP_RM3getUnifiedResourceDetails_Value.Ejecutable(CallerSOAP_RM3getUnifiedResourceDetails_Value.java:28)\r\n\tat com.tsoft.bot.frontend.steps.servicios.steps_servicios.seVerificaElAPIRMUnifiedResourceServicesRM__getUnifiedResourceDetails_Value(steps_servicios.java:73)\r\n\tat ✽.Given Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails_Value(Servicios_Agile1.feature:87)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1153518100,
  "status": "passed"
});
});