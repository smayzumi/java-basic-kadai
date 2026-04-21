package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
	//フィールド作成
	private int myNum;
	private int yourNum;
	private String myHand;
	private String yourHand;
	
	//コンストラクタ定義
	public Jyanken_Chapter28 () {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}
	
	//自分の手を入力
	public void getMyChoie(){
		//スキャナー開いて入力させよう
		Scanner scanner = new Scanner(System.in);
		
		String myChoice = scanner.next();
		
		scanner.close();
		//入力した手を数字と手の形に変換。ついでに変な値ははじきます。
		 switch(myChoice) {
		     case "r" -> {
		    	 this.myNum = 0;
		    	 this.myHand="グー";
		     }
		     
		     case "s" -> {
		    	 this.myNum = 1;
		    	 this.myHand = "チョキ";
		     }
		     
		     case "p" -> {
		     	this.myNum = 2;
		     	this.myHand ="パー";
		     }
		     default -> {
		    	this.myNum = 3;
		     }
		 }
		 
 		if (this.myNum == 3) {
	        // ここでエラーを発生させて、後続の処理を「はじき返す」
	        throw new IllegalArgumentException("やり直してください");
		} 
	}
	
	//相手のじゃんけんの手を出力
	public void getRondom(){
		//Start
		//配列にじゃんけんの手をセット
		//じゃんけんクラスを実行するクラスに対戦相手のじゃんけんの手を返す。
		this.yourNum =(int)(Math.random() * 3);
		
		switch(this.yourNum) {
	        case 0 -> {
	       	
	       	 this.yourHand="グー";
	        }
	        
	        case 1 -> {
	       	
	       	 this.yourHand = "チョキ";
	        }
	        
	        case 2 -> {
	        	
	        	this.yourHand ="パー";
	        }
	        
		} 
		//end
	}
	
	public void playGame() {
		//start	
		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は" + this.myHand+ "相手の手は"+ this.yourHand);
		
		//自分と対戦相手のじゃんけんの手を比較する。自分の数字から相手の数字を引いて、3足して3で割った結果が勝敗になる。
		int battle = (this.myNum - this.yourNum + 3) % 3;
		
		//じゃんけんの結果を出力する
		switch (battle) {
			case 0 -> System.out.println("あいこです");
			case 1 -> System.out.println ("自分の負けです");
			case 2 -> System.out.println("自分の勝ちです");
		}
		
		
		
		//end

		
	}
}
