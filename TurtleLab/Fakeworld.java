import java.awt.event.*;
import java.util.*;

public class Fakeworld extends World implements MouseListener
{
    Turtle Tyrone= new Turtle(200,200,this);   
    public Fakeworld(){
        addMouseListener(this);
    }
    
    public void mousePressed(MouseEvent e) {
       
         
        Tyrone.penDown();
        Tyrone.moveTo(e.getX(),e.getY());
       
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
  
    }

    public void mouseExited(MouseEvent e) {
   
    }

    public void mouseClicked(MouseEvent e) {
        
    }


}
