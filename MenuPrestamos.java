import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuPrestamos extends JFrame {

    public MenuPrestamos() {
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
        JButton newPrestamButton = new JButton("Registrar prestamo: ");
        newPrestamButton.setBounds(120, 50, 150, 30);
        panel.add(newPrestamButton);

        JButton verprestamButton = new JButton("Ver prestamos y moras");
        verprestamButton.setBounds(120, 100, 150, 30);
        panel.add(verprestamButton);

        JButton registerButton = new JButton("Registrar devolucion");
        registerButton.setBounds(120, 150, 150, 30);
        panel.add(registerButton); 
        
        JButton maxprestamButton = new JButton("Configurar maximo de prestamos");
        maxprestamButton.setBounds(120, 200, 150, 30);
        panel.add(maxprestamButton);

        // Add action listeners for buttons
        
        newPrestamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new NewPrestamWindow();
            }
        });

        verprestamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Biblioteca functionality
                new SearchPrestamos();
                dispose();
            }
        });
        
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new RegisterDevPrestamo();
            }
        });
        maxprestamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new SetMaxPrestamos();
            }
        });


        // Make the frame visible
        setVisible(true);
    }
}
