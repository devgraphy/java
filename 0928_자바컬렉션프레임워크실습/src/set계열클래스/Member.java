package set계열클래스;
/*
 * 
 * */
public class Member { 	// 구현 클래스
	//인스턴스 변수(객체 변수)선언 
	private String name; //이름 
	private int age; //나이 
	private String juminNum; //주민번호 

	//생성자 
	public Member(String name, int age, String juminNum) { 
		this.name = name; 
		this.age = age; 
		this.juminNum = juminNum;
	}
	@Override // 재정의
	public int hashCode() {
		return name.hashCode() +age + juminNum.hashCode();
	}
	@Override	// 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	// 참조변수 instanceof 타입(클래스명)
			Member member = (Member)obj;
			return member.name.equals(name) &&
					(member.age == age) &&
					member.juminNum.equals(juminNum);
		}
		else
			return false;
	}

	 
}  
	           