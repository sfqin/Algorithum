package com.wangyi;

import java.util.Scanner;

/**
 * 
 * @author qinzhe
 * 	幼儿园有n个小朋友排成一个队伍 从左到右 编号 0 到n-1
 *	其中一些事男一些是女  男用B表示 女用G表示
 *	当一个男生挨着的是女生就会发生矛盾  所以
 *	男生挨着女生或者女生挨着男生情况最少  
 *	你只能再原来的队形上进心调整 需要计算出最少需要调整多少次可以让上述
 *	情况最少  
 *	列如  GGBBG--》GGBGB-》GGGBB这样需要调整两次  这样就使之前的两处男女相邻变为一处相邻，需要调整队形2次 
 *	输入包括一个长度为n且只报含 G和B的字符串  n不超过50
 *	输出最少多少次
 */
public class Main2 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		scanner.close();
		String str = "GGBBBG";
		String[] stt = str.split("B");
		int i = 2;
		System.out.println(stt[0]+" hao");
		System.out.println(stt[1]+" hao");
		System.out.println(stt[2]+" hao");
		System.out.println(stt[3]+" hao");
	}
}
