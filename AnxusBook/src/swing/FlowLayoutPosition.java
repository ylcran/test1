package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlowLayoutPosition(){
		setTitle("【六十框架】");
		Container ctr = getContentPane();
		setLayout(new FlowLayout(1, 20, 20));
		//setBounds(1, y, width, height)
		for(int i=0;i<11;i++){
			ctr.add(new JButton("button"+i));
		}
		setSize(300, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	
	public static void main(String[] args){
		new FlowLayoutPosition();
	}

}
