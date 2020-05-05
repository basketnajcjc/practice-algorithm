package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class GoHomeTime {
	/*
	2019. 08. 26 퇴근까지 남은시간 계산
	지영은 성인이되어 회사에입사했다.
	​
	하지만 들어간기업이 하필 할일없는 중소기업이라​
	퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..​
	지영은 심심한지라 좀더효율적으로놀기위해​
	현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어​
	계산적으로놀고싶었다 우리가지영을도와주자!!​
	(참고로 지영의퇴근시간은 17시30분이다)
	​
	input: 현재시간​
	output: 남은시간 : ##시간 ##분
	*/
	
	public static void main(String[] args) {
		
		System.out.println("남은 시간 : " + getWorkTime("16:00"));
		System.out.println("남은 시간 : " + getWorkTime("14:20"));
		System.out.println("남은 시간 : " + getWorkTime("09:00"));
		System.out.println("남은 시간 : " + getWorkTime("10:50"));
		System.out.println("남은 시간 : " + getWorkTime("16:55"));
		
	}
	
	static String getWorkTime(String nowTime) {
		String remainingTime = "";
		int remainingTimeInteger = 0;
		
		String[] nowTimeArray = nowTime.split(":");
		String nowTimeString = "";
		int nowTimeInteger = 0;
		for(String now : nowTimeArray) {
			nowTimeString = nowTimeString + now;
		}
		nowTimeInteger = Integer.parseInt(nowTimeString);
		
		if(nowTimeInteger < 1730) {
			remainingTimeInteger = 1730 - nowTimeInteger;
			if(remainingTimeInteger%100 >= 60) 
				remainingTimeInteger -= 40;
		}
		
		if(remainingTimeInteger/100 > 0) {
			remainingTime = "0" + remainingTimeInteger/100 + "시간 " + (remainingTimeInteger%100)/10 + (remainingTimeInteger%10) + "분";
		} else {
			remainingTime = (remainingTimeInteger%100)/10 + "" + (remainingTimeInteger%10) + "분";
		}
		
		return remainingTime;
	}
	
}
