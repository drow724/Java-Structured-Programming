package part2.ex3.데이터구조화;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Exam[] exams= new Exam[3];
	
//		exams[0].kor = 30;
	
//		exams[0] = new Exam();
//		exams[0].kor = 30;
//	
//		System.out.printf("kor:%d", exams[0].kor);
		
		int menu;
		boolean keepLoop = true;

		
		while(keepLoop) {
			menu = inputMenu();
		
			switch(menu) {
		
			case 1: 
			
				inputList(exams);
			
				break;
		
			case 2: 
				printList(exams);
				
				break;
				
			case 3:
				System.out.println("good bye~");
				
				keepLoop = false;;
				break;
				
			default:
				System.out.println("입력 오류 1~3까지만 입력할 수 있습니다.");
			}
		}
	}
			private static void printList(Exam[] exams) {
				System.out.print("⎡            ⎤\n");
				System.out.print("⎢   성적출력   ⎟\n");
				System.out.print("⎣            ⎦\n");
				
				for(int i=0; i<3; i++) {
				Exam exam = exams[i];
				int kor = exam.kor;
				int eng = exam.eng;
				int math = exam.math;
				
				int total = kor+eng+math;
				float avg = total/3.0f;
				
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				
				System.out.printf("총 : %d\n", total);
				System.out.printf("평 : %6.2f\n", avg);
				System.out.println("--------------------");
				}
	}

			static int inputMenu() {
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("\t⎡            ⎤\n");
				System.out.println("\t⎢   메인 메뉴  ⎟\n");
				System.out.println("\t⎣            ⎦\n");
				System.out.println("\t1.성적입력");
				System.out.println("\t2.성적출력");
				System.out.println("\t3.종료");
				System.out.println("\t>");
				int menu = scan.nextInt();
				
				return menu;
			}	

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적입력   ⎟\n");
		System.out.print("⎣            ⎦\n");

		for(int i=0; i<3; i++) {
			
			int kor,eng,math;
	
			do {
				System.out.printf("국어:");
				kor = scan.nextInt();
			
				if(kor<0 || 100<kor)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kor<0 || 100<kor);
			
			do {
				System.out.printf("영어:");
				eng = scan.nextInt();
			
				if(eng<0 || 100<eng)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(eng<0 || 100<eng);
			
			do {
				System.out.printf("수학:");
				math = scan.nextInt();
			
				if(math<0 || 100<math)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(math<0 || 100<math);
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			exams[i] = exam;
		}
	}
}