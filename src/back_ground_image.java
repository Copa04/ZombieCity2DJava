import javax.swing.*;
import java.awt.*;

public class back_ground_image extends JPanel {
    private static Image background_IMG;
    public back_ground_image() {
        if (background_IMG == null) {
            background_IMG= new ImageIcon("C:\\Users\\david\\IdeaProjects\\paoo-proiect-doubledc\\fundal.jpg").getImage();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background_IMG != null) {
            g.drawImage(background_IMG, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
