package com.smh;
/**
 * 
 * @author smh
 * @since 20190808
 * @version 1.0
 *
 * 
 *
 */
public class Person {
	String number;
	String name;
	char sex;
	short year;
	boolean married;
	String idNumber;
	String address;
	String telephone;
	Person lover;
	short MAN_YEAR=22;
	short WOMAN_YEAR=20;
	Person(String number,String name,char sex,short year,boolean married,String idNumber,String address,String telephone,Person lover)
	{
		this.number=number;
		this.name=name;
		this.sex=sex;
		this.year=year;
		this.married=married;
		this.idNumber=idNumber;
		this.address=address;
		this.telephone=telephone;
		this.lover=lover;
	}
	boolean marry(Person lover)
	{
		boolean canMarry_Sex=this.sex!=lover.sex;
		boolean canMarry_Year=(this.year>=(this.sex=='男'?MAN_YEAR:WOMAN_YEAR))&&(lover.year>=(lover.sex=='男'?MAN_YEAR:WOMAN_YEAR));
		boolean canMarry_married=(!this.married)&&(!lover.married);
		if(canMarry_Sex&&canMarry_Year&&canMarry_married)
		{
			this.married=true;
			lover.married=true;
			this.lover=lover;
			lover.lover=this;
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("001","4",'男',(short) 22,false,"120103","XXX","34567",null);
		Person p2=new Person("002","1",'女',(short) 22,false,"120104","XXX","23451",null);
		boolean marry = p1.marry(p2);
		System.out.println(marry);
		Person p3=new Person("001","2",'女',(short) 19,false,"120105","XXX","12345",null);
		Person p4=new Person("002","3",'男',(short) 29,false,"120106","XXX","23456",null);
		System.out.println(p3.marry(p4)?"可以结婚":"未达到结婚的要求");
	}
}
