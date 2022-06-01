package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.ItemImpl;
import com.ty.hospital.app.dto.Item;
import com.ty.hospital.app.services.ItemService;

public class ItemServiceImpl implements ItemService {

	ItemImpl itemImpl=new ItemImpl();
	public Item saveItem(int medOrder_id, Item item) {
		return itemImpl.saveItem(medOrder_id, item);
	}

	public Item getItemById(int item_id) {
		return itemImpl.getItemById(item_id);
	}

	public Item updateItemById(int item_id, Item item) {
		return itemImpl.updateItemById(item_id, item);
	}

	public boolean deleteItemById(int item_id) {
		return itemImpl.deleteItemById(item_id);
	}

	public List<Item> getAllItemsByMedOrderId(int medOrder_id) {
		return itemImpl.getAllItemsByMedOrderId(medOrder_id);
	}

}
