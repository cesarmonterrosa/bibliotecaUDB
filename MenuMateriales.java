import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuMateriales extends JFrame {

    public MenuMateriales() {
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
        JLabel welcomeLabel = new JLabel("Gestionar materiales: ");
        welcomeLabel.setBounds(90, 50, 250, 25);
        panel.add(welcomeLabel);

        JButton addButton = new JButton("Añadir materiales");
        addButton.setBounds(120, 100, 150, 30);
        panel.add(addButton);

        JButton searchButton = new JButton("Buscar materiales");
        searchButton.setBounds(120, 150, 150, 30);
        panel.add(searchButton); 
        
        JButton deleteButton = new JButton("Borrar materiales");
        deleteButton.setBounds(120, 200, 150, 30);
        panel.add(deleteButton);

        // Add action listeners for buttons
        

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Biblioteca functionality
                new AddMaterialWindow();
                dispose();
            }
        });
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new SearchMaterialWindow();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Placeholder for Admin Portal functionality
                new DeleteMaterialWindow();
            }
        });


        // Make the frame visible
        setVisible(true);
    }
}
