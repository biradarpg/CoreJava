
public class LargestAndSecondLarge {

	public static void main(String[] args) {
		LargestAndSecondLarge lgs=new LargestAndSecondLarge();
		lgs.twoLargNumbersInArray();
	}
	public void twoLargNumbersInArray() {
		int nums[] = { 105,102,103 -16, 0, 1, 4, -4, 67, 90, 50, 100,106, -2, -18, 101 };
		int large1 = Integer.MIN_VALUE;
		int  large2= Integer.MIN_VALUE;
		System.out.println("Minimum Value o f integer is "+ large1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > large1) {
				large2=large1;
				large1 = nums[i];
			} else if (nums[i] >large2) {
				large2 = nums[i];
			}
		}
		System.out.println("larget number is " + large1);
		System.out.println("Second Largest number is " + large2);
	}

}
