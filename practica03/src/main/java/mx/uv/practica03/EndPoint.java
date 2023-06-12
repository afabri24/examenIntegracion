package mx.uv.practica03;


import java.util.ArrayList;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.SucesorRequest;
import https.t4is_uv_mx.saludos.SucesorResponse;




@Endpoint
public class EndPoint {
    @PayloadRoot(localPart= "SucesorRequest",namespace = "https://t4is.uv.mx/saludos")

    @ResponsePayload
    public SucesorResponse sucesor(@RequestPayload SucesorRequest peticion) {
        SucesorResponse respuesta = new SucesorResponse();
        respuesta.setNumero(peticion.getNumero()+1);
        return respuesta;
    }
}
