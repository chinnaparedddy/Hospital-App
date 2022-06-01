package com.ty.hospital.app.control;

import java.util.List;

import com.ty.hospital.app.dto.Item;
import com.ty.hospital.app.services.impl.ItemServiceImpl;

public class TestGetItemsByMedOrderId {

	public static void main(String[] args) {

		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		List<Item> items = itemServiceImpl.getAllItemsByMedOrderId(2);
		for (Item item : items) {

			System.out.println(item.getItem_id());
			System.out.println(item.getItem_name());
			System.out.println(item.getItem_cost());
			System.out.println(item.getItem_quntity());
			System.out.println("********************");

		}
	}

}
