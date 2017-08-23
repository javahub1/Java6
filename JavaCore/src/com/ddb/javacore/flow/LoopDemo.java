package com.ddb.javacore.flow;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// while循环 ----先判断条件，再决定是否执行循环
		//int i = 1;
		/*while (i <= 100) {
			System.out.println("第" + i + "遍:好好学习，天天向上！");
			// i = i + 1;
			// i += 1;
			i++;
		}*/
		
		// do...while循环，先执行循环体一次，然后再判断循环条件是否成立----有点类似与先斩后奏
//		int i = 101;
//		do {
//			System.out.println("第" + i + "遍:好好学习，天天向上！");
//			i ++;
//		} while (i<=100);
		
		/*
		 * 总结：
		 * do...while循环可以替代while循环，
		 * 两者区别是，do...while至少执行一次循环体，while可能一次都不会执行！
		 */
	
		//传统的for循环
//		int i;
//		for (i=1; i <=100; i++) {
//			System.out.println("第" + i + "遍:好好学习，天天向上！");
//			//i++;	//自增在循环体中也是可以的
//		}
		
		//for循环的初始变量可以在for外面定义，也可以在括号里定义
//		for (int j = 1; j <= 100; j++) {
//			System.out.println("第" + j + "遍:好好学习，天天向上！");
//		}
		
		//计算5门课程的平均分
//		int sum=0;	//表示5门课程的成绩总和
//		Scanner input = new Scanner(System.in);
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("请输入5门课程的第"+i +"门课程成绩：");
//			sum += input.nextInt();
//		}
//		System.out.println("5门课程的平均分为："+ (sum/5));
//		int avg = sum / 5;
//		System.out.println("5门课程的平均分为："+ avg);
		
		//多初始值for循环
//		final int SUM = 6;
//		for (int i = 0,j = SUM; i <= SUM; i++,j--) {
//			System.out.println(i+" + "+ j + " = " + (i + j));
//		}
		
		// 打印矩形，嵌套循环
//		for (int i = 0; i <= 3; i++) {
//			System.out.print("*");
//			for (int j = 0; j <= 7; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 增强for循环 foreach用来遍历数组或者容器
		//定义一个String类型的数组，含有四个初始元素！
		String[] array = {"AA","BB","CC","DD"}; 
		//冒号后面的是容器，冒号前面的是当次循环的元素。当次循环的的元素要有类型的声明
		for (String string : array) {
			System.out.println(string);
		}
		
	}

}
