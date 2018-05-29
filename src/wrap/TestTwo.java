package wrap;

public class TestTwo {
	public static void main(String[] args) {
		// 基本数据类型转换为字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);
		System.out.println(t2);
		// 字符串转换为基本数据类型
		String t3 ="5";
		/**
		 * 方法一：通过parse
		 * 方法二：先转化为包装类，然后再拆箱
		 */
		int t4 = Integer.parseInt(t3);
		
		//方法二
		int t5 = Integer.valueOf(t3);
		System.out.println(t3);
		System.out.println(t5);
	}
}
