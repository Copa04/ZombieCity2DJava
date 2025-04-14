import javax.swing.*;

public class Settings extends JPanel {
    public JButton backButton;
    public JButton Sound_Button;
    public JButton Control_Button;

    public Settings(JFrame frame) {
        this.setLayout(null);
        this.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);

        JLabel settingsLabel = new JLabel("Settings");
        settingsLabel.setBounds(10, 50, 100, 20);

        backButton = new JButton("Back to main menu");
        backButton.setBounds(10, 10, 150, 30);

        Sound_Button = new JButton("Sound Settings");
        Sound_Button.setBounds(ct.BUTTON_X,ct.BUTTON_Y_START,ct.BUTTON_WIDTH,ct.BUTTON_HEIGHT  );

        Control_Button = new JButton("Control Settings");
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
