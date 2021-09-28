package set�迭Ŭ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.Iterator;
/* ----------<���� ����>----------
 * ����: �ڵ����� �ζ� ��ȣ�� �߻���Ű�� ���ø����̼� �ۼ�
 * ���� ����: HashSet Ŭ������, ArrayList Ŭ����, Random Ŭ������ �����Ͽ� �ذ�
 * ��� ���:
 * << �ζǹ�ȣ �����ֱ�>>
 * [1, 20, 27, 32, 38, 42]
 * ���ĵ� ���·� �����ֱ�
 * */
/* ----------<���ٹ�>----------
 * HashSet���� �ߺ����� ������ ��� �뵵�� ����ϰ�
 * ������ ���� List�� �Űܴ�´�.
 * ���� �� ���
 * 
 * */
/* ----------<���� ���ٹ�>----------
 * TreeSet�� ����ϸ� �����ϸ鼭 �ֱ� ������ �ڵ尡 �� ����������.
 * TreeSet�� ������ �� �̹� �����ϱ� ������ �о�� �� ���� ������ �ʿ䰡 ����.
 * TreeSet�� Binary Search Tree�� ���·� �����͸� �����ϴ� �÷����̴�.
 * */
public class LottoGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> member_set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();	// ������ ���� �ڷᱸ���� ���

		Set<Integer> member_treeset = new TreeSet<Integer>(); 

		Random rd = new Random();	// ���� ��ü ����
		// HashSet�� ����Ͽ� �ߺ����� 6���� ���� ����
		int randnum;
		while(member_set.size() <= 6) {
			randnum = rd.nextInt(45)+1;	// 1���� 45������ ���� ����
			member_set.add(randnum);	
			member_treeset.add(randnum);
		}
		// System.out.println(member_set);
		
		// HashSet ��ȸ�ϸ鼭 List�� �߰�
		Iterator<Integer> it = member_set.iterator();
		while(it.hasNext()) {
			Integer val = it.next();
			list.add(val);
		}
		// List ����
		Collections.sort(list);
		// List ���
		System.out.println(list);
		// treeset ���
		System.out.println(member_treeset);
		
	}

}
