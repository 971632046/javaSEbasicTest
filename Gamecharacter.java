// 20190806 ��ҵ  smh
package com.smh;

import java.util.Random;
import java.util.*;
/**
 * @author smh
 * @since 20190806
 * @version 1.0
 */
public class Gamecharacter {
	// ��������
	// ����
	public String name;
	// �Ա�
	public char sex;
    // ����
	public String races;
    // ְ ҵ
	public String job;
    // ����
	public int Strength;
    // ����
	public int agility;
    // ����
	public int physicalPower;
    // ����
	public int genuis;
    // �ǻ�
	public int intelligence;
    // ����ֵ�� ħ��ֵ
	public float health;
	public float mana;
	
    public int getStrength() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
    public int getAgility() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	} 
    public int getPhysicalPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	} 
    public int getGenuis() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	} 
    public int getIntelligence() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
  
  }

  
