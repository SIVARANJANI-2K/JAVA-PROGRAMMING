import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class GoogleAccountCreation extends JFrame implements ActionListener {

    // Components of the form
    private Container container;
    private JLabel title, firstNameLabel, lastNameLabel, usernameLabel, passwordLabel, confirmPasswordLabel, phoneLabel, emailLabel, birthDateLabel, genderLabel, errorMessage;
    private JTextField firstNameField, lastNameField, usernameField, phoneField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> monthCombo, dayCombo, yearCombo, genderCombo;
    private JComboBox<ImageIcon> countryCombo;
    private JButton submitButton, resetButton, cancelButton;

    // Constructor to initialize the form
    public GoogleAccountCreation() {
        setTitle("Google Account Creation");
        setBounds(300, 90, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        // Title
        title = new JLabel("Create your Google Account");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setSize(300, 30);
        title.setLocation(200, 30);
        container.add(title);

        // First Name
        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        firstNameLabel.setSize(100, 20);
        firstNameLabel.setLocation(50, 80);
        container.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setFont(new Font("Arial", Font.PLAIN, 15));
        firstNameField.setSize(150, 20);
        firstNameField.setLocation(150, 80);
        container.add(firstNameField);

        // Last Name
        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lastNameLabel.setSize(100, 20);
        lastNameLabel.setLocation(50, 120);
        container.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setFont(new Font("Arial", Font.PLAIN, 15));
        lastNameField.setSize(150, 20);
        lastNameField.setLocation(150, 120);
        container.add(lastNameField);

        // Username
        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameLabel.setSize(100, 20);
        usernameLabel.setLocation(50, 160);
        container.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameField.setSize(200, 20);
        usernameField.setLocation(150, 160);
        container.add(usernameField);

        // Password
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 200);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setSize(200, 20);
        passwordField.setLocation(150, 200);
        container.add(passwordField);

        // Confirm Password
        confirmPasswordLabel = new JLabel("Confirm");
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPasswordLabel.setSize(100, 20);
        confirmPasswordLabel.setLocation(50, 240);
        container.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPasswordField.setSize(200, 20);
        confirmPasswordField.setLocation(150, 240);
        container.add(confirmPasswordField);

        // Phone Number with flag icons
        phoneLabel = new JLabel("Phone Number");
        phoneLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneLabel.setSize(120, 20);
        phoneLabel.setLocation(50, 280);
        container.add(phoneLabel);

        // Assuming flag images are stored in 'resources/flags' folder
        String[] countries = { "India", "USA" }; // More countries can be added
        ImageIcon indiaFlag = new ImageIcon("./flags/india.png");
        Image indiaF=indiaFlag.getImage().getScaledInstance(50, 25, DO_NOTHING_ON_CLOSE);

        ImageIcon usaFlag = new ImageIcon("./flags/usa.png");
        Image usaF=usaFlag.getImage().getScaledInstance(50, 25, DO_NOTHING_ON_CLOSE);
        indiaFlag=new ImageIcon(indiaF);
        usaFlag=new ImageIcon(usaF);
        ImageIcon[] flags={
            indiaFlag,usaFlag
        };

        countryCombo = new JComboBox<>(flags);
        countryCombo.setSize(70, 25);
        countryCombo.setLocation(150, 280);
        container.add(countryCombo);

        phoneField = new JTextField();
        phoneField.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneField.setSize(200, 20);
        phoneField.setLocation(260, 280);
        container.add(phoneField);

        // Recovery Email
        emailLabel = new JLabel("Recovery Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(120, 20);
        emailLabel.setLocation(50, 320);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setSize(200, 20);
        emailField.setLocation(150, 320);
        container.add(emailField);

        // Birth Date
        birthDateLabel = new JLabel("Your birthday");
        birthDateLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        birthDateLabel.setSize(120, 20);
        birthDateLabel.setLocation(50, 360);
        container.add(birthDateLabel);

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String[] days = new String[31];
        String[] years = new String[50];
        for (int i = 1; i <= 31; i++) days[i-1] = String.valueOf(i);
        for (int i = 1975, j = 0; i <= 2024; i++, j++) years[j] = String.valueOf(i);

        monthCombo = new JComboBox<>(months);
        dayCombo = new JComboBox<>(days);
        yearCombo = new JComboBox<>(years);

        monthCombo.setSize(60, 20);
        dayCombo.setSize(50, 20);
        yearCombo.setSize(60, 20);

        monthCombo.setLocation(150, 360);
        dayCombo.setLocation(220, 360);
        yearCombo.setLocation(280, 360);

        container.add(monthCombo);
        container.add(dayCombo);
        container.add(yearCombo);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(50, 400);
        container.add(genderLabel);

        String[] genders = { "Male", "Female", "Other" };
        genderCombo = new JComboBox<>(genders);
        genderCombo.setSize(100, 20);
        genderCombo.setLocation(150, 400);
        container.add(genderCombo);

        // Buttons
        submitButton = new JButton("Create Account");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(150, 30);
        submitButton.setLocation(50, 450);
        submitButton.addActionListener(this);
        container.add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 30);
        resetButton.setLocation(220, 450);
        resetButton.addActionListener(this);
        container.add(resetButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 15));
        cancelButton.setSize(100, 30);
        cancelButton.setLocation(350, 450);
        cancelButton.addActionListener(this);
        container.add(cancelButton);
    }

    // Action Performed event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try {
                validateForm();
                JOptionPane.showMessageDialog(this, "Account Created Successfully!");
            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        } else if (e.getSource() == resetButton) {
            resetForm();
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    // Validate the form
    private void validateForm() throws Exception {
        String phoneRegex = "\\d{10}";
        Pattern pattern = Pattern.compile(phoneRegex);
        if (!pattern.matcher(phoneField.getText()).matches()) {
            throw new Exception("Invalid phone number");
        }
        // Add more validation logic as needed
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        if (!password.equals(confirmPassword)) {
            throw new Exception("Passwords do not match");
        }

        // Check if all fields are filled
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
            usernameField.getText().isEmpty() || phoneField.getText().isEmpty() ||
            emailField.getText().isEmpty()) {
            throw new Exception("All fields must be filled");
        }
    
    }

    // Reset form fields
    private void resetForm() {
        firstNameField.setText("");
        lastNameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        phoneField.setText("");
        emailField.setText("");
        monthCombo.setSelectedIndex(0);
        dayCombo.setSelectedIndex(0);
        yearCombo.setSelectedIndex(0);
        genderCombo.setSelectedIndex(0);
    }

    // Show error messages
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    // Main method
    public static void main(String[] args) {
        GoogleAccountCreation form = new GoogleAccountCreation();
        form.setVisible(true);
    }
}
