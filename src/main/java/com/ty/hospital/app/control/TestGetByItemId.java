package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Item;
import com.ty.hospital.app.services.impl.ItemServiceImpl;

public class TestGetByItemId {

	public static void main(String[] args) {
		ItemServiceImpl itemServiceImpl=new ItemServiceImpl();
		Item item=itemServiceImpl.getItemById(1);
		if(item!=null) {
			System.out.println(item.getItem_id());
			System.out.println(item.getItem_name());
			System.out.println(item.getItem_cost());
			System.out.println(item.getItem_quntity());
			System.out.println("********************");
		}
	}
}
