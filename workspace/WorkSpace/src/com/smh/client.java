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
		  System.out.println("����һ��RPG��Ϸ");
		  System.out.println("============================");
		  System.out.println("1.��ʼ��Ϸ");
		  System.out.println("2.��Ϸ����");
		  System.out.println("3.������Ϸ");
		  System.out.println("4.�鿴��ɫ��Ϣ");
		  System.out.println("5.���ݽ�ɫ���鿴��ɫ��Ϣ");
		  System.out.println("6.�޸Ľ�ɫ��Ϣ");
		  System.out.println("7.ɾ����ɫ��Ϣ");
		  System.out.println("���������Ĳ���");
		  int c = scanner.nextInt();
		  switch (c) {
			case 1:
				// ִ�п�ʼ��Ϸ
				createNewGame();
				break;

			case 2:
				// ִ�������Ϸ����
				gameRules();
				welcome();
				break;
			case 3:
				//ִ�н�����Ϸ
				gameOver();
				break;
			case 4:
				// �鿴���н�ɫ��Ϣ
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
				System.out.println("��������,����������");
				welcome();
				break;
			}
}
	 public static void createNewGame() {
		    Gamecharacter[] players = {};
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������Ϸ��ɫ������:");
			String name = scanner.next();
			System.out.println("��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)");
		    String races = scanner.next();
		    // ������Ϸ��ɫ
		    Gamecharacter gp = new Gamecharacter();
		    gp.name = name;
		    gp.races = races;
		    // ��Ϸ��ɫ��������+1
		    Gamecharacter[] copyOf = Arrays.copyOf(players, players.length+1);
		    copyOf[copyOf.length-1] = gp;
		    if(copyOf != null) {
		    	System.out.println("�����ɹ�");
		    	System.out.println("����Ӣ������:"+gp.name);
		    	System.out.println("����Ӣ�������:"+gp.races);
		    	int power = gp.getStrength();
		    	System.out.println("����Ӣ��������ֵΪ:"+power);
		    	int agility = gp.getStrength();
		    	System.out.println("����Ӣ�����ݳ�ֵΪ:"+agility);
		    	int physicalPower = gp.getStrength();
		    	System.out.println("����Ӣ��������ֵΪ:"+physicalPower);
		    	int genuis = gp.getStrength();
		    	System.out.println("����Ӣ��������ֵΪ:"+genuis);
		    	int intelligence = gp.getStrength();
		    	System.out.println("����Ӣ���ǻ۳�ֵΪ:"+intelligence);
		    }
		    welcome();
		}
	 
	 public static void gameRules() {
			System.out.println("������Ϸ����");
		}
		
		// ������Ϸ�ķ���
	 public static void gameOver() {
			System.exit(0);
		}
	// �鿴���н�ɫ��Ϣ
		private static void printAllCharacters() {
			for(int i=0;i<players.length;i++) {
				System.out.println(players[i]);
			}
			welcome();
		}
		
		// 5.���ݽ�ɫ���鿴��ɫ��Ϣ
		private static void queryCharacterByName() {
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ��ѯ�Ľ�ɫ��:");
			String name = scanner.next();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					System.out.println(players[i]);
				}
			}
			welcome();
		}
		// 6.�޸Ľ�ɫ��Ϣ  ���ݽ�ɫ��ȥ�޸�������Ϣ
		private static void updateCharacterInfoByName() {
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ�޸ĵĽ�ɫ��:");
			String name = scanner.next();
			System.out.println("�������޸ĵ�����:");
			int race = scanner.nextInt();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					// ���޸Ĳ���
					players[i].races.equals(race);
					System.out.println("�޸ĳɹ�");
					System.out.println("�޸ĺ����Ϣ:"+players[i]);
				}
			}
			 welcome();
		}
		
		// 7.ɾ����ɫ��Ϣ
		private static void deleteCharacters() {
//			deletedPlayers = new GamePlayer[players.length-1];
			// Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫɾ���Ľ�ɫ��:");
			String name = scanner.next();
			for(int i=0;i<players.length;i++) {
				if(players[i].name.equals(name)) {
					// ɾ��
					players[i] = players[players.length-1];
					players = Arrays.copyOf(players, players.length-1);
				}
			}
			System.out.println("ɾ�������Ϣ:"+Arrays.toString(players));
			welcome();
		}
}
