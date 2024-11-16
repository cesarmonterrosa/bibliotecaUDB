import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuAdmin extends JFrame {

    public MenuAdmin() {
        // Set up the frame
        setTitle("Biblioteca UDB");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel welcomeLabel = new JLabel("Panel de Administrador");
        welcomeLabel.setBounds(90, 50, 250, 25);
        panel.add(welcomeLabel);

        JButton gestionMaterButton = new JButton("Administrar materiales");
        gestionMaterButton.setBounds(120, 150, 150, 30);
        panel.add(gestionMaterButton);

        JButton gestionUserButton = new JButton("Gestionar usuarios");
        gestionUserButton.setBounds(120, 100, 150, 30);
        panel.add(gestionUserButton);

        JButton gestionarPrestamosButton = new JButton("Gestionar préstamos");
        gestionarPrestamosButton.setBounds(120, 200, 150, 30); // Positioned below other buttons
        panel.add(gestionarPrestamosButton);


        // Add action listeners for buttons
        gestionMaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new MenuMateriales();
            }
        });

        gestionUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Biblioteca functionality
                new MenuGestionUsuario();
                dispose();
                
            }
        });

        gestionarPrestamosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Biblioteca functionality
                new MenuPrestamos();
                dispose();
                
            }
        });
        // Make the frame visible
        setVisible(true);
    }
}
