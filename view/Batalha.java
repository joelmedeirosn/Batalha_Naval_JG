package view;

import controller.Movimento;
import model.NomeInvalidoException;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Batalha extends JFrame implements ActionListener{

    Player player1 = new Player();
    Player player2 = new Player();
    private Player player;
    private JButton[][] botoes;
    private int saberNavio;
    private JRadioButton botaoAvioes = new JRadioButton("Porta Avioes");
    private JRadioButton botao1Cano = new JRadioButton("1 Cano");
    private JRadioButton botao2Canos = new JRadioButton("2 Canos");
    private JRadioButton botao3Canos = new JRadioButton("3 Canos");
    private JRadioButton botao4Canos = new JRadioButton("4 Canos");
    private JButton girar = new JButton("GIRAR");
    private JButton avancar = new JButton("AVANÇAR");
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JPanel tabuleiro = new JPanel(new GridLayout(10,10));
    private JPanel painel = new JPanel();
    ButtonGroup group = new ButtonGroup();


    public Batalha() {
        tabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BATALHA!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        botoes = new JButton[10][10];
        saberNavio = 1;
        this.textField();
        this.configurarGuia();
        this.configTabuleiro();
        this.botoes();

    }

    public void textField() {
        setLayout(new GridLayout());
        String nome1 = JOptionPane.showInputDialog("Digite seu nome, jogador 1");
        String nome2 = JOptionPane.showInputDialog("Digite seu nome, jogador 2");

        player1.setPlayerName(nome1);
        player2.setPlayerName(nome2);

    }

    public void configurarGuia(){
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        tabuleiro.setSize(500,750);
        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE OS NAVIOS:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painel.setBounds(500,0,285,750);
        add(painel);


    }



    public void configTabuleiro(){
        Movimento movimento = new Movimento(player1,this.botoes);

        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                this.botoes[i][j] = new JButton();
                this.botoes[i][j].addActionListener(movimento);
                this.tabuleiro.add(this.botoes[i][j]);
            }
        }

        add(this.tabuleiro);
    }

    public void botoes(){

        botao1Cano.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botao1Cano.setMaximumSize(new Dimension(250,80));
        botao1Cano.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(botao1Cano);

        botao2Canos.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botao2Canos.setMaximumSize(new Dimension(250,80));
        botao2Canos.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(botao2Canos);

        botao3Canos.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botao3Canos.setMaximumSize(new Dimension(250,80));
        botao3Canos.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(botao3Canos);

        botao4Canos.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botao4Canos.setMaximumSize(new Dimension(250,80));
        botao4Canos.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(botao4Canos);

        botaoAvioes.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botaoAvioes.setMaximumSize(new Dimension(250,80));
        botaoAvioes.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(botaoAvioes);


        girar.setAlignmentX(Component.CENTER_ALIGNMENT);
        girar.setMaximumSize(new Dimension(150,80));
        girar.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(girar);

        avancar.setAlignmentX(Component.CENTER_ALIGNMENT);
        avancar.setMaximumSize(new Dimension(200,80));
        avancar.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(avancar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao1Cano){
            saberNavio = 1;
        } else if (e.getSource() == botao2Canos) {
            saberNavio = 2;
        } else if (e.getSource() == botao3Canos) {
            saberNavio = 3;
        } else if (e.getSource() == botao4Canos) {
            saberNavio = 4;
        } else {
            saberNavio = 5;
        }
    }
}

