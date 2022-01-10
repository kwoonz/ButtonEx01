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
		// 성공여부 return 변수
		int ret = 0;
		
		try {
			// 고유번호 지정
			phoneInfo.setNo(++this.NO);
			
			this.InfoList.add(phoneInfo);
			
		} catch (Exception e) {
			System.out.println("정보 추가 중 에러가 발생하였습니다.\n" + e.getMessage());
			// return값 변경 (0 : 정상, 1 : 에러)
			ret = 1;
		}
	
		return ret;
	}
	
	public int update(PhoneInfo phoneinfo, int NO) {
		// 성공여부 return 변수
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
			System.out.println("정보 수정 중 에러가 발생하였습니다.\n" + e.getMessage());
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
			System.out.println("정보 삭제 중 고유번호를 잘못 입력하셨습니다.\n" + e.getMessage());
			ret = 1;
		}
		
		return ret;
	}

	

	public void showInfo() {
		for(int idx =0; idx < this.InfoList.size(); idx++) {
			System.out.println("::::::::::::::::::::::::::\n");
			System.out.println("고유번호 : " + InfoList.get(idx).getNo());
			System.out.println("이름 : " + InfoList.get(idx).getName());
			System.out.println("나이 : " + InfoList.get(idx).getAge());
			System.out.println("전화번호 : " + InfoList.get(idx).getPhonenumber()+'\n');
			System.out.println("::::::::::::::::::::::::::");
			
		}
		
	}



	
	
	
	
	
}
