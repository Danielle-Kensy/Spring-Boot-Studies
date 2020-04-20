package kensydanielle.componentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author daniok
 * @since 16/04/2020
 * @version 1.0
 */

@SpringBootApplication
@ComponentScan("externalclasses")
class ComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext  = SpringApplication.run(ComponentScanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());
	}

}
