import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        // Set up the frame
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Add components
        JLabel welcomeLabel = new JLabel("Bienvenido al Sistema de Biblioteca");
        welcomeLabel.setBounds(90, 50, 250, 25);
        panel.add(welcomeLabel);

        JButton bibliotecaButton = new JButton("Biblioteca");
        bibliotecaButton.setBounds(120, 150, 150, 30);
        panel.add(bibliotecaButton);

        JButton adminPortalButton = new JButton("Admin Portal");
        adminPortalButton.setBounds(120, 100, 150, 30);
        panel.add(adminPortalButton);

        // Add action listeners for buttons
        

        bibliotecaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Biblioteca functionality
                new BibliotecaWindow();
                dispose();
            }
        });
        
        adminPortalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new MenuAdmin();
            }
        });


        // Make the frame visible
        setVisible(true);
    }
}
