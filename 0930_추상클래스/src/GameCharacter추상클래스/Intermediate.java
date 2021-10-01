package GameCharacter추상클래스;

public class Intermediate extends Player{
	// 생성자
	public Intermediate(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump(int count) {
		System.out.println(count + "번 높히 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴할 수 없습니다.");
	}

}
