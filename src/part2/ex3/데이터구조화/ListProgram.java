package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ListProgram {
	
	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.exams= new Exam[3];
		list.current = 0;	
		
		int menu;
		boolean keepLoop = true;

		
		while(keepLoop) {
			menu = inputMenu();
		
			switch(menu) {
		
			case 1: 
			
				inputList(list);
			
				break;
		
			case 2: 
				printList(list);
				
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
			private static void printList(ExamList list) {
				System.out.print("⎡            ⎤\n");
				System.out.print("⎢   성적출력   ⎟\n");
				System.out.print("⎣            ⎦\n");
				
				int size = list.current;
				Exam[] exams = list.exams; 
				
				for(int i=0; i<size; i++) {
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

	private static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적입력   ⎟\n");
		System.out.print("⎣            ⎦\n");
			
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
			
			Exam[] exams = list.exams;
			int size = list.current;
			
			if(exams.length == size) {
				//1.크기가 5개 정도 더 새로운 배열을 생성하시오.
				Exam[] temp = new Exam[list.exams.length + 5];
				//2.값을 이주시키기
				for(int i =0; i<size; i++)
					temp[i] = exams[i];
				//3. list.exams가 새로만든 temp 배열을 참조하도록 한다.
				list.exams = temp;
				
				
			}
			
			list.exams[list.current] = exam;
			list.current++;
			
	}
}