package demo;

import java.util.Scanner;
/*
 	提示：
	1.需要判断是否是闰年，2月份的天数跟是否是闰年有关系；
	2.用switch-case判断每个月的天数
	
	*/
public class Demo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		
		int dayNum = theDayNum(month); //先根据月份得出天数，如果是闰年，对2月份的天数重新获取
		
		if(isLeapYear(year)){
			if(month == 2){
				dayNum ++;  //如果是闰年，2月份增加一天
			}
			System.out.print(year + "是闰年，");
		}else{
			System.out.print(year + "不是闰年，");
		}
		
		System.out.println(year + "年" + month + "月份共有" + dayNum + "天");
	}
	
	/*判断是否是闰年
	 * 能被4整除但不能被100整除，或者能被400整除，是闰年
	 */
	public static  boolean  isLeapYear(int year) {
		if((year % 4 ==0 && year % 100 !=0) || year%400 ==0){
			return true;
		}else{
			return false;
	   }
	}
	
     /*判断天数*/
	public  static int theDayNum(int month) {
		switch (month) {
        case 1:  
            return 31;  
        case 2:  
            return 28;  
        case 3:  
            return 31;  
        case 4:  
            return 30;  
        case 5:  
            return 31;  
        case 6:  
            return 30;  
        case 7:  
            return 31;  
        case 8:  
            return 31;  
        case 9:  
            return 30;  
        case 10:  
            return 31;  
        case 11:  
            return 30;  
        case 12:  
            return 31;  
        default:  
        	System.out.println("对不起，您输入的月份有误！");  
        	return 0; 
		}
		
	}
}