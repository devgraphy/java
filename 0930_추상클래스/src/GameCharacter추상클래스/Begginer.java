package GameCharacter추상클래스;

public class Begginer extends Player{
	// 생성자
	public Begginer(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	@Override
	public void jump(int count) {
		System.out.println("점프할 수 없습니다.");
	}
	@Override
	public void turn() {
		System.out.println("턴할 수 없습니다.");
	}
}
