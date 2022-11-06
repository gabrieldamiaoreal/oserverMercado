package publisher;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import domain.Product;

public class InventoryManager {

	public MarketInventory marketInventory;
	public List<Product> newProducts;
	
	public InventoryManager(MarketInventory marketInventory){
		this.marketInventory = marketInventory;	
	}
	
	public void generateManagerWindow(){
		
		//setting JFrame for iventory management window client
		JFrame frame = new JFrame("Cashier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(900, 700);
		
		//JPanel for product fields
		JPanel productPanel = new JPanel();
		productPanel.setBounds(0, 0, 900, 500);
		productPanel.setBackground(Color.GRAY);
		
		//button for adding new products
		JButton addButton = new JButton();
		 addButton.addActionListener(e -> {
			 this.marketInventory.setProducts(null);
	     });
		
		//adding frames to the JPanel
		frame.add(productPanel);
	}
}
