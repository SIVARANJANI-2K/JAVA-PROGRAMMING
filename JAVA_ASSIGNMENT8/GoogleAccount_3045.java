import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class GoogleAccount_3045 extends JFrame{
    private JTextField firstName,lastName,username;
    private JPasswordField password,confirmPassword;
    public GoogleAccount_3045(){
       
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets=new Insets(10, 10, 10, 10);
        setSize(700,1000);
        setVisible(true);
        JLabel title=new JLabel("Create Google Account");
        title.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,24));
        Border border=BorderFactory.createLineBorder(Color.BLUE,2,true);
        firstName=new JTextField(10);
        firstName.setBorder(border);
        firstName.setForeground(Color.BLUE);
        firstName.setBackground(Color.WHITE);
        setPlaceholder(firstName,"firstName");


        lastName=new JTextField(10);
        lastName.setBorder(border);
        lastName.setForeground(Color.BLUE);
        lastName.setBackground(Color.WHITE);
        setPlaceholder(lastName, "lastName");

        username=new JTextField(20);
        username.setBorder(border);
        username.setForeground(Color.BLUE);
        username.setBackground(Color.WHITE);
        setPlaceholder(username, "username");

        JLabel gmail=new JLabel("@gmail.com");
        gmail.setForeground(Color.BLACK);
        gmail.setBackground(Color.LIGHT_GRAY);

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.anchor=GridBagConstraints.WEST;
        add(title,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.weightx=1.5;
        gbc.fill=GridBagConstraints.NONE;
        gbc.anchor=GridBagConstraints.WEST;
        add(firstName,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.weightx=1.5;
        //gbc.anchor=GridBagConstraints.EAST;
        add(lastName,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.anchor=GridBagConstraints.WEST;
        add(username,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(gmail,gbc);
        add(new Label("You can add letters,numbers & periods",SwingConstants.LEADING));
        pack();
        
        
    }
    private void setPlaceholder(JTextField textField,String placeholder){
        textField.setText(placeholder);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if(textField.getText().equals(placeholder)){
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e){
                if(textField.getText().isEmpty()){
                    textField.setText(placeholder);
                    textField.setForeground(Color.BLUE);
                }
            }
        });
    }
    private void setPlaceholder(JPasswordField passField,String placeholder){
        passField.setText(placeholder);
        passField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if(passField.getPassword().toString().equals(placeholder)){
                    passField.setText("");
                    passField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e){
                if(passField.getPassword().toString().isEmpty()){
                    passField.setText(placeholder);
                    passField.setForeground(Color.BLUE);
                }
            }
        });
    }
    public static void main(String[] args){
        new GoogleAccount_3045();
    }
   
}
