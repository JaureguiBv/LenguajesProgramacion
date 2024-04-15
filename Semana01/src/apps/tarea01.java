/*
 * Programa que permite hallar la masa corporal de una persona
 */
package apps;

import java.util.Scanner;
/*
 * @author REYNOSO JAUREGUI Gerardo Kevin
 */
public class tarea01 {
    public static void main(String[] args) {
    Scanner tecladomasa = new Scanner(System.in);
 float masa, peso;

 System.out.print("Ingrese el valor peso : ");
 peso = Float.parseFloat(tecladomasa.nextLine());

 masa =  peso * peso;

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("Su masa corporal es de : " + masa);
 System.out.println("-----------------");
 }
}
