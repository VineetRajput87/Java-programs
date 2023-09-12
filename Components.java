import java.awt.*;
import java.awt.event.*; 
public class Components implements ActionListener, ItemListener
{
    Components()
    {
        Frame f =new Frame("AWT COMPONENTS");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new GridLayout(4,1));

        Panel p1 = new Panel();
        f.add(p1);
        p1.setBackground(Color.BLUE);

        Checkbox cb1 = new Checkbox("Male",false);
        p1.add(cb1);
        Checkbox cb2 = new Checkbox("Female",false);
        p1.add(cb2);
        
        Panel p2 = new Panel();
        f.add(p2);

        Choice c = new Choice();
        p2.add(c);
        c.add("Choice item 1");
        c.add("Choice item 2");
        c.add("Choice item 3");
        p2.setBackground(Color.yellow);

        Panel p3 = new Panel();
        f.add(p3);

        List l = new List();
        p3.add(l);
        l.add("List 1");
        l.add("List 2");
        l.add("List 3");
        l.add("List 4");
        p3.setBackground(Color.orange);

        Panel p4 = new Panel();
        f.add(p4);
        p4.setLayout(new BorderLayout());

        Button b = new Button("EXIT");
        p4.add(b);
        p4.add(b,BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent ae)
    {

    }
    public void itemStateChanged(ItemEvent ie)
    {

    }
    public static void main(String[] args) 
    {
        new Components();
    }
}
