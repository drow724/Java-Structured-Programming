package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int[] kors = new int[3];
		int total = 0;
		float avg;
		int menu;
		boolean keepLoop = true;

		Scanner scan = new Scanner(System.in);
		
		

		while(true) {
		//----------메인 메뉴 부분-----------
		System.out.println("\t⎡            ⎤\n");
		System.out.println("\t⎢   메인 메뉴  ⎟\n");
		System.out.println("\t⎣            ⎦\n");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("\t>");
		menu = scan.nextInt();
		
		switch(menu) {
		
		case 1: 

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
			
		break;
		
		case 2: 
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
}