

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectionWindow4 extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2145059568989015542L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private int px1,py1,px2,py2,px3,py3,px4,py4;
	private boolean go = false;
	/**
	 * @return the px4
	 */
	public int getPx4() {
		return px4;
	}

	/**
	 * @return the go
	 */
	public boolean isGo() {
		return go;
	}

	/**
	 * @param go the go to set
	 */
	public void setGo(boolean go) {
		this.go = go;
	}

	/**
	 * @param px4 the px4 to set
	 */
	public void setPx4(int px4) {
		this.px4 = px4;
	}

	/**
	 * @return the py4
	 */
	public int getPy4() {
		return py4;
	}

	/**
	 * @param py4 the py4 to set
	 */
	public void setPy4(int py4) {
		this.py4 = py4;
	}

	/**
	 * @return the px3
	 */
	public int getPx3() {
		return px3;
	}

	/**
	 * @param px3 the px3 to set
	 */
	public void setPx3(int px3) {
		this.px3 = px3;
	}

	/**
	 * @return the py3
	 */
	public int getPy3() {
		return py3;
	}

	/**
	 * @param py3 the py3 to set
	 */
	public void setPy3(int py3) {
		this.py3 = py3;
	}
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelectionWindow4 dialog = new SelectionWindow4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelectionWindow4() {
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		{
			lblNewLabel_1 = new JLabel("Player 1");
		}
		{
			textField_1 = new JTextField();
			textField_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String myString = textField_1.getText();
					if(myString.matches("-?\\\\d+")) {
						px1 = Integer.parseInt(myString);
					}
				}
			});
			textField_1.setText("0");
			textField_1.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Y");
		}
		{
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String myString = textField.getText();
					if(myString.matches("-?\\\\d+")) {
						py1 = Integer.parseInt(myString);
					}
				}
			});
			textField.setText("0");
			textField.setColumns(10);
		}
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_2.getText();
				if(myString.matches("-?\\\\d+")) {
					px2 = Integer.parseInt(myString);
				}
			}
		});
		textField_2.setText("0");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_3.getText();
				if(myString.matches("-?\\\\d+")) {
					py2 = Integer.parseInt(myString);
				}
			}
		});
		textField_3.setText("0");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Player 2");
		
		JLabel lblNewLabel_3 = new JLabel("Y");
		lblNewLabel_4 = new JLabel("X");
		lblNewLabel_5 = new JLabel("X");
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_4.getText();
				if(myString.matches("-?\\\\d+")) {
					px3 = Integer.parseInt(myString);
				}
			}
		});
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_5.getText();
				if(myString.matches("-?\\\\d+")) {
					py3 = Integer.parseInt(myString);
				}
			}
		});
		textField_5.setText("0");
		textField_5.setColumns(10);
		lblNewLabel_6 = new JLabel("Y");
		lblNewLabel_7 = new JLabel("Player 3");
		lblNewLabel_8 = new JLabel("X");
		
		JLabel lblNewLabel_9 = new JLabel("Player 4");
		
		JLabel lblNewLabel_10 = new JLabel("X");
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_6.getText();
				if(myString.matches("-?\\\\d+")) {
					px4 = Integer.parseInt(myString);
				}
			}
		});
		textField_6.setText("0");
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Y");
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myString = textField_7.getText();
				if(myString.matches("-?\\\\d+")) {
					py4 = Integer.parseInt(myString);
				}
			}
		});
		textField_7.setText("0");
		textField_7.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(14, 14, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_9))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_10)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5))))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
								.addComponent(textField_4, 0, 0, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, 0, 0, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel)
									.addComponent(lblNewLabel_3))
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
								.addComponent(textField_5, 0, 0, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_11)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, 0, 0, Short.MAX_VALUE)))
					.addGap(192))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_9)
							.addComponent(lblNewLabel_10))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_11)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						contentPanel.setVisible(false);
						setGo(true);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						setGo(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	/**
	 * @return the px1
	 */
	public int getPx1() {
		return px1;
	}

	/**
	 * @param px1 the px1 to set
	 */
	public void setPx1(int px1) {
		this.px1 = px1;
	}

	/**
	 * @return the py1
	 */
	public int getPy1() {
		return py1;
	}

	/**
	 * @param py1 the py1 to set
	 */
	public void setPy1(int py1) {
		this.py1 = py1;
	}

	/**
	 * @return the px2
	 */
	public int getPx2() {
		return px2;
	}

	/**
	 * @param px2 the px2 to set
	 */
	public void setPx2(int px2) {
		this.px2 = px2;
	}

	/**
	 * @return the py2
	 */
	public int getPy2() {
		return py2;
	}

	/**
	 * @param py2 the py2 to set
	 */
	public void setPy2(int py2) {
		this.py2 = py2;
	}
}
