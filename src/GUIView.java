import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class GUIView extends JFrame {
    private JTextField textField;
    private JButton button;

    private JTextArea outputArea;

    public GUIView() {
        textField = new JTextField();
        button = new JButton("Update Model");
        outputArea = new JTextArea();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        setLayout(new FlowLayout());
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        outputArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(textField);
        panel.add(button);
        panel.add(outputArea);
        add(panel);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String text) {
        outputArea.setText(text);
    }

    public void addButtonActionListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
