package game;

import java.awt.*;

public class GameTile {

    static final int TILE_SIZE = 75;

    private final int row;
    private final int col;
    private final Color color;

    public GameTile(int row, int col) {
        this.row = row;
        this.col = col;
        this.color = null;
    }

    public void render(Graphics g) {

        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
        g.setColor(Color.BLACK);
        g.drawRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
    }
}

