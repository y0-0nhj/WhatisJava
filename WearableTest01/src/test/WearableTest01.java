package test;

import wearable.*;

// ����)
// 1. Wearable �������̽��� ������ WearableComputer Ŭ������ �����Ͻÿ�.
// 2. Wearable, Color �������̽��� ��� ������ WearableRobot Ŭ������ �����Ͻÿ�.
// 3. WearableComputer Ŭ�������� ��ǻ���̸�(name)�� �ν��Ͻ� ������ �߰��Ͻÿ�.
// 4. WearableRobot Ŭ�������� ����(color)�� �ν��Ͻ� ������ �߰��Ͻÿ�.
// 5. main() �޼ҵ忡�� WearableComputer, WearableRobot Ŭ������ �ν��Ͻ� �� 2������ �迭�� ��� �������� �����Ͽ� ����Ͻÿ�.
public class WearableTest01 {
	public static void main(String[] args) {
		// �ν��Ͻ� �迭
		Wearable[] wearables = {
				new WearableComputer("��ũ1"),
				new WearableRobot(Color.RED),
				new WearableComputer("��ũ2"),
				new WearableRobot(Color.GREEN),
		};
		
		// ���
		for(Wearable w : wearables) {
			w.putOn();
			w.putOff();
			System.out.println();
		}
		
	}

}
