import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameExample extends JFrame implements ActionListener {
    JButton button1; // Declare button1 outside the main method
    JButton button2; // Declare button2 outside the main method

    public static void main(String s[]) {
        new JFrameExample();
    }

    public JFrameExample() {
        setTitle("First Java JFrame");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Buttons");
        button1 = new JButton("Button");
        button2 = new JButton("Button2");

        // Add ActionListeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        add(panel);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("Button 1 clicked!");
        } else if (e.getSource() == button2) {
            System.out.println("Button 2 clicked!");
        }
    }
}
