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
        System.out.println("请输入课程id:");
        Csid = sc.nextInt();
        System.out.println("请输入课程名:");
        Csname = sc.next();
		arr1.add(new CourseManager(Csid, Csname));
        menu();
    }
	 public static void menu() {
	        System.out.println("--------------学生选课管理系统-----------");
	        System.out.println("1.增加课程\n2.修改课程 \n3.删除课程 \n4.通过学生学号，查询该学生选课情况 \n5.通过课程号，打印当前课程下面学生信息\n6.返回上级菜单");
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
	                System.out.println("输入格式不规范！");
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
	            System.out.println("请输入学生id!");
	            Scanner sc = new Scanner(System.in);
	            int id = sc.nextInt();
	            for (i = 0; i < arr.size(); i++) {
	                if (arr.get(i).getId() == id) {
	                    j++;
	                    System.out.println("课程号为:" + arr1.get(i).getCsId() + "的学生信息为:\n--------------------\n"
	                            + "姓名:" + arr.get(i).getName() + "\n年龄为:" + arr.get(i).getAge() + "\n性别为:"
	                            + arr.get(i).getSex() + "\n--------------------\n\n");
	                    break;
	                }
	            }
	            if (j == 0) {
	                System.out.println("本系统暂时无该id学生信息!");
	            }
	        } else {
	            System.out.println("本系统暂时无学生信息！");
	        }
	        menu();
	 
	    }
		
	private static void deleteCourse() {
		 if (arr1.size() != 0) {
	            int j = 0;
	            System.out.println("请输入课程id!");
	            Scanner sc = new Scanner(System.in);
	            int Csid = sc.nextInt();
	            for (int i = 0; i < arr1.size(); i++) {
	                if (arr1.get(i).getCsId() == Csid) {
	                    int oCsid = arr1.get(i).getCsId();
	                    arr1.remove(i);
	                    System.out.println("id为:" + oCsid + "的课程信息已删除成功！");
	                    menu();
	                    break;
	                }
	                j++;
	            }
	            if (j == 0) {
	                System.out.println("本系统暂无该id课程信息！");
	            }
	        } else {
	            System.out.println("本系统暂时无课程信息！");
	        }
	        menu();
		
	}
	public static void changeCourse() {
		 if (arr1.size() != 0) {
	            int j = 0;
	            System.out.println("请输入课程id!");
	            Scanner sc = new Scanner(System.in);
	            int Csid = sc.nextInt();
	            for (int i = 0; i < arr1.size(); i++) {
	                if (arr1.get(i).getCsId() == Csid) {
	                    String Csname;
	                    int CsId;
	                    System.out.println("请输入修改后课程id:");
	                    CsId = sc.nextInt();
	                    System.out.println("请输入修改后课程名称:");
	                    Csname = sc.next();
	                    arr1.set(i, new CourseManager(Csid,Csname));
	                    j++;
	                    break;
	                }
	            }
	            if (j == 0) {
	                System.out.println("本系统暂无该id课程信息！");
	            }
	        } else {
	            System.out.println("本系统暂时无课程信息！");
	        }
	    }
	private int getCsId() {
		// TODO Auto-generated method stub
		return Csid;
	}
}
