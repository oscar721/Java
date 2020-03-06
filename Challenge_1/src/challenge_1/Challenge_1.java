/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge_1;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Challenge_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int gamer = 0;
        int level = 0;
        Scanner reader = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("********BIENVENIDO********\n");
        System.out.println("--------------------------");
        System.out.println("-----CARRERA NUMÉRICA-----");
        System.out.println("--------------------------\n");
        System.out.print("Ingrese la cantidad de jugadores (2 a 4 jugadores): ");
        gamer = reader.nextInt();

        while (gamer < 2 || gamer > 4) {
            System.out.println("Numero de jugadores incorrectos!!!");
            System.out.print("Ingrese la cantidad de jugadores (2 a 4 jugadores): ");
            gamer = reader.nextInt();
        }

        System.out.println("Jugadores a activos: " + gamer);
        System.out.println("--------------------------\n");

        System.out.println("-----Niveles de Juego-----");
        System.out.println("1. Nivel básico (Tablero de 20 posiciones)");
        System.out.println("2. Nivel intermedio (Tablero de 30 posiciones)");
        System.out.println("3. Nivel avanzado (Tablero de 50 posiciones)");
        System.out.print("Ingrese el nivel del juego:");
        level = reader.nextInt();

        while (level < 1 || level > 3) {
            System.out.println("Nivel incorrecto!!!");
            System.out.print("Ingrese el nivel de juego: ");
            level = reader.nextInt();
        }

        pros p = new pros();

        if (level == 1) {

            p.proceso(20, gamer);

        } else if (level == 2) {
            p.proceso(30, gamer);
        } else {
            p.proceso(50, gamer);
        }

    }

}
