import java.awt.event.*;
import java.awt.*;
public class Avg extends Frame implements ActionListener
{
    Button b1,b2,b3; 
    TextField textf1,textf2,textf3,text4;
    Avg()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("MENU ");
        Panel P = new Panel();
        add(P);
        P.setLayout(new GridLayout(6,2,50,50));

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

        Label l4 = new Label("#####AVERAGE#####");
        P.add(l4);

        text4 = new TextField();
        P.add(text4);

        // Label l5 = new Label("Display the result here...");
        // P.add(l5);

        b1 = new Button("COMPUTE");
        P.add(b1);
        b1.addActionListener(this);

        b2 = new Button("REFRESH");
        P.add(b2); 
        b2.addActionListener(this);

        b3 = new Button("EXIT");
        P.add(b3);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent obj1)
    {
        if(obj1.getSource()==b1)
        {
            Double a = Double.parseDouble(textf1.getText());
            Double b = Double.parseDouble(textf2.getText());
            Double c = Double.parseDouble(textf3.getText());
            double avg = (a+b+c)/3.0;
            text4.setText(String.valueOf(avg));
        }
        else if(obj1.getSource()==b2)
        {
            textf1.setText(null);
            textf2.setText(null);
            textf3.setText(null);
            text4.setText(null);
        }   
        else if(obj1.getSource()==b3)
        {
            System.exit(0);
        }        
    }
    public static void main(String arrp[])
    {
       new Avg(); 
    }
}
