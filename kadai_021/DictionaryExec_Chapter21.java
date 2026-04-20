package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		// 1. 辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 2. 調べる英単語を配列にセットする
		String[] wordsSearch = {"apple", "banana", "grape","orange"};
		
		// 3. 辞書を調べるメソッドを引数指定で呼び出す
		dictionary.searchWord(wordsSearch);

	}
}