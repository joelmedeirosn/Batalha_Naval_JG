package view;

import controller.MovimentoDefesa;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModoJogo extends JFrame implements ActionListener {
    private Navios navios = new Navios(1,1,0,0,0);
    private Tabuleiro tabuleiroP1 = new Tabuleiro();
    private Tabuleiro tabuleiroP2 = new Tabuleiro();
    private Player player1;
    private Player player2;
    private MovimentoDefesa movimentoDefesa1 = new MovimentoDefesa(tabuleiroP1,navios);
    private MovimentoDefesa movimentoDefesa2 = new MovimentoDefesa(tabuleiroP2,navios);
    private JButton normal = new JButton("NORMAL");
    private JButton custom = new JButton("CUSTOM");
    private JButton voltar = new JButton("VOLTAR");
    private Font fonteBotao = new Font("Tahoma",Font.ITALIC | Font.BOLD,15);
    private JPanel painel = new JPanel();

    public ModoJogo(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESCOLHA O MODO DE JOGO:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        this.configurarGuia();
        botoes();
    }

    public void botoes(){
        normal.setFont(fonteBotao);
        custom.setFont(fonteBotao);
        voltar.setFont(fonteBotao);

        normal.setAlignmentX(CENTER_ALIGNMENT);
        normal.setMaximumSize(new Dimension(200,80));
        normal.addActionListener(this);
        normal.setForeground(Color.BLACK);
        normal.setBackground(Color.RED);

        custom.setAlignmentX(CENTER_ALIGNMENT);
        custom.setMaximumSize(new Dimension(200,80));
        custom.addActionListener(this);
        custom.setForeground(Color.BLACK);
        custom.setBackground(Color.RED);

        voltar.setAlignmentX(CENTER_ALIGNMENT);
        voltar.setMaximumSize(new Dimension(200,80));
        voltar.addActionListener(this);
        voltar.setForeground(Color.BLACK);
        voltar.setBackground(Color.RED);

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
                this.player1.setPlayerName(JOptionPane.showInputDialog("Qual o seu nome, capitão Um?"));
            } catch (NomeInvalidoException x){
                JOptionPane.showMessageDialog(null, x.getMessage(), "Usuário incorreto", JOptionPane.WARNING_MESSAGE);
            }

            try{
                this.player2.setPlayerName(JOptionPane.showInputDialog("Qual o seu nome, capitão Dois?"));
            } catch (NomeInvalidoException x){
                JOptionPane.showMessageDialog(null, x.getMessage(), "Usuário incorreto", JOptionPane.WARNING_MESSAGE);
            }
        }


        if(e.getSource() == normal && this.player1.getPlayerName() != null && this.player2.getPlayerName() != null){
            Defesa defesa = new Defesa(navios,tabuleiroP1, tabuleiroP2, player1, player2, movimentoDefesa1, movimentoDefesa2);
            setVisible(false);
            defesa.setVisible(true);
            defesa.getPainelTabuleiro().setVisible(false);
            defesa.getPainelTabuleiro().setVisible(true);

        }

        if(e.getSource()== custom && this.player1.getPlayerName() != null && this.player2.getPlayerName() != null){
            boolean verificador1Cano = false;
            boolean verificador2Canos = false;
            boolean verificador3Canos = false;
            boolean verificador4Canos = false;
            boolean verificadorAviao = false;

            do {
                try {
                    String inputNavio1 = JOptionPane.showInputDialog(null, "Digite um número inteiro:", "Informe a Quantidade de Navios de 1 Cano", JOptionPane.QUESTION_MESSAGE);
                    int num1 = Integer.parseInt(inputNavio1);
                    verificador1Cano = true;
                    navios.setQuant1Cano(num1);
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "Valor inserido não é um número inteiro válido!");
                }
            }
            while (!verificador1Cano);

            do {
                try {
                    String inputNavio2 = JOptionPane.showInputDialog(null, "Digite um número inteiro:","Informe a Quantidade de Navios de 2 Canos",JOptionPane.QUESTION_MESSAGE);
                    int num2 = Integer.parseInt(inputNavio2);
                    verificador2Canos = true;
                    navios.setQuant2Canos(num2);
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "Valor inserido não é um número inteiro válido!");
                }
            }
            while (!verificador2Canos);

            do{
                try {
                    String inputNavio3 = JOptionPane.showInputDialog(null, "Digite um número inteiro:","Informe a Quantidade de Navios de 3 Canos",JOptionPane.QUESTION_MESSAGE);
                    int num3 = Integer.parseInt(inputNavio3);
                    verificador3Canos = true;
                    navios.setQuant3Canos(num3);
                } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "Valor inserido não é um número inteiro válido!");
                }
            }
            while (!verificador3Canos);

            do{
                try {
                    String inputNavio4 = JOptionPane.showInputDialog(null, "Digite um número inteiro:","Informe a Quantidade de Navios de 4 Canos",JOptionPane.QUESTION_MESSAGE);
                    int num4 = Integer.parseInt(inputNavio4);
                    verificador4Canos = true;
                    navios.setQuant4Canos(num4);
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "Valor inserido não é um número inteiro válido!");
                }
            }while (!verificador4Canos);

            do{
                try {
                    String inputAviao = JOptionPane.showInputDialog(null, "Digite um número inteiro:","Informe a Quantidade de Porta-avioes",JOptionPane.QUESTION_MESSAGE);
                    int num5 = Integer.parseInt(inputAviao);
                    verificadorAviao = true;
                    navios.setQuantAvioes(num5);
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "Valor inserido não é um número inteiro válido!");
                }
            }while(!verificadorAviao);

            Defesa defesa = new Defesa(navios,tabuleiroP1, tabuleiroP2, player1, player2, movimentoDefesa1, movimentoDefesa2);
            setVisible(false);
            defesa.setVisible(true);
            defesa.getPainelTabuleiro().setVisible(false);
            defesa.getPainelTabuleiro().setVisible(true);

        }

        if(e.getSource()== voltar){
            Menu menu = new Menu();
            this.dispose();
            menu.setVisible(true);
        }
    }
}