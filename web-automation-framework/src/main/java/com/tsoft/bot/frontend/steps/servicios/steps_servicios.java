package com.tsoft.bot.frontend.steps.servicios;

import com.tsoft.bot.frontend.utility.*;

import cucumber.api.java.en.Given;

import java.util.HashMap;
import java.util.List;

public class steps_servicios {

    @Given("^Se verifica el API CustomerInformation$")
    public void seVerificaElAPICustomerInformation() {
        CallerSOAP_CustomerInformation.API_API_TEST_CI();



    }

    @Given("^Se verifica el API PaymentManagement$")
    public void seVerificaElAPIPaymentManagement() throws Throwable {
        CallerSOAP_PaymentsManagement.API_API_TEST_PM();
    }

    @Given("^Se verifica el API retrieveAvailableDevicesByShop$")
    public void seVerificaElAPIRetrieveAvailableDevicesByShop() throws Throwable {
        CallerSOAP_AvailableDevicesByShop.Ejecutable();
    }

    @Given("^Se verifica el API retrieveShopsForDevice$")
    public void seVerificaElAPIRetrieveShopsForDevice() throws Throwable {
        CallerSOAP_ShopsForDevice.Ejecutable();
    }

    @Given("^Se verifica el API determinarOrigMaterial$")
    public void seVerificaElAPIDeterminarOrigMaterial() throws Throwable {
        CallerSOAP_determinarOrigMaterial.Ejecutable();
    }

    @Given("^Se verifica el API CheckAvailabilityInWarehouse$")
    public void seVerificaElAPICheckAvailabilityInWarehouse() throws Throwable {
        CallerSOAP_CheckAvailabilityInWarehouse.Ejecutable();
    }

    @Given("^Se verifica el API X(\\d+)FindCallerServices\\.findCaller$")
    public void seVerificaElAPIXFindCallerServicesFindCaller(int arg0) throws Throwable {
        CallerSOAP_findCaller.Ejecutable();
    }

    @Given("^Se verifica el API RM(\\d+)UnifiedResourceServices\\.RM(\\d+)__getUnifiedResourceDetails$")
    public void seVerificaElAPIRMUnifiedResourceServicesRM__getUnifiedResourceDetails(int arg0, int arg1) throws Throwable {
        CallerSOAP_RM3getUnifiedResourceDetails.Ejecutable();
    }

    @Given("^Se verifica el API CustomerInformation\\.createCustomer$")
    public void seVerificaElAPICustomerInformationCreateCustomer() throws Throwable {
        CallerSOAP_createCustomer.Ejecutable();
    }

    @Given("^Se verifica el API CustomerInformation\\.createFullCustomerSetup$")
    public void seVerificaElAPICustomerInformationCreateFullCustomerSetup() throws Throwable {
        CallerSOAP_createFullCustomerSetup.Ejecutable();

    }

    @Given("^Se verifica el API RM(\\d+)UnifiedResourceServices\\.RM(\\d+)__getUnifiedResourceDetails_ResourceSIM$")
    public void seVerificaElAPIRMUnifiedResourceServicesRM__getUnifiedResourceDetails_ResourceSIM(int arg0, int arg1) throws Throwable {
        CallerSOAP_RM3getUnifiedResourceDetails_ResourceSIM.Ejecutable();
    }

    @Given("^Se verifica el API RM(\\d+)UnifiedResourceServices\\.RM(\\d+)__getUnifiedResourceDetails_Value$")
    public void seVerificaElAPIRMUnifiedResourceServicesRM__getUnifiedResourceDetails_Value(int arg0, int arg1) throws Throwable {
        CallerSOAP_RM3getUnifiedResourceDetails_Value.Ejecutable();
    }
}
