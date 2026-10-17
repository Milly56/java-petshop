package org.example.exercicio4;

public class Main {
    static void main() {
        Petshop pet = new Petshop();

        pet.nome = "Luana";
        pet.especie = "macaco";
        pet.peso = 56.3;
        pet.porte = "Grande";

        System.out.println(pet.nome);
        System.out.println(pet.especie);
        System.out.println(pet.peso);
        System.out.println(pet.porte);

    }
}
