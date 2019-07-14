import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Overview {

    public JPanel mainPanel;
    public JTextArea playerStatistics;


    public Overview(Tournament currentEvent) {

        playerStatistics.append("hello");
        checkPlayerStatistics(currentEvent);
    }

    public JFrame initialiseGUI(Tournament currentEvent) {
        JFrame scoreBoard = new JFrame("Overview");
        scoreBoard.setSize(50000, 50000);
        scoreBoard.setContentPane(new Overview(currentEvent).mainPanel);
        scoreBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scoreBoard.pack();
        scoreBoard.setVisible(true);
        return scoreBoard;
    }

    public void checkPlayerStatistics(Tournament currentEvent) {
        if(currentEvent.getRemainingPlayers().size() == 0) {
            playerStatistics.setText("No Players found");
        } else {
            playerStatistics.setText("");
            currentEvent.getRemainingPlayers().forEach(player -> {
                playerStatistics.append(player.getFirstName() + " " + player.getLastName() + " - Age: " + player.getAge() + ", Skill Level: " + player.getSkillLevel() + ", Status: " + player.getPlayerStatus() + "\n");
            });
        }
    }
}
