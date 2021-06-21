import java.util.Random;
public class W2_4_RandOOP {
	public static void main(String arg[]){
		System.out.println("랜덤 1");
		RandAlgo rnd1 = new RandAlgo();
		rnd1.initInput();
		System.out.println(
			"최대값은 " + rnd1.getMax() + ", "
			+ "최소값은" + rnd1.getMin() + "입니다."
		);

		System.out.println("랜덤 2");
		RandAlgo rnd2 = new RandAlgo();
		rnd2.initInput();
		System.out.println(
			"최대값은 " + rnd1.getMax() + ", "
			+ "최소값은" + rnd1.getMin() + "입니다."
		);
	}
}

// 객체지향 설계하기
class RandAlgo {
	public int nInput = 100;
	public int maxRandom = 1000;
	int[] input = new int[nInput];
	public void initInput(){
		Random rnd = new Random();
		for(int i=0; i<nInput; i++){
			input[i] = rnd.nextInt(maxRandom)+1;
			System.out.print(input[i] + " ");
		}
		System.out.println("");
	}
	public int getMax(){
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<nInput; i++){
			if(input[i] > maxValue){
				maxValue = input[i];
			}
		}
		return maxValue;
	}
	public int getMin(){
		int minValue = Integer.MAX_VALUE;
		for(int i=0; i<nInput; i++){
			if(input[i] < minValue){
				minValue = input[i];
			}
		}
		return minValue;
	}
}






