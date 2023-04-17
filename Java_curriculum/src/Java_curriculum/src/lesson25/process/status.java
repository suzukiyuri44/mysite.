package lesson25.process;

public class status {
	//型を定義
	private int hp;
	private int mp;
	private int attack;
	private int rapidity;
	private int defense;
	
	//名前を表示する処理
	public static void start(String name) {
		System.out.println("こんにちは"+name+"さん");
	}
	//名前以外の表示する処理
	public void quantifying() {
		System.out.println("ステータス");
		System.out.println("HP:"+this.getHp());
		System.out.println("MP:"+this.getMp());
		System.out.println("攻撃力:"+this.getAttack());
		System.out.println("素早さ:"+this.getRapidity());
		System.out.println("防御力:"+this.getDefense());
		System.out.println("さあ冒険に出かけよう！");
	}
	
	//getterとsetterを定義をする。
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp =hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void setAttack(int attack) {
		this.attack =attack;
	}
	
	public int getRapidity() {
		return this.rapidity;
	}
	
	public void setRapidity(int rapidity) {
		this.rapidity = rapidity;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
