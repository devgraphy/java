package 이메일유효성검사패턴;

/* # 개념

## 메타문자 의미
\w =>한 개의 알파벳 또는 한 개의 숫자
(예) [A-Z A-Z 0-9]와 동일한 의미의 메타 문자

+=> 한 개 이상
{}=> 그룹핑
?=> 없음 또는 한 개

## 이메일 예시
개인 메일:
- king1234@naver.com
- kim1234@gmail.com

회사 메일:
- ern1234@partner.sk.com
- spec@ora.co.kr

## 유효성 검사 패턴 예시
"^\\w+@\\w+\\.\\w+(\\.\\w+)?"

- \\\w+
- \\\w+
- \\\\.  => 특수 문자 . 을 인식하기 위한 \
- \\\W+
- (\\\\.\\\w+)? => 옵션

 * */
public class EmailRegexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] email_ex = {"king1234@naver.com",
							"kim1234@gmail.com",
							"erin0521@partner.sk.com",
							"asd1234@partner.sk.com.aaa"};
		
		//이메일 패턴
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		for(String email:email_ex) {
			boolean check = email.matches(email_pattern);
			if(check == true) {
				System.out.println("적합한 이메일입니다: " + email);
			}
			else{
				System.out.println("부적합한 이메일입니다: " + email);
			}
		}
	}

}
