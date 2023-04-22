package view;

import controller.Movimento;
import model.Navios;
import model.Player;
import model.Tabuleiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Defesa extends JFrame implements ActionListener{

    private Movimento movimento;
    private Navios navios;

    private boolean avancou = false;

    public boolean isAvancou() {
        return avancou;
    }

    public void setAvancou(boolean avancou) {
        this.avancou = avancou;
    }
    private int saberNavio;
    private JButton[][] botoes;
    private JRadioButton botaoAvioes = new JRadioButton("Porta Avioes");
    private JRadioButton botao1Cano = new JRadioButton("1 Cano");
    private JRadioButton botao2Canos = new JRadioButton("2 Canos");
    private JRadioButton botao3Canos = new JRadioButton("3 Canos");
    private JRadioButton botao4Canos = new JRadioButton("4 Canos");
    private JButton girar = new JButton("GIRAR");
    private JButton avancar = new JButton("AVANÇAR");
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JPanel painelTabuleiro = new JPanel(new GridLayout(10,10));
    private JPanel painel = new JPanel();
    ButtonGroup group = new ButtonGroup();


    public Defesa(Navios navios, Tabuleiro tabuleiroP1, Tabuleiro tabuleiroP2,Player p,Movimento movimento) {
        this.movimento = movimento;
        this.navios = navios;
        painelTabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "" + p.getPlayerName() + "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        repaint();
        botoes = new JButton[10][10];
        this.configurarGuia();
        this.configTabuleiro();
        this.botoes();
    }

    public void configurarGuia(){
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        painelTabuleiro.setSize(500,750);
        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE OS NAVIOS:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        painel.setBounds(500,0,285,750);
        add(painel);
    }

    public void configTabuleiro(){


        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                this.botoes[i][j] = new JButton();
                this.botoes[i][j].addActionListener(movimento);
                this.painelTabuleiro.add(this.botoes[i][j]);
            }
        }
        add(this.painelTabuleiro);
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

        group.add(botao1Cano);
        group.add(botao2Canos);
        group.add(botao3Canos);
        group.add(botao4Canos);
        group.add(botaoAvioes);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(botao1Cano.isSelected()){
            navios.setSaberNavio(1);
            repaint();
        } else if (botao2Canos.isSelected()) {
            navios.setSaberNavio(2);
            repaint();
        } else if (botao3Canos.isSelected()) {
            navios.setSaberNavio(3);
            repaint();
        } else if (botao4Canos.isSelected()) {
            navios.setSaberNavio(4);
            repaint();
        } else if (botaoAvioes.isSelected()) {
            navios.setSaberNavio(5);
            repaint();
        }

        if(e.getSource() == avancar){
            this.avancou = true;
            setVisible(false);
        }
    }
}

