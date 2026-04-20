package kadai_015;

public class Car_Chapter15 {
	//フィールドに定義します。
	private int gear ;
	private int speed ;
	
	//コンストラクタの作成
	public Car_Chapter15 (int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//ギアチェンジした時、それを表示。スピードを計算する。
	public void changeGear(int afterGear) {
		
		 switch(afterGear) {
			case 1 -> this.speed = 10; 
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
			
		};
		
		
		
		System.out.println("ギアを"+this.gear+"から"+afterGear+"に切り替えました");
		
		this.gear =afterGear;
		
	}
	
	//スピードの表示
	public void run() {
		System.out.println("速度は時速" + this.speed + "です");
	}
	

}
