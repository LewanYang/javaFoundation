package wrap;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、自动装箱  装箱意思就是把基本数据类型转化成包装类
		int t1 = 2;
		Integer t2 = t1;
		//2、手动装箱
		Integer t3 = new Integer(t1);
		
		//测试
		System.out.println("t1:"+t1);
		System.out.println("t2:"+t2);
		System.out.println("t3:"+t3);
		
		System.out.println("============");
		
		//拆箱
		//1、自动拆箱
		int t4 = t2;
		//2、手动拆箱
		int t5 = t2.intValue();
		double t6 = t2.doubleValue();
		
		//测试
		System.out.println(t4+" "+t5+" "+t6);
		
	}

}
