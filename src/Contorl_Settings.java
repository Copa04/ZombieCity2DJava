import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class Contorl_Settings extends JPanel {
    private final HashMap<String, KeyStroke> keyBindings = new HashMap<>();
    private JLabel rightKeyLabel;
    private JButton changeRightKeyButton;
    public JButton Back;

    public Contorl_Settings() {
        setLayout(null);
        setBounds(0, 0, ct.FRAME_WIDTH, ct.FRAME_HEIGHT); // ajustează dimensiunile după nevoie

        //acelasi igitn tot meniul de setari pentru butonul de back si labelul lui
        Back = new JButton("Back to Settings");
        Back.setBounds(10, 10, 150, 30);
        this.add(Back);

        JLabel title = new JLabel("Control Settings");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(10, 50, 300, 30);
        add(title);


        // Tasta implicită pentru mers la dreapta: D
        keyBindings.put("moveRight", KeyStroke.getKeyStroke(KeyEvent.VK_D, 0));

        // Etichetă pentru tasta curentă
        JLabel rightKeyLabel = new JLabel("Right: " + formatKeyStroke(keyBindings.get("moveRight")));
        rightKeyLabel.setBounds(10, 260, 300, 30);
        add(rightKeyLabel);

        // Buton pentru a schimba tasta
        changeRightKeyButton = new JButton("Change Right Key");
        changeRightKeyButton.setBounds(320, 60, 260, 30);
        add(changeRightKeyButton);

        // Când apăsăm pe buton, ascultăm o tastă nouă
        changeRightKeyButton.addActionListener(e -> listenForKey("moveRight", rightKeyLabel));
    }

    // Ascultă următoarea tastă apăsată și o setează pentru acțiune
    private void listenForKey(String action, JLabel labelToUpdate) {
        labelToUpdate.setText("Press a key...");
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    KeyStroke ks = KeyStroke.getKeyStrokeForEvent(e);
                    keyBindings.put(action, ks);
                    labelToUpdate.setText(action + ": " + formatKeyStroke(ks));
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this);
                }
                return true;
            }
        });
    }

    // Format frumos pentru afișarea tastei
    private String formatKeyStroke(KeyStroke ks) {
        String keyText = KeyEvent.getKeyText(ks.getKeyCode());
        String modifiers = KeyEvent.getModifiersExText(ks.getModifiers());
        return modifiers.isEmpty() ? keyText : modifiers + " + " + keyText;
    }

    // Metodă publică pentru a obține tasta asociată unei acțiuni
    public KeyStroke getKeyForAction(String action) {
        return keyBindings.get(action);
    }
}
