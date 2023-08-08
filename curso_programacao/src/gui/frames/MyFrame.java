package gui.frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("Chess"); //muda o titulo do this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sair da aplicacao
        this.setResizable(false); //impede que o this seja redimensionado
        this.setSize(400,400);//seta tamanho x e y do this
        this.setVisible(true); // faz o this visivel

        ImageIcon image = new ImageIcon("icon.png"); //cria o imageicon
        this.setIconImage(image.getImage()); //muda o icone do this
        //this.getContentPane().setBackground(Color.WHITE); //muda a cor de frundo do this
        this.getContentPane().setBackground(new Color(123,50,250)); //muda a cor de frundo do this por rgb
        //this.getContentPane().setBackground(new Color(0xFFFFF); //muda a cor de frundo do this por hexadecimal


    }
}
