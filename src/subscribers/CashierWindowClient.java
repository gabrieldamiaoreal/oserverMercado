package subscribers;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CashierWindowClient extends JFrame {

	private Cashier cashier;
	private String[] productsArray;
	
	public CashierWindowClient(Cashier cashier){
		this.cashier = cashier;
	}
	
	public void generateCashierWindow(){
		
		//setting JFrame for cashier window client
		JFrame frame = new JFrame("Cashier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(900, 700);
		
		//JPanel for products
		JPanel productPanel = new JPanel();
		productPanel.setBounds(0, 0, 900, 500);
		productPanel.setBackground(Color.GRAY);
		
		//adding frames to the JPanel
		frame.add(productPanel);
	}
}
