package studentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManager extends StudentManager{
		private static int Csid;
		private static String Csname;
	public  CourseManager() {
		
	}
	public  CourseManager(int Csid,String Csname) {
        this.Csid = Csid;
        this.Csname = Csname;
	}
	  static ArrayList<CourseManager> arr1 = new ArrayList<CourseManager>();
	public static void addCourse() {
        int Csid;
        String Csname;
        Scanner sc = new Scanner(System.in);
        System.out.println("������γ�id:");
        Csid = sc.nextInt();
        System.out.println("������γ���:");
        Csname = sc.next();
		arr1.add(new CourseManager(Csid, Csname));
        menu();
    }
	 public static void menu() {
	        System.out.println("--------------ѧ��ѡ�ι���ϵͳ-----------");
	        System.out.println("1.���ӿγ�\n2.�޸Ŀγ� \n3.ɾ���γ� \n4.ͨ��ѧ��ѧ�ţ���ѯ��ѧ��ѡ����� \n5.ͨ���γ̺ţ���ӡ��ǰ�γ�����ѧ����Ϣ\n6.�����ϼ��˵�");
	        Scanner sc = new Scanner(System.in);
	        switch (sc.nextInt()) {
	            case 1:
	            	addCourse();
	                break;
	            case 2:
	                changeCourse();
	                break;
	            case 3:
	                deleteCourse();
	                break;
	            case 4:
	              findCoursetoStudentId();
	                break;
	            case 5:
	               findAlltoCourseId();
	                break;
	            case 6:
	            	StudentManager.menu();
	            	break;
	            default:
	                System.out.println("�����ʽ���淶��");
	                menu();
	                break;
	        }
	    }
	 private static void findAlltoCourseId() {
		// TODO Auto-generated method stub
		
	}
	private static void findCoursetoStudentId() {
		 int i;
	        if (arr.size() != 0) {
	            int j = 0;
	            System.out.println("������ѧ��id!");
	            Scanner sc = new Scanner(System.in);
	            int id = sc.nextInt();
	            for (i = 0; i < arr.size(); i++) {
	                if (arr.get(i).getId() == id) {
	                    j++;
	                    System.out.println("�γ̺�Ϊ:" + arr1.get(i).getCsId() + "��ѧ����ϢΪ:\n--------------------\n"
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
		
	private static void deleteCourse() {
		 if (arr1.size() != 0) {
	            int j = 0;
	            System.out.println("������γ�id!");
	            Scanner sc = new Scanner(System.in);
	            int Csid = sc.nextInt();
	            for (int i = 0; i < arr1.size(); i++) {
	                if (arr1.get(i).getCsId() == Csid) {
	                    int oCsid = arr1.get(i).getCsId();
	                    arr1.remove(i);
	                    System.out.println("idΪ:" + oCsid + "�Ŀγ���Ϣ��ɾ���ɹ���");
	                    menu();
	                    break;
	                }
	                j++;
	            }
	            if (j == 0) {
	                System.out.println("��ϵͳ���޸�id�γ���Ϣ��");
	            }
	        } else {
	            System.out.println("��ϵͳ��ʱ�޿γ���Ϣ��");
	        }
	        menu();
		
	}
	public static void changeCourse() {
		 if (arr1.size() != 0) {
	            int j = 0;
	            System.out.println("������γ�id!");
	            Scanner sc = new Scanner(System.in);
	            int Csid = sc.nextInt();
	            for (int i = 0; i < arr1.size(); i++) {
	                if (arr1.get(i).getCsId() == Csid) {
	                    String Csname;
	                    int CsId;
	                    System.out.println("�������޸ĺ�γ�id:");
	                    CsId = sc.nextInt();
	                    System.out.println("�������޸ĺ�γ�����:");
	                    Csname = sc.next();
	                    arr1.set(i, new CourseManager(Csid,Csname));
	                    j++;
	                    break;
	                }
	            }
	            if (j == 0) {
	                System.out.println("��ϵͳ���޸�id�γ���Ϣ��");
	            }
	        } else {
	            System.out.println("��ϵͳ��ʱ�޿γ���Ϣ��");
	        }
	    }
	private int getCsId() {
		// TODO Auto-generated method stub
		return Csid;
	}
}
