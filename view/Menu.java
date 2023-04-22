package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class Menu extends JFrame implements ActionListener {

    private Player p1;
    private Player p2;
    private ModoJogo modoJogo;
    private JButton jogar = new JButton("JOGAR");
    private JButton recorde = new JButton("RECORDE");
    private JButton sair = new JButton("SAIR");
    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JLabel titulo = new JLabel();

    public Menu(){
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
        recorde.setFont(fonteBotao);
        sair.setFont(fonteBotao);

        jogar.setForeground(Color.cyan);
        jogar.setBackground(Color.darkGray);
        recorde.setForeground(Color.cyan);
        recorde.setBackground(Color.darkGray);
        sair.setForeground(Color.cyan);
        sair.setBackground(Color.darkGray);

        jogar.addActionListener(this);
        recorde.addActionListener(this);
        sair.addActionListener(this);

        jogar.setBounds(300,240,200,70);
        recorde.setBounds(300,368,200,70);
        sair.setBounds(300,496,200,70);

        add(jogar);
        add(recorde);
        add(sair);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //metodo do action listener que da a função dos botões
        if(e.getSource()== jogar){
            this.p1 = new Player();
            this.p2 = new Player();
            ModoJogo modoJogo = new ModoJogo(p1,p2);
            modoJogo.setVisible(true);
            setVisible(false);
        }
        if(e.getSource()== sair){
            System.exit(0);
        }

    }




}