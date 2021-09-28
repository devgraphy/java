package set계열클래스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.Iterator;
/* ----------<문제 정의>----------
 * 문제: 자동으로 로또 번호를 발생시키는 애플리케이션 작성
 * 제한 사항: HashSet 클래스와, ArrayList 클래스, Random 클래스를 적용하여 해결
 * 출력 결과:
 * << 로또번호 보여주기>>
 * [1, 20, 27, 32, 38, 42]
 * 정렬된 상태로 보여주기
 * */
/* ----------<접근법>----------
 * HashSet으로 중복없이 난수를 담는 용도로 사용하고
 * 정렬을 위해 List로 옮겨담는다.
 * 정렬 후 출력
 * 
 * */
/* ----------<개선 접근법>----------
 * TreeSet을 사용하면 정렬하면서 넣기 때문에 코드가 더 간결해진다.
 * TreeSet은 저장할 때 이미 정렬하기 때문에 읽어올 때 따로 정렬할 필요가 없다.
 * TreeSet은 Binary Search Tree의 형태로 데이터를 저장하는 컬렉션이다.
 * */
public class LottoGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> member_set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();	// 정렬을 위한 자료구조로 사용

		Set<Integer> member_treeset = new TreeSet<Integer>(); 

		Random rd = new Random();	// 랜덤 객체 생성
		// HashSet을 사용하여 중복없이 6개의 난수 생성
		int randnum;
		while(member_set.size() <= 6) {
			randnum = rd.nextInt(45)+1;	// 1부터 45까지의 난수 생성
			member_set.add(randnum);	
			member_treeset.add(randnum);
		}
		// System.out.println(member_set);
		
		// HashSet 순회하면서 List에 추가
		Iterator<Integer> it = member_set.iterator();
		while(it.hasNext()) {
			Integer val = it.next();
			list.add(val);
		}
		// List 정렬
		Collections.sort(list);
		// List 출력
		System.out.println(list);
		// treeset 출력
		System.out.println(member_treeset);
		
	}

}
