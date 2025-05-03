package levels;

import java.awt.*;

public class Level {

    // Simple level layout using characters
    private char[][] layout = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', 'P', '.', 'Z', '.', '.', 'L', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    private final int tileSize = 64;

    public void draw(Graphics g) {
        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout[row].length; col++) {
                char tile = layout[row][col];
                int x = col * tileSize;
                int y = row * tileSize;

                switch (tile) {
                    case '#':
                        g.setColor(Color.DARK_GRAY); break; // wall
                    case '.':
                        g.setColor(Color.LIGHT_GRAY); break; // ground
                    case 'P':
                        g.setColor(Color.GREEN); break;     // player spawn
                    case 'Z':
                        g.setColor(Color.RED); break;       // zombie spawn
                    case 'L':
                        g.setColor(Color.YELLOW); break;    // loot
                    default:
                        g.setColor(Color.BLACK); break;
                }

                g.fillRect(x, y, tileSize, tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, tileSize, tileSize); // grid border
            }
        }
    }

    public int getTileSize() {
        return tileSize;
    }

    public char[][] getLayout() {
        return layout;
    }
}
