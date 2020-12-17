import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
    private static final int w = 400;
    private static final int l=400;
    private JTextField mem11;
    private JTextField mem22;
    private JTextField mem33;
    private JTextField answer;
    private JTextField Mresult;
    Double result=null;
    String formatResult="";
    String a="";
    String b="";
    String c="";
    Integer count = 0;
    Double mem1=null;
    Double mem2=null;
    Double mem3=null;
    Double mmem=0.0;
    public MyFrame()
    {
        super("Калькулятор");
        setSize(w,l);
        Toolkit TK =Toolkit.getDefaultToolkit();
        setLocation(TK.getScreenSize().height-3*l,TK.getScreenSize().width-3*w); /*Не вылезти за размер монитора*/
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");                   //BUTTONS
        JButton zero = new JButton("0");
        JButton start = new JButton("START");
        JButton x = new JButton("X");
        JButton y = new JButton("Y");
        JButton z = new JButton("Z");
        JButton MC = new JButton("MC");
        JButton MPlus = new JButton("M+");
        ButtonGroup myButtons = new ButtonGroup();
        JRadioButton f1 = new JRadioButton("Формула 1", true);
        myButtons.add(f1);
        JRadioButton f2 = new JRadioButton("Формула 2", false);
        myButtons.add(f2);
        mem11 = new JTextField(" ",10);
        mem11.setEditable(false);
        mem11.setMaximumSize(mem11.getPreferredSize());
        mem22 = new JTextField(" ",10);
        mem22.setEditable(false);
        mem22.setMaximumSize(mem22.getPreferredSize());
        mem33 = new JTextField(" ",10);
        mem33.setEditable(false);
        mem33.setMaximumSize(mem33.getPreferredSize());
        answer = new JTextField(" ",10);
        answer.setEditable(false);
        answer.setMaximumSize(answer.getPreferredSize());
        Mresult = new JTextField(" ",10);
        Mresult.setEditable(false);
        Mresult.setMaximumSize(Mresult.getPreferredSize());
        MC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    mmem = 0.0;
                    Mresult.setText("");
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        MPlus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    mmem = mmem + Double.parseDouble(answer.getText());
                    Mresult.setText(mmem.toString());
                }

                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });


        x.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    count = 1;
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        y.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    count = 2;
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        z.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    count = 3;
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });

        one.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {

                    if(count == 1) {
                        a+="1";
                        mem11.setText(a);
                    }
                    else if(count == 2) {
                        b+="1";
                        mem22.setText(b);
                    }
                    else {
                        c+="1";
                        mem33.setText(c);
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        two.addActionListener(new ActionListener() //TWO
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="2";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="2";
                    mem22.setText(b);
                }
                else {
                    c+="2";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        three.addActionListener(new ActionListener() //THREE
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="3";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="3";
                    mem22.setText(b);
                }
                else {
                    c+="3";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        four.addActionListener(new ActionListener() //FOUR
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="4";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="4";
                    mem22.setText(b);
                }
                else {
                    c+="4";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        five.addActionListener(new ActionListener()  //FIVE
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="5";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="5";
                    mem22.setText(b);
                }
                else {
                    c+="5";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        six.addActionListener(new ActionListener() //SIX
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="6";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="6";
                    mem22.setText(b);
                }
                else {
                    c+="6";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        seven.addActionListener(new ActionListener()//SEVEN
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="7";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="7";
                    mem22.setText(b);
                }
                else {
                    c+="7";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        eight.addActionListener(new ActionListener() //EIGHT
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    if(count == 1) {
                        a+="8";
                        mem11.setText(a);
                    }
                    else if(count == 2) {
                        b+="8";
                        mem22.setText(b);
                    }
                    else {
                        c+="8";
                        mem33.setText(c);
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        nine.addActionListener(new ActionListener() //NINE
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    if(count == 1) {
                        a+="9";
                        mem11.setText(a);
                    }
                    else if(count == 2) {
                        b+="9";
                        mem22.setText(b);
                    }
                    else {
                        c+="9";
                        mem33.setText(c);
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        zero.addActionListener(new ActionListener() //ZERO
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {if(count == 1) {
                    a+="0";
                    mem11.setText(a);
                }
                else if(count == 2) {
                    b+="0";
                    mem22.setText(b);
                }
                else {
                    c+="0";
                    mem33.setText(c);
                }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        start.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                try
                {
                    mem1 = Double.parseDouble(mem11.getText());
                    mem2 = Double.parseDouble(mem22.getText());
                    mem3 = Double.parseDouble(mem33.getText());
                    if(f1.isEnabled())
                    {
                        result = (Math.sin(Math.PI*mem2*mem2)+Math.log(mem2*mem2))/(Math.sin(Math.PI*mem3*mem3)
                                +Math.sin(mem1)+Math.log(mem3*mem3)+mem1*mem1+Math.exp(Math.cos(mem3*mem1)));
                        formatResult = String.format("%.2f",result);
                        answer.setText(formatResult);
                    }
                    else {
                        result = Math.pow(Math.sin(Math.pow(mem3, mem2)), 2) / Math.pow(1 + mem1 * mem1 * mem1, 0.5);
                        formatResult = String.format("%.2f",result);
                        answer.setText(formatResult);
                    }
                    result = 0.0;
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(MyFrame.this,"Неверный формат");
                }
            }
        });
        Box x1 = Box.createVerticalBox();
        x1.add(Box.createVerticalGlue());
        x1.add(x);
        x1.add(Box.createVerticalStrut(10));
        x1.add(mem11);
        x1.add(Box.createVerticalGlue());
        Box y1 = Box.createVerticalBox();
        y1.add(Box.createVerticalGlue());
        y1.add(y);
        y1.add(Box.createVerticalStrut(10));
        y1.add(mem22);
        y1.add(Box.createVerticalGlue());
        Box z1 = Box.createVerticalBox();
        z1.add(Box.createVerticalGlue());
        z1.add(z);
        z1.add(Box.createVerticalStrut(10));
        z1.add(mem33);
        z1.add(Box.createVerticalGlue());
        Box all = Box.createHorizontalBox();
        all.add(Box.createHorizontalGlue());
        all.add(x1);
        all.add(Box.createHorizontalStrut(10));
        all.add(y1);
        all.add(Box.createHorizontalStrut(10));
        all.add(z1);
        all.add(Box.createHorizontalGlue());
        Box buttons_one = Box.createHorizontalBox();
        buttons_one.add(Box.createHorizontalGlue());
        buttons_one.add(one);
        buttons_one.add(Box.createHorizontalStrut(20));
        buttons_one.add(two);
        buttons_one.add(Box.createHorizontalStrut(20));
        buttons_one.add(three);
        buttons_one.add(Box.createHorizontalGlue());
        Box buttons_two = Box.createHorizontalBox();
        buttons_two.add(Box.createHorizontalGlue());
        buttons_two.add(four);
        buttons_two.add(Box.createHorizontalStrut(20));
        buttons_two.add(five);
        buttons_two.add(Box.createHorizontalStrut(20));
        buttons_two.add(six);
        buttons_two.add(Box.createHorizontalGlue());
        Box buttons_three = Box.createHorizontalBox();
        buttons_three.add(Box.createHorizontalGlue());
        buttons_three.add(seven);
        buttons_three.add(Box.createHorizontalStrut(20));
        buttons_three.add(eight);
        buttons_three.add(Box.createHorizontalStrut(20));
        buttons_three.add(nine);
        buttons_three.add(Box.createHorizontalGlue());
        Box buttons_four = Box.createHorizontalBox();
        buttons_four.add(Box.createHorizontalGlue());
        buttons_four.add(zero);
        buttons_four.add(Box.createHorizontalStrut(20));
        buttons_four.add(start);
        buttons_four.add(Box.createHorizontalGlue());
        Box radio = Box.createHorizontalBox();
        radio.add(Box.createHorizontalGlue());
        radio.add(f1);
        radio.add(Box.createHorizontalStrut(10));
        radio.add(f2);
        radio.add(Box.createHorizontalStrut(10));
        radio.add(answer);
        radio.add(Box.createHorizontalGlue());
        Box M = Box.createHorizontalBox();
        M.add(Box.createHorizontalGlue());
        M.add(MPlus);
        M.add(Box.createHorizontalStrut(10));
        M.add(MC);
        M.add(Box.createHorizontalStrut(10));
        M.add(Mresult);
        M.add(Box.createHorizontalStrut(10));
        Box content = Box.createVerticalBox();
        content.add(Box.createVerticalGlue());
        content.add(all);
        content.add(Box.createVerticalStrut(10));
        content.add(buttons_one);
        content.add(Box.createVerticalStrut(10));
        content.add(buttons_two);
        content.add(Box.createVerticalStrut(10));
        content.add(buttons_three);
        content.add(Box.createVerticalStrut(10));
        content.add(buttons_four);
        content.add(Box.createVerticalStrut(10));
        content.add(radio);
        content.add(Box.createVerticalStrut(10));
        content.add(M);
        content.add(Box.createVerticalGlue());
        getContentPane().add(content);
    }
}
