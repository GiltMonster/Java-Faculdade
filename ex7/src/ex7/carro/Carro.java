package ex7.carro;

public class Carro {

    protected  int litrosNoTanque;

    private boolean carroLigado;

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public void setCarroLigado(boolean carroLigado) {
        this.carroLigado = carroLigado;
    }

    public void encherTanque(int litros){
        litrosNoTanque = litros;
    }
}
