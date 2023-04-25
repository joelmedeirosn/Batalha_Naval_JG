package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class Menu extends JFrame implements ActionListener {
    private Player p1 = new Player();
    private Player p2 = new Player();
    private JButton jogar = new JButton("JOGAR");
    private JButton recorde = new JButton("RECORDE");
    private JButton instrucoes = new JButton("INSTRUÇÕES");
    private JButton sair = new JButton("SAIR");
    private Font fonteBotao = new Font("Tahoma",Font.ITALIC | Font.BOLD,15);
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
        instrucoes.setFont(fonteBotao);
        sair.setFont(fonteBotao);

        jogar.setForeground(Color.BLACK);
        jogar.setBackground(Color.RED);
        recorde.setForeground(Color.BLACK);
        recorde.setBackground(Color.RED);
        instrucoes.setForeground(Color.BLACK);
        instrucoes.setBackground(Color.RED);
        sair.setForeground(Color.BLACK);
        sair.setBackground(Color.RED);

        jogar.addActionListener(this);
        recorde.addActionListener(this);
        instrucoes.addActionListener(this);
        sair.addActionListener(this);

        jogar.setBounds(300,240,200,70);
        recorde.setBounds(300,368,200,70);
        instrucoes.setBounds(300,496,200,70);
        sair.setBounds(300,624,200,70);

        add(jogar);
        add(recorde);
        add(instrucoes);
        add(sair);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jogar) {
            ModoJogo modoJogo = new ModoJogo(p1, p2);
            modoJogo.setVisible(true);
            setVisible(false);
        }

        if(e.getSource()==recorde){
            p1.tratarRecordes();
            JOptionPane.showMessageDialog(null, "Top 10 : \n" + p1.tratarRecordes());


        }

        if(e.getSource()==instrucoes){
            JOptionPane.showMessageDialog(null, "- Batalha Naval é um jogo onde dois jogadores colocam navios em uma grade de 10x10 células e tentam afundar os \n navios do oponente antes que os seus próprios navios sejam afundados.\n - Cada jogador (no modo normal) tem 11 navios de tamanhos diferentes para posicionar no tabuleiro.\n - Durante a fase de ataques, os jogadores selecionam as células na grade do oponente para tentar acertar os navios.\n - O primeiro jogador a afundar todos os navios do oponente vence o jogo.");
        }

        if (e.getSource() == sair) {
            int confirm = JOptionPane.showConfirmDialog(null, "Você está prestes a abandonar a tripulação, capitão.", "Sair do jogo", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
