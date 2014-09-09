import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class stuff extends JFrame implements KeyListener{
    
    public int x=0;
    public int velocity=0;
    public String direction ="right";
    
    public stuff(){
        super("I HATE PASTA");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        repaint re = new repaint();
        re.start();
        acc ac = new acc();
        ac.start();
        this.addKeyListener(this);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(x,100,100,100);

    }
    
    public static void main(String[] args){
        new stuff();
    }
    
    class repaint extends Thread{
        public void run(){
            while(true){
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    
                }
                repaint();
            }
        }
    }
    
    class acc extends Thread{
        public void run(){
            while(true){
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    
                }
                if(velocity>0){
                    velocity--;
                }else if(velocity<0){
                    velocity++;
                }
                x+=velocity;
            }
        }
    }
  
    
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==e.VK_RIGHT){
            direction="right";
            velocity+=1;
        }else if(e.getKeyCode()==e.VK_LEFT){
            direction="left";
            velocity-=1;
        }
    }
    
    public void keyReleased(KeyEvent e) {
        
    }
}

    