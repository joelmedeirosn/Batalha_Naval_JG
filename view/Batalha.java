package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.Movimento;

public class Batalha extends JFrame implements ActionListener{

    private JButton[][] botoes;
    private JLabel titulo = new JLabel();
    private Font fonteLabel = new Font("Serif", Font.BOLD,50);
    private JPanel tabuleiro = new JPanel(new GridLayout(10,10));

    public Batalha(){
        /*titulo.setFont(fonteLabel);
        titulo.setText("TABULEIRO");
        titulo.setBounds(250,100,800,70);
        add(titulo);*/
        botoes = new JButton[10][10];

        this.configurarGuia();
        this.configBotoes();

    }
    public void configurarGuia(){
       // setTitle("TABULEIRO");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
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
