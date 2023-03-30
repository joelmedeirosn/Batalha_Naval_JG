package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Batalha extends JFrame implements ActionListener{

    private JButton[][] botoes;
    private JButton avancar = new JButton("AVANÇAR");
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JPanel tabuleiro = new JPanel(new GridLayout(10,10));
    private JPanel painel = new JPanel();
    private JComboBox<String> navios = new JComboBox<String>();

    public Batalha(){
        tabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BATALHA!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        botoes = new JButton[10][10];

        this.textField();
        this.configurarGuia();
        this.configTabuleiro();
        this.comboBox();
        this.botoes();

    }

    public void textField(){
        setLayout(new GridLayout());
        String nome1 = JOptionPane.showInputDialog("Digite seu nome, jogador 1");
        String nome2 = JOptionPane.showInputDialog("Digite seu nome, jogador 2");

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

    public void comboBox(){ //falta implementar na interface
        painel.add(Box.createRigidArea(new Dimension(250,200)));
        painel.add(navios);
        navios.addItem("1 cano");
        navios.addItem("2 canos");
        navios.addItem("3 canos");
        navios.addItem("4 canos");
        navios.addItem("Porta aviões");

    }

    public void configTabuleiro(){

        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                this.botoes[i][j] = new JButton();
                this.tabuleiro.add(this.botoes[i][j]);
            }
        }

        add(this.tabuleiro);

    }

    public void botoes(){
        avancar.setAlignmentX(Component.CENTER_ALIGNMENT);
        avancar.setMaximumSize(new Dimension(200,80));
        avancar.addActionListener(this);

        painel.add(Box.createRigidArea(new Dimension(0,200)));
        painel.add(avancar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
