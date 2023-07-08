import java.awt.*;
import java.awt.event.*;
public class BCD implements KeyListener 
{ 
    Frame f;
    Label l;
    TextArea Ta;
    BCD()
    { 
        f = new Frame("My Name");
        f.setSize(600,600);
        f.setVisible(true);
        l = new Label();
        Ta = new TextArea(5,7);
        f.add(l);
        f.add(Ta);
        Ta.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ob)
    {
        Ta.setText("KEY PRESSED");
    }
    public void keyTyped(KeyEvent ob)
    {
        Ta.setText("KEY TYPED");
    }
    public void keyReleased(KeyEvent ob)
    {
        Ta.setText("KEY RELEASED");
    }
    public static void main(String[] args) 
    {
        new BCD();
    }
}
