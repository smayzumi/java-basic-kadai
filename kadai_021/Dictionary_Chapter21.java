package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	// HashMapをつくる
	HashMap<String, String> dic = new HashMap<String, String>();

	// コンストラクタで辞書に英単語と意味を追加します
	public Dictionary_Chapter21() {
		dic.put("apple", "りんご");   
		dic.put("peach", "桃");
		dic.put("banana", "バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}

	// 辞書を調べるメソッド
	public void searchWord(String[] searchWords) {
		// 繰り返し処理を使い、調べる英単語が辞書に追加されているか判定します
		for (int i = 0; i < searchWords.length; i++) {
			String word = searchWords[i]; // 配列から1つ単語を取り出す
			String result = dic.get(word); // HashMapから意味を取得する

			if (result == null) {
				System.out.println(word + "は辞書に存在しません");
			} else {
				System.out.println(word + "の意味は" + result);
			}
		}
	}
}