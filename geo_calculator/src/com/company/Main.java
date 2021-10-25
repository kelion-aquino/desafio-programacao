package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Figuras figura = Figuras.valueOf(sc.nextLine().toLowerCase(Locale.ROOT));
        double edge = 0;
        double high = 0;
        double base = 0;
        double base_menor = 0;
        double raio = 0;
        double lado =  0;
        double lado_2 = 0;
        double diagonal_menor = 0;
        double diagonal_maior = 0;
        double pi = 3.14;

        switch (figura) {
            case QUADRADO:
                System.out.print("Comprimento da aresta: ");
                edge = Double.parseDouble(sc.nextLine());
                System.out.println("==> perimetro: " + (edge * 4) + "area: " + (edge * edge));
                break;
            case RETANGULO:
                System.out.print("Comprimento da base: ");
                base = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da altura: ");
                high = Double.parseDouble(sc.nextLine());
                System.out.println("==> perimetro: " + ((2 * base) + (2 * high)) + "area: " + (base * high));
                break;
            case CILINDRO:
                System.out.print("Comprimento do raio: ");
                raio = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da altura: ");
                high = Double.parseDouble(sc.nextLine());
                System.out.println("==> o volume é: " + (pi * raio * raio * high));
                break;
            case CIRCULO:
                System.out.print("Comprimento do raio: ");
                raio = Double.parseDouble(sc.nextLine());
                System.out.println("==> perimetro: " + (pi * raio * 2) + "area: " + (pi * raio * raio));
                break;
            case CONE:
                System.out.print("Comprimento do raio: ");
                raio = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da altura: ");
                high = Double.parseDouble(sc.nextLine());
                System.out.println("==> o volume é: " + (pi * raio * raio * high) * 1/3);
                break;
            case CUBO:
                System.out.print("Comprimento do lado: ");
                lado = Double.parseDouble(sc.nextLine());
                System.out.println("==> o volume é: " + (lado * lado * lado));
                break;
            case ESFERA:
                System.out.print("Comprimento do raio: ");
                raio = Double.parseDouble(sc.nextLine());
                System.out.println("==> o volume é: " + (pi * raio * raio * raio * 4/3));
                break;
            case LOSANGO:
                System.out.print("Comprimento da diagonal maior: ");
                diagonal_maior = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da diagonal menor: ");
                diagonal_menor = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento do lado: ");
                lado = Double.parseDouble(sc.nextLine());
                System.out.println("==> perimetro: " + (lado * 4) + "area: " + (diagonal_menor + diagonal_maior) * 1/2);
                break;
            case PIRAMIDE:
                System.out.print("Comprimento do lado: ");
                lado = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento do altura: ");
                high = Double.parseDouble(sc.nextLine());
                System.out.println("==> o volume é: " + (lado * lado * high * 1/3));
                break;
            case TRAPEZIO:
                System.out.print("Comprimento da base menor: ");
                base_menor = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da base maior: ");
                base = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento da altura: ");
                high = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento do primeiro lado: ");
                lado = Double.parseDouble(sc.nextLine());
                System.out.print("Comprimento do segundo lado: ");
                lado_2 = Double.parseDouble(sc.nextLine());
                System.out.println("==> perimetro: " + (base + base_menor + lado + lado_2) + "area: " + (base_menor + base) * high/2);
                break;
        }
    }

    private enum Figuras {

        // 2D - Area
        QUADRADO("quadrado"),
        RETANGULO("retangulo"),
        CIRCULO("circulo"),
        TRIANGULO("triangulo"),
        TRAPEZIO("trapezio"),
        LOSANGO("losango"),
        // 3D - Volume
        CUBO("cubo"),
        ESFERA("espera"),
        PIRAMIDE("piramide"),
        CILINDRO("cilindro"),
        CONE("cone");

        private final String figura;

        Figuras(String figura) {
            this.figura = figura;
        }

        public String getFigura() {
            return figura;
        }
    }
}
