package kensy.danielle.exampleh2mysql.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//SpringBoot
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
/**
 * @author Daniok
 * @since 22/04/2020
 * @version 1.0
 */
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "renda")
    private double income;
}
