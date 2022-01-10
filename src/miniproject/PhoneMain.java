package miniproject;

public class PhoneMain {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		boolean choice = true;
		
		while(choice) {
			MenuView.sc.reset();
			
			MenuView.MenushowInfo();
			String menuNum = MenuView.sc.next();
			
			if("1".equals(menuNum)) {
				manager.addInfo(makeInfo());
			}else if ("2".equals(menuNum)) {
				manager.showInfo();
			}else if ("3".equals(menuNum)) {
				System.out.println("수정할 정보의 고유번호를 입력해 주세요.");
				System.out.print("고유번호>> ");
				int NO = MenuView.sc.nextInt();
				manager.update(makeInfo(), NO);
			}else if("4".equals(menuNum)) {
				System.out.println("삭제할 정보의 고유번호를 입력해 주세요.");
				System.out.print("고유번호>> ");
				manager.delete(MenuView.sc.nextInt());
			}else if ("5".equals(menuNum)) {
				choice = false;
			}
			
			
		}
		

	}

	public static PhoneInfo makeInfo() {
		MenuView.sc.reset();
		PhoneInfo person = new PhoneInfo();
		
		System.out.print("이름 : ");
		person.setName(MenuView.sc.next());
		
		System.out.print("나이 : ");
		person.setAge(MenuView.sc.nextInt());
		
		System.out.print("전화번호 : ");
		person.setPhonenumber(MenuView.sc.next());

		
		System.out.println();
		
		return person;
	}

}
