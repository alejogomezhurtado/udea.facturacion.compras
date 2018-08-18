package udea.facturacion.compras.controllers;


import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import udea.facturacion.compras.modelo.DtoCliente;

public class Cliente {
    private static final Logger logger = LogManager.getLogger(Cliente.class);

    public DtoCliente obtener(Integer idCliente){
        DtoCliente cliente = null;
        try {
            Gson gson = new Gson();
            RestTemplate restTemplate = new RestTemplate();
            cliente = restTemplate.getForObject("http://localhost:1114/cliente?idCliente="+idCliente, DtoCliente.class);
            logger.info("Cliente obtenido \n{"+cliente.toString()+"}");

        }catch (Exception ex){
            logger.error(ex);
        }
        return cliente;
    }

}
