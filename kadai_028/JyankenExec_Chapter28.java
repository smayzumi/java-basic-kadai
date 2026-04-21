package kadai_028;


public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//start
		
		//じゃんけんクラスのインスタンスを作成する
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力する		
		
		janken.getMyChoice();
		
		//対戦相手のじゃんけんの手が乱数で選ばれる
		
		janken.getRandom();
		
		//じゃんけんの結果を出力する
		
		janken.playGame();	
		
		//end
	}

}
