
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Ant {
	private int velocity = 1;
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
        x = -200;
        y = -200;
    }
    
    public void move() {
    	if(x !=-200 && x != 730){
    		x += dx;
    	}else if(x <=-200 && dx>0){
    		x += dx;
    	}else if(x >= 730 && dx<0){
    		x += dx;
    	}
    	
    	if(y !=-200 && y !=480){
    		y += dy;
    	}else if(y <=-200 && dy>0){
    		y += dy;
    	}else if(y >= 480 && dy<0){
    		y += dy;
    	}
    	
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
    
    public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -velocity;
            ImageIcon ii = new ImageIcon("ant_l.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = velocity;
            ImageIcon ii = new ImageIcon("ant_r.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_UP) {
            dy = -velocity;
            ImageIcon ii = new ImageIcon("ant_u.png");
        	image = ii.getImage();
        
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = velocity;
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
