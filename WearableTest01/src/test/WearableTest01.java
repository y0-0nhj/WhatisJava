package test;

import wearable.*;

// 문제)
// 1. Wearable 인터페이스를 구현한 WearableComputer 클래스를 생성하시오.
// 2. Wearable, Color 인터페이스를 모두 구현한 WearableRobot 클래스를 생성하시오.
// 3. WearableComputer 클래스에는 컴퓨터이름(name)을 인스턴스 변수로 추가하시오.
// 4. WearableRobot 클래스에는 색상(color)를 인스턴스 변수로 추가하시오.
// 5. main() 메소드에는 WearableComputer, WearableRobot 클래스의 인스턴스 각 2개씩을 배열에 담아 다형성을 구현하여 출력하시오.
public class WearableTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열
		Wearable[] wearables = {
				new WearableComputer("마크1"),
				new WearableRobot(Color.RED),
				new WearableComputer("마크2"),
				new WearableRobot(Color.GREEN),
		};
		
		// 출력
		for(Wearable w : wearables) {
			w.putOn();
			w.putOff();
			System.out.println();
		}
		
	}

}
