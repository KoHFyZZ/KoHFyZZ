import java.util.Arrays;

public class DigitsSum {

	public static void main(String[] args) {
		NumbGenerator numbGenerator = new NumbGenerator();
		SegmAndSum segmAndSum = new SegmAndSum();

		int[] array = numbGenerator.generateRandomNumberArray(3);
		System.out.println(Arrays.toString(array));
		
		System.out.println(segmAndSum.summarizeFirstDigits(array));
	}

}
