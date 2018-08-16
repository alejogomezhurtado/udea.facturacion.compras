package udea.facturacion.compras.controllers;


import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;

import udea.facturacion.compras.modelo.DtoCliente;
import udea.facturacion.compras.modelo.DtoSap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

    public DtoCliente obtener(String message){
        Gson gson = new Gson();
        DtoSap sap = gson.fromJson(message, DtoSap.class);
        RestTemplate restTemplate = new RestTemplate();
        //sap.getIdCliente()
        DtoCliente cliente = restTemplate.getForObject("http://localhost:1114/cliente?idCliente="+sap.getIdCliente(), DtoCliente.class);
        return cliente;
    }

}
