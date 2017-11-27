package centrarJpanel;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	@SuppressWarnings("deprecation")
	public Principal() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 467);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("archivo");
		menuBar.add(mnArchivo);
		menuBar.hide();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.setSize(100, 100);
				
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(271, 124, 340, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Esta parte es la que hace centrar el jPanel en el frame
	    int panelX = (getWidth() - panel.getWidth() - getInsets().left - getInsets().right) / 2;
	    int panelY = ((getHeight() - panel.getHeight() - getInsets().top - getInsets().bottom) / 2);

		panel.setLocation(panelX, panelY);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(120, 198, 117, 25);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(120, 72, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 114, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
