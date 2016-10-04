package com.cg;


public class Entry2 {
	public static void main(java.lang.String[] args) {
		java.util.Date d1;
		d1 =  new java.util.Date();
		
		java.sql.Date d2;
		d2 =  new java.sql.Date(d1.getTime());
	
		System.out.println(d2);
		String.intToString(3);
		
		
	}

	private static class String
	{
		private static void intToString(int a) {
			System.out.println(java.lang.String.valueOf(a));
		}
		
	}
}




