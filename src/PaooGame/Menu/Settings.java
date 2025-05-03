package PaooGame.Menu;

import javax.swing.*;

public class Settings extends back_ground_image {
    public Menu_Buttons backButton;
    public Menu_Buttons Sound_Button;
    public Menu_Buttons Control_Button;

    public Settings(JFrame frame) {
        this.setLayout(null);
        this.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);

        Label_extend settingsLabel = new Label_extend("Settings");
        settingsLabel.setBounds(10, 50, 100, 20);

        back_ground_image img=new back_ground_image();

        backButton = new Menu_Buttons("Back to main menu",Boolean.FALSE);
        backButton.setBounds(10, 10, 250, 50);

        Sound_Button = new Menu_Buttons("Sound Settings",Boolean.TRUE);
        Sound_Button.setBounds(ct.BUTTON_X,ct.BUTTON_Y_START,ct.BUTTON_WIDTH,ct.BUTTON_HEIGHT  );

        Control_Button = new Menu_Buttons("Control Settings",Boolean.TRUE);
        Control_Button.setBounds(ct.BUTTON_X,ct.BUTTON_Y_START+ct.BUTTON_SPACING,ct.BUTTON_WIDTH,ct.BUTTON_HEIGHT  );

        Sound_Settings sound_settings_panel = new Sound_Settings();
        Contorl_Settings control_settings_pannel = new Contorl_Settings();

        this.add(Control_Button);
        this.add(Sound_Button);
        this.add(settingsLabel);
        this.add(backButton);

        MenuActions.SetSoundActions(frame, this, sound_settings_panel, control_settings_pannel);

    }
}
