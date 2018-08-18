package udea.facturacion.compras.infraestructura;

import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import udea.facturacion.compras.controllers.Cliente;
import udea.facturacion.compras.controllers.Factura;
import udea.facturacion.compras.modelo.DtoFactura;

import java.util.concurrent.CompletableFuture;

@Component
public class Consumidor implements MessageListener {
    @Override
    public void onMessage(Message message) {
        Gson gson = new Gson();
        DtoFactura factura = gson.fromJson(new String(message.getBody()), DtoFactura.class);
        new Factura().ingresar(factura);
    }
}