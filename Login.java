import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSystem() {
        // Frame setup
        setTitle("Student Management System Login");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Background
        JLabel background = new JLabel(new ImageIcon("bg.jpg"));
        setContentPane(background);
        setLayout(null);

        // Panel setup for login form
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(255, 255, 255, 180)); // Semi-transparent background
        loginPanel.setBounds(100, 60, 300, 180);
        loginPanel.setLayout(null);
        add(loginPanel);

        // Logo
        JLabel logoLabel = new JLabel(new ImageIcon("logo.png"));
        logoLabel.setBounds(110, 10, 80, 80);
        loginPanel.add(logoLabel);

        // Username Label & Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 14));
        userLabel.setBounds(20, 90, 100, 25);
        loginPanel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 90, 150, 25);
        loginPanel.add(usernameField);

        // Password Label & Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passLabel.setBounds(20, 120, 100, 25);
        loginPanel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 120, 150, 25);
        loginPanel.add(passwordField);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 100, 25);
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals("Anurag") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Welcome to the database", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Proceed to next screen (e.g., open new frame or module)
            dispose(); // Close login window
            // new SMS(); // Assuming `SMS` is another class for the main application screen
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginSystem loginSystem = new LoginSystem();
            loginSystem.setVisible(true);
        });
    }
}
