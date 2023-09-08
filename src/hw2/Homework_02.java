package hw2;

public class Homework_02 {

	public static void main(String[] args) {

		//第一題:請設計一隻Java程式，計算1~1000的偶數和(2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}	
		System.out.println(sum);

		
		//第二題:請設計一隻Java程式，計算1~10的連乘積(1*2*3*...*10)(用for迴圈)
		int total = 1;
		for (int count = 1; count <= 10; count++) {
			total *= count;
		}
		System.out.println(total);

		
		//第三題:請設計一隻Java程式，計算1~10的連乘積(1*2*3*...*10)(用while迴圈)
		int total1 = 1;
		int count1 = 1;
		while(count1 <= 10) {
			total1 *= count1;
			count1++;
		}
		System.out.println(total1);

		
		//第四題:請設計一隻Java程式，輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print((i * i) + " ");
		}
		System.out.println();
		
		/*第五題:阿文很熱衷大樂透(1~49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些?總共有幾個?*/
		int sum1 = 0, t = 10; 
			for (int lotto = 1; lotto <= 49 ; lotto++) {
			 if (lotto % t == 4) { //排除個位數是4
			 }
			 else if (lotto / t == 4) { 
			 }                     //排除十位數是4
			 else {
				 System.out.print(lotto + " ");
				 sum1++; //總號碼數
			 }
		 }
		 System.out.println();
		 System.out.println("總共" + sum1 + "個");
		
		/*第六題:請設計一隻Java程式，輸出結果為以下:
		 12345678910
		 123456789
		 12345678
		 1234567
		 123456
		 12345
		 1234
		 123
		 12
		 1  */
		int g, h;
		for (g = 10; g >= 1; g--) {
			for (h =1; h <= g; h++) {
				System.out.print(h);
			}
		System.out.println();
		}
		
		/*第七題:請設計一隻Java程式，輸出結果為以下:
		 A
		 BB
		 CCC
		 DDDD
		 EEEEE
		 FFFFFF */
		int j, k, l;
		for (j = 0; j <= 5; j++) {
			for (k =0; k <= j; k++) {
				l = 65 + j;
				char m = (char)l;
				System.out.print(m);
			}
			System.out.println();
		}
		
		
		
		//第八題:請建立一個TestNineNine.java程式，可輸出九九乘法表
		//一: 使用for迴圈 + while迴圈
		int a, b;
		for (a = 1; a <= 9; a++) {
			b = 1;
			while(b <= 9) {
				System.out.print(a + "*" + b + "=" + (a*b) + "\t");
				b++;
			}
			System.out.println();
		}
		
		//二: 使用for迴圈 + do while迴圈
		int c,d;
		for (c = 1; c <= 9; c++) {
			d = 1;
			do {
				System.out.print(c + "*" + d + "=" + (c*d) + "\t");
				d++;
			}while(d <= 9);
			System.out.println();
		}
		
		// 三: 使用while迴圈 + do while迴圈
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
