package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Batalha extends JFrame implements ActionListener{

    private JButton[][] tabuleiro;
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);


    public Batalha(){
        /*titulo.setFont(fonteLabel);
        titulo.setText("TABULEIRO");
        titulo.setBounds(250,100,800,70);
        add(titulo);*/
        tabuleiro = new JButton[10][10];

        this.configurarGuia();

    }
    public void configurarGuia(){
       // setTitle("TABULEIRO");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
