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
    
    public static boolean isArrayEmpty() {
        int contador = 0;
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                contador++;
            }
        }
        return contador == arraySize;
    }

    public static void opcionEstudios() {
        if (checkArraySize()) {
            String nombreAnime, horarioAnime, creadoraAnime;
            boolean timeValidation = false;
            int sequence1, sequence2, sequence3, sequence4;

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
                } else {
                    sequence1 = Integer.parseInt(horarioAnime.subSequence(0, 2).toString());
                    sequence2 = Integer.parseInt(horarioAnime.subSequence(3, 5).toString());
                    sequence3 = Integer.parseInt(horarioAnime.subSequence(6, 8).toString());
                    sequence4 = Integer.parseInt(horarioAnime.subSequence(9, 11).toString());

                    if (((sequence1 < 0 || sequence1 >= 24) || (sequence3 < 0 || sequence3 >= 24))
                            || (sequence3 < sequence1) || ((sequence1 == sequence3) && (sequence4 <= sequence2)) ||
                            (sequence2 > 59 || sequence4 > 59) ) {
                        System.out.println("**HORAS NO VALIDAS O FUERA DE RANGO");
                        timeValidation = false;
                    }
                }
            } while (timeValidation == false);
            System.out.println("Ingrese Estudio Creadora del Anime:");
            creadoraAnime = sc.nextLine();
            System.out.println("..........................");
            System.out.println();
            Animes anime = new Animes(nombreAnime, horarioAnime, creadoraAnime);
            arregloAnime[getArrayPosition()] = anime;
        } else {
            System.out.println("No hay horarios disponibles para su anime");

        }
    }
    
    public static boolean existeAnime(String anime){
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i].getNombreAnime().equalsIgnoreCase(anime)) {
                
            }
            
        }
        
        return false;
    }
    
    public static void opcionTelevisora() {
        
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
