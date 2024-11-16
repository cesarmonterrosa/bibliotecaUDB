import javax.swing.*;

public class RegisterDevPrestamo extends JFrame {

    public RegisterDevPrestamo() {
        // Set up the frame
        setTitle("Biblioteca UDB");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Add components
        JLabel welcomeLabel = new JLabel("Aca se devuelven los prestamos ");
        welcomeLabel.setBounds(90, 10, 250, 25);
        panel.add(welcomeLabel);

        // Make the frame visible
        setVisible(true);
    }

}