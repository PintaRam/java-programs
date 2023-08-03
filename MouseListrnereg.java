package awtcode;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javafx.scene.paint.Color;
public class MouseListrnereg extends Frame implements MouseListener {
    Label l ;
    MouseListrnereg()
{   
    addMouseListener(this);
    l = new Label();
    l.setBounds(20,50,100,20);  
    add(l);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
    Graphics g=getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),30,30);  
}
public void mouseEntered(MouseEvent e)
{
   // l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e)
{
    //l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e)
{
    //l.setText("Mouse pressed");
}
public void mouseReleased(MouseEvent e)
{
    //l.setText("Mouse Releases");
}
public static void main(String[] args) {
    new MouseListrnereg();
}
    
}
