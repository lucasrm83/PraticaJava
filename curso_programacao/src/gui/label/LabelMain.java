package gui.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelMain {
    public static void main(String[] args) {

        //Jlabel = uma area gui para texto, imagem e ambos
        Border border = BorderFactory.createLineBorder(Color.green,3);

        ImageIcon image = new ImageIcon("incog.png");
        JLabel label = new JLabel(); //create a label
        label.setText("Eu vi o que você assistiu!"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text top,center,bottom of imageicon
        label.setForeground(Color.green);//set color da fonte, pode ser rgb e hexadec tambem
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set fonte
        label.setIconTextGap(-25); //set distancia do texto para imagem
        label.setBackground(Color.black); //set background collor
        label.setOpaque(true); //display backgroud color
        label.setBorder(border); //set border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as dimentions


        JFrame frame = new JFrame();
        frame.setTitle("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //set the frame size to the components size, make sure to add all components before pack


    }
}
