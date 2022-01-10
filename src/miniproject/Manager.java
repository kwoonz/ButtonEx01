package miniproject;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();
	
	private int NO = 0;
	
	public List<PhoneInfo> getInfoList() {
		return this.InfoList;
	}
	
	public void setInfoList(List<PhoneInfo> infoList) {
		this.InfoList = infoList;
	}
	
	public int addInfo(PhoneInfo phoneInfo) {
		// �������� return ����
		int ret = 0;
		
		try {
			// ������ȣ ����
			phoneInfo.setNo(++this.NO);
			
			this.InfoList.add(phoneInfo);
			
		} catch (Exception e) {
			System.out.println("���� �߰� �� ������ �߻��Ͽ����ϴ�.\n" + e.getMessage());
			// return�� ���� (0 : ����, 1 : ����)
			ret = 1;
		}
	
		return ret;
	}
	
	public int update(PhoneInfo phoneinfo, int NO) {
		// �������� return ����
		int ret = 0;
		
		try {
			for(int idx=0; idx < InfoList.size(); idx++) {
				PhoneInfo tempPhoneInfo = InfoList.get(idx);
				
				if(NO == tempPhoneInfo.getNo()) {
					
					InfoList.remove(idx);
					InfoList.add(idx, phoneinfo);
					break;
				}
				
				if(idx == InfoList.size()-1) {
					ret = 2;
				}
			}
		} catch (Exception e) {
			System.out.println("���� ���� �� ������ �߻��Ͽ����ϴ�.\n" + e.getMessage());
			ret = 1;
		}
		return ret;
	}	
	
	public int delete(int NO) {
		int ret = 0;
		
		try {
			for (int idx = 0; idx < this.InfoList.size(); idx++) {
				PhoneInfo tempPhoneInfo = InfoList.get(idx);
				
				if(NO == InfoList.size()) {
					InfoList.remove(idx);
					break;
				}
				
				if(idx == InfoList.size()-1 ) {
					ret =2;
				}
				
			}
		} catch (Exception e) {
			System.out.println("���� ���� �� ������ȣ�� �߸� �Է��ϼ̽��ϴ�.\n" + e.getMessage());
			ret = 1;
		}
		
		return ret;
	}

	

	public void showInfo() {
		for(int idx =0; idx < this.InfoList.size(); idx++) {
			System.out.println("::::::::::::::::::::::::::\n");
			System.out.println("������ȣ : " + InfoList.get(idx).getNo());
			System.out.println("�̸� : " + InfoList.get(idx).getName());
			System.out.println("���� : " + InfoList.get(idx).getAge());
			System.out.println("��ȭ��ȣ : " + InfoList.get(idx).getPhonenumber()+'\n');
			System.out.println("::::::::::::::::::::::::::");
			
		}
		
	}



	
	
	
	
	
}
