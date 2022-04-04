package Getraenkehandel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;



public class oberflaeche_getraenke extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	
	
	
	


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
		snack1.setPreis (1);
		snack1.setBestand(40);
		snack1.setLagertemp(20);
		
		
		double s_preis1 = snack1.getPreis();
		double lagertemp1 = snack1.getLagertemp();
		int s_bestand1 = snack1.getBestand();
		String s_name1 = snack1.getName();
		
		//Snack 2
		Snack snack2 = new Snack ();
		snack2.setName("Nic Nac's");
		snack2.setPreis (2);
		snack2.setBestand(50);
		snack2.setLagertemp(20);
		
		String s_name2 = snack2.getName();
		double lagertemp2 = snack2.getLagertemp();
		int s_bestand2 = snack2.getBestand();
		double s_preis2 = snack2.getPreis();
		
		//Snack 3
		Snack snack3 = new Snack ();
		snack3.setName("Chips");
		snack3.setBestand(100);
		snack3.setLagertemp(20);
		snack3.setPreis (2);
		
		double s_preis3 = snack3.getPreis();
		String s_name3 = snack3.getName();
		double lagertemp3 = snack3.getLagertemp();
		int s_bestand3 = snack3.getBestand();
		
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
		panel_2.setVisible(false);
		panel_2.setEnabled(false);
		
		JLabel lblBestandS = new JLabel("Snackliste");
		lblBestandS.setBounds(53, 11, 198, 17);
		lblBestandS.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestandS.setForeground(Color.CYAN);
		lblBestandS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_2.add(lblBestandS);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name:", "Bestand:", "Preis:", "Lagertemperatur:"},
				{s_name1, s_bestand1, s_preis1 + " €", lagertemp1},
				{s_name2, s_bestand2, s_preis2 + " €", lagertemp2},
				{s_name3, s_bestand3, s_preis3 + " €", lagertemp3},
			},
			new String[] {
				"Name", "Bestand", "Preis", "Lagertemperatur"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(145);
		table_1.setRowSelectionAllowed(false);
		table_1.setBounds(30, 39, 254, 64);
		panel_2.add(table_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 263, 306, 252);
		contentPane.add(panel_1);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		panel_1.setEnabled(false);
		
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

			new String  [] 
			{
				"Name:", "Bestand:", "Preis:"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btnNicNacs = new JButton("Nic Nac's");
		JButton btnBretzel = new JButton("Bretzel");
		JButton btnChips = new JButton("Chips");		
		JButton btnZurck = new JButton("Zur\u00FCck");
		

		
		JFormattedTextField formattedTextField_1_1 = new JFormattedTextField((Object) null);
		formattedTextField_1_1.setColumns(10);
		formattedTextField_1_1.setBounds(10, 147, 286, 22);
		formattedTextField_1_1.setValue(0);
		formattedTextField_1_1.setText("");
		formattedTextField_1_1.setColumns(10);
		formattedTextField_1_1.getValue();
		panel_2.add(formattedTextField_1_1);
		
		JRadioButton rdbtnsBestand = new JRadioButton("Bestandserh\u00F6hung");
		rdbtnsBestand.setBounds(0, 187, 115, 23);
		panel_2.add(rdbtnsBestand);
		
		JRadioButton rdbtnsVerkauf = new JRadioButton("Verkauf");
		rdbtnsVerkauf.setBounds(118, 187, 77, 23);
		panel_2.add(rdbtnsVerkauf);
		
		JRadioButton rdbtnsPreis = new JRadioButton("Preis\u00E4nderung");
		rdbtnsPreis.setBounds(199, 187, 101, 23);
		panel_2.add(rdbtnsPreis);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 11, 638, 241);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblHerzlichWillkommenZur = new JLabel("Herzlich Willkommen zur Artikelverwaltung");
		lblHerzlichWillkommenZur.setHorizontalAlignment(SwingConstants.CENTER);
		lblHerzlichWillkommenZur.setForeground(Color.CYAN);
		lblHerzlichWillkommenZur.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHerzlichWillkommenZur.setBounds(102, 11, 432, 49);
		panel_3.add(lblHerzlichWillkommenZur);
		
		
		
		JLabel lblGetrnkeverwaltung = new JLabel("Getr\u00E4nke");
		lblGetrnkeverwaltung.setBounds(49, 99, 156, 17);
		panel_3.add(lblGetrnkeverwaltung);
		lblGetrnkeverwaltung.setForeground(Color.CYAN);
		lblGetrnkeverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetrnkeverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblSnackverwaltung = new JLabel("Snack's");
		lblSnackverwaltung.setBounds(402, 99, 139, 17);
		panel_3.add(lblSnackverwaltung);
		lblSnackverwaltung.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnackverwaltung.setForeground(Color.CYAN);
		lblSnackverwaltung.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnVerkaufG = new JButton("Getr\u00E4nkeverwaltung");
		btnVerkaufG.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnVerkaufG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufG.setBounds(49, 127, 156, 23);
		panel_3.add(btnVerkaufG);
		btnVerkaufG.setForeground(Color.BLUE);
		btnVerkaufG.setBackground(Color.WHITE);
		btnVerkaufG.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnVerkaufS = new JButton("Snackverwaltung");
		btnVerkaufS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerkaufS.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null)); 
		
		btnVerkaufS.setBounds(402, 127, 139, 23);
		panel_3.add(btnVerkaufS);
		btnVerkaufS.setForeground(Color.BLUE);
		btnVerkaufS.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVerkaufS.setBackground(Color.WHITE);
		
		JLabel lblWasMchtenSie = new JLabel("Was m\u00F6chten sie verwalten ?");
		lblWasMchtenSie.setBounds(204, 71, 200, 17);
		panel_3.add(lblWasMchtenSie);
		lblWasMchtenSie.setForeground(Color.CYAN);
		lblWasMchtenSie.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 162, 261, 68);
		textArea.setVisible(false);
		panel_3.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(320, 162, 261, 68);
		textArea_1.setVisible(false);
		panel_3.add(textArea_1);
		
		
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnBretzel.setVisible(true);
				btnBretzel.setEnabled(false);
				btnNicNacs.setVisible(true);
				btnNicNacs.setEnabled(false);
				btnChips.setVisible(true);
				btnChips.setEnabled(false);
				
				rdbtnsBestand.setSelected(false);
				rdbtnsVerkauf.setSelected(false);
				rdbtnsPreis.setSelected(false);
				formattedTextField_1_1.setValue(null);
				textArea_1.setText("");
			}
		});
		btnZurck.setBounds(118, 218, 89, 23);
		panel_2.add(btnZurck);
		
		
		
		btnBretzel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				btnNicNacs.setVisible(false);
				btnNicNacs.setEnabled(false);
				btnChips.setVisible(false);
				btnChips.setEnabled(false);
				int Wert;
				
				Wert = ((Number) formattedTextField_1_1.getValue()).intValue();
				
				
				if (rdbtnsPreis.isSelected() ) 
				{
					snack1.PreisVeraendern(Wert);
					
				}
				else if (rdbtnsBestand.isSelected()) 
				{
					snack1.bestandErhoehen(Wert);
				}
				else if (rdbtnsVerkauf.isSelected())
				{
					snack1.snackverkaufen(Wert);
					
				}
				else
				{
					Wert = 0;
					textArea_1.setText("");
				}
				
				textArea_1.setVisible(true);
				textArea_1.setText(null);
				textArea_1.setText("Name:     "+ s_name1 +"     "+ s_name2 +"     "+ s_name3 + "\n" +
						"Bestand:   "+ snack1.getBestand() +"            " + snack2.getBestand() +"             " + snack3.getBestand() + "\n" +
						"Preis:       "+ snack1.getPreis() +" €" +"            " + snack2.getPreis() +" €" +"             " +snack3.getPreis() +" €\n" +
						"Lagertemp: "+ snack1.getLagertemp() + "      " + snack2.getLagertemp() + "     "+ snack3.getLagertemp());
			}
		});
		btnBretzel.setBounds(10, 113, 89, 23);
		panel_2.add(btnBretzel);
		
		
		btnNicNacs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnBretzel.setVisible(false);
				btnBretzel.setEnabled(false);
				btnChips.setVisible(false);
				btnChips.setEnabled(false);
				
				int Wert;
				
				Wert = ((Number) formattedTextField_1_1.getValue()).intValue();
				
				
				if (rdbtnsPreis.isSelected() ) 
				{
					snack2.PreisVeraendern(Wert);
					
				}
				else if (rdbtnsBestand.isSelected()) 
				{
					snack2.bestandErhoehen(Wert);
				}
				else if (rdbtnsVerkauf.isSelected())
				{
					snack2.snackverkaufen(Wert);
					
				}
				else
				{
					Wert = 0;
					textArea_1.setText("");
				}
				
				textArea_1.setVisible(true);
				textArea_1.setText(null);
				textArea_1.setText("Name:     "+ s_name1 +"     "+ s_name2 +"     "+ s_name3 + "\n" +
						"Bestand:   "+ snack1.getBestand() +"            " + snack2.getBestand() +"             " + snack3.getBestand() + "\n" +
						"Preis:     "+ snack1.getPreis() +" €" +"     " + snack2.getPreis() +" €" +"     " +snack3.getPreis() +" €\n" +
						"Lagertemp:     "+ snack1.getLagertemp() + "     " + snack2.getLagertemp() + "     "+ snack3.getLagertemp());
			}
		});
		btnNicNacs.setBounds(109, 113, 89, 23);
		panel_2.add(btnNicNacs);
		
		
		btnChips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnBretzel.setVisible(false);
				btnBretzel.setEnabled(false);
				btnNicNacs.setVisible(false);
				btnNicNacs.setEnabled(false);
				
				int Wert;
				
				Wert = ((Number) formattedTextField_1_1.getValue()).intValue();
				
				
				if (rdbtnsPreis.isSelected() ) 
				{
					snack3.PreisVeraendern(Wert);
					
				}
				else if (rdbtnsBestand.isSelected()) 
				{
					snack3.bestandErhoehen(Wert);
				}
				else if (rdbtnsVerkauf.isSelected())
				{
					snack3.snackverkaufen(Wert);
					
				}
				else
				{
					Wert = 0;
					textArea_1.setText("");
				}
				
				textArea_1.setVisible(true);
				textArea_1.setText(null);
				textArea_1.setText("Name:     "+ s_name1 +"     "+ s_name2 +"     "+ s_name3 + "\n" +
								"Bestand:   "+ snack1.getBestand() +"            " + snack2.getBestand() +"             " + snack3.getBestand() + "\n" +
								"Preis:     "+ snack1.getPreis() +" €" +"     " + snack2.getPreis() +" €" +"     " +snack3.getPreis() +" €\n" +
								"Lagertemp:     "+ snack1.getLagertemp() + "     " + snack2.getLagertemp() + "     "+ snack3.getLagertemp());
			}
		});
		btnChips.setBounds(208, 113, 89, 23);
		panel_2.add(btnChips);
		
		btnBretzel.setEnabled(false);
		btnNicNacs.setEnabled(false);
		btnChips.setEnabled(false);
		
		formattedTextField_1_1.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent e)
			{ 
				if(formattedTextField_1_1.getText().length() == 0)
				{
					btnBretzel.setEnabled(false);
					btnNicNacs.setEnabled(false);
					btnChips.setEnabled(false);
				}
				else 
					{
					btnBretzel.setEnabled(true);
					btnNicNacs.setEnabled(true);
					btnChips.setEnabled(true);
					}
			}
		}
		);
		
				
		
		JButton btnNewButton_1 = new JButton("Wein");
		JButton btnNewButton_2 = new JButton("Whiskey");
		JButton btnNewButton_3 = new JButton("Vodka");
		
	

		
		
		table_2 = new JTable();
		table_2.setEnabled(false);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name:", "Bestand:", "Preis:"},
				{name1, bestand1, preis1 + " €"},
				{name2, bestand2, preis2 + " €"},
				{name3, bestand3, preis3 + " €"},
			},
			new String[] {
				"Name", "Bestand", "Preis"
			}
		));
		table_2.setRowSelectionAllowed(false);
		table_2.setBounds(29, 40, 246, 64);
		panel_1.add(table_2);
		
		JRadioButton rdbtnPreis = new JRadioButton("Preis\u00E4nderung");
		JRadioButton rdbtnBestandserhhung = new JRadioButton("Bestandserh\u00F6hung");
		JRadioButton rdbtnVerkauf = new JRadioButton("Verkauf");
		
		
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(NumberFormat.getNumberInstance());
		formattedTextField_1.setValue(0);
		formattedTextField_1.setText("");
		formattedTextField_1.setColumns(10);
		formattedTextField_1.getValue();
		
		
		
		formattedTextField_1.setBounds(10, 151, 286, 22);
		panel_1.add(formattedTextField_1);
		
		formattedTextField_1.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent e)
			{ 
				if(formattedTextField_1.getText().length() == 0)
				{
					btnNewButton_1.setEnabled(false);
					btnNewButton_2.setEnabled(false);
					btnNewButton_3.setEnabled(false);
				}
				else 
					{
					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					}
			}
		}
		);

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int Wert;
				btnNewButton_1.setVisible(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_2.setEnabled(false);
				Wert = ((Number) formattedTextField_1.getValue()).intValue();
				
				
				if (rdbtnPreis.isSelected() ) 
				{
					getraenk1.PreisVeraendern(Wert);
					
				}
				else if (rdbtnBestandserhhung.isSelected()) 
				{
					getraenk1.bestandErhoehen(Wert);
				}
				else if (rdbtnVerkauf.isSelected())
				{
					getraenk1.getraenkverkaufen(Wert);
					
				}
				else
				{
					Wert = 0;
					textArea.setText("");
				}
				
				textArea.setVisible(true);
				textArea.setText(null);
				textArea.setText("Name:     "+ name1 +"     "+ name2 +"     "+ name3 + "\n" +
								"Bestand:   "+ getraenk1.getBestand() +"            " + getraenk2.getBestand() +"             " + getraenk3.getBestand() + "\n" +
								"Preis:     "+ getraenk1.getPreis() +" €" +"     " + getraenk2.getPreis() +" €" +"     " +getraenk3.getPreis() +" €");

			}
		});
		btnNewButton_3.setBounds(10, 116, 89, 23);
		panel_1.add(btnNewButton_3);
		
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int Wert;
				btnNewButton_1.setVisible(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_3.setEnabled(false);
				Wert = ((Number) formattedTextField_1.getValue()).intValue();
				
				if (rdbtnPreis.isSelected() ) 
				{
					getraenk2.PreisVeraendern(Wert);
					
				}
				else if (rdbtnBestandserhhung.isSelected()) 
				{
					
					getraenk2.bestandErhoehen(Wert);
				}
				else if (rdbtnVerkauf.isSelected())
				{
					getraenk2.getraenkverkaufen(Wert);
				}
				else
				{
					Wert = 0;
					textArea.setText("");
				}
				textArea.setVisible(true);
				textArea.setText("");
				textArea.setText("Name:     "+ name1 +"     "+ name2 +"     "+ name3 + "\n" +
						"Bestand:   "+ getraenk1.getBestand() +"            " + getraenk2.getBestand() +"             " + getraenk3.getBestand() + "\n" +
						"Preis:     "+ getraenk1.getPreis() +" €" +"     " + getraenk2.getPreis() +" €" +"     " +getraenk3.getPreis() +" €");
				
			}
		});
		btnNewButton_2.setBounds(109, 116, 89, 23);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int Wert;
				btnNewButton_2.setVisible(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_3.setEnabled(false);
				Wert = ((Number) formattedTextField_1.getValue()).intValue();
				
				
				if (rdbtnPreis.isSelected() ) 
				{
					getraenk3.PreisVeraendern(Wert);
					
				}
				else if (rdbtnBestandserhhung.isSelected()) 
				{
					
					getraenk3.bestandErhoehen(Wert);
				}
				else if (rdbtnVerkauf.isSelected())
				{
					getraenk3.getraenkverkaufen(Wert);
				}
				else
				{
					Wert = 0;
					textArea.setText("");
				}
				textArea.setVisible(true);
				textArea.setText(null);
				textArea.setText("Name:     "+ name1 +"     "+ name2 +"     "+ name3 + "\n" +
						"Bestand:   "+ getraenk1.getBestand() +"            " + getraenk2.getBestand() +"             " + getraenk3.getBestand() + "\n" +
						"Preis:     "+ getraenk1.getPreis() +" €" +"     " + getraenk2.getPreis() +" €" +"     " +getraenk3.getPreis() +" €");
				
				
			}
		});
		btnNewButton_1.setBounds(207, 116, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnZurck_1 = new JButton("Zur\u00FCck");
		btnZurck_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_1.setVisible(true);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setVisible(true);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setVisible(true);
				btnNewButton_3.setEnabled(false);
				
				rdbtnBestandserhhung.setSelected(false);
				rdbtnVerkauf.setSelected(false);
				rdbtnPreis.setSelected(false);
				formattedTextField_1.setValue(null);
				textArea.setText("");
			}
		});
		btnZurck_1.setBounds(94, 218, 89, 23);
		panel_1.add(btnZurck_1);
		
		rdbtnsPreis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnsBestand.setSelected(false);
				rdbtnsVerkauf.setSelected(false);
				rdbtnsPreis.setSelected(true);
			}
		});
		
		rdbtnsBestand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnsBestand.setSelected(true);
				rdbtnsVerkauf.setSelected(false);
				rdbtnsPreis.setSelected(false);
			}
		});
		
		rdbtnsVerkauf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnsBestand.setSelected(false);
				rdbtnsVerkauf.setSelected(true);
				rdbtnsPreis.setSelected(false);
			}
		});
		
		
		
		rdbtnPreis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnBestandserhhung.setSelected(false);
				rdbtnVerkauf.setSelected(false);
				rdbtnPreis.setSelected(true);
			}
		});
		rdbtnPreis.setBounds(199, 184, 101, 23);
		panel_1.add(rdbtnPreis);
		
		
		rdbtnBestandserhhung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnBestandserhhung.setSelected(true);
				rdbtnVerkauf.setSelected(false);
				rdbtnPreis.setSelected(false);
			}
		});
		rdbtnBestandserhhung.setBounds(0, 184, 115, 23);
		panel_1.add(rdbtnBestandserhhung);
		
		
		rdbtnVerkauf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnBestandserhhung.setSelected(false);
				rdbtnVerkauf.setSelected(true);
				rdbtnPreis.setSelected(false);
			}
		});
		rdbtnVerkauf.setBounds(117, 184, 77, 23);
		panel_1.add(rdbtnVerkauf);
		
		
		
		
		
		
		btnVerkaufG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_1.setVisible(true);
				panel_1.setEnabled(true);
				panel_2.setVisible(false);
				panel_2.setEnabled(false);
				textArea_1.setVisible(false);
				
			}
		});
		btnVerkaufS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel_2.setVisible(true);
				panel_2.setEnabled(true);
				panel_1.setVisible(false);
				panel_1.setEnabled(false);
				textArea.setVisible(false);
			}
		});
		
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_3.setEnabled(false);
		
	}
}
