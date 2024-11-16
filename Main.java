import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Set the look and feel (optional)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el tema: " + e.getMessage());
        }

        // Launch the login window
        SwingUtilities.invokeLater(() -> new VentanaLogin());
    }
}