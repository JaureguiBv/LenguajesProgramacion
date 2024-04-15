/*
 * Algoritmo que halle el área 
 * Algoritmo que halle el precio
 */
package apps;
    
import java.util.Scanner;

/**
 *
 * @author REYNOSO JAUREGUI Gerardo Kevin
 */
public class tarea02 {
    public static void main(String[] args) {
        Scanner tecladoterreno = new Scanner(System.in);
 int base, altura, area, costo, precio;
 
    costo = 750;
    
 System.out.print("Ingrese el valor de la base : ");
 base = Integer.parseInt(tecladoterreno.nextLine());
 System.out.print("Ingrese un valor para la altura : ");
 altura = Integer.parseInt(tecladoterreno.nextLine());
        area = base * altura;
         System.out.println("---- Reporte ----");
         System.out.println("-----------------");
         System.out.println("El Area es : " + area);
            precio = area * costo;
         System.out.println("El precio de terreno es :" + precio);
         System.out.println("-----------------");
    }
    
}
