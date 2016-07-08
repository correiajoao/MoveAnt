
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Ant {
	private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    
    public Ant(){
    	initAnt();
    }
    
    public void initAnt(){
    	ImageIcon ii = new ImageIcon("ant_l.png");
        image = ii.getImage();
        x = 40;
        y = 60;
    }
    
    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
            ImageIcon ii = new ImageIcon("ant_l.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
            ImageIcon ii = new ImageIcon("ant_r.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
            ImageIcon ii = new ImageIcon("ant_u.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
            ImageIcon ii = new ImageIcon("ant_d.png");
        	image = ii.getImage();
        
        }
    }

    public void keyReleased(KeyEvent e) {   
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
