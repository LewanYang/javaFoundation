package com.imooc.stringdemo;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		StringBuilder str = new StringBuilder("���");
		//��'���'�����������,���ַ�����ɡ���ã�imooc��
		str.append(",");
		str.append("imooc");
		System.out.println("str="+str);
		
		//�ĳ�iMOOC\
		//����һ��
		System.out.println("�滻��"+str.delete(4, 8).insert(4, "MOOC"));
		//��������
		System.out.println(str.replace(4, 8, "MOOC"));
		
		//���ַ�����'��ã�iMOOC'��ȡ��'���'�����
		System.out.println(str.substring(0,2));
		
	}
}
