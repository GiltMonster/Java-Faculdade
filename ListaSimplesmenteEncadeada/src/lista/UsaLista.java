package lista;

public class UsaLista {

    public static void main(String[] args) {

        //Pet pei1 = new Pet("Canina","Gai",4);
        MetodosLista.inserir(new Pet("Canina","Gaia",4));
        MetodosLista.inserir(new Pet("Felina","Mumu",7));
        MetodosLista.inserir(new Pet("Felina","Tutu",8));
        MetodosLista.inserir(new Pet("Felina","Tcha",3));
        MetodosLista.inserir(new Pet("Canina","Nani",8));
        //MetodosLista.exibir();

//        Object obj = MetodosLista.pesquisar("Tutu");
//        if (obj != null){
//            System.out.println("==PESQUISA==");
//            System.out.println(obj);
//        }else{
//            System.out.println("Não encontrou!");
//        }
//

        Pet pet = new Pet("Nani");
        if (MetodosLista.remover(pet)){
            System.out.println("Removido");
        }else{
            System.out.println("Não removido");
        }
        MetodosLista.exibir();
    }
}
