public class gabage {


    void method01() {
        int x = 10;
        if (x > 0) { // DESALOCAÇÂO POR ESCOPO
            int y = 20;
        }
        System.out.println(x); // quando a execução chegar aqui, a variavel y (na memoria), irá sumir

    }
// aqui fora, quando o method01 tiver sido executado, ao sair dele, as variaveis x e y serao desalocadas

// tudo que for pro HEAP é mantido, maás aquilo que fica em Stack pode ser perdido



    public static void main(String[] args) {
      
    

    }


}