public class ArrayObjetos {

    public static void main(String[] args) {

        MetodosArray.inserir(new Pessoa("Lucas", 18));
        MetodosArray.inserir(new Pessoa("Rodrigo", 25));
        MetodosArray.inserir(new Pessoa("Carol", 30));
        MetodosArray.inserir(new Pessoa("Barbara", 19));
        MetodosArray.inserir(new Pessoa("Eddie", 15));
        MetodosArray.inserir(new Pessoa("Nathalia", 85));
        MetodosArray.inserir(new Pessoa("Sergio", 10));
        MetodosArray.exibir();

        System.out.println("===Removendo...===");
        boolean verifica = MetodosArray.remover(5);

        if (verifica){
            MetodosArray.exibir();
        }else {
            System.out.println("Id NÃO encontrado.");
        }

        System.out.println("===Atualizando...===");

        boolean verifica1 = MetodosArray.atualiza(1);
        if (verifica1){
            MetodosArray.exibir();
        }else {
            System.out.println("Id NÃO encontrado.");
        }

    }

}
