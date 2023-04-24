package model;

import javax.swing.*;

public class Tabuleiro implements Grelha{


    private JButton[][] grid;

    public JButton[][] getGrid() {
        return this.grid;
    }
    public void setGrid(JButton[][] grid) {
        this.grid = grid;
    }



    public Tabuleiro() {
        this.grid = new JButton[10][10];
        CriarGrid();
    }

    @Override
    public void CriarGrid() {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                this.grid[i][j] = new JButton(" ");
            }
        }
    }
}
