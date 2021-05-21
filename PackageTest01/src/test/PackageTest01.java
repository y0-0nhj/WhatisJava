package test;

// 패키지의 역할
// 1. 클래스를 나누어 관리.
// 2. 사용자에 따라 접근을 제어.

// 클래스 앞에 public 사용하는 유무에 따라
// 1. public 접근 권한(access) : 어디서나, 누구에게나 사용할 수 있는 접근 권한
// 2. package 접근 권한(access), default 접근 권한 : 같은 package에서만 사용할 수 있는 접근 권한

import calc.Calc; // 단순명 import
//import calc.*; // on-demand import

public class PackageTest01 {
	public static void main(String[] args) {
		//calc.Calc c1 = new calc.Calc();
		Calc c1 = new Calc();
		
		//System.out.println(c1.add(10,  20));
		System.out.println(c1.multiply(20, 30));
	}

}
