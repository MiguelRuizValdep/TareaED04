/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *Clase principal
 * @author Miguel Ruiz-Valdepeñas
 */
public class Main {

    /**
     *
     * @param args representa un array de tipo String
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(cuenta1, 1200);
    }
     /**
      * 
      * @param cuenta1 Objeto tipo CCcuenta
      * @param cantidad parametro double que pasamos tanto para retirar como 
      * para ingresar.
      */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta ");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
