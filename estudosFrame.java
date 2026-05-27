import javax.swing.JButton; // botao no JFrame
import javax.swing.JFrame; // JFrame
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
//import java.awt.event.ActionEvent; //evento de clicar no botao
//import java.awt.event.ActionListener; // evento de "escutar" o clique

public class estudosFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("teste");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // setLayout define a organização dos itens no frame

        JButton botao = new JButton("Clique em mim!"); //cria o botao

        botao.addActionListener(e -> { //evento que o botao vai causar ao clicar
            JOptionPane.showMessageDialog(frame, "Você interagiu com o Swing!");
        });

        frame.add(botao); //adicioinando o botao
        
        frame.setVisible(true);

    }
}
