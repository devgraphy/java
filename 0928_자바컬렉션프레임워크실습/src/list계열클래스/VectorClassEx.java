/*
 * 목표: 스트링 배열의 원소를 벡터로 이동
 * */
package list계열클래스;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
public class VectorClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"김진영","최민호","조정래","김홍신","박경리"};
		
		// Vector(가변배열) 객체 생성
		// List<String> list = new Vector<String>();	// 기본 10개 생성, 공간이 부족하면 10개씩 늘어난다.
		List<String> list = new Vector<String>(4,3);	// 공간만 4개를 확보, 3개씩 커진다.
		
		//Vector 클래스의 주요 메서드 적용
		System.out.println("벡터에 저장된 요소의 개수: "+ list.size());// 0
		System.out.println("벡터의 용량:" + ((Vector<String>)list).capacity());	// 4
		for(int i = 0; i < name.length; i++) {
			list.add(name[i]);	// 맨 뒤에 객체 추가
		}
		System.out.println("벡터에 저장된 요소의 개수: "+ list.size());// 5
		System.out.println("벡터의 용량:" + ((Vector<String>)list).capacity());	// 7
		System.out.println(list);	// [김진영, 최민호, 조정래, 김홍신, 박경리]-객체를 컴마 공백으로 구분함
		
		list.add(2, "공지영");		// 2번째 인덱스에 원소 추가, 다형성(메서드 오버로딩)
		System.out.println(list);
		
		// 검색
		System.out.println(list.get(1));	// 최민호
		boolean contains_result1 = list.contains("조정래");	// 포함 여부 확인할 때, continas() 사용
		System.out.println(contains_result1);
		boolean contains_result2 = list.contains("김홍식");
		System.out.println(contains_result2);
		System.out.println(list.size());
		
		// 객체 변경 set() 메서드. 2번 째 원소의 값을 "이문열"로 변경
		list.set(2, "이문열");
		System.out.println(list);	//[김진영, 최민호, 이문열, 조정래, 김홍신, 박경리]

		
		// 객체 삭제 remove() 메서드
		list.remove(3);
		System.out.println(list);	//[김진영, 최민호, 이문열, 김홍신, 박경리]
		list.remove("김홍신");
		System.out.println(list);	//[김진영, 최민호, 이문열, 박경리]
		System.out.println();
		// 객체 정렬
		System.out.println("*객체 오름 차순 정렬*");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("*객체 내림 차순 정렬*");
		System.out.println(list);

		
	}

}
