package ex14;

public class ClienteBanco {
    private String nome;
    private String cpf;
    private String enderco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderco() {
        return enderco;
    }
    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }
    public ClienteBanco() {
    }

    public ClienteBanco(String nome, String cpf, String enderco) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderco = enderco;
    }

    @Override
    public String toString() {
        return "O Sr." + nome +" portador do CPF n. "+ cpf + '\n' +
                "residente e domiciliado na " + enderco + '\n' +
                "vem por meio desta solicitar o encerramento " +'\n'+
                "de sua contacorrente.";
    }
}
