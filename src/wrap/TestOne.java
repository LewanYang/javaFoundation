package wrap;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���Զ�װ��  װ����˼���ǰѻ�����������ת���ɰ�װ��
		int t1 = 2;
		Integer t2 = t1;
		//2���ֶ�װ��
		Integer t3 = new Integer(t1);
		
		//����
		System.out.println("t1:"+t1);
		System.out.println("t2:"+t2);
		System.out.println("t3:"+t3);
		
		System.out.println("============");
		
		//����
		//1���Զ�����
		int t4 = t2;
		//2���ֶ�����
		int t5 = t2.intValue();
		double t6 = t2.doubleValue();
		
		//����
		System.out.println(t4+" "+t5+" "+t6);
		
	}

}
