import java.awt.*;
class ExButton
{ 
    public static void main(String[] args) 
    {
        Frame F = new Frame("The Four Buttons");
        F.setSize(400,400);
        F.setVisible(true);
        F.setLayout(new BorderLayout(50,50));
        Button b1 = new Button("TOP");
        Button b2 = new Button("BOTTOM");
        Button b3 = new Button("LEFT");
        Button b4 = new Button("RIGHT");
        Button b5 = new Button("CENTER");

        F.add(b1,BorderLayout.NORTH);
        F.add(b2,BorderLayout.SOUTH);
        F.add(b3,BorderLayout.WEST);
        F.add(b4,BorderLayout.EAST);
        F.add(b5,BorderLayout.CENTER);


    }
}
