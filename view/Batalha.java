package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Batalha extends JFrame implements ActionListener {

    public Batalha(){
        this.configurarGuia();

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

    }
}
