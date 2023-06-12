package main.java.mx.uv.integracion;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.integracion_uv_mx.examen.SucesorRequest;
import https.integracion_uv_mx.examen.SucesorResponse;

@Endpoint
public class EndPoint {
     @PayloadRoot(localPart= "SucesorRequest",namespace = "https://t4is.uv.mx/saludos")
    @ResponsePayload
    public SucesorResponse sucesor(@RequestPayload SucesorRequest peticion) {
        SucesorResponse respuesta = new SucesorResponse();
        respuesta.setRespuesta(peticion.getNumero()+1);
        return respuesta;
    }
}