package modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import util.Fecha;
import modelo.Contraseña;
import modelo.Correo;
import modelo.Direccion;
import modelo.Mundo;
import modelo.Nif;
import modelo.Patron;
import modelo.Posicion;
import modelo.Usuario;
import modelo.Usuario.RolUsuario;

public class MundoTest{
    private Mundo mundo1;
    private Mundo mundo2;

    @Before
    public void crearObjetosPrueba() {
        mundo1 = new Mundo();
        byte[][] espacio;
		mundo2 = new Mundo("Mundo defecto", "parametros", "distribucion", espacio);
    }

    @After
    public void borrarObjetosPrueba() {
        mundo1 = null;
        mundo2 = null;
    }

    @Test
    public void testMundoConvencional() {
        assertTrue(mundo2 != null);
    }

    @Test
    public void testGetNombre(){
        assertEquals(mundo2.getNombre(), "Mundo");   
    }

    public void testGetConstantes(){
        assertEquals(mundo2.getConstantes(), "Mundo");   
    }

    public void testGetDistribucion(){
        assertEquals(mundo2.getNombre(), "Mundo");   
    }

    public void testGetEspacio(){
        assertEquals(mundo2.getNombre(), "Mundo");   
    }

    public void testSetNombre() {
        mundo1.setNombre("Mundo");
        assertEquals(mundo2.setNombre(), "Mundo");
    }
   
    public void testSetConstantes() {
        mundo1.setConstantes("Mundo");
        assertEquals(mundo2.setNombre(), "Mundo");
    }
   
    public void testSetDistribucion() {
        mundo1.setDistribucion("Mundo");
        assertEquals(mundo2.setNombre(), "Mundo");
    }
   
    public void testSetEspacio() {
        mundo1.setEspacio("Mundo");
        assertEquals(mundo2.setNombre(), "Mundo");
    }
   
   
} //class