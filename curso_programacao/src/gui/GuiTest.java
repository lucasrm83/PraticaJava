package gui;

import javax.swing.*;
import java.awt.*;

public class GuiTest {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame(); //cria um frame
        frame.setTitle("Chess"); //muda o titulo do frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sair da aplicacao
        frame.setResizable(false); //impede que o frame seja redimensionado
        frame.setSize(400,400);//seta tamanho x e y do frame
        frame.setVisible(true); // faz o frame visivel

        ImageIcon image = new ImageIcon("icon.png"); //cria o imageicon
        frame.setIconImage(image.getImage()); //muda o icone do frame
        //frame.getContentPane().setBackground(Color.WHITE); //muda a cor de frundo do frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //muda a cor de frundo do frame por rgb
        //frame.getContentPane().setBackground(new Color(0xFFFFF); //muda a cor de frundo do frame por hexadecimal*/
        MyFrame myFrame = new MyFrame();// se não for usar o myFrame pode escrefer só new MyFrame();



    }
}
