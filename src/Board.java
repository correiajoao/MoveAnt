import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	private Timer timer;
	private Ant ant;
	private final int DELAY = 10;

	public Board() {
		initBoard();
	}

	private void initBoard() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);

		ant = new Ant();

		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		java.awt.Image image = new ImageIcon("grama.jpg").getImage();
		g.drawImage(image, 0, 0, null);
		
		doDrawing(g);

		Toolkit.getDefaultToolkit().sync();
	}

	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ant.getImage(), ant.getX(), ant.getY(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ant.move();
		repaint();
	}

	private class TAdapter extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			ant.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			ant.keyPressed(e);
		}
	}
}
