package PaooGame.Menu;

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
     //   JPanel mainMenu = new JPanel(null);
     FadedInBackground mainMenu=new FadedInBackground();
        mainMenu.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);
        mainMenu.setLayout(null);
        frame.add(mainMenu);
    //    ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("fundal.jpg"));
      //  JLabel background = new JLabel(bgIcon);
      //  background.setLayout(new BorderLayout());
      //  frame.setContentPane(background);


        // Butoane Meniu Principal
        Menu_Buttons startButton = new Menu_Buttons("Start New Game",Boolean.TRUE);
        Menu_Buttons loadButton = new Menu_Buttons("Load Career",Boolean.TRUE);
        Menu_Buttons settingsButton = new Menu_Buttons("Settings",Boolean.TRUE);
        Menu_Buttons exitButton = new Menu_Buttons("Exit Game",Boolean.TRUE);

        //apel imagine de fundal
        back_ground_image img=new back_ground_image();

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

    // === Panou PaooGame.Menu.Settings ==
        Settings settingsPanel = new Settings(frame);


    // === Actiuni
        MenuActions.setActions(frame, mainMenu, settingsPanel, startButton, loadButton, settingsButton, exitButton);
        //setPanelBackground(this,);
        frame.setVisible(true);
    }
}
