package map�迭Ŭ����;

/*
 * ����: ȸ�� ����
 * */
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map;
public class HashTableClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userID = {"Lee", "Kim", "Jang","Wang", "Ha"};
		String[] password = {"L123","K456", "J123", "W231", "H664"};
		
		// HashTable ��ü ����
		Map<String, String> ht = new Hashtable<String, String>(userID.length);
		
		// ��ü ����
		for(int i = 0; i < userID.length; i++) {
			ht.put(userID[i], password[i]);
		}
		
		System.out.println(ht);	// {Jang=J123, Ha=H664, Lee=L123, Wang=W231, Kim=K456} 
								// ���� ���� x. Ű�� ���� ���� ã�ƿ��� ������ ������ �߿����� �ʴ�. ����Ʈ�� �ٸ��� {} �� ǥ�õȴ�.
		

		boolean FLAG = true;	// ����ġ ������ �빮�ڰ� ����
		while(FLAG) {
			System.out.println("���� id�� >>> ");
			Scanner in = new Scanner(System.in);
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			if(pw_value != null) {
				System.out.println("user password�� >>> ");
				String passwordInputValue = in.nextLine();
				if(pw_value.equals(passwordInputValue)) {
					System.out.println("���� ����!!");
				}
				else
					System.out.println("���� ����!!");
			}
			else {
				System.out.println("�Է��� ���� ID�� ��ϵǾ� ���� �ʽ��ϴ�.");
			}
					
		}
	}

}
