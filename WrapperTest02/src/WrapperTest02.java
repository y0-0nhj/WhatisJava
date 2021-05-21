import java.util.StringTokenizer;

// 문제) 1. 학생들의 점수 문자열 str을 이용하여 학생들의 총점과 평균을 구하시오.

public class WrapperTest02 {
	public static void main(String[] args) {
		String str = "85,88,72,91,56,73,66,87,68,95";
		int sum = 0;
		
		// 1번 방법 - String 클래스의 split() 메소드 활용
//		System.out.println("1. -----");
//		String[] scores = str.split(",");
//		for(String s : scores) {
//			sum += Integer.parseInt(s);
//		}
//		System.out.printf("총점: %d\n평균: %.2f\n", sum, (double)sum/scores.length);
				
		// 2번 방법 - StringTokenizer 클래스 활용
		sum = 0;
		System.out.println("2. -----");
		StringTokenizer st1 = new StringTokenizer(str, ",");
		int count = st1.countTokens(); // 토큰의 개수
		while(st1.hasMoreTokens()) {
			sum += Integer.parseInt(st1.nextToken());
		}
		System.out.printf("총점: %d\n평균: %.2f\n", sum, (double)sum/count);
		
		// end
	}

}
