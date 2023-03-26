import java.awt.*;
public class RegestrationForm 
{
    public static void main(String arrp[])
    {
        Frame obj = new Frame("REGESTRATION FORM");
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout());
        obj.setBackground(Color.YELLOW);
        Panel P = new Panel();
        obj.add(P);
        P.setLayout(new GridLayout(6,2,10,10));
        Label l1 = new Label("Enrollment : ");
        P.add(l1);
        TextField textf1 = new TextField();
        P.add(textf1);
        Label l2 = new Label("Name: ");
        P.add(l2);
        TextField textf2 = new TextField();
        P.add(textf2);
        Label l3 = new Label("Branch : ");
        P.add(l3);
        TextField textf3 = new TextField();
        P.add(textf3);
        Label l4 = new Label("Semester : ");
        P.add(l4);
        TextField textf4 = new TextField();
        P.add(textf4);
        Label l5 = new Label("Information");
        P.add(l5);
        TextArea textf5 = new TextArea(2,20);
        P.add(textf5);
        Button b1 = new Button("Submit");
        P.add(b1);
    }
}
