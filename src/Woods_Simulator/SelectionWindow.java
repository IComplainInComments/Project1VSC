

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

public class SelectionWindow extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5911746181841061330L;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private int px1,py1,px2,py2;
	private boolean go = false;

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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelectionWindow dialog = new SelectionWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelectionWindow() {
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
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(lblNewLabel_4)))
					.addGap(3)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
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
					.addContainerGap(148, Short.MAX_VALUE))
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
