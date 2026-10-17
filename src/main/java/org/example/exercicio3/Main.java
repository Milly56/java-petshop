package org.example.exercicio3;
import java.util.Scanner;

public class Main {
    static void main() {
        Petshop pet = new Petshop();
        Scanner sc = new Scanner(System.in);


        System.out.printf("Qual o nome do seu animal?");
        pet.nome = sc.nextLine();
        System.out.printf("Qual a especie do seu aninmal?");
        pet.especie = sc.nextLine();
        System.out.printf("Qual o peso do seu animal ?");
        pet.peso = sc.nextDouble();


        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: "+ pet.especie);
        System.out.printf("Peso:  %.2f kg\n",pet.peso);

        if (pet.peso <= 10) {
            System.out.println("Porte: Pequeno");

        } else if (pet.peso > 10 && pet.peso < 25) {
            System.out.println("Porte:Médio");

        } else {
            System.out.println("Porte : Grande");
        }

        sc.close();



    }
    }
