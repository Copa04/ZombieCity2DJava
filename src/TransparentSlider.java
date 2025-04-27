import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class TransparentSlider extends JSlider {
    private static final Color TRACK_COLOR = new Color(70, 130, 180); // Albastru deschis
    private static final Color THUMB_COLOR = Color.WHITE;

    public TransparentSlider(int orientation, int min, int max, int value) {
        super(orientation, min, max, value);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());
        setUI(new CustomSliderUI(this));
    }

    private static class CustomSliderUI extends BasicSliderUI {
        public CustomSliderUI(JSlider slider) {
            super(slider);
        }

        @Override
        public void paintTrack(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(TRACK_COLOR);
            g2d.fillRoundRect(trackRect.x, trackRect.y + (trackRect.height / 2) - 2,
                    trackRect.width, 4, 4, 4);
        }

        @Override
        public void paintThumb(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(THUMB_COLOR);
            g2d.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
        }

        @Override
        public void paintFocus(Graphics g) {}
    }
}