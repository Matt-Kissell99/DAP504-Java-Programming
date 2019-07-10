import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Overview {

    public JPanel mainPanel;
    public JButton startTournamentButton;
    public JButton yesButton;
    public JButton noButton;
    public JButton getCurrentPlayerStatisticsButton;
    public JButton endTournamentButton;
    public JTextArea terminalArea;
    public JTextArea playerStatistics;
    public JButton testingButtonButton;
    public JCheckBox isThisWorkingCheckBox;
    public JFormattedTextField iSwearThisIsFormattedTextField;

    public Overview() {
//        startTournamentButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        getCurrentPlayerStatisticsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
    }

    public void initialiseGUI() {
        JFrame myFrame = new JFrame("Overview");
        myFrame.setSize(10000, 10000);
        myFrame.setContentPane(new Overview().mainPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }


    public void appendToTerminal(String sentence) {
        terminalArea = new JTextArea();
        terminalArea.setEditable(false);
        terminalArea.append(sentence);
    }

    public JButton getNoButton() {
        return noButton;
    }

    public JButton getStartTournamentButton() {
        return startTournamentButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getEndTournamentButton() {
        return endTournamentButton;
    }

    public JButton getGetCurrentPlayerStatisticsButton() {
        return getCurrentPlayerStatisticsButton;
    }

    public JButton getYesButton() {
        return yesButton;
    }

    public JTextArea getTerminalArea() {
        return terminalArea;
    }

    public void startListener() {
        startTournamentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
