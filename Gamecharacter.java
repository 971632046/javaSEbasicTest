// 20190806 作业  smh
package com.smh;

import java.util.Random;
import java.util.*;
/*
 * @author smh
 * @since 20190806
 * @version 1.0
 */
public class Gamecharacter {
	// 声明变量
	// 名字
	String name;
	// 性别
    char sex;
    // 种族
    String races;
    // 职 业
    String job;
    // 力量
    int Strength;
    // 敏捷
    int agility;
    // 体力
    int physical;
    // 智力
    int genuis;
    // 智慧
    int intelligence;
    // 生命值和 魔法值
    float health;
    float mana;
   public void Random(){
	  Random a = new Random();
	  int b = a.nextInt(9999);
  }
   public static void main(String[] args) {
	  System.out.println("这是一款RPG游戏");
	  System.out.println("1.开始游戏");
	  System.out.println("2.游戏规则");
	  System.out.println("3.结束游戏");
	  System.out.println("请输入您的操作");
	  Scanner scanner = new Scanner(System.in);
	  int c = scanner.nextInt();
	  if(c ==1) {
		  System.out.println("请输入您的游戏角色名字");
		  String d = scanner.next();
		  System.out.println("请输入您的游戏角色种族");
		  System.out.println("1.人类 2.精灵 3.兽人 4. 矮人 5.元素");
		  int e = scanner.nextInt();
		  System.out.println("创建成功");
	  }
	  if(c ==2) {
		  System.out.println("游戏规则:XXXXXXXXXX");
		  return ;
	  }
	  if(c ==3) {
		  System.out.println("系统退出");
	  }
   }
}
  
