package PaooGame.Menu;

import javax.swing.*;


public class Menu {

    Menu_Buttons settingsButton;
    Menu_Buttons exitButton;
    Menu_Buttons startButton;
    Menu_Buttons loadButton;
    Menu_Buttons mainMenu;


    public static JPanel panel;

    //da=true  inseamna ca este meniu principal
    //da=false inseamna ca este meniu in timpul jocului

    public Menu( boolean da) {
        if (da == true) {
            meniu_principal_joc();
        } else {
            meniu_gameplay_joc();
        }
        settingsButton = new Menu_Buttons("Settings", Boolean.TRUE);
        exitButton = new Menu_Buttons("Exit Game", Boolean.TRUE);

        settingsButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START + 2 * ct.BUTTON_SPACING, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);
        exitButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START + 3 * ct.BUTTON_SPACING, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);

        //

        // apel imagine de fundal
        // img=new back_ground_image();
        // ???^
        // === Panou PaooGame.Menu.Settings ==
        Settings settingsPanel = new Settings();
       // MenuActions.setDefaultMenuActions(this, settingsPanel);

        panel.add(settingsButton);
        panel.add(exitButton);
    }


    public void meniu_principal_joc() {


        panel = new FadedInBackground();
        panel.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);
        panel.setLayout(null);

        // Butoane Meniu Principal
        startButton = new Menu_Buttons("Start New Game", Boolean.TRUE);
        loadButton = new Menu_Buttons("Load Career", Boolean.TRUE);
        // Poziționarea butoanelor (x, y, latime, inaltime)

        startButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);
        loadButton.setBounds(ct.BUTTON_X, ct.BUTTON_Y_START + ct.BUTTON_SPACING, ct.BUTTON_WIDTH, ct.BUTTON_HEIGHT);

        // Adauga butoanele pe panoul principal
        panel.add(startButton);
        panel.add(loadButton);
       // MenuActions.setStartGameMenu(this);


        // === Actiuni
        //  MenuActions.setActions(frame, mainMenu, settingsPanel, startButton, loadButton, settingsButton, exitButton);
        //setPanelBackground(this,);

    }

    public void meniu_gameplay_joc() {
        panel=new back_ground_image();
    }

}
