public class stringEstudos {
    public static void main(String[] args) {
    

    String mainString = " -   Teste para SABER com o FUNCIONA as FUNC de STRING   -  ";
    
    String ms1 = mainString.toLowerCase();
    String ms2 = mainString.toUpperCase();
    String ms3 = mainString.trim();
    String ms4 = mainString.substring(2);
    String ms5 = mainString.substring(2, 4);
    String ms6 = mainString.replace(ms4, ms5);
    String ms7 = mainString.replace("coco", "teste");
    int ms8 = mainString.indexOf("S");
    int ms9 = mainString.lastIndexOf("SABER");
    String[] ms10 = mainString.split("");
    
    System.out.println(mainString);
    System.out.println("louwer: " + ms1);
    System.out.println("Upper: " + ms2);
    System.out.println("Trim: " + ms3);
    System.out.println("subs2: " + ms4);
    System.out.println("Subs2,4: " + ms5);
    System.out.println("replacems4,5: " + ms6);
    System.out.println("replace coco: " + ms7);
    System.out.println("of: " + ms8);
    System.out.println("LastOf: " + ms9);
    System.out.println("Split: " + ms10[3]);

        
    }
    
}
