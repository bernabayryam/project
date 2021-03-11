package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GamePanel extends JPanel implements ActionListener {


    GamePanel() {

    }

    public void paint(Graphics g) {
        for (int row = 0; row < 7; row++) {

            for (int col = 0; col < 9; col++) {

                this.renderGameTile();
            }
        }
    }

    private void renderGameTile() {

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
