package GameCharacter�߻�Ŭ����;

public class Advanced extends Player{
	// ������
	public Advanced(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("���� ������ �޸��ϴ�.");
	}

	@Override
	public void jump(int count) {
		System.out.println(count + "�� ���� ���� �����մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("���� �մϴ�.");
		
	}

}
