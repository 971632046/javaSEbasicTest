package studentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<School> arr = new ArrayList<School>();
	 
    public static void main(String[] args) {
        menu();
    }
 
    //主方法
    public static void menu() {
        System.out.println("--------------学生选课管理系统-----------");
        System.out.println("1.添加学生\n2.修改学生信息\n3.删除学生\n4.根据学生编号查询\n5.查询全部学生信息\n6.课程管理 \n7.退出");
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
                System.out.println("欢迎下次使用本系统！");
                break;
            default:
                System.out.println("输入格式不规范！");
                menu();
                break;
        }
    }
 
    //查询全部学生信息
    public static void findAll() {
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("学号为:" + arr.get(i).getId() + "的学生信息为:\n--------------------\n"
                        + "姓名:" + arr.get(i).getName() + "\n年龄为:" + arr.get(i).getAge() + "\n性别为:"
                        + arr.get(i).getSex() + "\n--------------------\n\n");
            }
        } else {
            System.out.println("本系统暂时无学生信息！");
 
        }
        menu();
    }
 
    //根据学生id查询学生信息
    public static void findId() {
        int i;
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("请输入学生id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    j++;
                    System.out.println("学号为:" + arr.get(i).getId() + "的学生信息为:\n--------------------\n"
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
 
    //添加学生信息
    public static void add() {
        int id;
        String name;
        int age;
        String sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id(整数):");
        id = sc.nextInt();
        System.out.println("请输入学生姓名:");
        name = sc.next();
        System.out.println("请输入学生年龄（整数）:");
        age = sc.nextInt();
        System.out.println("请输入学生性别:");
        sex = sc.next();
		arr.add(new School(id, name, age, sex));
        menu();
    }
 
    //修改学生信息
    public static void change() {
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("请输入学生id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    String name;
                    int age;
                    String sex;
                    System.out.println("请输入修改后学生姓名:");
                    name = sc.next();
                    System.out.println("请输入修改后学生年龄:");
                    age = sc.nextInt();
                    System.out.println("请输入修改后学生性别:");
                    sex = sc.next();
                    arr.set(i, new School(id, name, age, sex));
                    j++;
                    break;
                }
            }
            if (j == 0) {
                System.out.println("本系统暂无该id学生信息！");
            }
        } else {
            System.out.println("本系统暂时无学生信息！");
        }
        menu();
    }
 
    //根据id删除学生信息
    public static void delete() {
        if (arr.size() != 0) {
            int j = 0;
            System.out.println("请输入学生id!");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == id) {
                    int oid = arr.get(i).getId();
                    arr.remove(i);
                    System.out.println("学号为:" + oid + "的学生信息已删除成功！");
                    menu();
                    break;
                }
                j++;
            }
            if (j == 0) {
                System.out.println("本系统暂无该id学生信息！");
            }
        } else {
            System.out.println("本系统暂时无学生信息！");
        }
        menu();
    }


}
