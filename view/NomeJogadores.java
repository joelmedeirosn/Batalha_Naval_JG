package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NomeJogadores extends JFrame implements ActionListener {
    private JButton normal = new JButton("NORMAL");
    private JButton custom = new JButton("CUSTOM");

    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);

    public NomeJogadores(){
        this.configurarGuia();
        botoes();
        textField();

    }

    public void botoes(){
        normal.setFont(fonteBotao);
        normal.setForeground(Color.cyan);
        normal.setBackground(Color.darkGray);
        normal.addActionListener(this);
        normal.setBounds(300,368,200,70);
        add(normal);

        custom.setFont(fonteBotao);
        custom.setForeground(Color.cyan);
        custom.setBackground(Color.darkGray);
        custom.addActionListener(this);
        custom.setBounds(300,396,200,70);
        add(custom);
        setLayout(null);
    }
    public void textField(){
        setLayout(new FlowLayout());
        String nome1 = JOptionPane.showInputDialog("Digite seu nome, jogador 1");
        String nome2 = JOptionPane.showInputDialog("Digite seu nome, jogador 2");

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
        if(e.getSource()== normal){
            Batalha batalha = new Batalha();
            this.dispose();
            batalha.setVisible(true);
        }
        if(e.getSource()== custom){ //tem que diferenciar as funcoes desse botao e do de cima
            Batalha batalha = new Batalha();
            this.dispose();
            batalha.setVisible(true);
        }


    }
}
