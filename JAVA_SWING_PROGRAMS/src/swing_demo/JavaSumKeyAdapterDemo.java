package swing_demo;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JavaSumKeyAdapterDemo {
	
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JFrame f = new JFrame();
	
//	Constructor
	 JavaSumKeyAdapterDemo() {
		l1= new JLabel("First Number");
		t1 = new JTextField(20);
		
		l2 =new  JLabel("Second Number");
		t2 =new JTextField(20);
		
		l3 = new JLabel("Presss any key to get result");
		t3 = new JTextField(20);
		
		t3.addKeyListener( new KeyChecker());
		
		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		f.setVisible(true);
		f.setSize(250, 250);
		f.setLayout(new GridLayout(3,2));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	 
//	 Key Adapter extend class 
	class KeyChecker extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			
			int result = num1 + num2;
			
			JOptionPane.showMessageDialog(f, "The sum of two number is "+ result);
			t3.setText(null);
		}
	}

	public static void main(String[] args) {
//		called from main 
	new JavaSumKeyAdapterDemo();

	}

}
