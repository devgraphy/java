package GameCharacter�߻�Ŭ����;

public class Intermediate extends Player{
	// ������
	public Intermediate(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump(int count) {
		System.out.println(count + "�� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� �� �����ϴ�.");
	}

}
