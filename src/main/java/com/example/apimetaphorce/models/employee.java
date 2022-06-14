package com.example.apimetaphorce.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long idEmployee;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Long phonenumber;
 
    @ManyToOne
    @JoinColumn(name = "contracttype")
    private contracttype contracttype;

    @Column(nullable = false)
    private boolean active; 
    // ID 
    public Long getId() {
        return idEmployee;
    }
    public void setId(Long id) {
        this.idEmployee = id;
    }

    //Nombre
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Apellido
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    //Fecha de nacimiento
     public String getBirthDay() {
        return birthday;
    }
    public void setBirthDay(String birthday) {
        this.birthday = birthday;
    }

    //Correo
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Celular
    public Long getPhoneNumber() {
        return phonenumber;
    }
    public void setPhoneNumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

      //Contrato
    public contracttype getContracttype() {
        return contracttype;
    }
    public void setContracttype(contracttype contract) {
        this.contracttype = contract;
    }

    //activo
    public boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
}
