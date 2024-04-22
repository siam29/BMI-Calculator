
package project;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class bmi extends JFrame 
{

    private ImageIcon icon, img;
    private Font f, fn, fn1,fn2,fn3;
    private JLabel user1, user2, img1, user3, user4,user5;
    private JTextField f1, f2,f3;
    private JPasswordField p1, p2;
    private JButton b1, b2;
    private Container c;
    private Cursor cr;
    private JTextArea t, t1, t2;

    bmi()
    {
        c = this.getContentPane();
        c.setLayout(null);
        f = new Font("Arial", Font.BOLD, 45);
        fn = new Font("Arial", Font.BOLD, 25);
        fn1 = new Font("Arial", Font.BOLD, 35);
         fn2 = new Font("Arial", Font.BOLD, 30);
          fn3 = new Font("Arial", Font.BOLD, 18);
        c.setBackground(Color.CYAN);
        
         img1=new JLabel();
          img= new ImageIcon(getClass().getResource("bmi.jpg"));
       img1=new JLabel(img);
       img1.setBounds(20,480,570,450);
       c.add(img1);

        user1 = new JLabel();
        user1.setText("BODY MASS INDEX (BMI) ");
        user1.setForeground(Color.yellow);
        user1.setOpaque(true);
        user1.setBackground(Color.BLUE);
        user1.setBounds(25, 10, 560, 60);
        user1.setFont(f);
        c.add(user1);

        user2 = new JLabel();
        user2.setText("Weight (kg)");
        user2.setForeground(Color.YELLOW);
        user2.setOpaque(true);
        user2.setBackground(Color.BLUE);
        user2.setBounds(25, 90, 150, 40);
        user2.setFont(fn);
        c.add(user2);

        user3 = new JLabel();
        user3.setText("Height (feet)");
        user3.setForeground(Color.YELLOW);
        user3.setOpaque(true);
        user3.setBackground(Color.BLUE);
        user3.setBounds(205, 90, 160, 40);
        user3.setFont(fn);
        c.add(user3);

         user5 = new JLabel();
        user5.setText("Height (inch)");
        user5.setForeground(Color.YELLOW);
        user5.setOpaque(true);
        user5.setBackground(Color.BLUE);
        user5.setBounds(400, 90, 160, 40);
        user5.setFont(fn);
        c.add(user5);
        
        f1 = new JTextField();
        f1.setBounds(25, 150, 150, 40);
        f1.setHorizontalAlignment(JTextField.CENTER);
        f1.setBackground(Color.GREEN);
        f1.setFont(fn);
        c.add(f1);

        f2 = new JTextField();
        f2.setBounds(205, 150, 160, 40);
        f2.setHorizontalAlignment(JTextField.CENTER);
        f2.setBackground(Color.GREEN);
        f2.setFont(fn);
        c.add(f2);
        
         f3 = new JTextField();
        f3.setBounds(400, 150, 160, 40);
        f3.setHorizontalAlignment(JTextField.CENTER);
        f3.setBackground(Color.GREEN);
        f3.setFont(fn);
        c.add(f3);
        
        cr = new Cursor(Cursor.HAND_CURSOR);

        b1 = new JButton("Calculate");
        b1.setBounds(60, 210, 200, 60);
        b1.setCursor(cr);
       // b1.setBackground(Color.PINK);
        b1.setFont(fn1);
        c.add(b1);

        b2 = new JButton("Clear");
        b2.setBounds(310, 210, 180, 60);
        b2.setCursor(cr);
       // b2.setBackground(Color.PINK);
        b2.setFont(fn1);
        c.add(b2);

        user4 = new JLabel();
        user4.setText("    BMI");
        user4.setForeground(Color.YELLOW);
        user4.setOpaque(true);
        user4.setBackground(Color.BLUE);
        user4.setBounds(20, 290, 120, 60);
        user4.setFont(fn);
        c.add(user4);

        t = new JTextArea();
        t.setBounds(170, 290, 115, 60);
       // t.setFont(f);
       // t.setBackground(Color.MAGENTA);
        c.add(t);

        t1 = new JTextArea();
        t1.setBounds(310, 290, 260, 60);
       // t1.setFont(fn2);
       // t1.setBackground(Color.MAGENTA);
        c.add(t1);

        t2 = new JTextArea();
        t2.setBounds(20, 360, 570, 180);
       // t2.setFont(fn1);
       // t2.setBackground(Color.MAGENTA);
        c.add(t2);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                String v = f1.getText();
                String v1 = f2.getText();
                 String v2 = f3.getText();
                if (v.isEmpty()) {
                    // JOptionPane.showMessageDialog(null,"You didnt put any number");
                    t.setText("");
                } 
                else
                {
                    t.setText("");
                    int n1 = Integer.parseInt(v);
                    int n2 = Integer.parseInt(v1);
                    int n3 = Integer.parseInt(v2);
                    double BMI, height, feet, inch, meters;
                    int weight, age;
                    height = ((n2*12)+n3)*.0254;
                    BMI = n1 / (height * height);
                    if (BMI < 18.5) 
                    {
                           t.setFont(f);
                           t.setBackground(Color.GRAY);
                           c.add(t);
                            t1.setFont(fn1);
                           t1.setBackground(Color.GRAY);
                           c.add(t1);
                            t2.setFont(fn3);
                           t2.setBackground(Color.GRAY);
                           c.add(t2);
                          String r = Double.toString(BMI);
                       t.append(r);
                        double x = 18.5 - BMI;
                        double y = x * (height * height);
                        int p=(int)y;
                        p=p+2;
                       t1.append("Underweight");
                      // String r1 = Double.toString(y);
                       //String s5=r1[0];
                        t2.append("You should increase weights "+p+"kg\n"+ "# Follows some instructions such as :" + " \n " +
                               "1. Add healty calories.You don't need to" + "\n" +
                                "drastically change your diet" + "\n" +
                                " 2. Snake away." + "\n" +
                                " 3. Eat mini-meals." + "\n" +
                                " 4. Bulk up.");
                    }
                    else if (BMI > 18.5 && BMI < 25)
                    {
                         t.setFont(f);
                           t.setBackground(Color.GREEN);
                           c.add(t);
                            t1.setFont(fn1);
                           t1.setBackground(Color.GREEN);
                           c.add(t1);
                            t2.setFont(fn);
                           t2.setBackground(Color.GREEN);
                           c.add(t2);
                         String r = Double.toString(BMI);
                       t.append(r);
                         t1.append("Normal");
                          t2.append("\n"+"\t   WoW\n\n"+"            Your Weight is perfect" +"\n"+"            You should keep it up");
                    }
                    else if (BMI >= 25 && BMI < 30)
                    {
                         t.setFont(f);
                           t.setBackground(Color.YELLOW);
                           c.add(t);
                            t1.setFont(fn2);
                           t1.setBackground(Color.YELLOW);
                           c.add(t1);
                            t2.setFont(fn3);
                           t2.setBackground(Color.YELLOW);
                           c.add(t2);
                           String r = Double.toString(BMI);
                       t.append(r);
                        double x = BMI-25;
                        double y = x * (height * height);
                        int p=(int)y;
                         p=p+3;
                       t1.append("Overweight");
                        String r1 = Double.toString(y);
                     //   t2.append("weight decrese "+y+"\n"+("Overweight");
                     //   String r1 = Double.toString(y2);
                        t2.append("You should decrease weights "+p+"kg\n"+
                               "# Follows some instructions such as :" + "\n" +
                                "1. Losing weight through healthy eating." + "\n" +
                                "2. Being more physically active,and making other changes " + "\n"
                                + " to your usual habits. " + "\n" +
                                "3. Eat less fat and fewer fried foods." + "\n" +
                                "4. Limit the amount of sugar you eat.");
                    }
                    else if(BMI >= 30 && BMI < 35)
                    {
                         t.setFont(f);
                           t.setBackground(Color.ORANGE);
                           c.add(t);
                            t1.setFont(fn1);
                           t1.setBackground(Color.ORANGE);
                           c.add(t1);
                            t2.setFont(fn3);
                           t2.setBackground(Color.ORANGE);
                           c.add(t2);
                            String r = Double.toString(BMI);
                       t.append(r);
                        double x = BMI-25;
                        double y = x * (height * height);
                        int p=(int)y;
                         p=p+3;
                       t1.append("Obese");
                        String r1 = Double.toString(y);
                         t2.append("You should decrease weights "+p+"kg\n"
                                 + "# Follows some instructions such as :" + " \n " +
                                "1. Avoid fried & oily foods and aslo avoid taking fats because" + " \n " +
                                "   they increase the level of colesterol in their blood." + "\n" +
                                "2. Stop eating between meals" + "\n" +
                                "3. Eating something all the time increases the calorie intake" + "\n" +
                                "   and thus increases weight.");
                    }
                    else
                    {
                         t.setFont(f);
                           t.setBackground(Color.RED);
                           c.add(t);
                            t1.setFont(fn1);
                           t1.setBackground(Color.RED);
                           c.add(t1);
                            t2.setFont(fn3);
                           t2.setBackground(Color.RED);
                           c.add(t2);
                            String r = Double.toString(BMI);
                       t.append(r);
                        double x = BMI-25;
                        double y = x * (height * height);
                        int p=(int)y;
                        p=p+3;
                       t1.append("Extremly Obese");
                       // String r1 = Double.toString(y);
                        t2.append("You should decrease weights "+p+"kg\n"+  
                        "Follows some instructions such as :" + "\n" +
                        "1.Reduce calorie & sodium intake by cutting out processed foods" + "\n" +
                        "2.Get your heart pumping.Watch your calories.To lower your " + "\n" +
                        "BMI,you need to consume fewer calories than you burn." + "\n" +
                        "3.Prep your meals. Meal prep prevents you from grabbing " + "\n" +
                        "takeout on the way home from work.");
                    }
                    }
                }
            
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               
                   // JOptionPane.showMessageDialog(null,"You didnt put any number");
                    f1.setText("");
                    f2.setText("");
                    f3.setText("");
                  //t1.setForeground(Color.YELLOW);
                   // t.setBackground(Color.WHITE);
                    t1.setText("");
                    t2.setText("");
                    t.setText("");
                     t.setBackground(Color.WHITE);
                      t1.setBackground(Color.WHITE);
                       t2.setBackground(Color.WHITE);
                     // f2.setBackground(Color.);
            }
        });
        
    }

    public static void main(String[] args) {
        bmi frame = new bmi();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150, 70, 610, 900);
        frame.setTitle("BMI");
        frame.setResizable(false);
    }
}
