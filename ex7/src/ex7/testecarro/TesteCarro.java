package ex7.testecarro;

import ex7.carro.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.encherTanque(10);

        System.out.println("Carro ligado: " + carro.isCarroLigado() + " tanque cheio ");
    }
}
