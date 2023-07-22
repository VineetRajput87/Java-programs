import java.awt.event.*;
import java.awt.*;
public class SumandAvg extends Frame implements ActionListener 
{
    Button b1,b3;  
    Checkbox cb1;
    TextField textf1,textf2,textf3,text4,text5;
   
    SumandAvg()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("MENU ");
        Panel P = new Panel(); 
        add(P);
        P.setLayout(new GridLayout(8,20,50,50));

        Label l1 = new Label("Enter First Number : ");
        P.add(l1);

        textf1 = new TextField();
        P.add(textf1);


        Label l2 = new Label("Enter Second Number : ");
        P.add(l2);

        textf2 = new TextField();
        P.add(textf2);

        Label l3 = new Label("Enter Third Number : ");
        P.add(l3);

        textf3 = new TextField();
        P.add(textf3);

        Label l5 = new Label("SUM OF THREE NUMBERS IS : ");
        P.add(l5);

        text5 = new TextField();
        P.add(text5);

        Label l4 = new Label("AVERAGE OF THREE NUMBERS IS : ");
        P.add(l4);

        text4 = new TextField();
        P.add(text4);

        // Label l5 = new Label("Display the result here...");
        // P.add(l5);

        b1 = new Button("EXIT");
        P.add(b1);
        b1.addActionListener(this);

        Checkbox cb1 = new Checkbox("CLICK TO ENABLE RESULT BUTTON",false);
        P.add(cb1); 

        b3 = new Button("SHOW RESULT");
        P.add(b3);
        //b3.setVisible(false);
        b3.addActionListener(this);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==cb1)
        {
             if(cb1.getState()==true)
             {
             b3.setVisible(true);
             }
        }

    }

    public void actionPerformed(ActionEvent obj1)
    {
        if(obj1.getSource()==b1)
        {
            System.exit(0);
        }   
        else if(obj1.getSource()==cb1)
        {
            b3.setVisible(true);
        }
        if(obj1.getSource()==b3)
        {
            Double a = Double.parseDouble(textf1.getText());
            Double b = Double.parseDouble(textf2.getText());
            Double c = Double.parseDouble(textf3.getText());
            double avg = (a+b+c)/3.0;
            double sum = (a+b+c);
            text5.setText(String.valueOf(sum));
            text4.setText(String.valueOf(avg));
        }
             
    }
    public static void main(String arrp[])
    {
       new SumandAvg(); 
    }
}
