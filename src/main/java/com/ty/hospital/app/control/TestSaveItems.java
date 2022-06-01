package com.ty.hospital.app.control;

import com.ty.hospital.app.dao.impl.ItemImpl;
import com.ty.hospital.app.dto.Item;
import com.ty.hospital.app.services.impl.ItemServiceImpl;

public class TestSaveItems {

	public static void main(String[] args) {

		Item item=new Item();
		item.setItem_name("parasetmal");
		item.setItem_quntity(2);
		item.setItem_cost(15);
		ItemServiceImpl itemServiceImpl=new ItemServiceImpl();
		itemServiceImpl.saveItem(1, item);
	}

}
