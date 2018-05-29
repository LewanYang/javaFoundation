package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notice notice1 = new Notice(1,"周杰伦","管理员",new Date());
		Notice notice2 = new Notice(2,"穆勒","足球员",new Date());
		Notice notice3 = new Notice(3,"哈登","篮球员",new Date());
		
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//显示公告
		System.out.println("显示公告");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
		
		//添加和显示
		
		System.out.println("==================================");
		// 再第一条公告后面添加一条新公告
		Notice notice4 =new Notice(4,"在线编辑可以使用","管理员",new Date());
		noticeList.add(1, notice4);
		
		System.out.println("显示公告");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
		
		System.out.println("==================================");
		noticeList.remove(2);
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
		
		System.out.println("==================================");
		//修改第二条公告中的title值
		notice4.setTitle("修改过后");
		// 使用ArrayList中的set方法：
		noticeList.set(1, notice4);
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(i+1+":"+((Notice)(noticeList.get(i))).getTitle());
		}
	
		
		
	}
}
