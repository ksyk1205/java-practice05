package prob2;

public class SmartPhone extends MusicPhone {
	public void execute (String function) {
		if(function.equals("앱")) {
			System.out.println("앱실행");
		}else {
			super.execute(function);
		}
	}
	public void playMusic() {
		System.out.println("다운로드 음악재생");
	}
	
}
