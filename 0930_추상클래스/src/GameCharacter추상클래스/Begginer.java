package GameCharacter�߻�Ŭ����;

public class Begginer extends Player{
	// ������
	public Begginer(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	@Override
	public void jump(int count) {
		System.out.println("������ �� �����ϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("���� �� �����ϴ�.");
	}
}
