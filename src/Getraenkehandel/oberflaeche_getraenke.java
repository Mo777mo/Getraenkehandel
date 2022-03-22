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
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class oberflaeche_getraenke extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField Vodka;
	private JTextField Whiskey;
	private JTextField Wein;
	private JTextField Bretzel;
	private JTextField NicNac;
	private JTextField Chips;
	private JTable table_2;
	private JTextField textField;

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
		JPanel panel = new JPanel();
		panel.setBounds(40, 47, 576, 341);
		contentPane.add(panel);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		panel.setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 565);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(342, 263, 306, 252);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBestandS = new JLabel("Snackliste");
		lblBestandS.setBounds(53, 11, 198, 17);
		lblBestandS.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestandS.setForeground(Color.CYAN);
		lblBestandS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_2.add(lblBestandS);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name:", "Bestand:", "Preis:", "Lagertemperatur:"},
				{s_name1, s_bestand1, s_preis1, lagertemp1},
				{s_name2, s_bestand2, s_preis2, lagertemp2},
				{s_name3, s_bestand3, s_preis3, lagertemp3},
			},
			new String[] {
				"Name", "Bestand", "Preis", "Lagertemperatur"
			}
		));
		table_1.getColumnModel().getColumn(3).setPreferredWidth(95);
		table_1.setRowSelectionAllowed(false);
		table_1.setBounds(31, 39, 246, 64);
		panel_2.add(table_1);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				panel.setVisible(true);
				panel_2.setVisible(false);
				panel.setEnabled(true);
				panel_2.setEnabled(false);
			}
		});
		btnZurck.setBounds(118, 218, 89, 23);
		panel_2.add(btnZurck);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 263, 306, 252);
		contentPane.add(panel_1);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setLayout(null);
		
		JLabel lblBestandG = new JLabel("Getr\u00E4nkeliste");
		lblBestandG.setBounds(29, 11, 246, 17);
		lblBestandG.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestandG.setForeground(Color.CYAN);
		lblBestandG.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(lblBestandG);
		
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
		
		JButton btnBretzel = new JButton("Bretzel");
		btnBretzel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		btnBretzel.setBounds(207, 114, 89, 23);
		panel_2.add(btnBretzel);
		
		JButton btnNicNacs = new JButton("Nic Nac's");
		btnNicNacs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		btnNicNacs.setBounds(207, 148, 89, 23);
		panel_2.add(btnNicNacs);
		
		JButton btnChips = new JButton("Chips");
		btnChips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		btnChips.setBounds(207, 182, 89, 23);
		panel_2.add(btnChips);
		
		Bretzel = new JTextField();
		Bretzel.setColumns(10);
		Bretzel.setBounds(69, 115, 86, 20);
		panel_2.add(Bretzel);
		
		NicNac = new JTextField();
		NicNac.setColumns(10);
		NicNac.setBounds(69, 149, 86, 20);
		panel_2.add(NicNac);
		
		Chips = new JTextField();
		Chips.setColumns(10);
		Chips.setBounds(69, 183, 86, 20);
		panel_2.add(Chips);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 39, 638, 213);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblHerzlichWillkommenZur = new JLabel("Herzlich Willkommen zur Artikelverwaltung");
		lblHerzlichWillkommenZur.setHorizontalAlignment(SwingConstants.CENTER);
		lblHerzlichWillkommenZur.setForeground(Color.CYAN);
		lblHerzlichWillkommenZur.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHerzlichWillkommenZur.setBounds(102, 11, 432, 49);
		panel_3.add(lblHerzlichWillkommenZur);
		
		
		
		JLabel lblGetrnkeverwaltung = new JLabel("Getr\u00E4nke Verwaltung");
		lblGetrnkeverwaltung.setBounds(49, 99, 156, 17);
		panel_3.add(lblGetrnkeverwaltung);
		lblGetrnkeverwaltung.setForeground(Color.CYAN);
		lblGetrnkeverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetrnkeverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblSnackverwaltung = new JLabel("Snack Verwaltung");
		lblSnackverwaltung.setBounds(402, 99, 139, 17);
		panel_3.add(lblSnackverwaltung);
		lblSnackverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnackverwaltung.setForeground(Color.CYAN);
		lblSnackverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnVerkaufG = new JButton("Getr\u00E4nkeverkauf");
		btnVerkaufG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnVerkaufG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufG.setBounds(49, 155, 156, 23);
		panel_3.add(btnVerkaufG);
		btnVerkaufG.setForeground(Color.BLUE);
		btnVerkaufG.setBackground(Color.WHITE);
		btnVerkaufG.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBestandsnderungG = new JButton("Bestandserh\u00F6hung");
		btnBestandsnderungG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBestandsnderungG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnBestandsnderungG.setBounds(49, 221, 156, 23);
		panel_3.add(btnBestandsnderungG);
		
		btnBestandsnderungG.setForeground(Color.BLUE);
		btnBestandsnderungG.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBestandsnderungG.setBackground(Color.WHITE);
		
		JButton btnPreisG = new JButton("Preis\u00E4nderung");
		btnPreisG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPreisG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPreisG.setBounds(49, 287, 156, 23);
		panel_3.add(btnPreisG);
		
		btnPreisG.setForeground(Color.BLUE);
		btnPreisG.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPreisG.setBackground(Color.WHITE);
		
		JButton btnVerkaufS = new JButton("Getr\u00E4nkeverkauf");
		btnVerkaufS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null)); 
		
		btnVerkaufS.setBounds(402, 155, 139, 23);
		panel_3.add(btnVerkaufS);
		btnVerkaufS.setForeground(Color.BLUE);
		btnVerkaufS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVerkaufS.setBackground(Color.WHITE);
		
		JButton btnBestandsnderungS = new JButton("Bestanderh\u00F6hung");
		btnBestandsnderungS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBestandsnderungS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		btnBestandsnderungS.setBounds(402, 221, 139, 23);
		panel_3.add(btnBestandsnderungS);
		btnBestandsnderungS.setForeground(Color.BLUE);
		btnBestandsnderungS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBestandsnderungS.setBackground(Color.WHITE);
		
		JButton btnPreisS = new JButton("Preis\u00E4nderung");
		btnPreisS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPreisS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPreisS.setBounds(402, 287, 139, 23);
		panel_3.add(btnPreisS);
		btnPreisS.setForeground(Color.BLUE);
		btnPreisS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPreisS.setBackground(Color.WHITE);
		
		JLabel lblWasMchtenSie = new JLabel("Was m\u00F6chten sie verwalten ?");
		lblWasMchtenSie.setBounds(204, 71, 200, 17);
		panel_3.add(lblWasMchtenSie);
		lblWasMchtenSie.setForeground(Color.CYAN);
		lblWasMchtenSie.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Wein");
		btnNewButton_1.setBounds(207, 184, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Whiskey");
		btnNewButton_2.setBounds(207, 150, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vodka");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				{
					Scanner tastatur = new Scanner(System.in);
					
					int x = tastatur.nextInt();
			}
		}}
			);
		btnNewButton_3.setBounds(207, 116, 89, 23);
		panel_1.add(btnNewButton_3);
		
		Vodka = new JTextField();
		Vodka.setBounds(10, 117, 40, 20);
		panel_1.add(Vodka);
		Vodka.setColumns(10);
		
		Whiskey = new JTextField();
		Whiskey.setBounds(10, 151, 40, 20);
		panel_1.add(Whiskey);
		Whiskey.setColumns(10);
		
		Wein = new JTextField();
		Wein.setBounds(10, 185, 40, 20);
		panel_1.add(Wein);
		Wein.setColumns(10);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name:", "Bestand:", "Preis:"},
				{name1, bestand1, preis1},
				{name2, bestand2, preis2},
				{name3, bestand3, preis3},
			},
			new String[] {
				"Name", "Bestand", "Preis"
			}
		));
		table_2.setRowSelectionAllowed(false);
		table_2.setBounds(29, 40, 246, 64);
		panel_1.add(table_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(71, 117, 40, 20);
		panel_1.add(textField);
		
		btnVerkaufG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_1.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
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
				panel_1.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
			}
		});
		btnVerkaufS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_2.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
			}
		});
		btnBestandsnderungS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_2.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
			}
		});
		btnPreisS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panel_2.setVisible(true);
				panel.setVisible(false);
				panel.setEnabled(false);
			}
		});
		
		
	}
}
