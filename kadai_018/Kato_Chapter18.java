package kadai_018;

abstract public class Kato_Chapter18 {
	//	フィールドを作ります
	public String familyName = "加藤";
	public String givenName= "";
	public String address = "東京都中野区〇×";
	//コンストラクタを作ります
	public Kato_Chapter18( ) {
	}
	
	//メソッドを作ります
	public void commonIntroduce(){
		//共通の紹介を出力する
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	//ここは個別の子クラスで設定する
	abstract public void eachIntroduce();
	
	public void execIntroduce(){
	//紹介を実行する
		commonIntroduce();
		eachIntroduce();
	}
}
