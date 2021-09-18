package Java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 第2回課題
		
		// コンソールに「HelloWorld」を表示
		String greeting = "HelloWorld";
		System.out.println(greeting);
		
		// コンソールに1～10まで足した結果を表示
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);
		
		// コンソールに「3年後の今日が何曜日なのか」を計算して表示
		LocalDateTime date = LocalDateTime.now(); // 現在の時刻を取得
		System.out.println(date);
		System.out.println(date.plusYears(3).getDayOfWeek()); // 3年後の曜日を取得して表示
		
		// コンソールに「引数が0なら偽。引数が1なら真」と表示
		isNumber(0);
		isNumber(1);
		
		// String型のListかMapを作成して、その内容をコンソール画面に表示
		List<String> list = new ArrayList<String>();
		list.add("いちご");
		list.add("バナナ");
		list.add("桃");
		for(String str: list) {
			System.out.println(str);
		}
	}
	
	// 引数が0なら偽。引数が1なら真をコンソールに表示するメソッド
	static void isNumber(int num) {
		if (num == 1) {
			System.out.println("真");
		} else if(num == 0) {
			System.out.println("偽");
		}
	}
}
