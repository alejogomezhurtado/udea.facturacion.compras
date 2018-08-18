package udea.facturacion.compras.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import udea.facturacion.compras.modelo.DtoFactura;

public class Factura {
	private static final Logger logger = LogManager.getLogger(Factura.class);

	public void ingresar(DtoFactura factura){
		logger.info("Ingresa Factura \n{"+factura.toString()+"}");
		new Cliente().obtener(factura.getIdCliente());
	}
}
