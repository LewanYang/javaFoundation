package com.imooc.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		//����һ���ַ���;
		String str = new String("JAVA �ܽ��� ������");
		//���ַ���ת����byte����
		byte[] arrs = str.getBytes();
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
		
		System.out.println();
		//��byte������ת�����ַ���
		String str1 = new String(arrs);
		System.out.print(str1);
		
	}
}
