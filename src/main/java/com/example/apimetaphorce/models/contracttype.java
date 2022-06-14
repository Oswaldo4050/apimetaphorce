package com.example.apimetaphorce.models;


import javax.persistence.*;

@Entity
@Table(name = "contracttype")
public class contracttype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idContrat;

    @Column(nullable = false)
    private String name;
    private String description;

    // ID 
    public Long getIdContract() {
        return idContrat;
    }
    public void setId(Long id) {
        this.idContrat = id;
    }

    //Nombre
    public String getNameContract() {
        return name;
    }
    public void setNameContract(String name) {
        this.name = name;
    }

    //Description
    public String getDescription() {
        return description;
    }
    public void setLastName(String description) {
        this.description = description;
    }
}
