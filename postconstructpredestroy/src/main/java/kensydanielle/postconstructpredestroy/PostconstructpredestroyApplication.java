package kensydanielle.postconstructpredestroy;

import kensydanielle.postconstructpredestroy.dao.ClientDAO;
import kensydanielle.postconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author daniok
 * @since 16/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class PostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Danielle Kensy"));

		System.out.println("objeto ClientDAO: " + clientDAO);
		System.out.println("objeto cliente: " + clientDAO.getClient());
	}

}
