public class FornecedorPessoa extends Fornecedor{

    private String RG, CPF;

    public FornecedorPessoa(String fone, String nome, String RG, String CPF) {
        super(fone, nome);
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
