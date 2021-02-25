package ar.edu.unju.fi;


import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import ar.edu.unju.fi.aplicacion.modelo.dominio.Cliente;


public class ClienteTest 
{
   
    private static EntityManager manager;
    private static EntityManagerFactory emf;
    
    @Test
    public void agregarClienteTest()
    {
        emf = Persistence.createEntityManagerFactory("prueba");
        manager = emf.createEntityManager();

        manager.getTransaction().begin();

        Cliente cliente01 = new Cliente(29752841, "Zapana", "Jose");

        manager.persist(cliente01);
        

        manager.getTransaction().commit();

        assertEquals(1, manager.find(Cliente.class, 1L).getId());
    }
}
