package logica;

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
        //verigicacion si cuando la base es -1, y el exponente es par, es el mismo numero pero en positivo
        if (base == -1) {
            if (exponente % 2 == 0) {
                return 1;
            }
            return -1;
        }

        long resultado = 1;   // long por si como en el caso anterior se pasa del rango de un int
        //for normal para sacar el resultado, multiplica la base por la cantidad de veces que indique el parametro de exponente
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        return (int) resultado;
    }
}