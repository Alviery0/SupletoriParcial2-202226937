package logica;
//
public class Parcial {

    public int potencia(int base, int exponente) throws Exception {
//se verifica que no se cumpla ninguna de las condiciones que invalidan la operación
        if (exponente < 0) {
            throw new Exception("El exponente no puede ser negativo");
        }
        if (base == 0 && exponente == 0) {
            throw new Exception("0 elevado a 0 es una indeterminacion");
        }
        if (base == 0) {
            return 0;
        }
        //casos basicos de si es 1 elevado a algo siempre es 1
        if (base == 1) {
            return 1;
        }
 
}