 package com.imooc.anonymous;

public class PersonTest {

	//����һ
//	public void getRead(Man man){
//		man.read();
//	}
//	
//	public void getRead(Woman woman) {
//		woman.read();
//	}
	
	//������ ����д���飬ֱ�ӵ��ø��෽��
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
		//ʹ�������ڲ���
		test.getRead(new Person() {

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("����ϲ�����ƻõ�Ӱ");
			}
			
		});
		
		test.getRead(new Person() {

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("Ů��ϲ���������Ӱ");
			}
			
		});
	}

}
