/*
 * ��ǥ: ��Ʈ�� �迭�� ���Ҹ� ���ͷ� �̵�
 * */
package list�迭Ŭ����;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
public class VectorClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"������","�ֹ�ȣ","������","��ȫ��","�ڰ渮"};
		
		// Vector(�����迭) ��ü ����
		// List<String> list = new Vector<String>();	// �⺻ 10�� ����, ������ �����ϸ� 10���� �þ��.
		List<String> list = new Vector<String>(4,3);	// ������ 4���� Ȯ��, 3���� Ŀ����.
		
		//Vector Ŭ������ �ֿ� �޼��� ����
		System.out.println("���Ϳ� ����� ����� ����: "+ list.size());// 0
		System.out.println("������ �뷮:" + ((Vector<String>)list).capacity());	// 4
		for(int i = 0; i < name.length; i++) {
			list.add(name[i]);	// �� �ڿ� ��ü �߰�
		}
		System.out.println("���Ϳ� ����� ����� ����: "+ list.size());// 5
		System.out.println("������ �뷮:" + ((Vector<String>)list).capacity());	// 7
		System.out.println(list);	// [������, �ֹ�ȣ, ������, ��ȫ��, �ڰ渮]-��ü�� �ĸ� �������� ������
		
		list.add(2, "������");		// 2��° �ε����� ���� �߰�, ������(�޼��� �����ε�)
		System.out.println(list);
		
		// �˻�
		System.out.println(list.get(1));	// �ֹ�ȣ
		boolean contains_result1 = list.contains("������");	// ���� ���� Ȯ���� ��, continas() ���
		System.out.println(contains_result1);
		boolean contains_result2 = list.contains("��ȫ��");
		System.out.println(contains_result2);
		System.out.println(list.size());
		
		// ��ü ���� set() �޼���. 2�� ° ������ ���� "�̹���"�� ����
		list.set(2, "�̹���");
		System.out.println(list);	//[������, �ֹ�ȣ, �̹���, ������, ��ȫ��, �ڰ渮]

		
		// ��ü ���� remove() �޼���
		list.remove(3);
		System.out.println(list);	//[������, �ֹ�ȣ, �̹���, ��ȫ��, �ڰ渮]
		list.remove("��ȫ��");
		System.out.println(list);	//[������, �ֹ�ȣ, �̹���, �ڰ渮]
		System.out.println();
		// ��ü ����
		System.out.println("*��ü ���� ���� ����*");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("*��ü ���� ���� ����*");
		System.out.println(list);

		
	}

}
