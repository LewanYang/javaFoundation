package com.imooc.trycatch;

public class TryDemoFive {
	public static void main(String args[]) {
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}
	
	public static void testTwo() throws Exception {
		try {
			testOne();
		} catch (HotelAgeException e) {
			// TODO Auto-generated catch block
			throw new Exception("�����²������쳣");
		}
	}
	
	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("���ǵڶ����²������쳣");
		}
	}
}
