import java.awt.*;
public class LoginForm
{
    public static void main(String arrp[])
    {
        Frame obj = new Frame("LOGIN FORM"); 
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout()); 
        //obj.setBackground(Color.YELLOW);
        Panel P = new Panel();
        obj.add(P);
        P.setLayout(new GridLayout(3,2,10,10));
        Label l1 = new Label("Username : ");
        P.add(l1);
        TextField textf1 = new TextField();
        P.add(textf1);
        Label l2 = new Label("Password : ");
        P.add(l2);
        TextField textf2 = new TextField();
        P.add(textf2);
        Button b1 = new Button("Submit");
        P.add(b1);
        Checkbox c = new Checkbox();
        P.add(c);
        
        

    }
}

