package miniproject;

public class PhoneInfo {
	
	// 고유 번호
	private int no;
	
	// 이름
	private String name;
	
	// 나이 
	private int age;
	
	// 핸드폰 번호
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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phonenumber);
	}
	

}
