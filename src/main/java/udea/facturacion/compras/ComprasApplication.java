package udea.facturacion.compras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComprasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ComprasApplication.class);
		app.setWebEnvironment(false);
		app.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {

	}
}
