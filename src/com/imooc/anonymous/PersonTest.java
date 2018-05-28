 package com.imooc.anonymous;

public class PersonTest {

	//方案一
//	public void getRead(Man man){
//		man.read();
//	}
//	
//	public void getRead(Woman woman) {
//		woman.read();
//	}
	
	//方案二 不用写两遍，直接调用父类方法
	public void getRead(Person person) {
		person.read();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest test = new PersonTest();
//		Man one = new Man();
//		Woman two = new Woman();
//		
//		test.getRead(one);
//		test.getRead(two);
		//使用匿名内部类
		test.getRead(new Person() {

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("男生喜欢看科幻电影");
			}
			
		});
		
		test.getRead(new Person() {

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("女生喜欢看爱情电影");
			}
			
		});
	}

}
