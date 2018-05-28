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
			throw new Exception("我是新产生的异常");
		}
	}
	
	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("我是第二个新产生的异常");
		}
	}
}
