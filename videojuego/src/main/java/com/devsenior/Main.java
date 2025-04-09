package com.devsenior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonajeDAO sentencias = new PersonajeDAO();

        int opcion;
        do {
            System.out.println("Menu principal");
            System.out.println("1. Agregar un personaje");
            System.out.println("2. Listar Personajes");
            System.out.println("0. para terminar...");
            System.out.println("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Clase: ");
                    String clase = sc.nextLine();
                    Personaje p = new Personaje(nombre, clase, 1, 0);
                    sentencias.agregarPersonaje(p);
                    break;
                case 2:
                    sentencias.listar().forEach(System.out::println);
                    break;
                
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    break;
            }
        }while(opcion != 0);

        sc.close();
      
    }
}