package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class window {

	private JFrame frmHypixelSlayerMoney;
	private JTextField PricesOfItems;
	private JTextField RevenantFlesh;
	private JTextField FoulFlesh;
	private JTextField PestilenceRune;
	private JTextField UndeadCatalyst;
	private JTextField SmiteVIBook;
	private JTextField BeheadedHorror;
	private JTextField RevenantCatalyst;
	private JTextField SnakeRune;
	private JTextField ScytheBlade;
	private JTextField RevFleshChance;
	private JTextField FoulFleshChance;
	private JTextField PesRuneChance;
	private JTextField UndeadChance;
	private JTextField SmiteChance;
	private JTextField BeheadChance;
	private JTextField RevCatChance;
	private JTextField SnakeChance;
	private JTextField ScytheChance;
	private JTextField DropChance;
	private JTextField TierSelect;
	private JTextField Price;
	private JTextField RevFleshPrice;
	private JTextField FoulFleshPrice;
	private JTextField PesRunePrice;
	private JTextField UndeadPrice;
	private JTextField SmitePrice;
	private JTextField BeheadPrice;
	private JTextField RevCatPrice;
	private JTextField SnakePrice;
	private JTextField ScythePrice;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ItemHandler handler = new ItemHandler();
	private DocumentHandler action = new DocumentHandler();
	private LinkedHashMap<JTextField, Double> ZCD = new LinkedHashMap<JTextField, Double>();
	private LinkedHashMap<JTextField, Double> ZP = new LinkedHashMap<JTextField, Double>();
	private JTextField ExpectedValue;
	static window window = new window();
	private JTextField Result;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frmHypixelSlayerMoney.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public window() {
		initialize();
		zombieSetup();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHypixelSlayerMoney = new JFrame();
		frmHypixelSlayerMoney.setIconImage(Toolkit.getDefaultToolkit().getImage(window.class.getResource("/images/Beheaded_Horror.png")));
		frmHypixelSlayerMoney.setTitle("Hypixel Slayer Money Guide");
		frmHypixelSlayerMoney.setBounds(100, 100, 597, 489);
		frmHypixelSlayerMoney.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmHypixelSlayerMoney.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Zombie Slayer", null, panel, null);
		panel.setLayout(null);

		PricesOfItems = new JTextField();
		PricesOfItems.setHorizontalAlignment(SwingConstants.CENTER);
		PricesOfItems.setText("Potential Drops");
		PricesOfItems.setEditable(false);
		PricesOfItems.setBounds(10, 81, 112, 20);
		panel.add(PricesOfItems);
		PricesOfItems.setColumns(10);

		RevenantFlesh = new JTextField();
		RevenantFlesh.setHorizontalAlignment(SwingConstants.CENTER);
		RevenantFlesh.setText("Revenant Flesh");
		RevenantFlesh.setEditable(false);
		RevenantFlesh.setBounds(10, 126, 112, 20);
		panel.add(RevenantFlesh);
		RevenantFlesh.setColumns(10);

		FoulFlesh = new JTextField();
		FoulFlesh.setHorizontalAlignment(SwingConstants.CENTER);
		FoulFlesh.setText("Foul Flesh");
		FoulFlesh.setEditable(false);
		FoulFlesh.setBounds(10, 157, 112, 20);
		panel.add(FoulFlesh);
		FoulFlesh.setColumns(10);

		PestilenceRune = new JTextField();
		PestilenceRune.setHorizontalAlignment(SwingConstants.CENTER);
		PestilenceRune.setText("Pestilence Rune");
		PestilenceRune.setEditable(false);
		PestilenceRune.setBounds(10, 188, 112, 20);
		panel.add(PestilenceRune);
		PestilenceRune.setColumns(10);

		UndeadCatalyst = new JTextField();
		UndeadCatalyst.setHorizontalAlignment(SwingConstants.CENTER);
		UndeadCatalyst.setText("Undead Catalyst");
		UndeadCatalyst.setEditable(false);
		UndeadCatalyst.setBounds(10, 219, 112, 20);
		panel.add(UndeadCatalyst);
		UndeadCatalyst.setColumns(10);

		SmiteVIBook = new JTextField();
		SmiteVIBook.setHorizontalAlignment(SwingConstants.CENTER);
		SmiteVIBook.setText("Smite VI Book");
		SmiteVIBook.setEditable(false);
		SmiteVIBook.setBounds(10, 250, 112, 20);
		panel.add(SmiteVIBook);
		SmiteVIBook.setColumns(10);

		BeheadedHorror = new JTextField();
		BeheadedHorror.setHorizontalAlignment(SwingConstants.CENTER);
		BeheadedHorror.setText("Beheaded Horror");
		BeheadedHorror.setEditable(false);
		BeheadedHorror.setBounds(10, 281, 112, 20);
		panel.add(BeheadedHorror);
		BeheadedHorror.setColumns(10);

		RevenantCatalyst = new JTextField();
		RevenantCatalyst.setHorizontalAlignment(SwingConstants.CENTER);
		RevenantCatalyst.setText("Revenant Catalyst");
		RevenantCatalyst.setEditable(false);
		RevenantCatalyst.setBounds(10, 312, 112, 20);
		panel.add(RevenantCatalyst);
		RevenantCatalyst.setColumns(10);

		SnakeRune = new JTextField();
		SnakeRune.setHorizontalAlignment(SwingConstants.CENTER);
		SnakeRune.setText("Snake Rune");
		SnakeRune.setEditable(false);
		SnakeRune.setBounds(10, 343, 112, 20);
		panel.add(SnakeRune);
		SnakeRune.setColumns(10);

		ScytheBlade = new JTextField();
		ScytheBlade.setHorizontalAlignment(SwingConstants.CENTER);
		ScytheBlade.setText("Scythe Blade");
		ScytheBlade.setEditable(false);
		ScytheBlade.setBounds(10, 374, 112, 20);
		panel.add(ScytheBlade);
		ScytheBlade.setColumns(10);

		DropChance = new JTextField();
		DropChance.setEditable(false);
		DropChance.setHorizontalAlignment(SwingConstants.CENTER);
		DropChance.setText("Chance");
		DropChance.setColumns(10);
		DropChance.setBounds(148, 81, 86, 20);
		panel.add(DropChance);

		RevFleshChance = new JTextField();
		RevFleshChance.setEditable(false);
		RevFleshChance.setText("0.0%");
		RevFleshChance.setHorizontalAlignment(SwingConstants.CENTER);
		RevFleshChance.setBounds(148, 126, 86, 20);
		panel.add(RevFleshChance);
		RevFleshChance.setColumns(10);

		FoulFleshChance = new JTextField();
		FoulFleshChance.setEditable(false);
		FoulFleshChance.setText("0.0%");
		FoulFleshChance.setHorizontalAlignment(SwingConstants.CENTER);
		FoulFleshChance.setColumns(10);
		FoulFleshChance.setBounds(148, 157, 86, 20);
		panel.add(FoulFleshChance);

		PesRuneChance = new JTextField();
		PesRuneChance.setEditable(false);
		PesRuneChance.setText("0.0%");
		PesRuneChance.setHorizontalAlignment(SwingConstants.CENTER);
		PesRuneChance.setColumns(10);
		PesRuneChance.setBounds(148, 188, 86, 20);
		panel.add(PesRuneChance);

		UndeadChance = new JTextField();
		UndeadChance.setEditable(false);
		UndeadChance.setText("0.0%");
		UndeadChance.setHorizontalAlignment(SwingConstants.CENTER);
		UndeadChance.setColumns(10);
		UndeadChance.setBounds(148, 219, 86, 20);
		panel.add(UndeadChance);

		SmiteChance = new JTextField();
		SmiteChance.setEditable(false);
		SmiteChance.setText("0.0%");
		SmiteChance.setHorizontalAlignment(SwingConstants.CENTER);
		SmiteChance.setColumns(10);
		SmiteChance.setBounds(148, 250, 86, 20);
		panel.add(SmiteChance);

		BeheadChance = new JTextField();
		BeheadChance.setEditable(false);
		BeheadChance.setText("0.0%");
		BeheadChance.setHorizontalAlignment(SwingConstants.CENTER);
		BeheadChance.setColumns(10);
		BeheadChance.setBounds(148, 281, 86, 20);
		panel.add(BeheadChance);

		RevCatChance = new JTextField();
		RevCatChance.setEditable(false);
		RevCatChance.setText("0.0%");
		RevCatChance.setHorizontalAlignment(SwingConstants.CENTER);
		RevCatChance.setColumns(10);
		RevCatChance.setBounds(148, 312, 86, 20);
		panel.add(RevCatChance);

		SnakeChance = new JTextField();
		SnakeChance.setEditable(false);
		SnakeChance.setText("0.0%");
		SnakeChance.setHorizontalAlignment(SwingConstants.CENTER);
		SnakeChance.setColumns(10);
		SnakeChance.setBounds(148, 343, 86, 20);
		panel.add(SnakeChance);

		ScytheChance = new JTextField();
		ScytheChance.setEditable(false);
		ScytheChance.setText("0.0%");
		ScytheChance.setHorizontalAlignment(SwingConstants.CENTER);
		ScytheChance.setColumns(10);
		ScytheChance.setBounds(148, 374, 86, 20);
		panel.add(ScytheChance);	

		TierSelect = new JTextField();
		TierSelect.setEditable(false);
		TierSelect.setHorizontalAlignment(SwingConstants.CENTER);
		TierSelect.setText("Select Which Tier");
		TierSelect.setBounds(10, 11, 104, 20);
		panel.add(TierSelect);
		TierSelect.setColumns(10);

		JRadioButton Tier1 = new JRadioButton("Tier 1");
		buttonGroup.add(Tier1);
		Tier1.setBounds(10, 38, 57, 23);
		Tier1.addItemListener(handler);
		panel.add(Tier1);

		JRadioButton Tier2 = new JRadioButton("Tier 2");
		buttonGroup.add(Tier2);
		Tier2.setBounds(69, 38, 57, 23);
		Tier2.addItemListener(handler);
		panel.add(Tier2);

		JRadioButton Tier3 = new JRadioButton("Tier 3");
		buttonGroup.add(Tier3);
		Tier3.setBounds(128, 38, 57, 23);
		Tier3.addItemListener(handler);
		panel.add(Tier3);

		JRadioButton Tier4 = new JRadioButton("Tier 4");
		buttonGroup.add(Tier4);
		Tier4.setBounds(187, 38, 57, 23);
		Tier4.addItemListener(handler);
		panel.add(Tier4);		

		ExpectedValue = new JTextField();
		ExpectedValue.setHorizontalAlignment(SwingConstants.CENTER);
		ExpectedValue.setText("Expected Value Per Run: ");
		ExpectedValue.setEditable(false);
		ExpectedValue.setBounds(375, 81, 179, 20);
		panel.add(ExpectedValue);
		ExpectedValue.setColumns(10);

		Price = new JTextField();
		Price.setEditable(false);
		Price.setHorizontalAlignment(SwingConstants.CENTER);
		Price.setText("Price (Coins)");
		Price.setBounds(263, 81, 86, 20);
		panel.add(Price);
		Price.setColumns(10);

		RevFleshPrice = new JTextField();
		RevFleshPrice.setHorizontalAlignment(SwingConstants.CENTER);
		RevFleshPrice.setBounds(263, 126, 86, 20);
		RevFleshPrice.getDocument().addDocumentListener(action);
		panel.add(RevFleshPrice);
		RevFleshPrice.setColumns(10);

		FoulFleshPrice = new JTextField();
		FoulFleshPrice.setHorizontalAlignment(SwingConstants.CENTER);
		FoulFleshPrice.setColumns(10);
		FoulFleshPrice.setBounds(263, 157, 86, 20);
		FoulFleshPrice.getDocument().addDocumentListener(action);
		panel.add(FoulFleshPrice);

		PesRunePrice = new JTextField();
		PesRunePrice.setHorizontalAlignment(SwingConstants.CENTER);
		PesRunePrice.setColumns(10);
		PesRunePrice.setBounds(263, 188, 86, 20);
		PesRunePrice.getDocument().addDocumentListener(action);
		panel.add(PesRunePrice);

		UndeadPrice = new JTextField();
		UndeadPrice.setHorizontalAlignment(SwingConstants.CENTER);
		UndeadPrice.setColumns(10);
		UndeadPrice.setBounds(263, 219, 86, 20);
		UndeadPrice.getDocument().addDocumentListener(action);
		panel.add(UndeadPrice);

		SmitePrice = new JTextField();
		SmitePrice.setHorizontalAlignment(SwingConstants.CENTER);
		SmitePrice.setColumns(10);
		SmitePrice.setBounds(263, 250, 86, 20);
		SmitePrice.setColumns(10);
		SmitePrice.getDocument().addDocumentListener(action);
		panel.add(SmitePrice);

		BeheadPrice = new JTextField();
		BeheadPrice.setHorizontalAlignment(SwingConstants.CENTER);
		BeheadPrice.setColumns(10);
		BeheadPrice.setBounds(263, 281, 86, 20);
		BeheadPrice.getDocument().addDocumentListener(action);
		panel.add(BeheadPrice);

		RevCatPrice = new JTextField();
		RevCatPrice.setHorizontalAlignment(SwingConstants.CENTER);
		RevCatPrice.setColumns(10);
		RevCatPrice.setBounds(263, 312, 86, 20);
		RevCatPrice.getDocument().addDocumentListener(action);
		panel.add(RevCatPrice);

		SnakePrice = new JTextField();
		SnakePrice.setHorizontalAlignment(SwingConstants.CENTER);
		SnakePrice.setColumns(10);
		SnakePrice.setBounds(263, 343, 86, 20);
		SnakePrice.getDocument().addDocumentListener(action);
		panel.add(SnakePrice);

		ScythePrice = new JTextField();
		ScythePrice.setHorizontalAlignment(SwingConstants.CENTER);
		ScythePrice.setColumns(10);
		ScythePrice.setBounds(263, 374, 86, 20);
		ScythePrice.getDocument().addDocumentListener(action);
		panel.add(ScythePrice);

		Result = new JTextField();
		Result.setEditable(false);
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setBounds(416, 126, 112, 20);
		panel.add(Result);
		Result.setColumns(10);

	}

	public void zombieSetup() {
		ZCD.put(RevFleshChance, 1.0);
		ZCD.put(FoulFleshChance, 0.0);
		ZCD.put(PesRuneChance, 0.0);
		ZCD.put(UndeadChance, 0.0);
		ZCD.put(SmiteChance, 0.0);
		ZCD.put(BeheadChance, 0.0);
		ZCD.put(RevCatChance, 0.0);
		ZCD.put(SnakeChance, 0.0);
		ZCD.put(ScytheChance, 0.0);

		ZP.put(RevFleshPrice, 0.0);
		ZP.put(FoulFleshPrice, 0.0);
		ZP.put(PesRunePrice, 0.0);
		ZP.put(UndeadPrice, 0.0);
		ZP.put(SmitePrice, 0.0);
		ZP.put(BeheadPrice, 0.0);
		ZP.put(RevCatPrice, 0.0);
		ZP.put(SnakePrice, 0.0);
		ZP.put(ScythePrice, 0.0);
	}

	public List<Double> loadZombieChances(Integer tier) {

		List<Double> tier1 = new ArrayList<Double>();
		tier1.add(1.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);
		tier1.add(0.0);

		List<Double> tier2 = new ArrayList<Double>();
		tier2.add(1.0);
		tier2.add(0.2);
		tier2.add(0.05);
		tier2.add(0.01);
		tier2.add(0.0);
		tier2.add(0.0);
		tier2.add(0.0);
		tier2.add(0.0);
		tier2.add(0.0);

		List<Double> tier3 = new ArrayList<Double>();
		tier3.add(1.0);
		tier3.add(0.2);
		tier3.add(0.05);
		tier3.add(0.01);
		tier3.add(0.01);
		tier3.add(0.00162);
		tier3.add(0.01);
		tier3.add(0.0);
		tier3.add(0.0);

		List<Double> tier4 = new ArrayList<Double>();
		tier4.add(1.0);
		tier4.add(0.2);
		tier4.add(0.05);
		tier4.add(0.01);
		tier4.add(0.01);
		tier4.add(0.00162);
		tier4.add(0.01);
		tier4.add(0.0045);
		tier4.add(0.00054);
		switch(tier) {
		case 1:
			int i = 0;
			for(JTextField text : ZCD.keySet()) {
				ZCD.put(text, tier1.get(i));
				i++;
			}
			return tier1;
		case 2:
			int i1 = 0;
			for(JTextField text : ZCD.keySet()) {
				ZCD.put(text, tier2.get(i1));
				i1++;
			}
			return tier2;
		case 3:
			int i2 = 0;
			for(JTextField text : ZCD.keySet()) {
				ZCD.put(text, tier3.get(i2));
				i2++;
			}
			return tier3;
		case 4:
			int i3 = 0;
			for(JTextField text : ZCD.keySet()) {
				ZCD.put(text, tier4.get(i3));
				i3++;
			}
			return tier4;
		}
		return tier1;
	}

	public Double getFee() {
		switch(getSelectedButtonText(buttonGroup)) {
		case "Tier 1":
			return 100.0;
		case "Tier 2":
			return 2000.0;
		case "Tier 3":
			return 10000.0;
		case "Tier 4":
			return 50000.0;
		}
		return 0.0;
	}

	public String getSelectedButtonText(ButtonGroup buttonGroup) {
		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				return button.getText();
			}
		}

		return null;
	}

	public void updateData(List<Double> list) {
		ZCD.forEach((k,v) -> {
			Double value = v*100;
			k.setText(round(value, 3) + "%");
		});
		window.frmHypixelSlayerMoney.revalidate();			
	}


	private static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public void recalculate() {		
		String result = "";		
		int ev = 0;
		List<Double> probability = new ArrayList<Double>();
		List<Double> price = new ArrayList<Double>();
		List<Double> quantity = new ArrayList<Double>();
		ZCD.forEach((k,v) -> {
			probability.add(v);
		});
		ZP.forEach((k,v) -> {
			price.add(v);
		});		
		try {
			switch(getSelectedButtonText(buttonGroup)) {
			case "Tier 1":
				quantity.add(2.0);
				for(int i=1;i<=8;i++) {
					quantity.add(1.0);
				}
				for(int i = 0; i<=8; i++) {
					double outcome = price.get(i) * probability.get(i) * quantity.get(i);
					ev += outcome;
				}
				break;
			case "Tier 2":
				quantity.add(13.5);
				for(int i=1;i<=8;i++){
					quantity.add(1.0);
				}
				for(int i = 0; i<=8; i++) {
					double outcome = price.get(i) * probability.get(i) * quantity.get(i);
					ev += outcome;
				}
				break;
			case "Tier 3":
				quantity.add(40.0);
				quantity.add(1.5);
				for(int i=2;i<=8;i++){
					quantity.add(1.0);
				}
				for(int i = 0; i<=8; i++) {
					double outcome = price.get(i) * probability.get(i) * quantity.get(i);
					ev += outcome;
				}
				break;
			case "Tier 4":
				quantity.add(57.0);
				quantity.add(2.5);
				for(int i=2;i<=8;i++){
					quantity.add(1.0);
				}
				for(int i = 0; i<=8; i++) {
					double outcome = price.get(i) * probability.get(i) * quantity.get(i);
					ev += outcome;
				}
				break;

			}		

		//calculating ExpectedValue		
		ev -= getFee();

		result += ev;	
		result += " coins";
		Result.setText(result);
		}catch(NullPointerException e) {}
	}


	private class ItemHandler implements ItemListener{		

		@Override
		public void itemStateChanged(ItemEvent e) {			

			if (e.getStateChange() == ItemEvent.DESELECTED) {
			}else {
				switch(getSelectedButtonText(buttonGroup)) {
				case "Tier 1":
					updateData(loadZombieChances(1));
					recalculate();
					break;
				case "Tier 2":
					updateData(loadZombieChances(2));
					recalculate();
					break;
				case "Tier 3":
					updateData(loadZombieChances(3));
					recalculate();
					break;
				case "Tier 4":
					updateData(loadZombieChances(4));
					recalculate();
					break;
				}
			}
		}

	}


	private class DocumentHandler implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();			
		}

		public void warn() {

			ZP.forEach((k,v) -> {
				try {
					double d = Double.parseDouble(k.getText());
					ZP.put(k, d);
					recalculate();
				}catch(NumberFormatException e) {}
			});

		}

	}
}
