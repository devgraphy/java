package set�迭Ŭ����;
/*
 * 
 * */
public class Member { 	// ���� Ŭ����
	//�ν��Ͻ� ����(��ü ����)���� 
	private String name; //�̸� 
	private int age; //���� 
	private String juminNum; //�ֹι�ȣ 

	//������ 
	public Member(String name, int age, String juminNum) { 
		this.name = name; 
		this.age = age; 
		this.juminNum = juminNum;
	}
	@Override // ������
	public int hashCode() {
		return name.hashCode() +age + juminNum.hashCode();
	}
	@Override	// ������
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	// �������� instanceof Ÿ��(Ŭ������)
			Member member = (Member)obj;
			return member.name.equals(name) &&
					(member.age == age) &&
					member.juminNum.equals(juminNum);
		}
		else
			return false;
	}

	 
}  
	           