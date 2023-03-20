package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    //Color fundo = new Color(253,184,39);
   //JPanel menu = new JPanel();
    private JButton bJogar = new JButton("JOGAR");
    private JButton bRanking = new JButton("RANKING");
    private JButton bSair = new JButton("SAIR");
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
        bJogar.setFont(fonteBotao);
        bRanking.setFont(fonteBotao);
        bSair.setFont(fonteBotao);

        bJogar.setForeground(Color.cyan);
        bJogar.setBackground(Color.darkGray);
        bRanking.setForeground(Color.cyan);
        bRanking.setBackground(Color.darkGray);
        bSair.setForeground(Color.cyan);
        bSair.setBackground(Color.darkGray);

        bJogar.addActionListener(this);
        bRanking.addActionListener(this);
        bSair.addActionListener(this);

        bJogar.setBounds(300,240,200,70);
        bRanking.setBounds(300,368,200,70);
        bSair.setBounds(300,496,200,70);

        add(bJogar);
        add(bRanking);
        add(bSair);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //metodo do action listener que da a função dos botões
        if(e.getSource()== bJogar){
            NomeJogadores nomeJogadores = new NomeJogadores();
            this.dispose();
            nomeJogadores.setVisible(true);
        }
        if(e.getSource()== bSair){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Menu();

    }


}
