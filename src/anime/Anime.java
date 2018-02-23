/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Anime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String nombreAnime, horarioAnime, creadoraAnime;
        
        do{
            try{
                System.out.println("__________________________");
                System.out.println("___________MENU___________");
                System.out.println("Opcion >1 --- Estudios");
                System.out.println("Opcion >2 --- Televisora");
                System.out.println("Opcion >3 --- Salir");
                System.out.println("__________________________");
                System.out.print(">>");
                System.out.println();
                opcion = sc.nextInt();
                
                switch (opcion){
                    case 1:
                        System.out.println(".......Menu Estudio.......");
                        System.out.print("Ingrese nombre de Anime >");
                        nombreAnime = sc.nextLine();
                        System.out.print("Ingrese horario del Anime ( Inicio-Fin | Ej: 16-20 ) >");
                        horarioAnime = sc.nextLine();
                        System.out.print("Ingrese Estudio Creadora del Anime >");
                        creadoraAnime = sc.nextLine();
                        System.out.println("..........................");
                        System.out.println();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    default:
                        System.out.println("Opcion no Valida");
                }
            }catch (InputMismatchException e) {
                System.out.print("Ingreso un valor no numérico");
                sc.next();
            }
        }while(opcion!=3);
    }
    
}
