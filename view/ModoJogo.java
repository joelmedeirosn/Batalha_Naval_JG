package view;

import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModoJogo extends JFrame implements ActionListener {
    private JButton normal = new JButton("NORMAL");
    private JButton custom = new JButton("CUSTOM");
    private JButton voltar = new JButton("VOLTAR");
    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    private JPanel painel = new JPanel();
    private JLabel titulo = new JLabel();
    private Player player;

    public ModoJogo(Player player){
        this.player = player;
        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESCOLHA O MODO DE JOGO:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        this.configurarGuia();
        botoes();

    }


    public void botoes(){
        normal.setAlignmentX(CENTER_ALIGNMENT);
        normal.setMaximumSize(new Dimension(200,80));
        normal.addActionListener(this);

        custom.setAlignmentX(CENTER_ALIGNMENT);
        custom.setMaximumSize(new Dimension(200,80));
        custom.addActionListener(this);

        voltar.setAlignmentX(CENTER_ALIGNMENT);
        voltar.setMaximumSize(new Dimension(200,80));
        voltar.addActionListener(this);

        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setPreferredSize(new Dimension(800,800));
        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(normal);
        painel.add(Box.createRigidArea(new Dimension(0,50)));
        painel.add(custom);
        painel.add(Box.createRigidArea(new Dimension(0,50)));
        painel.add(voltar);

        add(painel);

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

        if(e.getSource()== voltar){
            Menu menu = new Menu();
            this.dispose();
            menu.setVisible(true);
        }


    }
}
