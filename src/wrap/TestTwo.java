package wrap;

public class TestTwo {
	public static void main(String[] args) {
		// ������������ת��Ϊ�ַ���
		int t1 = 2;
		String t2 = Integer.toString(t1);
		System.out.println(t2);
		// �ַ���ת��Ϊ������������
		String t3 ="5";
		/**
		 * ����һ��ͨ��parse
		 * ����������ת��Ϊ��װ�࣬Ȼ���ٲ���
		 */
		int t4 = Integer.parseInt(t3);
		
		//������
		int t5 = Integer.valueOf(t3);
		System.out.println(t3);
		System.out.println(t5);
	}
}
