package model;

import javax.swing.*;

public class Cronometro extends Thread{
    private JLabel timerLabel;
    private boolean pauseP1 = true;
    private boolean pauseP2 = true;
    private int segP1 = 0;
    private int minP1 = 0;
    private int horaP1 = 0;
    private int segP2 = 0;
    private int minP2 = 0;
    private int horaP2 = 0;
    private String time;

    public Cronometro(JLabel label){
        this.timerLabel=label;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                if(pauseP1==false) {
                    segP1++;
                    if (segP1 >= 60) {
                        segP1 = 0;
                        minP1++;
                        if (minP1 >= 60) {
                            minP1 = 0;
                            horaP1++;
                        }
                    }
                    this.time = String.format("%02d:%02d:%02d", horaP1, minP1, segP1);
                    timerLabel.setText(time);
                }
                if(pauseP2 ==false) {
                    segP2++;
                    if (segP2 >= 60) {
                        segP2 = 0;
                        minP2++;
                        if (minP2 >= 60) {
                            minP2 = 0;
                            horaP2++;
                        }
                    }
                    this.time = String.format("%02d:%02d:%02d", horaP2, minP2, segP2);
                    timerLabel.setText(time);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void reiniciarCronometro() {
        segP1 =0;
        segP2 =0;
        minP1 =0;
        minP2 =0;
        horaP1 =0;
        horaP2 =0;
        pauseP1=true;
        pauseP2 =true;
    }
    public void pauseP1() {
        this.pauseP1 = true;

    }
    public void pauseP2() {
        this.pauseP2 = true;
    }

    public void playP1() {
        this.pauseP1 = false;
    }
    public void playP2() {
        this.pauseP2 = false;
    }
}
