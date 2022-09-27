package pessoa;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }


    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Pessoa){
            Pessoa p =(Pessoa) obj;

            if (this.getNome().equals(p.getNome()) && this.getRg().equals(p.getRg())){
                return true;

            }else{
                return false;

            }
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, rg);
    }
}
