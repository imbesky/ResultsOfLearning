package practice1;

public class SwitchCase {

	public static void main(String[] args) {
		
		int month = 11;
		int monthis = month % 2;
		int daysis=0;
		
		if (month == 2) {
			daysis = 28;
		} else if(month < 8) {
			switch(monthis) {
			case 1: daysis = 31;
					break;
			case 0: daysis = 30;
					break;
			default: ;
			}
		} else {
			switch(monthis) {
			case 0: daysis = 31;
					break;
			case 1: daysis = 30;
					break;
			default: ;
			}
		}
		System.out.println(month+"월의 일 수는 "+daysis+"일 입니다.");
	}

}
