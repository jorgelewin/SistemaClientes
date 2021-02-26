package ar.edu.unju.fi.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "cli_dni")
    private int dni;
    @Column(name = "cli_apellidos")
    private String apellidos;
    @Column(name = "cli_nombres")
    private String Nombres;

    public Cliente() {
    }

    public Cliente(int dni, String apellidos, String nombres) {
        
        this.dni = dni;
        this.apellidos = apellidos;
        Nombres = nombres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    @Override
    public String toString() {
        return "Cliente [Nombres=" + Nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", id=" + id + "]";
    }

}
