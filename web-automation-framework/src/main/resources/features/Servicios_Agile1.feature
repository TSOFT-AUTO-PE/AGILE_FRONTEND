Feature: Servicios Mesa Agil

  @ResourceLogistics.retrieveAvailableDevicesByShop
  Scenario Outline: Validar Servicio ResourceLogistics.retrieveAvailableDevicesByShop

    Given Se verifica el API retrieveAvailableDevicesByShop

    Examples:
      | caso_prueba |
      |           1 |

  @ResourceLogistics.retrieveShopsForDevice
  Scenario Outline: Validar Servicio ResourceLogistics.retrieveShopsForDevice

    Given Se verifica el API retrieveShopsForDevice

    Examples:
      | caso_prueba |
      |           1 |

  @WSResourceLogisticsHTTPv2.determinarOrigMaterial
  Scenario Outline: Validar Servicio WSResourceLogisticsHTTPv2.determinarOrigMaterial

    Given Se verifica el API determinarOrigMaterial

    Examples:
      | caso_prueba |
      |           1 |

  @ResourceLogistics.checkAvailabilityInWarehouse
  Scenario Outline: Validar Servicio ResourceLogistics.checkAvailabilityInWarehouse

    Given Se verifica el API CheckAvailabilityInWarehouse

    Examples:
      | caso_prueba |
      |           1 |

  @X3FindCallerServices
  Scenario Outline: Validar Servicio findCaller

    Given Se verifica el API X3FindCallerServices.findCaller

    Examples:
      | caso_prueba |
      |           1 |

  @RM1UnifiedResourceServices
  Scenario Outline: Validar Servicio RM3__getUnifiedResourceDetails

    Given Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails

    Examples:
      | caso_prueba |
      |           1 |

  @Customer_Management-createCustomer
  Scenario Outline: Validar Servicio CustomerInformation en ambiente UAT-10

    Given Se verifica el API CustomerInformation.createCustomer

    Examples:
      | caso_prueba |
      |           1 |

  @CustomerInformation_createFullCustomerSetup
  Scenario Outline: Validar Servicio CustomerInformation.createFullCustomerSetup en ambiente UAT-4

    Given Se verifica el API CustomerInformation.createFullCustomerSetup

    Examples:
      | caso_prueba |
      |           1 |

  @RM1UnifiedResourceServices_2
  Scenario Outline: Validar Servicio RM3__getUnifiedResourceDetails_2

    Given Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails_ResourceSIM

    Examples:
      | caso_prueba |
      |           1 |

  @RM1UnifiedResourceServices_3
  Scenario Outline: Validar Servicio RM3__getUnifiedResourceDetails_3

    Given Se verifica el API RM1UnifiedResourceServices.RM3__getUnifiedResourceDetails_Value

    Examples:
      | caso_prueba |
      |           1 |