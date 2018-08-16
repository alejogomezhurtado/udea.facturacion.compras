package udea.facturacion.compras.infraestructura;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import udea.facturacion.compras.controllers.Cliente;

import java.util.concurrent.CompletableFuture;

@Component
public class Consumidor implements MessageListener {
    @Override
    public void onMessage(Message message) {
        new Cliente().obtener(new String(message.getBody()));
        System.out.println(new String(message.getBody()));
    }
}