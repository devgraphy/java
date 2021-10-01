package GameCharacter추상클래스;

public abstract class Player {
	// 멤버 변수
	protected String name;
	
	// 생성자
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	// 사용자 정의 일반 메소드
	public void showInfo() {
		System.out.println("캐릭터 이름은 " + name);
	}
	// 사용자 정의 추상 메소드
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	final public void go(int count) {
		run();
		jump(count);
		turn();
	}
}
