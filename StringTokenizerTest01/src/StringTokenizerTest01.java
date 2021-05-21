import java.util.StringTokenizer;

public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String s1 = "dog,cat,tiger,lion,bear,rabbit";
		
		// ����) ,(��ǥ)�� �����ؼ� �迭�� �����Ͽ� ����� ����Ͻÿ�.
		// split() �޼ҵ� Ȱ�� : ���ڿ��� Ư�� ���ڷ� ������ �迭�� �����ϴ� �Լ�
		String[] animals = s1.split(",");
		
		System.out.println("1. ----------");
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("2. ----------");
		for(String s : animals) {
			System.out.println(s);
		}
		
		// StringTokenizer Ŭ���� ����ϴ� �⺻ ���
		System.out.println("3. ----------");
		StringTokenizer st1 = new StringTokenizer(s1, ",");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("4. ----------");
		s1 = s1.concat("/puma/monkey/giraffe/elephant/hippo");
		System.out.println(s1);
		
		StringTokenizer st2 = new StringTokenizer(s1, ",/");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("5. ----------");
		StringTokenizer st3 = new StringTokenizer(s1, ",/", true);
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		
		// end
		
	}

}
