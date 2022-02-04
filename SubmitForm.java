
import java.awt.event.*;
import java.awt.*;
public class SubmitForm extends Frame implements ActionListener {
    Button button;
    TextField t2;
    TextField t3;
    TextField t4;
    public SubmitForm() {
          setTitle("Form");
          setSize(800, 600);
          setLayout(new FlowLayout());
          setVisible(true);
          addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent we) {
                  System.exit(ABORT);
              }
          });
          Label l1 = new Label("SIGN UP");
          l1.setFont(new Font("Verdana", Font.PLAIN,25));
          l1.setForeground(Color.blue);
          add(l1);
          l1.setBounds(300,80,200,50);
          Label l2 = new Label("Full Name");
          l2.setFont(new Font("TimesRoman",Font.PLAIN , 20));
          add(l2);
          l2.setBounds(250,200,100,40);
          t2 = new TextField(30);
          add(t2);
          t2.setBounds(400,200,100,40);
          Label l3 = new Label("Email");
          l3.setFont(new Font("TimesRoman", Font.PLAIN , 20));
          add(l3);
          l3.setBounds(250,300,100,40);
          t3 = new TextField(30);
          add(t3);
          t3.setBounds(400,300,100,40);
          Label l4 = new Label("Password");
          l4.setFont(new Font("TimesRoman", Font.PLAIN , 20));
          add(l4);
          l4.setBounds(250,400,100,40);
          t4 = new TextField(30);
          add(t4);
          t4.setBounds(400,400,100,40);
          button = new Button("Submit");
          add(button);
          button.setBounds(350,500,100,50);
          
        }
        public void actionPerformed(ActionEvent e) {
            System.out.println("Name:"+t2.getText());
        }                
        public static void main(String[] args) {
         SubmitForm obj = new SubmitForm();   
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }
    }
    
