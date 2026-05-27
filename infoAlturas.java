public class infoAlturas {


    private String name;
    private int idade;
    private double altura;



    public infoAlturas(String name, int idade,double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    //getter and setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getaltura() {
        return altura;
    }
    public void setaltura(double altura) {
        this.altura = altura;
    }


}

