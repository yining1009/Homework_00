package hw2;

public class Homework_02 {

	
	public static void main(String[] args) {
		
//		//第一題:請設計一隻Java程式，計算1~1000的偶數和(2+4+6+8+...+1000)
//		System.out.println("第一題:");
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}	
//		System.out.println(sum);	
//		System.out.println();
//		
//		
//		//第二題:請設計一隻Java程式，計算1~10的連乘積(1*2*3*...*10)(用for迴圈)
//		System.out.println("第二題:");
//		int total = 1;
//		for (int count = 1; count <= 10; count++) {
//			total *= count;
//		}
//		System.out.println(total);
//		System.out.println();
//		
//		
//		//第三題:請設計一隻Java程式，計算1~10的連乘積(1*2*3*...*10)(用while迴圈)
//		System.out.println("第三題:");
//		int total1 = 1;
//		int count1 = 1;
//		while(count1 <= 10) {
//			total1 *= count1;
//			count1++;
//		}
//		System.out.println(total1);
//		System.out.println();
//		
//		
//		//第四題:請設計一隻Java程式，輸出結果為以下:1 4 9 16 25 36 49 64 81 100
//		System.out.println("第四題:");
//		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.print((i * i) + " ");
//		}
//		System.out.println();
//		System.out.println();
//		
//		/*第五題:阿文很熱衷大樂透(1~49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些?總共有幾個?*/
//		System.out.println("第五題:");
//		
//		System.out.println();
//		
//		/*第六題:請設計一隻Java程式，輸出結果為以下:
//		 12345678910
//		 123456789
//		 12345678
//		 1234567
//		 123456
//		 12345
//		 1234
//		 123
//		 12
//		 1  */
//		System.out.println("第六題:");
//		for (int r = 1; r <= 10; r++) {
//			for (int t = 1; t <= r; t++) {
//				System.out.print("A");
//			
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		/*第七題:請設計一隻Java程式，輸出結果為以下:
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF */
//		System.out.println("第七題:");
//		for (int g = 1; g <= 6; g++) {
//			for (int h = 1; h <= g; h++) {
//				System.out.print("A");
//			
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		
//		//第八題:請建立一個TestNineNine.java程式，可輸出九九乘法表
//		//一: 使用for迴圈 + while迴圈
//		System.out.println("第八題:使用for迴圈 + while迴圈");
//		int a, b;
//		for (a = 1; a <= 9; a++) {
//			b = 1;
//			while(b <= 9) {
//				System.out.print(a + "*" + b + "=" + (a*b) + "\t");
//				b++;
//			}
//			System.out.println();
//		}
//		//二: 使用for迴圈 + do while迴圈
//		System.out.println("第八題:使用for迴圈 + do while迴圈");
//		int c,d;
//		for (c = 1; c <= 9; c++) {
//			d = 1;
//			do {
//				System.out.print(c + "*" + d + "=" + (c*d) + "\t");
//				d++;
//			}while(d <= 9);
//			System.out.println();
//		}
		//三: 使用while迴圈 + do while迴圈
		System.out.println("第八題:使用while迴圈 + do while迴圈");
		int e, f;
		e = 1;
		while (e <= 9) {
			
			f = 1;
			do {
				System.out.print(e + "*" + f + "=" + (e*f) + "\t");
				f++;
			}while(f <= 9);
			
			e++;
			System.out.println();
			
		}
		
		
		
		
		
	}
}
