package map계열클래스;

/*
 * 문제: 회원 인증
 * */
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map;
public class HashTableClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userID = {"Lee", "Kim", "Jang","Wang", "Ha"};
		String[] password = {"L123","K456", "J123", "W231", "H664"};
		
		// HashTable 객체 생성
		Map<String, String> ht = new Hashtable<String, String>(userID.length);
		
		// 객체 저장
		for(int i = 0; i < userID.length; i++) {
			ht.put(userID[i], password[i]);
		}
		
		System.out.println(ht);	// {Jang=J123, Ha=H664, Lee=L123, Wang=W231, Kim=K456} 
								// 순서 유지 x. 키를 통해 값을 찾아오기 때문에 순서가 중요하지 않다. 리스트와 다르게 {} 로 표시된다.
		

		boolean FLAG = true;	// 스위치 변수는 대문자가 관례
		while(FLAG) {
			System.out.println("유저 id는 >>> ");
			Scanner in = new Scanner(System.in);
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			if(pw_value != null) {
				System.out.println("user password는 >>> ");
				String passwordInputValue = in.nextLine();
				if(pw_value.equals(passwordInputValue)) {
					System.out.println("인증 성공!!");
				}
				else
					System.out.println("인증 실패!!");
			}
			else {
				System.out.println("입력한 유저 ID는 등록되어 있지 않습니다.");
			}
					
		}
	}

}
