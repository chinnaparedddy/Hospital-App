package com.ty.hospital.app.services;

import java.util.List;

import com.ty.hospital.app.dto.Item;

public interface ItemService {

	Item saveItem(int medOrder_id, Item item);

	Item getItemById(int item_id);

	Item updateItemById(int item_id, Item item);

	boolean deleteItemById(int item_id);

	List<Item> getAllItemsByMedOrderId(int medOrder_id);
}
