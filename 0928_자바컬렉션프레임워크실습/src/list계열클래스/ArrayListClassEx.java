package list계열클래스;
/* 
 * ArrayList와  Vector 클래스는
 * 모두 동적 배열(죽, 가변 재열) 클래스이다.
 * 고정 배열이 가지고 있는 문제점을 해결하기 위해서 만들어진 클래스이다.
 * 
 * vector와 ArrayList의 차이
 * vector는 동기화가 되어서 안정적(동시에 여러 쓰레드가 접근 불가)이지만 ArrayList는 동기화 처리가 되지 않아 여러 쓰레드가 접근하게 된다.
 * 게임에서는 ArrayList를 사용한다.
 * */
import java.util.List; 
import java.util.ArrayList; 

public class ArrayListClassEx { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 
	List<Integer> list = new ArrayList<Integer>(); 
	
	//객체 추가 
	list.add(new Integer(90)); // 정수 90을 객체화 시킴! list.add(90) 이것도됨. --> 자동 파싱 ( 자동으로 객체화) 
	list.add(new Integer(85)); 
	list.add(new Integer(100)); 
	list.add(new Integer(70)); 
	list.add(new Integer(75));
	
	System.out.println(list); 
	//[90,85,100,70,75] 
	
	list.add(2,60); 
	System.out.println(list); 
	//[90,85,60,100,70,75] 	
	} 
}  
           
