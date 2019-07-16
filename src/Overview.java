import javax.swing.*;

public class Overview {

    public JPanel mainPanel; //MainPanel component
    public JTextArea playerStatistics; //Player statistics JTextArea


    public Overview(Tournament currentEvent) {
        checkPlayerStatistics(currentEvent); //Start by checking statistics
    }

    public JFrame initialiseGUI(Tournament currentEvent) {
        JFrame scoreBoard = new JFrame("Overview"); //Create JFrame
        scoreBoard.setSize(10000, 10000); //Set size of window
        scoreBoard.setContentPane(new Overview(currentEvent).mainPanel); //Set the mainPanel
        scoreBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Default exit when closing the GUI
        scoreBoard.pack();
        scoreBoard.setVisible(true); //Set it to be visible
        return scoreBoard; //Return the JFrame for future use
    }

    public void checkPlayerStatistics(Tournament currentEvent) {
        if(currentEvent.getRemainingPlayers().size() == 0) { //If there are no players, return the sentence below
            playerStatistics.setText("No Players found");
        } else { //Else if return all of the active players and the eliminated players
            playerStatistics.setText("");
            playerStatistics.append("Current Active Players:\n");
            playerStatistics.append("------------------------------------------------------------------------\n");

            currentEvent.getRemainingPlayers().forEach(player -> { //Foreach remaining player print their statistics out
                playerStatistics.append(player.getFirstName() + " " + player.getLastName() + " - Won: " + player.getWon() + " | Lost: " + player.getLost() + " | Win ratio: " + player.getRatio() + " | Status: " + player.getPlayerStatus() + "\n");
            });

            playerStatistics.append("------------------------------------------------------------------------\n");
            playerStatistics.append("Eliminated Players:\n");
            playerStatistics.append("------------------------------------------------------------------------\n");

            currentEvent.getEliminatedPlayers().forEach(player -> { //Foreach eliminated player print their statistics out
                playerStatistics.append(player.getFirstName() + " " + player.getLastName() + " - Won: " + player.getWon() + " | Lost: " + player.getLost() + " | Win ratio: " + player.getRatio() + " | Status: " + player.getPlayerStatus() + "\n");
            });
        }
    }
}
