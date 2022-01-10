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
				System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
				System.out.print("������ȣ>> ");
				int NO = MenuView.sc.nextInt();
				manager.update(makeInfo(), NO);
			}else if("4".equals(menuNum)) {
				System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
				System.out.print("������ȣ>> ");
				manager.delete(MenuView.sc.nextInt());
			}else if ("5".equals(menuNum)) {
				choice = false;
			}
			
			
		}
		

	}

	public static PhoneInfo makeInfo() {
		MenuView.sc.reset();
		PhoneInfo person = new PhoneInfo();
		
		System.out.print("�̸� : ");
		person.setName(MenuView.sc.next());
		
		System.out.print("���� : ");
		person.setAge(MenuView.sc.nextInt());
		
		System.out.print("��ȭ��ȣ : ");
		person.setPhonenumber(MenuView.sc.next());

		
		System.out.println();
		
		return person;
	}

}
