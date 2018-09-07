package demo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Window_demo {

	public void test_03(){
		init();
		}
		public void init(){
		JLabel jl_1=new JLabel("用户名");
		JLabel jl_2=new JLabel("密码");
		JTextField jtf=new JTextField();
		JPasswordField jpf=new JPasswordField();
		JButton button_1=new JButton("确定");
		JPanel panel=new JPanel();
		panel.setLayout(null);
		jl_1.setBounds(30, 50, 50, 30);
		jl_2.setBounds(30,90,50,30);
		jtf.setBounds(100, 50, 100, 30);
		jpf.setBounds(100, 90, 100, 30);
		button_1.setBounds(110, 130, 80, 30);
		panel.add(jl_1);
		panel.add(jl_2);
		panel.add(jtf);
		panel.add(jpf);
		panel.add(button_1);
		this.
		this.Add(panel);
		this.setSize(300, 250);
		this.setLocation(400, 300);
		this.setVisible(true);
		}
		public static void main(String[] args) {
		new test_03();
		}
}
