package ch07_interface;

public class ExInterface03 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		Television r1 = new Television();
		r1.num = 8;
		r1.turnOff();
		rc.turnOn();
		rc.setVolume(10);
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		rc.setMute(false);
		RemoteControl.changeBattery();
		
	}
}

interface RemoteControl1{
	
}

interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
	default void setMute(boolean state) {
		if(state) {
			System.out.println("무음 처리합니다");
		}
		else {
			System.out.println("무음을 해체합니다");
		}	
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}	
}

class Television implements RemoteControl, RemoteControl1 {
	int num = 0;
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	public void setVolume(int volumn) {
		System.out.println("TV의 볼륨을 " + volumn + "으로 설정합니다.");
	}
}

class Audio implements RemoteControl{
	@Override
	public void turnOn() {System.out.println("Audio를 켭니다.");}
	@Override
	public void turnOff() {	System.out.println("Audio를 끕니다.");	}
	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio의 볼륨을 "+volumn+"으로 설정합니다.");	}
}