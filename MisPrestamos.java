import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MisPrestamos extends JFrame {

    public MisPrestamos() {
        // Set up the frame
        setTitle("Mis prestamoss");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Add components
        JLabel welcomeLabel = new JLabel("Biblioteca UDB");
        welcomeLabel.setBounds(90, 50, 250, 25);
        panel.add(welcomeLabel);

        JButton searchButton = new JButton("Buscar");
        searchButton.setBounds(120, 150, 150, 30);
        panel.add(searchButton);


        // Add action listeners for buttons
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                JOptionPane.showMessageDialog(null, "Aun sin crear...");
            }
        });

        // Make the frame visible
        setVisible(true);
    }
}
