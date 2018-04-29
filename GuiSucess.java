package com.finalbuilt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiSucess {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void call() {
		EventQueue.invokeLater(() -> {
				try {
					GuiSucess window = new GuiSucess();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiSucess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUnblockingUrlSucess = new JLabel("Sucessfully Unblocked");
		lblUnblockingUrlSucess.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUnblockingUrlSucess.setBounds(56, 10, 200, 30);
		frame.getContentPane().add(lblUnblockingUrlSucess);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener((ActionEvent e) -> {
			frame.dispose();
		});
		btnExit.setBounds(104, 63, 85, 21);
		frame.getContentPane().add(btnExit);
		frame.setBounds(300, 300, 344, 162);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
