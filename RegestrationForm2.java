import java.awt.*;
import java.awt.event.*;
//import java.event.ActionEvent;
public class RegestrationForm2 implements ActionListener
{
    Frame obj;
    Panel P;
    TextField textf1,textf2,textf3,textf4;
    TextArea textf5;
    Button b1;
    Label l1;
    Label l2;
    Label l3; 
    Label l4;
    Label l5;

    RegestrationForm2()
    {
       obj=new Frame ("REGESTRATION FORM");
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout());
        obj.setBackground(Color.YELLOW);
        P=new Panel();
        obj.add(P);
        P.setLayout(new GridLayout(6,2,10,10));

        l1=new Label("Enrollment : ");
        P.add(l1);
        textf1 = new TextField();
        P.add(textf1);
        textf1.getText();

       l2= new Label("Name: ");
        P.add(l2);
        textf2 = new TextField();
        P.add(textf2);
        textf2.getText();

       l3= new Label("Branch : ");
        P.add(l3);
        textf3 = new TextField();
        P.add(textf3);
        textf3.getText();

       l4= new Label("Semester : ");
        P.add(l4);
        textf4 = new TextField();
        P.add(textf4);
        textf4.getText();

       l5= new Label("Information");
        P.add(l5);
        textf5 = new TextArea(2,20);
        P.add(textf5); 
        textf5.getText();

        b1 = new Button("Submit");
        P.add(b1);

        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent obj1)
    {

        if(obj1.getSource()==b1)
        {   
            String Name;
            String Enrollment;
            String Branch;
            String Semester;

            Name=textf2.getText();
            Enrollment=textf1.getText();
            Branch=textf3.getText();
            Semester=textf4.getText();

            //System.exit(0);
            textf5.setText("Desplaying the Detials : \n\n"+"Name : "+Name+"\nEnrollment : "+Enrollment+"\nBranch : "+Branch+"\nSemester : "+Semester);
            //textf5.setText("Name : "+Name);
            //textf5.setText("Enrollment : "+Enrollment);
            //textf5.setText("Branch : "+Branch);
            //textf5.setText("Semester : "+Semester);


        }
    }
    public static void main(String arrp[])
    {
        new RegestrationForm2();
    }
}
