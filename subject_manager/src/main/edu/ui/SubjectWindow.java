package main.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SubjectWindow {
	private JFrame frame;
	private JButton addSubject;
	private JButton updateSubject;
	private JButton deleteSubject;
	private JButton refreshTable;
	private JButton exitWindow;
	
	
	private JPanel rightPanel;
	private JPanel centralPanel;
	private JPanel bottomPanel;
	
	public SubjectWindow() {
		// TODO Auto-generated constructor stub
		this.frame = new JFrame();
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addSubject = new JButton("Add");
		this.updateSubject = new JButton("Update");
		this.deleteSubject = new JButton("Delete");
		this.refreshTable = new JButton("Refresh");
		this.exitWindow = new JButton("Exit");
		
		
		this.rightPanel = new JPanel();
		this.centralPanel = new JPanel();
		this.centralPanel.setBackground(Color.lightGray);
		this.bottomPanel = new JPanel();
		this.bottomPanel.setBackground(Color.green);
		
		buildWindow();
	}
	
	private void buildWindow(){
		
		this.rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));		
		this.rightPanel.add(addSubject);
		this.rightPanel.add(updateSubject);
		this.rightPanel.add(deleteSubject);
		this.rightPanel.add(refreshTable);
		this.rightPanel.add(exitWindow);
		this.frame.getContentPane().add(BorderLayout.EAST,rightPanel);
		this.frame.getContentPane().add(BorderLayout.CENTER,centralPanel);
		this.frame.getContentPane().add(BorderLayout.SOUTH,bottomPanel);
		this.frame.setSize(800, 500);
		
		JTextArea textArea = new JTextArea(10,20);
		bottomPanel.add(textArea);
		
		
	}
	
	 
	public void launch(){
		this.frame.setVisible(true);
	}
	

}
