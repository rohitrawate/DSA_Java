public class EqualSigns {
    public static void main(String[] args) {
        int[] signal1= new int[] {1,2,3,3,3,5,4};
        int[] signal2= new int[] {1,2,3,4,3,5,4};
        System.out.println(getMaxEqualCoount(signal1, signal2));
    }

    private static int getMaxEqualCoount(int[] signal1, int[] signal2) {
        int maxEqual = 0;
        int minLength = Math.min(signal1.length, signal2.length);
        for(int i=0;i<minLength;i++) {
            if(signal1[i]==signal2[i]) {
                if(signal1[i]>maxEqual) maxEqual=signal1[i];
            }
        }
        return maxEqual;
    }
}