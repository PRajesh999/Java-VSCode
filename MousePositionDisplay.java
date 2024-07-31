import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MousePositionDisplay extends JFrame implements MouseMotionListener {
    JLabel label;

    public MousePositionDisplay() {
        setTitle("Mouse Position Display");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Mouse Position: ");
        add(label);

        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse Position: " + x + ", " + y);
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MousePositionDisplay().setVisible(true);
            }
        });
    }
}
