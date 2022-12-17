import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      RAJAN S.F. CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(21, 5, 335, 27);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(21, 34, 335, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnR.setBounds(21, 108, 59, 52);
		frame.getContentPane().add(btnR);
		
		JButton btnHx = new JButton("1/x");
		btnHx.setEnabled(false);
		btnHx.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnHx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHx.setBounds(21, 163, 59, 52);
		frame.getContentPane().add(btnHx);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEx.setBounds(90, 108, 59, 52);
		frame.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLog.setBounds(90, 163, 59, 52);
		frame.getContentPane().add(btnLog);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(90, 274, 59, 52);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(90, 330, 59, 52);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(90, 385, 59, 52);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(90, 440, 128, 52);
		frame.getContentPane().add(btn0);
		
		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSin.setBounds(159, 108, 59, 52);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSinh.setBounds(159, 163, 59, 52);
		frame.getContentPane().add(btnSinh);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(159, 274, 59, 52);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(159, 330, 59, 52);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(159, 385, 59, 52);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCos.setBounds(228, 108, 59, 52);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCosh.setBounds(228, 163, 59, 52);
		frame.getContentPane().add(btnCosh);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(228, 274, 59, 52);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(228, 330, 59, 52);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(228, 385, 59, 52);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDot.setBounds(228, 440, 59, 52);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTan.setBounds(297, 108, 59, 52);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(""); 
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTanh.setBounds(297, 163, 59, 52);
		frame.getContentPane().add(btnTanh);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") {
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "x^y") {
					double resultt = 1;
					
					for(int i = 0; i<second; i++) {
						resultt = first*resultt;
					}
					
					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEqual.setBounds(297, 440, 59, 52);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDiv.setBounds(297, 385, 59, 52);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMult = new JButton("*");
		btnMult.setEnabled(false);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMult.setBounds(297, 330, 59, 52);
		frame.getContentPane().add(btnMult);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSub.setBounds(297, 274, 59, 52);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnAdd.setBounds(297, 218, 59, 52);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackSpace.setBounds(228, 218, 59, 52);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(159, 218, 59, 52);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
				
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPercent.setBounds(90, 218, 59, 52);
		frame.getContentPane().add(btnPercent);
		
		JButton btnXY = new JButton("x^y");
		btnXY.setEnabled(false);
		btnXY.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x^y";
			}
		});
		btnXY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXY.setBounds(21, 218, 59, 52);
		frame.getContentPane().add(btnXY);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.setEnabled(false);
		btnX3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnX3.setBounds(21, 274, 59, 52);
		frame.getContentPane().add(btnX3);
		
		JButton btnX2 = new JButton("x^2");
		btnX2.setEnabled(false);
		btnX2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);		
			}
		});
		btnX2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnX2.setBounds(21, 330, 59, 52);
		frame.getContentPane().add(btnX2);
		
		JButton btnFact = new JButton("n!");
		btnFact.setEnabled(false);
		btnFact.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFact.setBounds(21, 385, 59, 52);
		frame.getContentPane().add(btnFact);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(21, 440, 59, 52);
		frame.getContentPane().add(btnPlusMinus);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btn0.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				
				btnSub.setEnabled(true);
				btnDiv.setEnabled(true);
				btnMult.setEnabled(true);
				
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				
				btnR.setEnabled(true);
				
				btnEx.setEnabled(true);
				btnLog.setEnabled(true);
				btnXY.setEnabled(true);
				
				btnX3.setEnabled(true);
				btnX2.setEnabled(true);
				btnFact.setEnabled(true);
				
				btnPlusMinus.setEnabled(true);
				btnPercent.setEnabled(true);
				btnEqual.setEnabled(true);
				
				btnHx.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(21, 82, 59, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnYes = new JRadioButton("OFF");
		rdbtnYes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
						
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false); 
				
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btn0.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				
				btnSub.setEnabled(false);
				btnDiv.setEnabled(false);
				btnMult.setEnabled(false);
				
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				
				btnR.setEnabled(false);
				
				btnEx.setEnabled(false);
				btnLog.setEnabled(false);
				btnXY.setEnabled(false);
				
				btnX3.setEnabled(false);
				btnX2.setEnabled(false);
				btnFact.setEnabled(false);
				
				btnPlusMinus.setEnabled(false);
				btnPercent.setEnabled(false);
				btnEqual.setEnabled(false);
				
				btnHx.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				
				textField.setEnabled(false);
				
				
			}
		});
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnYes.setBounds(90, 82, 59, 21);
		frame.getContentPane().add(rdbtnYes);
	}
}
