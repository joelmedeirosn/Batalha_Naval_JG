package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class Menu extends JFrame implements ActionListener {
    JButton jb = new JButton("JOGAR");
    JButton jb2 = new JButton("RANKING");
    JButton jb3 = new JButton("SAIR");
    Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    Font fonteLabel = new Font("Serif", Font.BOLD,50);
    ImageIcon imagem = new ImageIcon(getClass().getResource("fundo.jpeg"));
    JLabel fundo = new JLabel(imagem);

    JLabel titulo = new JLabel();
    public Menu(){
       // add(BorderLayout.NORTH,jb); adiciona um botao em uma das margens da janela
        add(fundo);

        titulo.setFont(fonteLabel);
        titulo.setText("Batalha Naval");
        titulo.setBounds(250,100,800,70);
        add(titulo);//titulo batalha naval

        jb.setFont(fonteBotao);//fonte da letra do botao
        jb2.setFont(fonteBotao);
        jb3.setFont(fonteBotao);

        jb.setForeground(Color.white);
        jb.setBackground(Color.black);//cor do botao

        jb.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);//botao ser tratado nessa mesma classe
        setLayout(null);
        jb.setBounds(300,240,200,70);//coordenadas do botao
        jb2.setBounds(300,368,200,70);
        jb3.setBounds(300,496,200,70);

        add(jb);
        add(jb2);
        add(jb3);

        setTitle("Batalha Naval");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //metodo do action listener que da a função dos botões
        if(e.getSource()==jb){
            JOptionPane.showMessageDialog(null, "jogo");
        }
        if(e.getSource()==jb3){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Menu();

    }


}
