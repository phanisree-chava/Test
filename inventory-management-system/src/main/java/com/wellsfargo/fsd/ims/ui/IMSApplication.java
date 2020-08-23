package com.wellsfargo.fsd.ims.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.wellsfargo.fsd.ims.entity.Item;
import com.wellsfargo.fsd.ims.service.ItemService;
import com.wellsfargo.fsd.ims.service.ItemServiceImpl;
import com.wellsfrago.fsd.ims.exception.ImsException;

public class IMSApplication {
	
	public static final Scanner scanner = new Scanner(System.in);
	public static final ItemService itemservice = new ItemServiceImpl();
public static void main(String[] args)
{
	Menu menu = null;
	while(menu !=Menu.QUIT)
	{System.out.println("choice operation");
		
		for (Menu m:Menu.values())
		{
			System.out.println(m.ordinal()+"\t" +m);
		}
		System.out.println("choice");
		int ordinal =scanner.nextInt();
		if(ordinal<0 || ordinal>=Menu.values().length)
		{System.out.println("unknown choice");
			menu =null;
		}else
		{
			menu =Menu.values()[ordinal];
			switch(menu)
			{
			case ADD: doAdd();
			break;
			case DELETE:doDelete();
			break;
			case FIND:doFind();
				break;
			case LIST:doList();
				break;
			}
		}
		
		}
	
	System.out.println("APPLICATION TERMINATED");
	}
private static void doFind() {
	System.out.println("icode");
	int icode =scanner.nextInt();
	try {
		Item item = itemservice.getItemById(icode);
				
	if(item==null)
	{
		System.out.println("no records in the database");
	}else {
		System.out.println(item);
	}
}
	catch (ImsException e)
	{
		System.out.println(e.getMessage());
	}
	
}


private static void doDelete()
{
	System.out.println("code");
	int icode = scanner.nextInt();
	try {
		boolean isDeleted = itemservice.deleteItem(icode);
		
		if(isDeleted)
		{
			System.out.println("no item");
		}
		else {
			System.out.println(isDeleted);
	}}
		catch(ImsException e)
		{
			System.out.println(e.getMessage());
		}
}

private static void doAdd()
{
	
	Item item = new Item();
	
	System.out.println("Icode");
	item.setIcode(scanner.nextInt());

	System.out.println("Title");
	item.setTitle(scanner.next());
	
	/*
	 * System.out.println("PackageDate")
	 * item.setpackageDate(LocalDate.parse(scanner.next()));
	 */
	
	System.out.println("Unit");
	item.setUnit(scanner.next());
	System.out.println("Fragile");
	item.setFargile(scanner.nextBoolean());
	System.out.println("costPrice");
	item.setCostprice(scanner.nextDouble());

	System.out.println("sellingPrice");
	item.setSellingPrice(scanner.nextDouble());
}

private static void doList()
{
	try {
		List<Item> items = itemservice.getAllItems();
		
		if(items==null)
		{
			System.out.println("no records in the database");
		}
	
else			
	{ 
	for(Item item : items)
	
	{
		System.out.println(item);
	}
	}
	}
	
	catch(ImsException e)
	{
		System.out.println(e.getMessage());
	}
	}

}

