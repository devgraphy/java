package GameCharacter�߻�Ŭ����;

public class GameTest {

	public static void main(String[] args) {
		Player begginer_pl = new Begginer("�ʱ���");
		begginer_pl.showInfo();
		begginer_pl.go(5);	// @���ʵ� ���ڸ� �ް� ������ �� �ۿ� ������?
		System.out.println();
		
		Player inter_pl = new Intermediate("�߱���");
		inter_pl.showInfo();
		inter_pl.go(5);
		System.out.println();
		
		Player advan_pl = new Advanced("�����");
		advan_pl.showInfo();
		advan_pl.go(10);		
	}

}
