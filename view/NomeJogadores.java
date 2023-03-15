package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NomeJogadores extends JFrame implements ActionListener {
    JButton comecar = new JButton("COMEÇAR");
    Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);

    JTextField nome1 = new JTextField(15);
    JTextField nome2 = new JTextField(15);

    public NomeJogadores(){
        this.configurarGuia();
        botoes();
        textField();

    }

    public void botoes(){
        comecar.setFont(fonteBotao);
        comecar.setForeground(Color.cyan);
        comecar.setBackground(Color.darkGray);
        comecar.addActionListener(this);
        comecar.setBounds(300,368,200,70);
        add(comecar);
        setLayout(null);
    }
    public void textField(){
        setLayout(new FlowLayout());
        add(nome1);
        add(nome2);
    }

    public void configurarGuia(){
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== comecar){
            Batalha batalha = new Batalha();
            this.dispose();
            batalha.setVisible(true);
        }


    }
}
