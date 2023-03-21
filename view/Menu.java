package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class Menu extends JFrame implements ActionListener {
    //Color fundo = new Color(253,184,39);
   //JPanel menu = new JPanel();
    private Player player;

    private JButton jogar = new JButton("JOGAR");
    private JButton ranking = new JButton("RANKING");
    private JButton sair = new JButton("SAIR");
    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
   // ImageIcon imagem = new ImageIcon(getClass().getResource("fundo.jpeg"));
   // JLabel fundo = new JLabel(imagem);

    private JLabel titulo = new JLabel();


    public Menu(){
        // add(BorderLayout.NORTH,jb); adiciona um botao em uma das margens da janela
        //add(fundo);
        //menu.setBackground(fundo);
        titulo.setFont(fonteLabel);
        titulo.setText("Batalha Naval");
        titulo.setBounds(250,100,800,70);
        add(titulo);

        this.botoes();
        this.configurarGuia();
    }

    public void configurarGuia(){
        setTitle("Batalha Naval");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void botoes(){
        jogar.setFont(fonteBotao);
        ranking.setFont(fonteBotao);
        sair.setFont(fonteBotao);

        jogar.setForeground(Color.cyan);
        jogar.setBackground(Color.darkGray);
        ranking.setForeground(Color.cyan);
        ranking.setBackground(Color.darkGray);
        sair.setForeground(Color.cyan);
        sair.setBackground(Color.darkGray);

        jogar.addActionListener(this);
        ranking.addActionListener(this);
        sair.addActionListener(this);

        jogar.setBounds(300,240,200,70);
        ranking.setBounds(300,368,200,70);
        sair.setBounds(300,496,200,70);

        add(jogar);
        add(ranking);
        add(sair);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //metodo do action listener que da a função dos botões
        if(e.getSource()== jogar){
            ModoJogo nomeJogadores = new ModoJogo();
            this.dispose();
            nomeJogadores.setVisible(true);
        }
        if(e.getSource()== sair){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Menu();

    }


}
