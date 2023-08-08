import java.io.*;




public class ShiftOp {

	public static void main(String[] args)
	{
		int a = 10;
	
		// using left shift
		System.out.println("a<<1 : " + (a << 1));
	
		// using right shift
		System.out.println("a>>1 : " + (a >>> 1));

	// }
// }


// public class ShiftOperatorsExample {
    // public static void main(String[] args) {
        int num = 25; // Binary representation: 00000000 00000000 00000000 00011001

        // Left shift by 2 positions
        int leftShiftResult = num << 2; // Binary representation: 00000000 00000000 00000000 01100100
        System.out.println("Left Shift Result: " + leftShiftResult); // Output: 100

        // Right shift by 3 positions
        int rightShiftResult = num >> 3; // Binary representation: 00000000 00000000 00000000 00000011
        System.out.println("Right Shift Result: " + rightShiftResult); // Output: 3

        // Unsigned right shift by 4 positions
        int unsignedRightShiftResult = num >>> 4; // Binary representation: 00000000 00000000 00000000 00000000
        System.out.println("Unsigned Right Shift Result: " + unsignedRightShiftResult); // Output: 0 || 1
    }
}