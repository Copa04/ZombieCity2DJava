package Main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;


    private LevelManager levelManager; // Add LevelManager
    private Game game;
    public GamePanel(Game game) {
        this.game = game;

        setFocusable(true);
        addKeyListener(new KeyboardInputs(this));
        SwingUtilities.invokeLater(this::requestFocusInWindow);


        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

        setPanelSize();

        levelManager = new LevelManager(); // Initialize LevelManager
    }




    private void setPanelSize() {
        Dimension size = new Dimension(1280, 1080);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }


    public void updateGame() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);
    }
    public Game getGame(){
        return game;
    }



}