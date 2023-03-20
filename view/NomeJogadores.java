package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NomeJogadores extends JFrame implements ActionListener {
    private JButton normal = new JButton("NORMAL");
    private JButton custom = new JButton("CUSTOM");
    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    private JPanel painel = new JPanel();

    public NomeJogadores(){
        normal.setAlignmentX(CENTER_ALIGNMENT);
        normal.setMaximumSize(new Dimension(100,40));
        normal.addActionListener(this);

        custom.setAlignmentX(CENTER_ALIGNMENT);
        custom.setMaximumSize(new Dimension(100,40));
        custom.addActionListener(this);

        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setPreferredSize(new Dimension(800,800));
        painel.add(Box.createRigidArea(new Dimension(0,10)));
        painel.add(normal);
        painel.add(Box.createRigidArea(new Dimension(0,50)));
        painel.add(custom);
        add(painel);

        this.configurarGuia();
        botoes();
        textField();

    }

    public void botoes(){
        normal.setAlignmentX(CENTER_ALIGNMENT);
        normal.setMaximumSize(new Dimension(200,80));
        normal.addActionListener(this);

        custom.setAlignmentX(CENTER_ALIGNMENT);
        custom.setMaximumSize(new Dimension(200,80));
        custom.addActionListener(this);

        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setPreferredSize(new Dimension(800,800));
        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(normal);
        painel.add(Box.createRigidArea(new Dimension(0,50)));
        painel.add(custom);
        add(painel);

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
