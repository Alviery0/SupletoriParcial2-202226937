package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    public void setUp() {
        parcial = new Parcial();
    } //para que se reinicie cada vez que haga un test y no se tranquen entre si

    @Test
    //ejemplo del enunciado 
    public void potenciaNormal() throws Exception {
        assertEquals(100, parcial.potencia(10, 2));
    }

    @Test
    //test para el exponente cero, debe dar 1
    public void exponenteCero() throws Exception {
        assertEquals(1, parcial.potencia(5, 0));
    }

    @Test
    //test para el exponente negativo, se supone que tiene que dar error
    public void baseNegativa() throws Exception {
        assertEquals(-8, parcial.potencia(-2, 3));
        assertEquals(4, parcial.potencia(-2, 2));
    }
    
    @Test
    //test para cuadno se mete un exponente negativo y debe dar error otra vez
    public void exponenteNegativo() {
        Exception ex = assertThrows(Exception.class, () -> parcial.potencia(2, -1));
        assertEquals("El exponente no puede ser negativo", ex.getMessage());
    }

    @Test
    //el ejemplo de la indeterminacion de 0 elevado a 0
    public void ceroElevadoACero() {
        Exception ex = assertThrows(Exception.class, () -> parcial.potencia(0, 0));
        assertEquals("0 elevado a 0 es indeterminado", ex.getMessage());
    }

    @Test
    //test para cuando la base es cero, siempre debe dar cero
    public void ceroElevadoAPositivo() throws Exception {
        assertEquals(0, parcial.potencia(0, 5));
    }


    @Test
    //ejemplo para cuando la base es 1, siempre debe retornar uno, no importa el exponente
    public void unoElevadoAlgo() throws Exception {
        assertEquals(1, parcial.potencia(1, 2000000000));
    }


    

}
