public class UsaLista {
    /**
     * Elebore uma classe Pessoa:
     * @param args(nome, id, idade). Armazene-os
     * na lista dubla. Adapte o remover, para remover por id
     * escreva o método atualizar por id.
     */

    public static void main(String[] args) {
//        MetodosLista.incerir("Gersom");
//        MetodosLista.incerir("Anna");
//        MetodosLista.incerir("Sandra");
//        MetodosLista.incerir("José");
//        MetodosLista.incerir("Maria");
//
//        if (MetodosLista.remover("Maria")){
//            System.out.println("Removeu");
//        }else {
//            System.out.println("Não removeu");
//        }
//        MetodosLista.exibir();

        //================== LISTA PESSOA ==================

        MetodosListaPessoa.incerir(new Pessoa("Lucas",1,20));
        MetodosListaPessoa.incerir(new Pessoa("Ana",2,13));

        Pessoa p1 = new Pessoa(2);
        if (MetodosListaPessoa.remover(p1)){
            System.out.println("Removeu");
        }else {
            System.out.println("Não removeu");
         }

        MetodosListaPessoa.exibir();

    }
}
