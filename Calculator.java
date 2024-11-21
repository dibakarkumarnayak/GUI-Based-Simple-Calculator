import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
    
    double number1=0,number2=0,result=0;
    int c;
    
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton on=new JRadioButton("On");
    JRadioButton off=new JRadioButton("Off");
    JButton butt0=new JButton("0");
    JButton butt1=new JButton("1");
    JButton butt2=new JButton("2");
    JButton butt3=new JButton("3");    
    JButton butt4=new JButton("4");
    JButton butt5=new JButton("5");
    JButton butt6=new JButton("6");
    JButton butt7=new JButton("7");
    JButton butt8=new JButton("8");
    JButton butt9=new JButton("9");
    JButton dot=new JButton(".");
    JButton clear=new JButton("C");
    JButton delete=new JButton("DEL");
    JButton equal=new JButton("=");
    JButton mul=new JButton("*");
    JButton div=new JButton("/");
    JButton add=new JButton("+");
    JButton sub=new JButton("-");
    JButton square=new JButton("x\u00B2");
    JButton reciprocal=new JButton("1/x");
    JButton sqr=new JButton("\u221A");

    Calculator()
    {
        preparegui();
        addComponents();
        addActionEvent();
    }

    public void preparegui()
    {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents()
    {
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        on.setBounds(10,95,60,40);
        on.setSelected(true);
        on.setFont(new Font("Arial",Font.BOLD,14));
        on.setBackground(Color.black);
        on.setForeground(Color.white);
        on.setFocusable(false);
        frame.add(on);

        off.setBounds(10,120,60,40);
        off.setSelected(false);
        off.setFont(new Font("Arial",Font.BOLD,14));
        off.setBackground(Color.black);
        off.setForeground(Color.white);
        off.setFocusable(false);
        frame.add(off);

        ButtonGroup bg=new ButtonGroup();
        bg.add(on);
        bg.add(off);

        butt7.setBounds(10,230,60,40);
        butt7.setFont(new Font("Arial",Font.BOLD,20));
        butt7.setFocusable(false);
        frame.add(butt7);

        butt8.setBounds(80,230,60,40);
        butt8.setFont(new Font("Arial",Font.BOLD,20));
        butt8.setFocusable(false);
        frame.add(butt8);

        butt9.setBounds(150,230,60,40);
        butt9.setFont(new Font("Arial",Font.BOLD,20));
        butt9.setFocusable(false);
        frame.add(butt9);

        butt4.setBounds(10,290,60,40);
        butt4.setFont(new Font("Arial",Font.BOLD,20));
        butt4.setFocusable(false);
        frame.add(butt4);

        butt5.setBounds(80,290,60,40);
        butt5.setFont(new Font("Arial",Font.BOLD,20));
        butt5.setFocusable(false);
        frame.add(butt5);

        butt6.setBounds(150,290,60,40);
        butt6.setFont(new Font("Arial",Font.BOLD,20));
        butt6.setFocusable(false);
        frame.add(butt6); 
        
        butt1.setBounds(10,350,60,40);
        butt1.setFont(new Font("Arial",Font.BOLD,20));
        butt1.setFocusable(false);
        frame.add(butt1);

        butt2.setBounds(80,350,60,40);
        butt2.setFont(new Font("Arial",Font.BOLD,20));
        butt2.setFocusable(false);
        frame.add(butt2);

        butt3.setBounds(150,350,60,40);
        butt3.setFont(new Font("Arial",Font.BOLD,20));
        butt3.setFocusable(false);
        frame.add(butt3);

        dot.setBounds(150,410,60,40);
        dot.setFont(new Font("Arial",Font.BOLD,20));
        dot.setFocusable(false);
        frame.add(dot);

        butt0.setBounds(10,410,130,40);
        butt0.setFont(new Font("Arial",Font.BOLD,20));
        butt0.setFocusable(false);
        frame.add(butt0);

        equal.setBounds(220,350,60,100);
        equal.setFont(new Font("Arial",Font.BOLD,20));
        equal.setBackground(new Color(239,188,2));
        equal.setFocusable(false);
        frame.add(equal);

        div.setBounds(220,110,60,40);
        div.setFont(new Font("Arial",Font.BOLD,20));
        div.setBackground(new Color(239,188,2));
        div.setFocusable(false);
        frame.add(div);

        sqr.setBounds(10,170,60,40);
        sqr.setFont(new Font("Arial",Font.BOLD,18));
        sqr.setFocusable(false);
        frame.add(sqr);

        mul.setBounds(220,230,60,40);
        mul.setFont(new Font("Arial",Font.BOLD,20));
        mul.setBackground(new Color(239,188,2));
        mul.setFocusable(false);
        frame.add(mul);

        sub.setBounds(220,170,60,40);
        sub.setFont(new Font("Arial",Font.BOLD,20));
        sub.setBackground(new Color(239,188,2));
        sub.setFocusable(false);
        frame.add(sub);
        
        add.setBounds(220,290,60,40);
        add.setFont(new Font("Arial",Font.BOLD,20));
        add.setBackground(new Color(239,188,2));
        add.setFocusable(false);
        frame.add(add);

        square.setBounds(80,170,60,40);
        square.setFont(new Font("Arial",Font.BOLD,20));
        square.setFocusable(false);
        frame.add(square);

        reciprocal.setBounds(150,170,60,40);
        reciprocal.setFont(new Font("Arial",Font.BOLD,15));
        reciprocal.setFocusable(false);
        frame.add(reciprocal);

        delete.setBounds(150,110,60,40);
        delete.setFont(new Font("Arial",Font.BOLD,12));
        delete.setBackground(Color.red);
        delete.setForeground(Color.white);
        delete.setFocusable(false);
        frame.add(delete);

        clear.setBounds(80,110,60,40);
        clear.setFont(new Font("Arial",Font.BOLD,12));
        clear.setBackground(Color.red);
        clear.setForeground(Color.white);
        clear.setFocusable(false);
        frame.add(clear);
        
    }

    public void addActionEvent()
    {
        on.addActionListener(this);
        off.addActionListener(this);
        clear.addActionListener(this);
        delete.addActionListener(this);
        div.addActionListener(this);
        sqr.addActionListener(this);
        square.addActionListener(this);
        reciprocal.addActionListener(this);
        sub.addActionListener(this);
        butt7.addActionListener(this);
        butt8.addActionListener(this);
        butt9.addActionListener(this);
        mul.addActionListener(this);
        butt4.addActionListener(this);
        butt5.addActionListener(this);
        butt6.addActionListener(this);
        add.addActionListener(this);
        butt1.addActionListener(this);
        butt2.addActionListener(this);
        butt3.addActionListener(this);
        equal.addActionListener(this);
        butt0.addActionListener(this);
        dot.addActionListener(this);

    }

    public static void main(String[] args) 
    {
        Calculator cal=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object s=e.getSource();
        if(s==on)
        {
            enable();
        }
        else if(s==off)
        {
            disable();
        }
        else if(s==clear)
        {
            label.setText("");
            textField.setText("");

        }
        else if(s==delete)
        {
            int l=textField.getText().length(); 
            int n=l-1;
            if(l>0)
            {
                StringBuilder bk=new StringBuilder(textField.getText());
                bk.deleteCharAt(n);
                textField.setText(bk.toString());
            }
            if(textField.getText().endsWith(""));
            label.setText("");
        }
        else if(s==butt0)
        {
            if(textField.getText().equals("0"))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+"0");
            }
        }
        else if(s==butt1)
        {
            textField.setText(textField.getText()+"1");

        }
        else if(s==butt2)
        {
            textField.setText(textField.getText()+"2");

        }
        else if(s==butt3)
        {
            textField.setText(textField.getText()+"3");

        }
        else if(s==butt4)
        {
            textField.setText(textField.getText()+"4");

        }
        else if(s==butt5)
        {
            textField.setText(textField.getText()+"5");

        }
        else if(s==butt6)
        {
            textField.setText(textField.getText()+"6");

        }
        else if(s==butt7)
        {
            textField.setText(textField.getText()+"7");

        }
        else if(s==butt8)
        {
            textField.setText(textField.getText()+"8");

        }
        else if(s==butt9)
        {
            textField.setText(textField.getText()+"9");

        }
        else if(s==dot)
        {
            if(textField.getText().contains("."))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+".");
            }
        }
        else if(s==add)
        {
            String str=textField.getText();
            number1=Double.parseDouble(textField.getText());
            c=1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if(s==sub)
        {
            String str=textField.getText();
            number1=Double.parseDouble(textField.getText());
            c=2;
            textField.setText("");
            label.setText(str + "-");
        }
        else if(s==mul)
        {
            String str=textField.getText();
            number1=Double.parseDouble(textField.getText());
            c=3;
            textField.setText("");
            label.setText(str + "*");
        }
        else if(s==div)
        {
            String str=textField.getText();
            number1=Double.parseDouble(textField.getText());
            c=4;
            textField.setText("");
            label.setText(str + "/");
        }
        else if(s==square)
        {
            number1= Double.parseDouble(textField.getText());
            double sq=Math.pow(number1, 2);
            String str=Double.toString(sq);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==sqr)
        {
            number1=Double.parseDouble(textField.getText());
            double sqr=Math.sqrt(number1);
            textField.setText(Double.toString(sqr));
        }
        else if(s==reciprocal)
        {
            number1= Double.parseDouble(textField.getText());
            double rc=1/number1;
            String str=Double.toString(rc);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==equal)
        {
            number2=Double.parseDouble(textField.getText());
            switch (c) 
            {
                case 1:result=number1+number2;
                    break;
                case 2:result=number1-number2;
                    break;
                case 3:result=number1*number2;
                    break;
                case 4:result=number1/number2;
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0", ""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            number1=result;

        }
    }

    public void enable()
    {   
        on.setEnabled(false);
        off.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        clear.setEnabled(true);
        delete.setEnabled(true);
        div.setEnabled(true);
        sqr.setEnabled(true);
        square.setEnabled(true);
        reciprocal.setEnabled(true);
        sub.setEnabled(true);
        butt7.setEnabled(true);
        butt8.setEnabled(true);
        butt9.setEnabled(true);
        mul.setEnabled(true);
        butt4.setEnabled(true);
        butt5.setEnabled(true);
        butt6.setEnabled(true);
        add.setEnabled(true);
        butt1.setEnabled(true);
        butt2.setEnabled(true);
        butt3.setEnabled(true);
        equal.setEnabled(true);
        butt0.setEnabled(true);
        dot.setEnabled(true);

    }

    public void disable()
    {
        on.setEnabled(true);
        off.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        clear.setEnabled(false);
        delete.setEnabled(false);
        div.setEnabled(false);
        sqr.setEnabled(false);
        square.setEnabled(false);
        reciprocal.setEnabled(false);
        sub.setEnabled(false);
        butt7.setEnabled(false);
        butt8.setEnabled(false);
        butt9.setEnabled(false);
        mul.setEnabled(false);
        butt4.setEnabled(false);
        butt5.setEnabled(false);
        butt6.setEnabled(false);
        add.setEnabled(false);
        butt1.setEnabled(false);
        butt2.setEnabled(false);
        butt3.setEnabled(false);
        equal.setEnabled(false);
        butt0.setEnabled(false);
        dot.setEnabled(false);
    }

}