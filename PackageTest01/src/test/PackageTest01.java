package test;

// ��Ű���� ����
// 1. Ŭ������ ������ ����.
// 2. ����ڿ� ���� ������ ����.

// Ŭ���� �տ� public ����ϴ� ������ ����
// 1. public ���� ����(access) : ��𼭳�, �������Գ� ����� �� �ִ� ���� ����
// 2. package ���� ����(access), default ���� ���� : ���� package������ ����� �� �ִ� ���� ����

import calc.Calc; // �ܼ��� import
//import calc.*; // on-demand import

public class PackageTest01 {
	public static void main(String[] args) {
		//calc.Calc c1 = new calc.Calc();
		Calc c1 = new Calc();
		
		//System.out.println(c1.add(10,  20));
		System.out.println(c1.multiply(20, 30));
	}

}
