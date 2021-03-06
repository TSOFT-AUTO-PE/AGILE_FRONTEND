/*@autor : Abraham Hernandez*/
package com.tsoft.bot.frontend.utility;

import com.tsoft.bot.frontend.helpers.Hook;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;


public class CallerSOAP_createFullCustomerSetup {

    private static final String EXCEL_SERVICE = "excel/Service_Agile8.xlsx";
    private static final String HOJA_SERVICE = "Servicios";
    private static final String COLUMNA_URL = "Url";
    private static final String COLUMNA_RESQUEST = "Resquest";
    private static WebDriver driver;

    public static void Ejecutable() throws Throwable {
        driver = Hook.getDriver();
        String url = getDataFrom().get(0).get(COLUMNA_URL);
        String resquest = getDataFrom().get(0).get(COLUMNA_RESQUEST);
        getValueTagXML(detailResponse(url, resquest), "customerAccountID", 0);
        ExtentReportUtil.INSTANCE.stepInfo(driver, "El Tag de validación es customerAccountID: "+getValueTagXML(detailResponse(url, resquest), "customerAccountID", 0));
    }


    public static String getValueTagXML(String getResponse, String getSpecificTag, int pos) {

        String getVar1 = null;

        try {

            String response = getResponse;
            InputStream inputStream = new ByteArrayInputStream(response.getBytes());
            SOAPMessage message = MessageFactory.newInstance().createMessage(null, inputStream);
            SOAPPart soapPart = message.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPBody body = envelope.getBody();
            NodeList var1 = body.getElementsByTagNameNS("*", getSpecificTag);
            getVar1 = var1.item(pos).getChildNodes().item(0).getNodeValue();
            System.out.println(getVar1);

        } catch (Exception e) {
            e.getMessage();
        }

        assert getVar1 != null;
        return getVar1;
    }

    public static String detailResponse(String urlExcel, String requestExcel) {

        StringBuffer response = null;
        try {

            String url = urlExcel;
            URL obj = new URL(url);
            long inicioDate = System.currentTimeMillis();
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            con.setRequestProperty("Accept-Charset", "application/xml");
            String request = requestExcel;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(request);
            wr.flush();
            wr.close();
            int responseStatus = con.getResponseCode();

            if (responseStatus == 200) {
                System.out.println("Servicio culminó con éxito" + " ==> " + "Estado : " + responseStatus);
            } else {
                if (responseStatus == 500) {
                    System.out.println("Error en el servicio" + " ==> " + "Estado : " + responseStatus);
//
                }
                System.out.println("El servicio retornó estado: " + responseStatus);
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            long finDate = System.currentTimeMillis();
            System.out.println("Tiempo de respuesta: " + ((finDate - inicioDate) / 1000.0) + " segs");
            ExtentReportUtil.INSTANCE.stepPass(driver, "Tiempo de respuesta: " + ((finDate - inicioDate) / 1000.0) + " segs");

            if (responseStatus == 200) {
                ExtentReportUtil.INSTANCE.stepPass(driver, "Servicio culminó con éxito"  + " ==> " + "Estado : " +responseStatus);
            }else {
                if (responseStatus == 500) {
                    ExtentReportUtil.INSTANCE.stepFail(driver, "Servicio culminó con fallo"  + " ==> " + "Estado : " +responseStatus);
                }
                if(response.toString() == "Connection timed out: connect"){
                    ExtentReportUtil.INSTANCE.stepFail(driver, "Servicio culminó con fallo"  + " ==> " + "Estado : " +response.toString());
                }
                System.out.println("El servicio retornó estado: " + responseStatus);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
       return response.toString();
    }


    private static List<HashMap<String, String>> getDataFrom() throws Throwable {
        return ExcelReader.data(EXCEL_SERVICE, HOJA_SERVICE);
    }
}
