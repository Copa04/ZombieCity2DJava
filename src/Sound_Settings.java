import javax.swing.*;

public class Sound_Settings extends JPanel {
    public JButton backButton;
    JSlider MasterVolumeSlider;
    JSlider MusicVolumeSlider;
    JSlider CreaturesVolumeSlider;


    public Sound_Settings() {
        this.setLayout(null);
        this.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);
    //Label uri
        JLabel settingsLabel = new JLabel("Sound Settings");
        JLabel masterVolumeLabel = new JLabel("Master Volume");
        JLabel creaturesVolumeLabel = new JLabel("Creatures Volume");
        JLabel musicVolumeLabel = new JLabel("Music Volume");

        settingsLabel.setBounds(10, 50, 100, 20);
        masterVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START, 300, 20);
        creaturesVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START+ct.SLIDER_SPACING, 300, 20);
        musicVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START+2*ct.SLIDER_SPACING, 300, 20);

        //butoane
        backButton = new JButton("Back to main menu");
        backButton.setBounds(10, 10, 150, 30);


        //slidere
        MasterVolumeSlider= new JSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL);
        MasterVolumeSlider.setBounds(ct.SLIDER_X_START, ct.SLIDER_Y_START, ct.SLIDER_WIDTH, ct.SLIDER_HEIGHT);

        CreaturesVolumeSlider= new JSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL );
        CreaturesVolumeSlider.setBounds(ct.SLIDER_X_START,ct.SLIDER_Y_START+ct.SLIDER_SPACING, ct.SLIDER_WIDTH, ct.SLIDER_HEIGHT);

        MusicVolumeSlider= new JSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL );
        MusicVolumeSlider.setBounds(ct.SLIDER_X_START,ct.SLIDER_Y_START+2*ct.SLIDER_SPACING, ct.SLIDER_WIDTH, ct.SLIDER_HEIGHT);

        this.add(MusicVolumeSlider);
        this.add(CreaturesVolumeSlider);
        this.add(MasterVolumeSlider);

        this.add(backButton);

        this.add(settingsLabel);
        this.add(masterVolumeLabel);
        this.add(musicVolumeLabel);
        this.add(creaturesVolumeLabel);
    }
}