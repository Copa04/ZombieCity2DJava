package Main;

import javax.swing.*;

public class jframe_init extends javax.swing.JFrame {
    public jframe_init(){
       // frame = new jframe_init("ZombieCity");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //aici e fullscreen
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
    }


}
