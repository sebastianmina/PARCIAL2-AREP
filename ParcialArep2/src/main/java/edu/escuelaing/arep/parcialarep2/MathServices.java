/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.parcialarep2;

/**
 *
 * @author Sebastián Mina
 */
public class MathServices {
    
     /**
     * Obtiene el resultado de la arcotangente del numero x
     * @param x Double
     * @return Resultado de la operacion de tipo Double
     */
    public double arctan ( Double x){
        return java.lang.Math.atan(x);
    }

    /**
     * Obtiene el resultado de raíz cuadrada de x
     * @param x Double
     * @return Resultado de la operacion de tipo Double
     */
    public double sqrt( Double x){
        return java.lang.Math.sqrt(x);
    }
}
