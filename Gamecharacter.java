// 20190806 ��ҵ  smh
package com.smh;

import java.util.Random;
import java.util.*;
/*
 * @author smh
 * @since 20190806
 * @version 1.0
 */
public class Gamecharacter {
	// ��������
	// ����
	String name;
	// �Ա�
    char sex;
    // ����
    String races;
    // ְ ҵ
    String job;
    // ����
    int Strength;
    // ����
    int agility;
    // ����
    int physical;
    // ����
    int genuis;
    // �ǻ�
    int intelligence;
    // ����ֵ�� ħ��ֵ
    float health;
    float mana;
   public void Random(){
	  Random a = new Random();
	  int b = a.nextInt(9999);
  }
   public static void main(String[] args) {
	  System.out.println("����һ��RPG��Ϸ");
	  System.out.println("1.��ʼ��Ϸ");
	  System.out.println("2.��Ϸ����");
	  System.out.println("3.������Ϸ");
	  System.out.println("���������Ĳ���");
	  Scanner scanner = new Scanner(System.in);
	  int c = scanner.nextInt();
	  if(c ==1) {
		  System.out.println("������������Ϸ��ɫ����");
		  String d = scanner.next();
		  System.out.println("������������Ϸ��ɫ����");
		  System.out.println("1.���� 2.���� 3.���� 4. ���� 5.Ԫ��");
		  int e = scanner.nextInt();
		  System.out.println("�����ɹ�");
	  }
	  if(c ==2) {
		  System.out.println("��Ϸ����:XXXXXXXXXX");
		  return ;
	  }
	  if(c ==3) {
		  System.out.println("ϵͳ�˳�");
	  }
   }
}
  
