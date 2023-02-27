
import java.awt.*;
public class AwtApplication 
{
    public static void main(String arrp[])
    {
        Frame obj = new Frame("TITLE");
        obj.setSize(400,400);
        obj.setVisible(true);
        Panel P = new Panel();
        obj.add(P);
        Label l1 = new Label("Enter First Name : ");
        P.add(l1);
        TextField textf1 = new TextField();
        P.add(textf1);
        Label l2 = new Label("Enter First Name : ");
        P.add(l2);
        TextField textf2 = new TextField();
        P.add(textf2);
        Label l3 = new Label("Enter First Name : ");
        P.add(l3);
        TextField textf3 = new TextField();
        P.add(textf3);
    }
}
