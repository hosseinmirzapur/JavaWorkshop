import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductChangeTicket extends JFrame {
    public JTextField enterYourRequestTextTextField;
    public JPanel panel1;
    public ProductChangeTicket() {
        enterYourRequestTextTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Your request ticket is saved!");
            }
        });
    }
}
