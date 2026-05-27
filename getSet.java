public class getSet {

    private String name;
    private double price;
    //definido como private para fazer o encapsulamento getter and setter

    protected String teste; // só pode ser acessado no msm pacote, bem comoi em sublasses de pacotes diferentes

    //GET
    public String getName() {
        return name;  //função para retornar o atributo APENAS
    }
    public double getPrice() {
        return price;
    }

    //SET
    public void setName(String name) {
        this.name = name;   // para alterar o valor do atributo é preciso usar o SET pra mudar, NAO RETORNA NADA 
        //                      e recebe um valor para o atributo.
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
    
        getSet produto = new getSet(); // CRIAR OBJETO

        produto.setName("lucas"); // SETAR UM NOVO NAME
                
        System.out.println(produto.getName()); // IMPRIMIR UM NOVO NAME

    }

}
