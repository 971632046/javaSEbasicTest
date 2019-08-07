// 20190806 作业  smh
package com.smh;

import java.util.Random;
import java.util.*;
/**
 * @author smh
 * @since 20190806
 * @version 1.0
 */
public class Gamecharacter {
	// 声明变量
	// 名字
	public String name;
	// 性别
	public char sex;
    // 种族
	public String races;
    // 职 业
	public String job;
    // 力量
	public int Strength;
    // 敏捷
	public int agility;
    // 体力
	public int physicalPower;
    // 智力
	public int genuis;
    // 智慧
	public int intelligence;
    // 生命值和 魔法值
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

  
