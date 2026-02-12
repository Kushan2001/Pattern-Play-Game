import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PatternPlay {
     int boardWidth = 600;
        int boardHeight = 650;
  
         JFrame frame = new JFrame("Pattern Play");
        JLabel textLabel = new JLabel();
        JPanel textPanel = new JPanel();
        JPanel boardPanel = new JPanel();
    

    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;

    boolean gameOver = false;
    int turns = 0;

    PatternPlay() {
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    textLabel.setBackground(Color.gray);
    textLabel.setForeground(Color.white);
    textLabel.setFont(new Font("Arial", Font.BOLD, 30));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Pattern Play");
    textLabel.setOpaque(true);

    textPanel.setLayout(new BorderLayout());
    textPanel.add(textLabel);
    frame.add(textPanel, BorderLayout.NORTH);


}

}