package org.example.exercicio1;

public class Main {
    static void main() {
        Petshop petshop = new Petshop();

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome:" + petshop.nome);
        System.out.println("Espécie:" + petshop.especie);
        System.out.println("Peso: "+ petshop.peso + " kg");
    }
}
