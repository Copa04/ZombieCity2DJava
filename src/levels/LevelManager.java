package levels;

import java.awt.*;

public class LevelManager {

    private Level currentLevel;

    public LevelManager() {
        currentLevel = new Level(); // Start with 1 level
    }

    public void draw(Graphics g) {
        if (currentLevel != null) {
            currentLevel.draw(g);
        }
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    // Optional: Add methods to switch levels in the future
}
