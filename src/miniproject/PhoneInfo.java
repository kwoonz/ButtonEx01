package miniproject;

public class PhoneInfo {
	
	// ���� ��ȣ
	private int no;
	
	// �̸�
	private String name;
	
	// ���� 
	private int age;
	
	// �ڵ��� ��ȣ
	private String phonenumber;
	
	public PhoneInfo() {
		
	}
	
	public PhoneInfo(int no, String name, int age, String num) {
		this.no = no;
		this.name = name;
		this.age = age;
		phonenumber = num;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	public void showPhoneInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ��ȣ : " + phonenumber);
	}
	

}
