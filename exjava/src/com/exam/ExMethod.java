package com.exam;

public class ExMethod {
	public static void main(String[] args) {
//		System.out.println("********************");
//		System.out.println("* 포로리님 환영합니다. *");
//		System.out.println("********************");
//		
//		System.out.println("********************");
//		System.out.println("* 너부리님 환영합니다. *");
//		System.out.println("********************");
//		
//		System.out.println("********************");
//		System.out.println("* 호랭이님 환영합니다. *");
//		System.out.println("********************");
		
		welcome( "포로리" );
		welcome( "너부리" );
		welcome( "호랭이" );
		
		double a = multi(2,3);
		System.out.println( a );
		//여기서만 필요할때 a를 따로 사용하지 않고 바로 넣어서 사용 
		System.out.println( multi(2,3) );
	}
	//2개의 숫자를 받아서, 두 수를 곱한 결과를 돌려주는
	//multi 함수를 정의하세요.

	public static double multi(double x, double y) {
		double z = x * y;
		return z;
	}
	
	public static void welcome(String name){
		System.out.println("********************");
		System.out.println("* " + name + "님 환영합니다. *");
		System.out.println("********************");
	}
	
}
	
	
//한숟가락먹어라(){
//	숟가락을 들어라;
//	밥을 떠라;
//	입을 벌려라;
//	입에 숟가락을 넣어라;
//	숟가락을 놓아라;
//}



//다음과 같이 출력되도록 프로그램을 작성
//********************
//* 포로리님 환영합니다. *
//********************
//********************
//* 너부리님 환영합니다. *
//********************
//********************
//* 호랭이님 환영합니다. *
//********************