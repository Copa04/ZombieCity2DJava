import javax.swing.*;

public class Menu {
    public void showMenu() {

        JFrame frame = new JFrame("ZombieCity");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //aici e fullscreen
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);

    // === Panou Meniu Principal ===
        JPanel mainMenu = new JPanel(null);
        mainMenu.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);

        frame.add(mainMenu);

        // Butoane Meniu Principal
        JButton startButton = new JButton("Start New Game");
        JButton loadButton = new JButton("Load Career");
        JButton settingsButton = new JButton("Settings");
        JButton exitButton = new JButton("Exit Game");

        // Poziționarea butoanelor (x, y, latime, inaltime)

            startButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);
            loadButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START+ct.BUTTON_SPACING, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);
            settingsButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START+2*ct.BUTTON_SPACING, ct.BUTTON_WIDTH,ct.BUTTON_HEIGHT);
            exitButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START+3*ct.BUTTON_SPACING, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);

        // Adauga butoanele pe panoul principal
        mainMenu.add(startButton);
        mainMenu.add(loadButton);
        mainMenu.add(settingsButton);
        mainMenu.add(exitButton);

    // === Panou Settings ==
        Settings settingsPanel = new Settings(frame);


    // === Actiuni
        MenuActions.setActions(frame, mainMenu, settingsPanel, startButton, loadButton, settingsButton, exitButton);
        //setPanelBackground(this,);
        frame.setVisible(true);
    }
}
