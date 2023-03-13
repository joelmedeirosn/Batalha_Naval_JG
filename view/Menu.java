package view;

import javax.swing.*;

public class Menu extends JFrame {
    public Menu(){
        setTitle("Batalha Naval");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();

    }
}
