package view;

import model.NomeInvalidoException;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModoJogo extends JFrame implements ActionListener {

    private Menu menu;
    private JButton normal = new JButton("NORMAL");
    private JButton custom = new JButton("CUSTOM");
    private JButton voltar = new JButton("VOLTAR");
    private Font fonteBotao = new Font("Courier New",Font.ITALIC | Font.BOLD,15);
    private JPanel painel = new JPanel();
    private JLabel titulo = new JLabel();
    private Player player1;
    private Player player2;
    private Defesa defesa;


    public ModoJogo(Player player1, Player player2, Defesa defesa){
        this.player1 = player1;
        this.player2 = player2;
        this.defesa = defesa;
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
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == normal || e.getSource()==custom){

            try{
               this.player1.setPlayerName(JOptionPane.showInputDialog("Qual o seu nome, capitão?"));
           } catch (NomeInvalidoException x){
               JOptionPane.showMessageDialog(null, x.getMessage(), "Usuário incorreto", JOptionPane.WARNING_MESSAGE);
               actionPerformed(e);
           }

            try{
                this.player2.setPlayerName(JOptionPane.showInputDialog("Qual o seu nome, capitão?"));
            } catch (NomeInvalidoException x){
                JOptionPane.showMessageDialog(null, x.getMessage(), "Usuário incorreto", JOptionPane.WARNING_MESSAGE);
                actionPerformed(e);
            }
       }


        if(e.getSource() == normal && this.player1.getPlayerName() != null && this.player2.getPlayerName() != null){
            setVisible(false);
            this.dispose();
            defesa.setVisible(true);

        }

        if(e.getSource()== custom && this.player1.getPlayerName() != null && this.player2.getPlayerName() != null){ //tem que diferenciar as funcoes desse botao e do de cima
            //Defesa batalhaP1 = new Defesa(player1,player2);
            //Defesa batalhaP2 = new Defesa(player1,player2);

            //this.dispose();
            //batalhaP1.setVisible(true);
            //batalhaP2.setVisible(false);
        }

        if(e.getSource()== voltar){
            this.dispose();
            //menu.setVisible(true);
        }


    }
}
