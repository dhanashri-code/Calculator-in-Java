import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class Calculator extends JFrame{
    /* Instance Member Variable */
    int ch;
    JLabel l1;
    double num1=0 , num2=0 , result=0 ;
    JTextField t1;
    JButton b0 , bsq , bcb , b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , ba , bs , bm , bd , bmo , bdo , be , bc;

    /* Constructor */
    Calculator(String s1)
    {
        super(s1);
    }

    /* Set the Components in the Frame */
    void setCompo()
    {
        /* Creating Objects of all Member Variable */
        l1 = new JLabel();
        t1 = new JTextField();
        t1.setEditable(false);

        bsq = new JButton("sqr");
        bcb = new JButton("cb");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        ba = new JButton("+");
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        bmo = new JButton("%");
        bdo = new JButton(".");
        be = new JButton("=");
        bc = new JButton("c");
        
        /* Creating Border object */
        Border bord = BorderFactory.createLineBorder(Color.BLACK, 3);
        Border bord1 = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);

        /* Creating Font Object  */
        Font f1 = new Font("Times New Roman",Font.BOLD,30);
        Font f2 = new Font("Callibri",Font.BOLD,20);
        Font f3 = new Font("Callibri",Font.BOLD,20);

        /* For JTextFeild Text Align in Right */
        t1.setHorizontalAlignment(JTextField.RIGHT);
        l1.setHorizontalAlignment(JTextField.RIGHT);

        /* Set Text Color of all Buttons*/
        l1.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        t1.setForeground(Color.WHITE);
        be.setForeground(Color.BLACK);

        /* set Backgrount-Color of all Buttons */        
        t1.setBackground(Color.BLACK);
        be.setBackground(Color.GREEN);
        bc.setBackground(Color.RED);
        bsq.setBackground(Color.ORANGE);
        bcb.setBackground(Color.ORANGE);
        b0.setBackground(Color.DARK_GRAY);
        b1.setBackground(Color.DARK_GRAY);
        b2.setBackground(Color.DARK_GRAY);
        b3.setBackground(Color.DARK_GRAY);
        b4.setBackground(Color.DARK_GRAY);
        b5.setBackground(Color.DARK_GRAY);
        b6.setBackground(Color.DARK_GRAY);
        b7.setBackground(Color.DARK_GRAY);
        b8.setBackground(Color.DARK_GRAY);
        b9.setBackground(Color.DARK_GRAY);
        ba.setBackground(Color.ORANGE);
        bs.setBackground(Color.ORANGE);
        bm.setBackground(Color.ORANGE);
        bd.setBackground(Color.ORANGE);
        bmo.setBackground(Color.ORANGE);
        bdo.setBackground(Color.GRAY);
        
        /* setBorder to Buttons */
        t1.setBorder(bord1);
        bc.setBorder(bord);
        bsq.setBorder(bord);
        bcb.setBorder(bord);
        b0.setBorder(bord);
        b1.setBorder(bord);
        b2.setBorder(bord);
        b3.setBorder(bord);
        b4.setBorder(bord);
        b5.setBorder(bord);
        b6.setBorder(bord);
        b7.setBorder(bord);
        b8.setBorder(bord);
        b9.setBorder(bord);
        ba.setBorder(bord);
        bs.setBorder(bord);
        bm.setBorder(bord);
        bd.setBorder(bord);
        bmo.setBorder(bord);
        bdo.setBorder(bord);
        be.setBorder(bord);
        
        /*setFont Style */
        t1.setFont(f1);
        ba.setFont(f1);
        bs.setFont(f1);
        bm.setFont(f1);
        bd.setFont(f1);
        bc.setFont(f1);
        be.setFont(f1);

        bmo.setFont(f2);
        bcb.setFont(f2);
        bsq.setFont(f2);
        bdo.setFont(f2);

        l1.setFont(f3);
        b0.setFont(f3);
        b1.setFont(f3);
        b2.setFont(f3);
        b3.setFont(f3);
        b4.setFont(f3);
        b5.setFont(f3);
        b6.setFont(f3);
        b7.setFont(f3);
        b8.setFont(f3);
        b9.setFont(f3);

        /* adding componentes in Frame */
        add(l1);
        add(t1);

        add(bc);
        add(bsq);
        add(bmo);
        add(bd);

        add(b7);
        add(b8);
        add(b9);
        add(bm);

        add(b4);
        add(b5);
        add(b6);
        add(bs);

        add(b1);
        add(b2);
        add(b3);
        add(ba);

        add(bdo);
        add(b0);
        add(bcb);
        add(be);
        
        setLayout(null);
        
        /* set position of Componenets */
        l1.setBounds(10,10,380,70);

        t1.setBounds(10, 80, 390, 90);

        bc.setBounds(0,200,100,70);
        bsq.setBounds(100,200,100,70);
        bmo.setBounds(200,200,100,70);
        bd.setBounds(300,200,100,70);

        b7.setBounds(0,270,100,70);
        b8.setBounds(100,270,100,70);
        b9.setBounds(200,270,100,70);
        bm.setBounds(300,270,100,70);

        b4.setBounds(0,340,100,70);
        b5.setBounds(100,340,100,70);
        b6.setBounds(200,340,100,70);
        bs.setBounds(300,340,100,70);

        b1.setBounds(0,410,100,70);
        b2.setBounds(100,410,100,70);
        b3.setBounds(200,410,100,70);
        ba.setBounds(300,410,100,70);

        bdo.setBounds(0,480,100,70);
        b0.setBounds(100,480,100,70);
        bcb.setBounds(200,480,100,70);
        be.setBounds(300,480,100,70);

        /* Add ActionListener Interface on Buttons */
        b0.addActionListener(new B1());
        b1.addActionListener(new B1());
        b2.addActionListener(new B1());
        b3.addActionListener(new B1());
        b4.addActionListener(new B1());
        b5.addActionListener(new B1());
        b6.addActionListener(new B1());
        b7.addActionListener(new B1());
        b8.addActionListener(new B1());
        b9.addActionListener(new B1());
        ba.addActionListener(new B1());
        bs.addActionListener(new B1());
        bm.addActionListener(new B1());
        bd.addActionListener(new B1());
        bmo.addActionListener(new B1());
        be.addActionListener(new B1());
        bc.addActionListener(new B1());
        bcb.addActionListener(new B1());
        bsq.addActionListener(new B1());
    }
    public static void main(String[] args) {
        /*Creating Frame */
        Calculator c1 = new Calculator("Calculator Made By Dhanashri 😍");
        c1.setVisible(true);
        c1.setSize(425,590);
        c1.setCompo();
        c1.setLayout(null); 
        c1.getContentPane().setBackground(Color.BLACK);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setLocationRelativeTo(null);
    }

    /* Implement ActionListener Interface */
    class B1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e1)
        {
            if(e1.getSource() == b0)
            {
                t1.setText(t1.getText() + "0");
            }
            else if(e1.getSource() == b1)
            {
                t1.setText(t1.getText() + "1");   
            }

            else if(e1.getSource() == b2)
            {
                t1.setText(t1.getText() + "2");
            }

            else if(e1.getSource() == b3)
            {
                t1.setText(t1.getText() + "3");
            }

            else if(e1.getSource() == b4)
            {
                t1.setText(t1.getText() + "4");
            }

            else if(e1.getSource() == b5)
            {
                t1.setText(t1.getText() + "5");
            }

            else if(e1.getSource() == b6)
            {
                t1.setText(t1.getText() + "6");
            }

            else if(e1.getSource() == b7)
            {
                t1.setText(t1.getText() + "7");
            }

            else if(e1.getSource() == b8)
            {
                t1.setText(t1.getText() + "8");
            }

            else if(e1.getSource() == b9)
            {
                t1.setText(t1.getText() + "9");
            }

            else if(e1.getSource() == ba)
            {
                String str = t1.getText();
                num1 = Double.parseDouble(t1.getText());
                ch = 1;
                t1.setText("");
                l1.setText(str + "+");
            }

            else if(e1.getSource() == bs)
            {
                String str = t1.getText();
                num1 = Double.parseDouble(t1.getText());
                ch = 2;
                t1.setText("");
                l1.setText(str + "-");
            }

            else if(e1.getSource() == bm)
            {
                String str = t1.getText();
                num1 = Double.parseDouble(t1.getText());
                ch = 3;
                t1.setText("");
                l1.setText(str + "*");
            }

            else if(e1.getSource() == bd)
            {
                String str = t1.getText();
                num1 = Double.parseDouble(t1.getText());
                ch = 4;
                t1.setText("");
                l1.setText(str + "/");
            }

            else if(e1.getSource() == bmo)
            {
                String str = t1.getText();
                num1 = Double.parseDouble(t1.getText());
                ch = 5;
                t1.setText("");
                l1.setText(str + "%");
            }

            else if(e1.getSource() == bsq)
            {
                num1 = Double.parseDouble(t1.getText());
                double sqr = Math.pow(num1,2);
                String sqr1 = Double.toString(sqr);
                l1.setText(sqr1);
            }

            else if(e1.getSource() == bcb)
            {
                num1 = Double.parseDouble(t1.getText());
                double cq = Math.pow(num1,3);
                String cq1 = Double.toString(cq);
                l1.setText(cq1);
            }

            else if(e1.getSource() == bc)
            {
                t1.setText("");
                l1.setText("");
            }

            else if(e1.getSource() == bdo)
            {
                t1.setText(t1.getText() + ".");
            }

            else if(e1.getSource() == be)
            {
                num2 = Double.parseDouble(t1.getText());
                l1.setText(t1.getText() + " = ");
                /* Perform Operations According to Select Operator */
                switch (ch) 
                {
                    case 1:
                    {
                        result = num1 + num2;
                        break;
                    }
                    case 2:
                        result = num1 - num2;
                        break;

                    case 3:
                        result = num1 * num2;
                        break;

                    case 4:
                        result = num1 / num2;
                        break;

                    case 5:
                        result = num1 % num2;
                        break;
                }
                t1.setText(Double.toString(result));  
            }
        }
    }
}
 

