package com.benjamin.myapplication;

import static java.lang.Math.sqrt;

/**
 * @author Daniel Marcos Benjamín Gonzalo
 * @version 1.0
 * Clase que contiene métodos para trabajar con números primos.
 */
public class NumerosPrimos {

    /**
     * Comprueba si un entero positivo mayor que 0 es o no es primo. Si el entero es 0, 1, o negativo
     * devuelve false.
     * Por si se le pasa como argumento un valor nulo, se envuelve la comparación del entero en un
     * bloque try-catch.
     * En esa comparación del número entero que se le pasa, se comprueba si es un valor menor que 2.
     * De ser así, se retorna falso, ya que el 1, el 0 y los enteros negativos no son primos.
     * Por último, comprueba uno a uno todos los divisores del número, desde 2 hasta la raíz cuadrada
     * del número, ya que no es necesario comprobar más divisores.
     * En el momento que encuentra un divisor, devuelve false, y si tras comprobar todos los
     * divisores no ha encontrado ninguno, devuelve true.
     * @author Daniel Marcos Benjamín Gonzalo
     * @param numero Entero que representa el valor del número que se quiere calcular si es primo.
     * @return boolean Devuelve true si el número que se pasa como argumento es primo y false si no
     * lo es, es un entero negativo, o se le pasa una referencia nula.
     * @version 1.3
     *  - Se añade el bloque try-catch para controlar la entrada de un parámetro nulo como entero.
     */
    public static boolean esPrimo(int numero) {

        //Comprobamos que no es un número negativo, el cero, el uno, o una referencia nula.
        try {
            if (numero < 2)
                return false;
        } catch (Exception ex) {
            return false;
        }

        /* Dividimos el número por todos los divisiores hasta la raíz cuadrada de sí mismo hasta que
         * encontremos un divisor que de resto 0. Si se encuentra algún divisor se devuelve false.
         **/
        for(int divisor = 2; divisor<=sqrt(numero); divisor++) {
            if (numero % divisor == 0)
                return false;
        }
        return true;
    }
}
