package PaooGame.Menu;

import javax.swing.*;

public class Sound_Settings extends back_ground_image {
    public Menu_Buttons backButton;
    TransparentSlider MasterVolumeSlider;
    TransparentSlider MusicVolumeSlider;
    TransparentSlider CreaturesVolumeSlider;


    public Sound_Settings() {
        this.setLayout(null);
        this.setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT);
    //Label uri
        Label_extend settingsLabel = new Label_extend("Sound Settings");
        Label_extend masterVolumeLabel = new Label_extend("Master Volume");
        Label_extend creaturesVolumeLabel = new Label_extend("Creatures Volume");
        Label_extend musicVolumeLabel = new Label_extend("Music Volume");

        settingsLabel.setBounds(10, 50, 200, 20);
        masterVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START, 300, 20);
        creaturesVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START+ct.SLIDER_SPACING, 300, 20);
        musicVolumeLabel.setBounds(ct.SLIDER_X_START-200, ct.SLIDER_Y_START+2*ct.SLIDER_SPACING, 300, 20);

        //butoane
        backButton = new Menu_Buttons("Back to main menu",Boolean.FALSE);
        backButton.setBounds(10, 10, 300, 30);

        //imag de fundal
        back_ground_image img= new back_ground_image();

        //slidere
        MasterVolumeSlider= new TransparentSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL);
        MasterVolumeSlider.setBounds(ct.SLIDER_X_START, ct.SLIDER_Y_START, ct.SLIDER_WIDTH, ct.SLIDER_HEIGHT);

        CreaturesVolumeSlider= new TransparentSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL );
        CreaturesVolumeSlider.setBounds(ct.SLIDER_X_START,ct.SLIDER_Y_START+ct.SLIDER_SPACING, ct.SLIDER_WIDTH, ct.SLIDER_HEIGHT);

        MusicVolumeSlider= new TransparentSlider(JSlider.HORIZONTAL, 0, ct.SLIDER_VOLUME_MAX, ct.SLIDER_VOLUME_INITIAL );
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