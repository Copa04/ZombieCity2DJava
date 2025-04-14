import javax.swing.*;

public class MenuActions {

    public static void setActions(JFrame frame, JPanel mainMenu,
                                  Settings settingsPanel,
                                  JButton startButton, JButton loadButton,
                                  JButton settingsButton, JButton exitButton) {

        startButton.addActionListener(e -> System.out.println("Starting New Game"));
        loadButton.addActionListener(e -> System.out.println("Loading Career..."));

        settingsButton.addActionListener(e -> {
            frame.remove(mainMenu);
            frame.add(settingsPanel);
            frame.revalidate();
            frame.repaint();
        });

        settingsPanel.backButton.addActionListener(e -> {
            frame.remove(settingsPanel);
            frame.add(mainMenu);
            frame.revalidate();
            frame.repaint();
        });

        exitButton.addActionListener(e -> System.exit(0));
    }
    public static void SetSoundActions(JFrame frame,
                                       Settings SettingsPanel, Sound_Settings sound_settings_panel,
                                       Contorl_Settings contorl_settings_panel
                                       )
    {
        SettingsPanel.Sound_Button.addActionListener(e -> {
            frame.remove(SettingsPanel);
            frame.add(sound_settings_panel);
            frame.revalidate();
            frame.repaint();
        });
        sound_settings_panel.backButton.addActionListener(e -> {
            frame.remove(sound_settings_panel);
            frame.add(SettingsPanel);
            frame.revalidate();
            frame.repaint();
        });
        SettingsPanel.Control_Button.addActionListener(e -> {
           frame.remove(SettingsPanel);
           frame.add(contorl_settings_panel);
           frame.revalidate();
           frame.repaint();
        });
        contorl_settings_panel.Back.addActionListener(e -> {
           frame.remove(contorl_settings_panel);
           frame.add(SettingsPanel);
           frame.revalidate();
           frame.repaint();
        });

    }


}
