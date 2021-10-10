package ru.mirea.java.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr4 extends JFrame{
    JButton realMadrid = new JButton("Real Madrid");
    JButton ACmilan = new JButton("AC Milan");

    JLabel score = new JLabel();
    JLabel winCommand = new JLabel();
    JLabel lastGoal = new JLabel();

    int milGoal = 0, madrGoal = 0;

    public Pr4(){
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3, 1));
        add(realMadrid);
        setSize(500,500);

        updateScore();
        updateWinCommand();

        ACmilan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ++milGoal;
                updateWinCommand();
                updateScore();
                updateLastGoal("AC Milan");
            }
        });

        realMadrid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ++madrGoal;
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
        add(ACmilan);
        add(score);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        score.setFont(fnt);
        add(lastGoal);
        lastGoal.setVerticalAlignment(JLabel.CENTER);
        lastGoal.setHorizontalAlignment(JLabel.CENTER);
        lastGoal.setFont(fnt22);
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
        lastGoal.setText("Last goal " + command);
    }

    public void updateScore() {
        score.setText( madrGoal + "||" + milGoal);
    }

    public static void main(String[] args) {
        new Pr4().setVisible(true);
    }
}
