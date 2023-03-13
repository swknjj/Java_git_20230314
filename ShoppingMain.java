package 실습;
import java.time.LocalDateTime;
import java.util.*;

public class ShoppingMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectService objectservice = new ObjectService();
		UserService userservice = new UserService();

		while (true) {
			System.out.println("=====윤하's 쁘띠 쇼핑몰=====");
			System.out.println("");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				objectservice.check();
			}else if(menu == 2) {
				objectservice.findAll();
			}else if(menu == 3) {
				objectservice.findByObjectName();
			}else if(menu == 4) {
				objectservice.update();
			}else if(menu == 5) {
				objectservice.delete();
			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		
		
	}
}
