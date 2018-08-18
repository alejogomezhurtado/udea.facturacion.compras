package udea.facturacion.compras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComprasApplication{

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ComprasApplication.class);
		app.setWebEnvironment(false);
		app.run(args);
	}

}
