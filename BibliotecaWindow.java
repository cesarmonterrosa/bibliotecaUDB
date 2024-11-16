import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BibliotecaWindow extends JFrame {

    public BibliotecaWindow() {
        // Set up the frame
        setTitle("Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        setLocationRelativeTo(null); // Center the window on the screen

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Add components
        JLabel welcomeLabel = new JLabel("Opciones de Biblioteca:");
        welcomeLabel.setBounds(120, 40, 200, 25);
        panel.add(welcomeLabel);

        JButton buscarMaterialButton = new JButton("Buscar Material");
        buscarMaterialButton.setBounds(120, 100, 150, 30);
        panel.add(buscarMaterialButton);

        JButton misPrestamosButton = new JButton("Mis Préstamos");
        misPrestamosButton.setBounds(120, 150, 150, 30);
        panel.add(misPrestamosButton);

        // Add action listeners for buttons
        buscarMaterialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Buscar Material functionality
                new BuscarMaterial();
            }
        });

        misPrestamosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Mis Préstamos functionality
                new MisPrestamos();
            }
        });

        // Make the frame visible
        setVisible(true);
    }
}
