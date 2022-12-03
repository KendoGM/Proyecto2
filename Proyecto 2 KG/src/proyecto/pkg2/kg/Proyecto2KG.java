/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2.kg;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kendo
 */
public class Proyecto2KG {
   public static void main(String[] args) {
    // PARTE MAIN 
      byte op;
      int opwh = 1;
      int Ing ;
      Cola cajero1 = new Cola();
      Cola cajero2 = new Cola();
      Cola cajero3 = new Cola();
      Cola cajero4 = new Cola();
       
      
      Scanner Scan = new Scanner(System.in);     
        while (opwh == 1){
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("Por favor, elija una opción.");
            System.out.println("1- Agregar a la fila.");
            System.out.println("2- Eliminar de la fila.");
            System.out.println("3- Verificar las colas vacias.");
            System.out.println("4- Salir.");
            op = Scan.nextByte();
            
            switch (op){
                case 1:
                    //REVISAMOS SI LA COLA ESTA LLENA, SI NO LO ESTA AGREGAMOS
                    //ELEMENTOS
                    if (cajero1.Colallena()) {
                     if (cajero2.Colallena()) {
                         if (cajero3.Colallena()) {
                             if (cajero4.Colallena()) {
                                 System.out.println("TODOS LOS CAJEROS ESTAN LLENOS");
                             }else{
                      System.out.print("Digite un elemento: (DEBE SER UN NUMERO) ");
                      Ing = Scan.nextInt();
                      try {
                          cajero4.insertar(Ing);
                      } catch (Exception ex) {
                          Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                         }else{
                      System.out.print("Digite un elemento: (DEBE SER UN NUMERO) ");
                      Ing = Scan.nextInt();
                      try {
                          cajero3.insertar(Ing);
                      } catch (Exception ex) {
                          Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                     }else{
                      System.out.print("Digite un elemento: (DEBE SER UN NUMERO) ");
                      Ing = Scan.nextInt();
                      try {
                          cajero2.insertar(Ing);
                      } catch (Exception ex) {
                          Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                  } else{
                      System.out.print("Digite un elemento: (DEBE SER UN NUMERO) ");
                      Ing = Scan.nextInt();
                      try {
                          cajero1.insertar(Ing);
                      } catch (Exception ex) {
                          Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                    System.out.println("Desea salir?"); //MENSAJE DE SALIDA
                    opwh = Scan.nextByte();
                    break;
                case 2:
                     if (cajero1.ColaVacia()) {
                         if (cajero2.ColaVacia()) {
                             if (cajero3.ColaVacia()) {
                                 if (cajero4.ColaVacia()) {
                             }else{   try {
                    System.out.println(cajero4.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                         }else{   try {
                    System.out.println(cajero3.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    System.out.println("Todas las colas estan vacias");
                } else{   try {
                    System.out.println(cajero2.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{   try {
                    System.out.println(cajero1.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Proyecto2KG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    System.out.println("Desea salir?");//MENSAJE DE SALIDA
                    opwh = Scan.nextByte();
                    break;
                case 3:
                    if (cajero1.ColaVacia()){ 
                    System.out.println("Cajero 1 esta vacio");{
                        if (cajero2.ColaVacia()){ 
                    System.out.println("Cajero 2 esta vacio");
                    if (cajero3.ColaVacia()){ 
                    System.out.println("Cajero 3 esta vacio");
                    if (cajero4.ColaVacia()){ 
                    System.out.println("Cajero 4 esta vacio");
                    }
                    }else{
                    System.out.println("NO HAY CAJEROS VACIOS");
                    }
                            }
                        }
                    }  
                    System.out.println("Desea salir?");//MENSAJE DE SALIDA
                    opwh = Scan.nextByte();
                    break;   
                default: 
                    
            }
        }
    }
}
   
      
    
    
 
