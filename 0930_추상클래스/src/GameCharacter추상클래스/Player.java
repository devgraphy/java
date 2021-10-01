package GameCharacter�߻�Ŭ����;

public abstract class Player {
	// ��� ����
	protected String name;
	
	// ������
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	// ����� ���� �Ϲ� �޼ҵ�
	public void showInfo() {
		System.out.println("ĳ���� �̸��� " + name);
	}
	// ����� ���� �߻� �޼ҵ�
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	final public void go(int count) {
		run();
		jump(count);
		turn();
	}
}
