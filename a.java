public class a {


    public String name;
    public double preco;
    public int qtd;

    public String coco;

    public a (){
        //serve como um construtor "PADRAO"
    }

    public a(String name, double preco, int qtd) {
        this.name = name; // o THIS é usado pra apontar os parametros da public a , para a variavel criada fora dela
        this.preco = preco;
        this.qtd = qtd;
    }
    
    // aqui em baixo temos uma sobrecarga, basicamente é mais de uma função para mesma classe, mudando os parametros
    public a (String name, double preco) {
        this.name = name; 
        this.preco = preco;
    }

    public static void main(String [] args) {

    }
}
