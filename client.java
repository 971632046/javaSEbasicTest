package com.smh;
/**
 * @author smh
 * @since 20190807
 * @version 1.0
 */
import java.util.Arrays;
import java.util.Scanner;

public class client {
	public static void main(String[] args) {
		welcome();
	}
	 public static void welcome() {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("============================");
		  System.out.println("这是一款RPG游戏");
		  System.out.println("============================");
		  System.out.println("1.开始游戏");
		  System.out.println("2.游戏规则");
		  System.out.println("3.结束游戏");
		  System.out.println("请输入您的操作");
		  int c = scanner.nextInt();
		  switch (c) {
			case 1:
				// 执行开始游戏
				createNewGame();
				break;

			case 2:
				// 执行输出游戏规则
				gameRules();
				welcome();
				break;
			case 3:
				//执行结束游戏
				gameOver();
				break;
			default:
				System.out.println("输入有误,请重新输入");
				welcome();
				break;
			}
}
	 public static void createNewGame() {
		    Gamecharacter[] players = {};
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入您游戏角色的姓名:");
			String name = scanner.next();
			System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)");
		    String races = scanner.next();
		    // 构建游戏角色
		    Gamecharacter gp = new Gamecharacter();
		    gp.name = name;
		    gp.races = races;
		    // 游戏角色容器长度+1
		    Gamecharacter[] copyOf = Arrays.copyOf(players, players.length+1);
		    copyOf[copyOf.length-1] = gp;
		    if(copyOf != null) {
		    	System.out.println("创建成功");
		    	System.out.println("您的英雄名叫:"+gp.name);
		    	System.out.println("您的英雄种族叫:"+gp.races);
		    	int power = gp.getStrength();
		    	System.out.println("您的英雄力量初值为:"+power);
		    	int agility = gp.getStrength();
		    	System.out.println("您的英雄敏捷初值为:"+agility);
		    	int physicalPower = gp.getStrength();
		    	System.out.println("您的英雄体力初值为:"+physicalPower);
		    	int genuis = gp.getStrength();
		    	System.out.println("您的英雄智力初值为:"+genuis);
		    	int intelligence = gp.getStrength();
		    	System.out.println("您的英雄智慧初值为:"+intelligence);
		    }
		    welcome();
		}
	 
	 public static void gameRules() {
			System.out.println("这是游戏规则");
		}
		
		// 结束游戏的方法
	 public static void gameOver() {
			System.exit(0);
		}
}
