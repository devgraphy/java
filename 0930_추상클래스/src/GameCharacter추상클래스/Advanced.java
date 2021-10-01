package GameCharacter추상클래스;

public class Advanced extends Player{
	// 생성자
	public Advanced(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}

	@Override
	public void jump(int count) {
		System.out.println(count + "번 아주 높히 점프합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("턴을 합니다.");
		
	}

}
