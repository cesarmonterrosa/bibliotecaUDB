import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewPassWindow extends JFrame {

    public NewPassWindow() {
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
        JLabel welcomeLabel = new JLabel("Ingrese una nueva contraseña: ");
        welcomeLabel.setBounds(90, 50, 250, 25);
        panel.add(welcomeLabel);

        JTextField textField = new JTextField(20); // 20 is the preferred width
        textField.setBounds(90, 90, 200, 25);
        panel.add(textField);

        JButton searchButton = new JButton("Confimar"); 
        searchButton.setBounds(120, 150, 150, 30);
        panel.add(searchButton);


        // Add action listeners for buttons
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new VentanaLogin();
                dispose();
            }
        });

        // Make the frame visible
        setVisible(true);
    }



}
