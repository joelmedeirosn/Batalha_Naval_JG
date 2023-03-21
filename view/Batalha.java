package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.*;
import model.*;

public class Batalha extends JFrame implements ActionListener{

    private JButton[][] botoes;
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JPanel tabuleiro = new JPanel(new GridLayout(10,10));
    private JComboBox<String> combo = new JComboBox<String>();

    public Batalha(){
        /*titulo.setFont(fonteLabel);
        titulo.setText("TABULEIRO");
        titulo.setBounds(250,100,800,70);
        add(titulo);*/
        tabuleiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BATALHA!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        botoes = new JButton[10][10];



        this.textField();
        this.configurarGuia();
        this.configBotoes();
       // this.comboBox();

    }

    public void textField(){
        setLayout(new GridLayout());
        String nome1 = JOptionPane.showInputDialog("Digite seu nome, jogador 1");
        String nome2 = JOptionPane.showInputDialog("Digite seu nome, jogador 2");

    }

    public void configurarGuia(){
       // setTitle("TABULEIRO");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void comboBox(){ //falta implementar na interface
        tabuleiro.setLayout(new BoxLayout(tabuleiro, BoxLayout.PAGE_AXIS));
        tabuleiro.add(Box.createRigidArea(new Dimension(250,200)));
        tabuleiro.add(combo);
        combo.addItem("1 cano");
        combo.addItem("2 canos");
        combo.addItem("3 canos");
        combo.addItem("4 canos");
        combo.addItem("Porta aviões");

    }

    public void configBotoes(){

        for(int i = 0; i<this.botoes.length;i++){
            for(int j = 0;j<this.botoes[i].length;j++){
                this.botoes[i][j] = new JButton();
                this.tabuleiro.add(this.botoes[i][j]);
            }
        }

        add(this.tabuleiro);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
