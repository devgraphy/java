package set�迭Ŭ����;

import java.util.Set;
import java.util.HashSet;
/*
 * HashSet�� ��ü�� �����ϱ� ����
 * ���� ��ü��  hashCode() �޼��带 ȣ���ؼ� �ؽ��ڵ� ���� ��´�.
 * �׸��� �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
 * ���� ������ �ؽ��ڵ尡 �ִٸ� equals() �޼���� �� ��ü�� ���ؼ�
 * true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ� ������ ���� �ʴ´�.
 * */

public class HashSetClassEx {	// ���� Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// HashSet ��ü ����
		Set<Member> member_set = new HashSet<Member>();
		Member member1 = new Member("�����", 29, "111111-1111111");
		Member member2 = new Member("�����", 29, "111111-1111111");
		member_set.add(member1);
		member_set.add(member2);
		System.out.println("�� ��ü��: "+ member_set.size());	// �� ��ü��: 1
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member1.equals(member2));
	}

}
