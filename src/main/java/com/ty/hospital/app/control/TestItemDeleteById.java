package com.ty.hospital.app.control;

import com.ty.hospital.app.services.impl.ItemServiceImpl;

public class TestItemDeleteById {

	public static void main(String[] args) {

		ItemServiceImpl itemServiceImpl =new ItemServiceImpl();
		if(itemServiceImpl.deleteItemById(1)){
			System.out.println("deleted");
		}else {
			System.out.println("Not deleted");
		}
	}

}
