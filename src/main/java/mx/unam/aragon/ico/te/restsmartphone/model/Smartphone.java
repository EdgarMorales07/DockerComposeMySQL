package mx.unam.aragon.ico.te.restsmartphone.model;

import jakarta.persistence.*;

@Entity
@Table(name = "smartphone")
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String modelo;

    private Integer anio;

    @Column(length = 50)
    private String procesador;

    @Column(length = 5)
    private String almacenamiento;

    @Column(length = 5)
    private String ram;
}
