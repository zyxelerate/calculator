package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.math.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Calculator extends JFrame {
	private BigDecimal num1;
	private BigDecimal num2;
	private BigDecimal num3;
	private boolean isDecimal = false;
	private String operator;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("");
		textPane.setBounds(10, 11, 278, 55);
		contentPane.add(textPane);
		//RESET
		JButton btnAc = new JButton("A/C");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
				isDecimal = false;
			}
		});
		btnAc.setBounds(10, 77, 61, 55);
		contentPane.add(btnAc);
		//7
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp = button_7.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_7.setBounds(10, 132, 61, 55);
		contentPane.add(button_7);
		//CHANGE SIGN
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BigDecimal temp = new BigDecimal(String.valueOf(textPane.getText()));
		        textPane.setText(String.valueOf(temp.negate()));
			}
		});
		btnSign.setBounds(71, 77, 61, 55);
		contentPane.add(btnSign);
		//8
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_8.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_8.setBounds(71, 132, 61, 55);
		contentPane.add(button_8);
		//PERCENT
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p;
		        num1 = new BigDecimal(textPane.getText());
		        textPane.setText("");
		        BigDecimal temp = new BigDecimal(100);
		        num3 = num1.divide(temp,  2, RoundingMode.HALF_UP);
		        p = String.format("%.2f", num3);
		        textPane.setText(p);
			}
		});
		btnPercent.setBounds(131, 77, 61, 55);
		contentPane.add(btnPercent);
		//9
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_9.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_9.setBounds(131, 132, 61, 55);
		contentPane.add(button_9);
		//4
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_4.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_4.setBounds(10, 187, 61, 55);
		contentPane.add(button_4);
		//5
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_5.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_5.setBounds(71, 187, 61, 55);
		contentPane.add(button_5);
		//6
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_6.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_6.setBounds(131, 187, 61, 55);
		contentPane.add(button_6);
		//1
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_1.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_1.setBounds(10, 242, 61, 55);
		contentPane.add(button_1);
		//2
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_2.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_2.setBounds(71, 242, 61, 55);
		contentPane.add(button_2);
		//3
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_3.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_3.setBounds(131, 242, 61, 55);
		contentPane.add(button_3);
		//0
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = button_0.getText();
				textPane.setText(textPane.getText() + temp);
			}
		});
		button_0.setBounds(10, 297, 122, 55);
		contentPane.add(button_0);
		//DECIMAL POINT
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isDecimal = true;
		        String temp = textPane.getText() + textPane.getText();
		        textPane.setText(temp);
			}
		});
		btnDecimal.setBounds(131, 297, 61, 55);
		contentPane.add(btnDecimal);
		//DIVIDE
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = new BigDecimal(textPane.getText());
		        textPane.setText("");
		        operator = "/";
			}
		});
		btnDivide.setBounds(193, 77, 95, 55);
		contentPane.add(btnDivide);
		//MULTIPLY
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = new BigDecimal(textPane.getText());
		        textPane.setText("");
		        operator = "*";
			}
		});
		btnMultiply.setBounds(193, 132, 95, 55);
		contentPane.add(btnMultiply);
		//SUBTRACT
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = new BigDecimal(textPane.getText());
		        textPane.setText("");
		        operator = "-";
			}
		});
		btnSubtract.setBounds(193, 187, 95, 55);
		contentPane.add(btnSubtract);
		//ADD
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = new BigDecimal(textPane.getText());
		        textPane.setText("");
		        operator = "+";
			}
		});
		btnAdd.setBounds(193, 242, 95, 55);
		contentPane.add(btnAdd);
		//EQUALS
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans = "";
		        num2 = new BigDecimal(textPane.getText());

		        if(operator == "+"){
		            num3 = num1.add(num2);
		            if(!(isDecimal)){
		                ans = String.format("%.0f", num3);
		            } else {
		                ans = String.format("%.2f", num3);
		            }
		            textPane.setText(ans);
		        }
		        else if (operator == "-"){
		            num3 = num1.subtract(num2);
		            if(!(isDecimal)){
		                ans = String.format("%.0f", num3);
		            } else {
		                ans = String.format("%.2f", num3);
		            }
		            textPane.setText(ans);
		        }
		        else if(operator == "/"){
		            try {
		                num3 = num1.divide(num2, 2, RoundingMode.HALF_UP);
		                if(!(isDecimal)){
			                ans = String.format("%.0f", num3);
			            } else {
			                ans = String.format("%.2f", num3);
			            }
		            }catch(ArithmeticException a){
		                JOptionPane.showMessageDialog(null,"Math Error");
		                textPane.setText("");
		            }
		            textPane.setText(ans);
		        }
		        else if (operator == "*"){
		            num3 = num1.multiply(num2);
		            if(!(isDecimal)){
		                ans = String.format("%.0f", num3);
		            } else {
		                ans = String.format("%.2f", num3);
		            }
		            textPane.setText(ans);
		        }
		        isDecimal = false;
			}
		});
		btnResult.setBounds(193, 297, 95, 55);
		contentPane.add(btnResult);
	}
}
