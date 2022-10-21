/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratio.pkg2.emanuel.flores;

import java.util.Scanner;

/**
 *
 * @author lucar
 */
public class Laboratio2EmanuelFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
         do {
         Scanner leer = new Scanner(System.in);
         System.out.println("-----------------------");
         System.out.println("Bienvenido a laboratorio ");
         System.out.println("Ingrese la opcion deseada: ");
         System.out.println("1-> MCD");
         System.out.println("2-> Sumatoria con Pow");
         System.out.println("3-> Supermercado");
         System.out.println("4->Saliendo");
         /*int*/ opcion = leer.nextInt();
         System.out.println(+opcion);
         
         if (opcion == 1){
             int numA, numB;
             System.out.println("Bienvenido a MCD");
             System.out.println("Ingrese su primer numero: ");
             numA = leer.nextInt();
             System.out.println("Ingrese su segundo numero: ");
             numB = leer.nextInt();
             do {
             if(numA > numB){
                 numA = numA - numB;                 
             }
             else if(numB > numA){
                 numB = numB - numA;
             }             
            } while (numA != numB);
             System.out.println("El MCD de ambos numeros es: " + numA);
             
         }// fin opcion 1
         
         else if (opcion == 2){
             double num, ans = 0, base;
             double cont = 1;
             System.out.println("Bienvenido a Sumatoria con Pow");
             System.out.println("Ingrese un numero: ");
             num = leer.nextDouble();
            
            while (cont <= num){
                base = cont/(cont+1);
                ans = Math.pow(base, cont) + ans;
                cont++;
            }
            System.out.println("La sumatoria es: " + ans);
         }// fin opcion 2
         
         else if (opcion == 3){
             int cliente, precio, cant, cantsin, pago;
             System.out.println("Bienvenido a Supermercado");
             System.out.println("Ingrese la cantidad de productos: ");
             cant = leer.nextInt();
             System.out.println("Escriba el precio del producto (individual): ");
             precio = leer.nextInt();
             System.out.println("Ingrese el tipo de cliente: 0, 1, 2");
             cliente = leer.nextInt();
             while (cliente < 0 || cliente > 2){
                 System.out.println("Ha elegido un numero invalido");
                 cliente = leer.nextInt();
             }
                 if (cliente == 0){
                     System.out.println("Usted no tiene descuento accesible");
                     if (cant < 10){
                         pago = cant * precio;
                         System.out.println("Su factura es de: " + pago);
                     }
                     else if (cant >= 10 || cant <= 19){
                         cantsin = cant - 2;
                         pago = cantsin * precio;
                         System.out.println("Su factura es de: " + pago);
                     }
                     else if (cant >= 20){
                         cantsin = cant - 5;
                         pago = cantsin * precio;
                         System.out.println("Su factura es de: "+ pago);
                     }
                 }
             
                 if (cliente == 1){
                     System.out.println("Usted tiene 10% de descuento");
                     if (cant < 20){
                         pago = cant * precio;
                         double desc = pago *0.90;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                     else if (cant >=20 || cant <= 29){
                         cantsin = cant - 2;
                         pago = cantsin * precio;
                         double desc = pago *0.90;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                     else if (cant >= 30){
                         cantsin = cant - 5;
                         pago = cantsin * precio;
                         double desc = pago *0.90;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                 }
                 if (cliente == 2){
                     System.out.println("Usted tiene 30% de descuento");
                     if (cant <= 29){
                         pago = cant * precio;
                         double desc = pago * 0.70;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                     else if (cant >= 30 || cant <= 39){
                         cantsin = cant - 2;
                         pago = cantsin * precio;
                         double desc = pago *0.70;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                     else if (cant >= 40){
                         cantsin = cant - 5;
                         pago = cantsin * precio;
                         double desc = pago *0.70;
                         System.out.println("Su factura con descuento incluido es de: " + desc);
                     }
                 }
         }// fin opcion 3
         else if (opcion == 4){
             System.out.println("Saliendo");
         }//fin opcion 4
     }while (opcion != 4);
    } 
}
