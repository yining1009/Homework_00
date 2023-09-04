package hw1;

public class Homework_01 {
	
	public static void main(String[] args) {
		
		// 第一題:請設計一隻Java程式，計算12,6這兩個數值的和與積
		System.out.println("第一題:");
		int num1 = 12, num2 = 6;
		System.out.println("和=" + (num1 + num2));
		System.out.println("積=" + (num1 * num2));
System.out.println();

		// 第二題:請設計一隻Java程式，計算200顆蛋共是幾打幾顆
		System.out.println("第二題:");
		int sum = 200;
		int dozen = 12;
		System.out.println("總共" + (sum / dozen));
		System.out.println("剩下" + (sum % dozen));
		System.out.println();

		// 第三題:請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("第三題:");
		int allsecs = 256559, hrs = 24, mins = 60, secs = 60;
		int daysec = hrs*mins*secs, hrssec = mins*secs;
		int hrsleft = allsecs % daysec, minleft = hrsleft % hrssec, secleft = minleft % secs;
		System.out.println("2556559秒=" + (allsecs/daysec) + "天" + (hrsleft/hrssec) + "小時" + (minleft/secs) + "分鐘" + secleft + "秒");
		System.out.println();

		// 第四題:請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		//圓面積=半徑*半徑*圓周率 , 圓周長=直徑*圓周率 , 定義常數用final
		System.out.println("第四題:");
		final double PI = 3.1415;
		double r = 5;
		System.out.println("圓面積=" + (r * r * PI));
		System.out.println("圓周長=" + (2 * r * PI));
		System.out.println();

		// 第五題:某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 
		// 複利公式:　期末=期初*(1+利率)的n次方
		System.out.println("第五題:");
		int money = 1_500_000;
		double rate = 0.02;
		double saving = money * Math.pow((1+rate), 10);
		System.out.printf("十年後本金加利息=%.2f", saving);
		System.out.println();
		System.out.println();
		
		/*第六題:請寫一隻程式，利用System.out.println()印出以下三個運算式結果
		5 + 5
		5 + '5'
		5 + "5"
		並用註解各別說明答案的產生原因*/
		System.out.println("第六題:");
		int num3 = 5;
		char num4 = '5';
		String num5 = "5";
		System.out.println("5+5=" + (num3 + num3)); // 整數+整數
		System.out.println("5+'5'=" + (num3 + num4)); // 整數+字元('/u8')
		System.out.println("5+\"5\"=" + (num3 + num5)); // 整數+字串

	}

}

