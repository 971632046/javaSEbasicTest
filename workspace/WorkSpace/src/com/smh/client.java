package com.smh;
/**
 * @author smh
 * @since 20190806
 * @version 1.0
 * @since 20190807
 * @version 1.0
 */
import java.util.Arrays;
import java.util.Scanner;

public class client {
	static Gamecharacter[] players = {};
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
		  System.out.println("4.查看角色信息");
		  System.out.println("5.根据角色名查看角色信息");
		  System.out.println("6.修改角色信息");
		  System.out.println("7.删除角色信息");
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
			case 4:
				// 查看所有角色信息
				printAllCharacters();
				break;
			case 5:
				queryCharacterByName();
				break;
			case 6:
				updateCharacterInfoByName();
				break;
			case 7:
				deleteCharacters();
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
	// 查看所有角色信息
		private static void printAllCharacters() {
			for(int i=0;i<players.length;i++) {
				System.out.println(players[i]);
			}
			welcome();
		}
		
		// 5.根据角色名查看角色信息
		private static void queryCharacterByName() {
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要查询的角色名:");
			String name = scanner.next();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					System.out.println(players[i]);
				}
			}
			welcome();
		}
		// 6.修改角色信息  根据角色名去修改种族信息
		private static void updateCharacterInfoByName() {
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要修改的角色名:");
			String name = scanner.next();
			System.out.println("请输入修改的种族:");
			int race = scanner.nextInt();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					// 做修改操作
					players[i].races.equals(race);
					System.out.println("修改成功");
					System.out.println("修改后的信息:"+players[i]);
				}
			}
			 welcome();
		}
		
		// 7.删除角色信息
		private static void deleteCharacters() {
//			deletedPlayers = new GamePlayer[players.length-1];
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要删除的角色名:");
			String name = scanner.next();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					// 删除
					players[i] = players[players.length-1];
					players = Arrays.copyOf(players, players.length-1);
				}
			}
			System.out.println("删除后的信息:"+Arrays.toString(players));
			welcome();
		}
}
