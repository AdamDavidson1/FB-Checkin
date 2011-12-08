package com.gatevo.fbcheckin.models;

import android.content.Context;

import com.gatevo.aframe.DatabaseModel;

public class UserModel extends DatabaseModel{
	private static String[] columns = { 
										"id INTEGER PRIMARY KEY AUTOINCREMENT",
										"username TEXT",
										"added_datetime DATE"
									  };
	private static String tableName = "example";
	
	public UserModel(Context context){
		super(context, columns, tableName);
	}
	
}