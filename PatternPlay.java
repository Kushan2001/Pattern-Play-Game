import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PatternPlay {
    PatternPlay() {
        JFrame frame = new JFrame("Pattern Play");
        frame.setSize(600, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;

    boolean gameOver = false;
    int turns = 0;

}
 