package thread;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ThreadSwing extends JFrame {
	private Container ct = getContentPane();
	public static Thread t;
	public int i;
	private JLabel jl = new JLabel();
	
	ThreadSwing(){
		setBounds(300, 200, 250, 100);
		ct.setLayout(null);
		URL url = ThreadSwing.class.getResource("biao2.jpg");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10, 10, 200, 50);
		jl.setOpaque(true);
		t = new Thread(new Runnable() {
			public void run() {
				while(i<200){
					jl.setBounds(i, 10, 200, 50);
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					i = i + 2;
					if(i == 200){
						i = 10;
					}
				}
			}
		});
		t.start();
		ct.add(jl);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args){
		new ThreadSwing();
	}
}
