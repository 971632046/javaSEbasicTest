package studentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<School> arr = new ArrayList<School>();
	 
    public static void main(String[] args) {
        menu();
    }
 
    //������
    public static void menu() {
        System.out.println("--------------ѧ��ѡ�ι���ϵͳ-----------");
        System.out.println("1.���ѧ��\n2.�޸�ѧ����Ϣ\n3.ɾ��ѧ��\n4.����ѧ����Ų�ѯ\n5.��ѯȫ��ѧ����Ϣ\n6.�γ̹��� \n7.�˳�");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                 add();
                break;
            case 2:
                change();
                break;
            case 3:
                delete();
                break;
            case 4:
                findId();
                break;
            case 5:
                findAll();
                break;
            case 6:
            	CourseManager.menu();
            	break;
            case 7:
                System.out.println("��ӭ�´�ʹ�ñ�ϵͳ��");
                break;
            default:
                System.out.println("�����ʽ���淶��");
                menu();
                break;
        }
    }
 
    //��ѯȫ��ѧ����Ϣ
    public static void findAll() {
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("ѧ��Ϊ:" + arr.get(i).getId() + "��ѧ����ϢΪ:\n--------------------\n"
                        + "����:" + arr.get(i).getName() + "\n����Ϊ:" + arr.get(i).getAge() + "\n�Ա�Ϊ:"
                        + arr.get(i).getSex() + "\n--------------------\n\n");
            }
        } else {
            System.out.println("��ϵͳ��ʱ��ѧ����Ϣ��");
 
        }
        menu();
    }
 
    //����ѧ��id��ѯѧ����Ϣ
    public static void findId() {
        int i;
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("������ѧ��id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    j++;
                    System.out.println("ѧ��Ϊ:" + arr.get(i).getId() + "��ѧ����ϢΪ:\n--------------------\n"
                            + "����:" + arr.get(i).getName() + "\n����Ϊ:" + arr.get(i).getAge() + "\n�Ա�Ϊ:"
                            + arr.get(i).getSex() + "\n--------------------\n\n");
                    break;
                }
            }
            if (j == 0) {
                System.out.println("��ϵͳ��ʱ�޸�idѧ����Ϣ!");
            }
        } else {
            System.out.println("��ϵͳ��ʱ��ѧ����Ϣ��");
        }
        menu();
 
    }
 
    //���ѧ����Ϣ
    public static void add() {
        int id;
        String name;
        int age;
        String sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��id(����):");
        id = sc.nextInt();
        System.out.println("������ѧ������:");
        name = sc.next();
        System.out.println("������ѧ�����䣨������:");
        age = sc.nextInt();
        System.out.println("������ѧ���Ա�:");
        sex = sc.next();
		arr.add(new School(id, name, age, sex));
        menu();
    }
 
    //�޸�ѧ����Ϣ
    public static void change() {
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("������ѧ��id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    String name;
                    int age;
                    String sex;
                    System.out.println("�������޸ĺ�ѧ������:");
                    name = sc.next();
                    System.out.println("�������޸ĺ�ѧ������:");
                    age = sc.nextInt();
                    System.out.println("�������޸ĺ�ѧ���Ա�:");
                    sex = sc.next();
                    arr.set(i, new School(id, name, age, sex));
                    j++;
                    break;
                }
            }
            if (j == 0) {
                System.out.println("��ϵͳ���޸�idѧ����Ϣ��");
            }
        } else {
            System.out.println("��ϵͳ��ʱ��ѧ����Ϣ��");
        }
        menu();
    }
 
    //����idɾ��ѧ����Ϣ
    public static void delete() {
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("������ѧ��id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    int oid = arr.get(i).getId();
                    arr.remove(i);
                    System.out.println("ѧ��Ϊ:" + oid + "��ѧ����Ϣ��ɾ���ɹ���");
                    menu();
                    break;
                }
                j++;
            }
            if (j == 0) {
                System.out.println("��ϵͳ���޸�idѧ����Ϣ��");
            }
        } else {
            System.out.println("��ϵͳ��ʱ��ѧ����Ϣ��");
        }
        menu();
    }


}
