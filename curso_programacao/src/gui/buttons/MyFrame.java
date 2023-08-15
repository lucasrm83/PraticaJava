package gui.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    MyFrame(){
        ImageIcon icon = new ImageIcon("pointing.png");
        ImageIcon icon2 = new ImageIcon("incog2.png");
        label = new JLabel();
        label.setBounds(150,250,200,150);
        label.setIcon(icon2);
        label.setVisible(false);
        label.setText("I saw what you did");



        button = new JButton();
        button.setBounds(100,100,250,100);
        button.setText("Buenos dias!");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(10);
        button.setForeground(Color.GREEN);
        button.setBackground(Color.BLUE);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Buenos");
            button.setEnabled(false);
            label.setVisible(true);
        }


    }
}
