import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class Quiz_3045 extends JFrame implements ActionListener {
    private JTextField q1;
    private JTextArea q2;
    private JRadioButton[] q3;
    private JCheckBox[]  q4;
    private JComboBox<String> q5;
    private JButton submit;
    private int score=0;
    public Quiz_3045(){
        q1=new JTextField(20);
        q2=new JTextArea(5,10);
        q3=new JRadioButton[]{
                new JRadioButton("int"),
                new JRadioButton("float"),
                new JRadioButton("String"),
                new JRadioButton("boolean")

        };
        q4=new JCheckBox[]{
                new JCheckBox("private"),
                new JCheckBox("public"),
                new JCheckBox("protected"),
                new JCheckBox("final")
        };
        String[] options={"new", "this","static","class"};
        q5=new JComboBox<>(options);
        submit=new JButton("Submit");
        setLayout(new GridBagLayout());
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagConstraints gbc=new GridBagConstraints();
        Border border=BorderFactory.createLineBorder(Color.BLACK,2);
        q1.setBorder(border);
        q2.setBorder(border);
        gbc.insets=new Insets(15, 15, 15, 15);
     
        gbc.gridx=0; 
        gbc.gridy=0; 
        gbc.anchor=GridBagConstraints.WEST;
         add(new Label(" What keyword is used to inherit a class in Java?"),gbc);
        gbc.gridx=1; gbc.gridy=0; gbc.weightx=1; gbc.weighty=0; gbc.fill=GridBagConstraints.HORIZONTAL;  
        add(q1,gbc);


        gbc.gridx=0;
         gbc.gridy=1; 
         gbc.anchor=GridBagConstraints.WEST; 
         add(new Label("Explain the purpose of the super keyword in Java."),gbc);
        gbc.gridx=1; gbc.gridy=1; gbc.weightx=1; gbc.weighty=1; gbc.fill=GridBagConstraints.BOTH;  
        add(new JScrollPane(q2), gbc);

        ButtonGroup bg=new ButtonGroup();
        JPanel radioJPanel=new JPanel();
        radioJPanel.setLayout(new GridLayout(1,q3.length));
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.anchor=GridBagConstraints.WEST;
        add(new Label("Which of the following is not a primitive data type in Java?"),gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        for(JRadioButton op:q3){
            bg.add(op);
            radioJPanel.add(op);
        
        }
        add(radioJPanel,gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.anchor=GridBagConstraints.WEST;
        add(new Label("Which of the following are access modifiers in Java? (Select all that apply)"),gbc);
        JPanel checkBoxPanel=new JPanel();
        checkBoxPanel.setLayout(new GridLayout(1,q4.length));
        for(JCheckBox checkBox:q4){
            checkBoxPanel.add(checkBox);
        }
        gbc.gridx=1;
        gbc.gridy=3;
        add(checkBoxPanel,gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        gbc.anchor=GridBagConstraints.WEST;
        add(new Label("Which of the following is used to create an instance of a class in Java?"),gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.weightx=1;
        
        add(q5,gbc);

        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=0;
        gbc.weighty=0;
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit,gbc);
        submit.addActionListener(this);
         pack();

        
    }
    public void actionPerformed(ActionEvent e){
        String q1_ans=q1.getText();
        String q2_ans=q2.getText();
        if(q1_ans.equals("extends")){
            score+=1;
        }
        if(q2_ans.toLowerCase().contains("parent class's variables, methods, or constructors from the child class")){
            score+=2;
        }
        String q3_ans="";
        for(JRadioButton option:q3){
            if(option.isSelected()){
                q3_ans=option.getText();
                break;
            }
        }
        if(q3_ans.equals("String")){
            score+=1;
        }
        int checkScore=0;
        int option=1;
        for(JCheckBox checkBox:q4){
            if(option<=3 && checkBox.isSelected()){
                checkScore+=1;
            }
            else if(option>3 && checkBox.isSelected()){
                checkScore=0;
            }
        }
        score+=checkScore;
        String q5_ans=(String)q5.getSelectedItem();
        if(q5_ans.equals("new")){
            score+=1;
        }
        String message=String.format("Your Total Score is "+score+"/8");
        JOptionPane.showMessageDialog(Quiz_3045.this, message, "Final Score", JOptionPane.INFORMATION_MESSAGE);
        String answers=String.format("\n ANSWERS \n 1.extends\n 2.The super keyword is used to refer to the parent class's variables, methods, or constructors from the child class.\n3.String\n4.private,public,protected\n5.new\n");
        JOptionPane.showMessageDialog(Quiz_3045.this, answers, "ANSWERS", JOptionPane.INFORMATION_MESSAGE);
        score=0;
    }

    public static void main(String[] args){
        new Quiz_3045();
    }
}
/*
1. Radio Type (Single-Choice) Question:
Question: Which of the following is not a primitive data type in Java?

A) int
B) float
C) String
D) boolean
(Correct answer: C)

2. Radio Type (Single-Choice) Question:
Question: Which of the following is used to create an instance of a class in Java?

A) new
B) this
C) static
D) class
(Correct answer: A)

3. Multiple Answer Type (Multiple-Choice) Question:
Question: Which of the following are access modifiers in Java? (Select all that apply)

A) private
B) public
C) protected
D) final
(Correct answers: A, B, C)

4. Single Word Answer Type:
Question: What keyword is used to inherit a class in Java?

(Correct answer: extends)

5. Sentence Answer Type:
Question: Explain the purpose of the super keyword in Java.

(Sample answer: The super keyword is used to refer to the parent class's variables, methods, or constructors from the child class.)
 */