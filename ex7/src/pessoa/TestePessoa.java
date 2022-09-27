package pessoa;

import java.util.Arrays;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("lucas");
        p1.setRg("123456");

        p2.setNome("lucas");
        p2.setRg("123456");

        if(p1.equals(p2)){
            System.out.println("p1 igual a p2");
            System.out.println("HashCode f1:" + p1.hashCode());
            System.out.println("HashCode f2:" + p2.hashCode());

        }else{
            System.out.println("p1 é diferente  a p2");
            System.out.println("HashCode f1:" + p1.hashCode());
            System.out.println("HashCode f2:" + p2.hashCode());

        }
    }

}
