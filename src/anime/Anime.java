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
    private static int arraySize = 3;
    private static Animes[] arregloAnime = new Animes[arraySize];
    private static Scanner sc = new Scanner(System.in);

    public static boolean checkArraySize() {
        for (int i = 0; i < arregloAnime.length; i++) {
            if (arregloAnime[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int getArrayPosition() {
        for (int i = 0; i < arregloAnime.length; i++) {
            if (arregloAnime[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void opcionEstudios() {
        if (checkArraySize()) {
            String nombreAnime, horarioAnime, creadoraAnime;
            boolean timeValidation = false;

            System.out.println(".......Menu Estudio.......");
            sc.nextLine();
            System.out.println("Ingrese nombre de Anime:");
            nombreAnime = sc.nextLine();
            do {
                System.out.println("Ingrese horario del Anime ( Inicio-Fin | Ej: 16:00-20:59 ):");
                horarioAnime = sc.nextLine();
                timeValidation = horarioAnime.matches("\\d{2}:\\d{2}-\\d{2}:\\d{2}");
                if (timeValidation == false) {
                    System.out.println("**FORMATO INCORRECTO");
                }else{
                    
                }
            } while (timeValidation == false);
            System.out.println("Ingrese Estudio Creadora del Anime:");
            creadoraAnime = sc.nextLine();
            System.out.println("..........................");
            System.out.println();
            Animes anime = new Animes(nombreAnime, horarioAnime, creadoraAnime);
            arregloAnime[getArrayPosition()] = anime;
        } else {
            System.out.println("No hya horarios disponibles para su anime");

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;

        do {
            try {
                System.out.println("__________________________");
                System.out.println("___________MENU___________");
                System.out.println("Opcion >1 --- Estudios");
                System.out.println("Opcion >2 --- Televisora");
                System.out.println("Opcion >3 --- Salir");
                System.out.println("__________________________");
                System.out.print(">>");
                System.out.println();
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        opcionEstudios();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Opcion no Valida");
                }
            } catch (InputMismatchException e) {
                System.out.print("Ingreso un valor no numérico");
                sc.next();
            }
        } while (opcion != 3);
    }

}
