import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaLogin extends JFrame {

    public VentanaLogin() {
        // Set up the frame (window)
        setTitle("Sistema de Biblioteca - Inicio de Sesión");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create and add components
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        // Make the window visible
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // User label and text field
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(140, 50, 200, 25);
        panel.add(userText);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 90, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(140, 90, 200, 25);
        panel.add(passwordText);

        // Login button
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(140, 140, 150, 25);
        panel.add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for login logic
                new MainMenu();
                dispose();
            }
        });

        // Reset Password button
        JButton resetPasswordButton = new JButton("Restablecer Contraseña");
        resetPasswordButton.setBounds(240, 180, 150, 25); // Positioned at bottom-right
        resetPasswordButton.setBorderPainted(false);
        resetPasswordButton.setContentAreaFilled(false);
        resetPasswordButton.setForeground(java.awt.Color.BLUE);
        resetPasswordButton.setFont(resetPasswordButton.getFont().deriveFont(10f)); // Small font
        panel.add(resetPasswordButton);

        // Add action listener to the reset button
        resetPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for opening the reset password screen
                new ResetPassWindow();
                dispose();
            }
        });
    }
}
