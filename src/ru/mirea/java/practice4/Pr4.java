package ru.mirea.java.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Pr4 extends JFrame{
    JButton realM = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");

    JLabel score = new JLabel();
    JLabel winCommand = new JLabel();
    JLabel lastGol = new JLabel();

    int milGoal = 0, madrGoal = 0;

    public Pr4(){
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3, 1));
        add(realM);
        setSize(500,500);

        updateScore();
        updateWinCommand();

        milan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milGoal;
                updateWinCommand();
                updateScore();
                updateLastGoal("AC Milan");
            }
        });

        realM.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrGoal++;
                updateWinCommand();
                updateScore();
                updateLastGoal("Real Madrid");
            }
        });

        Font fnt = new Font("Times new roman",Font.BOLD,50);
        Font fnt22 = new Font("Times new roman",Font.BOLD,22);
        add(winCommand);
        winCommand.setVerticalAlignment(JLabel.CENTER);
        winCommand.setHorizontalAlignment(JLabel.CENTER);
        winCommand.setFont(fnt22);
        add(milan);
        add(score);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        score.setFont(fnt);
        add(lastGol);
        lastGol.setVerticalAlignment(JLabel.CENTER);
        lastGol.setHorizontalAlignment(JLabel.CENTER);
        lastGol.setFont(fnt22);
    }

    public void updateWinCommand() {
        if (milGoal > madrGoal)
            winCommand.setText("Winner AC Milan");
        else if (milGoal < madrGoal)
            winCommand.setText("Winner Real Madrid");
        else
            winCommand.setText("Winner draw");
    }

    public void updateLastGoal(String command) {
        lastGol.setText("Last goal " + command);
    }

    public void updateScore() {
        score.setText( madrGoal + "||" + milGoal);
    }

    public static void main(String[] args) {
        new Pr4().setVisible(true);
    }
}
