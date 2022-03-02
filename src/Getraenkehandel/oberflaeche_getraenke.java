package Getraenkehandel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class oberflaeche_getraenke extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					oberflaeche_getraenke frame = new oberflaeche_getraenke();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public oberflaeche_getraenke() 
	{
		//Getränk 1
		Getraenk getraenk1 = new Getraenk ();
		getraenk1.setName("vodka");
		String name1 = getraenk1.getName();
		
		getraenk1.setPreis (12);
		double preis1 = getraenk1.getPreis();
		getraenk1.setBestand (20);
		int bestand1 = getraenk1.getBestand();
		
		//Getränk 2
		Getraenk getraenk2 = new Getraenk ();
		getraenk2.setName("Whiskey");
		String name2 = getraenk2.getName();
		
		getraenk2.setPreis (15);
		double preis2 = getraenk2.getPreis();
		getraenk2.setBestand (30);
		int bestand2 = getraenk2.getBestand();
		
		//Getränk 3
		Getraenk getraenk3 = new Getraenk ();
		getraenk3.setName("Wein");
		String name3 = getraenk3.getName();
		
		getraenk3.setPreis (10);
		double preis3 = getraenk3.getPreis();
		getraenk3.setBestand (45);
		int bestand3 = getraenk3.getBestand();
		
		//Snack 1
		Snack snack1 = new Snack ();
		snack1.setName("Bretzel");
		String s_name1 = snack1.getName();
		double lagertemp1 = snack1.getLagertemp();
		int s_bestand1 = snack1.getBestand();
		
		snack1.setPreis (1);
		double s_preis1 = snack1.getPreis();
		snack1.setBestand(40);
		snack1.setLagertemp(20);
		
		//Snack 2
		Snack snack2 = new Snack ();
		snack2.setName("Nic Nac's");
		String s_name2 = snack2.getName();
		double lagertemp2 = snack2.getLagertemp();
		int s_bestand2 = snack2.getBestand();
		
		snack2.setPreis (2);
		double s_preis2 = snack2.getPreis();
		snack2.setBestand(50);
		snack2.setLagertemp(20);
		
		//Snack 3
		Snack snack3 = new Snack ();
		snack3.setName("Chips");
		String s_name3 = snack3.getName();
		double lagertemp3 = snack3.getLagertemp();
		int s_bestand3 = snack3.getBestand();
		
		snack3.setPreis (2);
		double s_preis3 = snack3.getPreis();
		snack3.setBestand(100);
		snack3.setLagertemp(20);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 565);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(Color.GRAY);
		panel.setBounds(342, 11, 576, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Willkommen zur Artikel Verwaltung");
		lblWelcome.setBounds(179, 30, 257, 20);
		panel.add(lblWelcome);
		lblWelcome.setForeground(Color.BLUE);
		lblWelcome.setBackground(Color.WHITE);
		lblWelcome.setLabelFor(lblWelcome);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 18));
		
		JLabel lblGetrnkeverwaltung = new JLabel("Getr\u00E4nke Verwaltung");
		lblGetrnkeverwaltung.setBounds(49, 99, 156, 17);
		panel.add(lblGetrnkeverwaltung);
		lblGetrnkeverwaltung.setForeground(Color.BLUE);
		lblGetrnkeverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetrnkeverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblSnackverwaltung = new JLabel("Snack Verwaltung");
		lblSnackverwaltung.setBounds(402, 99, 139, 17);
		panel.add(lblSnackverwaltung);
		lblSnackverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnackverwaltung.setForeground(Color.BLUE);
		lblSnackverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnVerkaufG = new JButton("Getr\u00E4nkeverkauf");
		btnVerkaufG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnVerkaufG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufG.setBounds(49, 155, 156, 23);
		panel.add(btnVerkaufG);
		btnVerkaufG.setForeground(Color.BLUE);
		btnVerkaufG.setBackground(Color.WHITE);
		btnVerkaufG.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBestandsnderungG = new JButton("Bestands\u00E4nderung");
		btnBestandsnderungG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBestandsnderungG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBestandsnderungG.setBounds(49, 221, 156, 23);
		panel.add(btnBestandsnderungG);
		
		btnBestandsnderungG.setForeground(Color.BLUE);
		btnBestandsnderungG.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBestandsnderungG.setBackground(Color.WHITE);
		
		JButton btnPreisG = new JButton("Preis\u00E4nderung");
		btnPreisG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPreisG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPreisG.setBounds(49, 287, 156, 23);
		panel.add(btnPreisG);
		
		btnPreisG.setForeground(Color.BLUE);
		btnPreisG.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPreisG.setBackground(Color.WHITE);
		
		JButton btnVerkaufS = new JButton("Getr\u00E4nkeverkauf");
		btnVerkaufS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null)); 
		
		btnVerkaufS.setBounds(402, 155, 139, 23);
		panel.add(btnVerkaufS);
		btnVerkaufS.setForeground(Color.BLUE);
		btnVerkaufS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVerkaufS.setBackground(Color.WHITE);
		
		JButton btnBestandsnderungS = new JButton("Bestands\u00E4nderung");
		btnBestandsnderungS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBestandsnderungS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		btnBestandsnderungS.setBounds(402, 221, 139, 23);
		panel.add(btnBestandsnderungS);
		btnBestandsnderungS.setForeground(Color.BLUE);
		btnBestandsnderungS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBestandsnderungS.setBackground(Color.WHITE);
		
		JButton btnPreisS = new JButton("Preis\u00E4nderung");
		btnPreisS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPreisS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPreisS.setBounds(402, 287, 139, 23);
		panel.add(btnPreisS);
		btnPreisS.setForeground(Color.BLUE);
		btnPreisS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPreisS.setBackground(Color.WHITE);
		
		JLabel lblWasMchtenSie = new JLabel("Was m\u00F6chten sie verwalten ?");
		lblWasMchtenSie.setBounds(204, 71, 200, 17);
		panel.add(lblWasMchtenSie);
		lblWasMchtenSie.setForeground(Color.BLUE);
		lblWasMchtenSie.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 100, 306, 252);
		contentPane.add(panel_1);
		panel_1.setVisible(false);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(null);
		
		JLabel lblVerkaufG = new JLabel("Bestands\u00E4nderung Getr\u00E4nke");
		lblVerkaufG.setBounds(29, 11, 246, 17);
		lblVerkaufG.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerkaufG.setForeground(Color.BLUE);
		lblVerkaufG.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(lblVerkaufG);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name:", "Bestand:", "Preis:"},
				{name1, bestand1, preis1 + " €"},
				{name2, bestand2, preis2 + " €"},
				{name3, bestand3, preis3 + " €"},
			},
/*
			new Object[][] {
					{"Name:", "Bestand:", "Preis:"},
					{name1, bestand1, preis1 + " €"},
					{name2, bestand2, preis2 + " €"},
					{name3, bestand3, preis3 + " €"},
				},
			*/
			new String[] {
				"Name:", "Bestand:", "Preis:"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(29, 40, 246, 64);
		panel_1.add(table);
		btnVerkaufG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnBestandsnderungG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_1.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
			}
		});
		btnPreisG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		btnVerkaufS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnBestandsnderungS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnPreisS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
	}
}
