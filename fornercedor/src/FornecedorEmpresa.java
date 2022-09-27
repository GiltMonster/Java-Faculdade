public class FornecedorEmpresa extends Fornecedor{
    private String ie, vnpj;

    public FornecedorEmpresa(String fone, String nome, String ie, String vnpj) {
        super(fone, nome);
        this.ie = ie;
        this.vnpj = vnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getVnpj() {
        return vnpj;
    }

    public void setVnpj(String vnpj) {
        this.vnpj = vnpj;
    }
}
