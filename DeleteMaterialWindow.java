import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DeleteMaterialWindow extends JFrame {

    public DeleteMaterialWindow() {
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
        JLabel welcomeLabel = new JLabel("Introduzca el titulo o ID del material: ");
        welcomeLabel.setBounds(90, 10, 250, 25);
        panel.add(welcomeLabel);

        JTextField textField = new JTextField(20); // 20 is the preferred width
        textField.setBounds(90, 90, 200, 25);
        panel.add(textField);

        JButton searchButton = new JButton("Continuar"); 
        searchButton.setBounds(120, 150, 150, 30);
        panel.add(searchButton);
        



        // Add action listeners for buttons
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Placeholder for Admin Portal functionality
                try {
                    JLabel resultsLabel = new JLabel("Resultado de busqueda");
                    resultsLabel.setBounds(90, 190, 250, 25);
                    panel.add(resultsLabel);
                    JButton searchButton = new JButton("Borrar"); 
                    searchButton.setBounds(120, 220, 150, 30);
                    panel.add(searchButton);
                    //ACA VA LA LOGICA DE BORRADO
                } catch (Exception e) {
                    JLabel resultsLabel = new JLabel("Sin resultados");
                    resultsLabel.setBounds(90, 190, 250, 25);
                    panel.add(resultsLabel);
                }
            }
        });

        // Make the frame visible
        setVisible(true);
    }



}
