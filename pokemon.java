//import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class pokemon extends JFrame implements KeyListener{

    public pokemon(){
        this.setTitle("BATTLE");//Titulo da janela
        this.setSize(300, 300);//Tamanho da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Caso não colocar:não irá fechar, o programa se esconderá 
        this.addKeyListener(this); // Diz para a janela ouvir esta classe
        this.setVisible(true);//Torna a janela visível, caso for false irá não será visível
    }

    public boolean emBatalha = false;
    public boolean emEscolha = true;


    public void teste(String []Args) {
        System.out.println("coco");
    }

    public void keyPressed(KeyEvent e) {
        if (emEscolha == true) {
            switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("FIGHT");
                emBatalha = true;
                emEscolha = false;
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("BAG");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Seta para a esquerda pressionada");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Seta para a direita pressionada");
                break;
        }
        } else if (emBatalha == true) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    System.out.println("FOGAO");
                    emBatalha = false;
                    emEscolha = true;           
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("Seta para baixo pressionada");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("Seta para a esquerda pressionada");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("Seta para a direita pressionada");
                    break;
            }
        }
    }


            @Override//Aplica a fuunção que o usuario quer, soprepondo a função original
            public void keyTyped(KeyEvent e) {}

             @Override//Aplica a fuunção que o usuario quer, soprepondo a função original
            public void keyReleased(KeyEvent e) {}

            public static void main(String[] args) {

            new pokemon(); 
            }



































}