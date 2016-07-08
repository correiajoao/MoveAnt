import javax.swing.JFrame;
import java.awt.EventQueue;

public class MovingSpriteEx extends JFrame {
	public MovingSpriteEx() {
		initUI();
	}

	private void initUI() {

		add(new Board());

		setSize(975,725);
		setResizable(false);

		setTitle("Moving ant");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				MovingSpriteEx ex = new MovingSpriteEx();
				ex.setVisible(true);
			}
		});
	}
}
