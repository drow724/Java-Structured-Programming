package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructureProgram {
	
	static int[] kors = new int[3];
	
	public static void main(String[] args) {

		
		int menu;
		boolean keepLoop = true;

		
		while(keepLoop) {
			menu = 메뉴입력();
		
			switch(menu) {
		
			case 1: 
			
				성적입력();
			
				break;
		
			case 2: 
				성적출력();
				
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
	static void 성적출력() {
		
		int total = 0;
		float avg;
		
		for(int i=0; i<3; i++)
			total += kors[i];
		
		avg = (float)(total / 3.0);
		
		System.out.print("\t⎡            ⎤\n");
		System.out.print("\t⎢   성적출력   ⎟\n");
		System.out.print("\t⎣            ⎦\n");
		
		for(int i=0; i<3; i++)
			System.out.printf("\t국어%d : %d\n", 3-i, kors[i]);
		
		
		System.out.printf("\t총 : %d\n", total);
		System.out.printf("\t평 : %6.2f\n", avg);
		System.out.println("\t--------------------");
	}
	
	static int 메뉴입력() {
		
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
	
	static void 성적입력() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\t⎡            ⎤\n");
		System.out.print("\t⎢   성적입력   ⎟\n");
		System.out.print("\t⎣            ⎦\n");

		for(int i=0; i<3; i++)
			do {
				System.out.printf("\t국어%d:", i+1);
				kors[i] = scan.nextInt();
			
				if(kors[i]<0 || 100<kors[i])
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kors[i]<0 || 100<kors[i]);
		
	}
}