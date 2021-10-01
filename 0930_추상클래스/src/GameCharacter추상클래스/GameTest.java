package GameCharacter추상클래스;

public class GameTest {

	public static void main(String[] args) {
		Player begginer_pl = new Begginer("초급자");
		begginer_pl.showInfo();
		begginer_pl.go(5);	// @비기너도 인자를 받게 구현할 수 밖에 없는지?
		System.out.println();
		
		Player inter_pl = new Intermediate("중급자");
		inter_pl.showInfo();
		inter_pl.go(5);
		System.out.println();
		
		Player advan_pl = new Advanced("고급자");
		advan_pl.showInfo();
		advan_pl.go(10);		
	}

}
