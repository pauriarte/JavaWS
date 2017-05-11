package client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import client.wsdl.GetUNSPSCSegments;
import client.wsdl.GetUNSPSCSegmentsResponse;

public class UNSPSCClient extends WebServiceGatewaySupport {

    public GetUNSPSCSegmentsResponse getGetUNSPSCSegments(){

        GetUNSPSCSegments request = new GetUNSPSCSegments();
        GetUNSPSCSegmentsResponse response = (GetUNSPSCSegmentsResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.webservicex.net/GenericUNSPSC.asmx",
                        request,
                        new SoapActionCallback("http://www.webservicex.net/GetUNSPSCSegments"));

        return response;

    }
}
