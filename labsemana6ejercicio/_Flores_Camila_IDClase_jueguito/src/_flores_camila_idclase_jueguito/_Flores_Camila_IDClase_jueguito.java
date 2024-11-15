/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _flores_camila_idclase_jueguito;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class _Flores_Camila_IDClase_jueguito {
    
    
    public static void main(String[] args) {
        String[] palabras = {"CAMILA", "OMOA", "POTRA", "RISOTTO", "BEEFWELLINGTON", 
                             "CAMARONES", "GORDONBLEU", "REINA", "EVA", "CAMPANAS"};
        
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            OUTER:
            while (true) {
                System.out.println("\nMenu Principal:");
                System.out.println("1. Jugar");
                System.out.println("2. Cambiar Palabras");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion porfavor: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                ////case rule switch ya que el switch normal me daba error.
                switch (opcion) {
                    case 1 -> {
                        //para palabra random
                        String palabra = palabras[random.nextInt(palabras.length)];
                        char[] palabraSecreta = new char[palabra.length()];
                        for (int i = 0; i < palabraSecreta.length; i++) {
                            palabraSecreta[i] = '_';
                        }   int oportunidades = 5;
                        boolean ganaste = false;
                        
                        
                        System.out.println(" ");
                        
                        System.out.println("====AHORCADOS====");
                        System.out.println("Comienza el juego!");
                        while (oportunidades > 0 && !ganaste) {
                            System.out.println("\nPalabra: " + String.valueOf(palabraSecreta));
                            System.out.println("Usted tiene: " + oportunidades + "oportunidades");
                            System.out.print("Ingrese un caracter(letra o la palabra completa): ");
                            char caracter = scanner.nextLine().toUpperCase().charAt(0);
                            ////para que si esten en minuscula se puedan leer mayusculas
                            
                            //si el acierto esta bueno no nos resta oportunidades.
                            boolean acerto = false;
                            for (int i = 0; i < palabra.length(); i++) {
                                if (palabra.charAt(i) == caracter) {
                                    palabraSecreta[i] = caracter;
                                    acerto = true;
                                }
                            }
                            
                            if (acerto) {
                                System.out.println("Felicidades! Ha acertado la letra!");
                                ganaste = String.valueOf(palabraSecreta).equals(palabra);
                            } else {
                                System.out.println("La letra que ingreso no esta en la palabras.");
                                oportunidades--;
                            }
                        }   if (ganaste) {
                            System.out.println("\nFelicidades!!!! ha adivinado la palabra: " + palabra);
                        } else {
                            System.out.println("\nQue triste! se ha quedado sin intentos. La palabra era: " + palabra);
                        }
                    }
                    case 2 -> {
                        System.out.println("\nPalabras actuales:");
                        for (int i = 0; i < palabras.length; i++) {
                            System.out.println((i + 1) + ". " + palabras[i]);
                        }   System.out.println("\nDesea cambiar alguna palabra? (s/n)");
                        char respuesta = scanner.nextLine().toLowerCase().charAt(0);
                        if (respuesta == 's') {
                            System.out.print("Porfavor ingrese el numero de la palabra que desea cambiar: ");
                            int index = scanner.nextInt() - 1;
                            scanner.nextLine(); 
                            ///index para vr que palabra el usuario va a seleccionar
                            
                            if (index >= 0 && index < palabras.length) {
                                System.out.print("Ingrese la nueva palabra porfavor: ");
                                palabras[index] = scanner.nextLine().toUpperCase();
                                System.out.println("Palabra actualizada");
                            } else {
                                System.out.println("opcion invalida.");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Gracias por jugar!");
                        break OUTER;
                    }
                    default -> System.out.println("Opcion invalida. Intente nuevamente.");
                }
            }
        }
    }
}