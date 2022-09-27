package ex8;

public class Circulo {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Circulo(double raio) {
        if(raio > 0){
            this.raio = raio;
        }else{
            System.out.println("Raio não pode ser negativo: " + raio);
        }
    }
}
