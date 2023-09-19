package com.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class FruitMarketApp {
	
	@Autowired
	@Qualifier("appleFruit")
	Fruit f;
	
	public static void main(String[] args) {
		  AnnotationConfigApplicationContext     context = new AnnotationConfigApplicationContext(FruitMarketApp.class);
		  FruitMarketApp fruitMarket = context.getBean(FruitMarketApp.class);
		  fruitMarket.showFruit();
		  }
	public void showFruit() {
	f.showFruit();	
	}
}

 interface Fruit {
void showFruit();

}


@Component("mangoFruit")
@Primary
 class Mango implements Fruit {
	public Mango() 
	{
		
	}
	
	@Override
	public String toString() {
		return "Mango";
	}
	public void showFruit() {
	System.out.println("This is Mango");	
	}


}

@Component("appleFruit")

 class Apple implements Fruit {
	public void Mango() 
	{
		
	}
	
	@Override
	public String toString() {
		return "Apple";
	}
	public void showFruit() {
	System.out.println("This is Apple");	
	}


}
