package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notice notice1 = new Notice(1,"�ܽ���","����Ա",new Date());
		Notice notice2 = new Notice(2,"����","����Ա",new Date());
		Notice notice3 = new Notice(3,"����","����Ա",new Date());
		
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//��ʾ����
		System.out.println("��ʾ����");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
	}

}