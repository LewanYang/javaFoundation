package com.imooc.earth;

public class Earth {
	/**
	 * ����ʹ������ʽ
	 * ����ʵ�����󴴽�ʱ����ֱ�ӳ�ʼ����ֱ����һ�ε���get����ʱ������ɳ�ʼ��������
	 */
	
	// 1���������е�˽�й���
	private Earth() {
		
	}
	
	//2�����������͵�˽�о�̬ʵ��
	private static Earth earth = null;
	
	//3���������о�̬�������ؾ�̬ʵ������
	public static Earth getEarth() {
		if(earth == null) {
			earth = new Earth();
		}
		return earth;
	}
}
