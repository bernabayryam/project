package game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {



    GameBoard() {



        this.add(new GamePanel());
        this.setTitle("Knights,Elves,Dwarfs");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocation(300, 200);

    }


    public void paint(Graphics g) {

            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 9; col++) {
                    g.setColor(Color.BLACK);
                    g.drawRect(0, 0, 100, 100);

                    GameTile tile=new GameTile(row,col);
                    tile.render(g);
                }
            }
        }
    }





