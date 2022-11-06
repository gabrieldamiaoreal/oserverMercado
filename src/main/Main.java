package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.Product;
import publisher.MarketInventory;
import subscribers.Cashier;
import subscribers.CashierWindowClient;

public class Main {

	public static void main(String[] args) {
		MarketInventory estoque = new MarketInventory(); //publisher instanciado
		
		Cashier caixa = new Cashier(estoque); // subscriber instanciado e para ele eh passado como argumento o publisher
		//PriceChecker consultaPreco = new PriceChecker(estoque);
		
		estoque.add(caixa); // adicionando na lista de subscribers conhecidos pelo pub
		//estoque.add(consultaPreco);
		
		List<Product> productList = new ArrayList<>();
		Product prod1 = new Product("coca", 5.5f);
		Product prod2 = new Product("bibs", 8.5f);
		Product prod3 = new Product("fanta", 5);
		
		Collections.addAll(productList, prod1, prod2, prod3);
		
		System.out.println("caixa vazio: " + caixa.getCashierProducts());
		
		estoque.setProducts(productList);
		
		System.out.println("caixa apos a insercao dos produtos no estoque e publisher notificar os subscribers: ");
		System.out.println(caixa.getCashierProducts().toString());
		
		CashierWindowClient janelaCaixa = new CashierWindowClient(caixa);
		janelaCaixa.generateCashierWindow();
	}
}
