public class DiaPracMain {
    public static void main(String[] args) {
        int[] arrA = new int[9];
        int length= arrA.length;
        int mid = length / 2 + 1;
        int blankNum = 0;
        for (int i = 0; i < mid; i++) {
            int starNum = i*2+1;
            blankNum = (length-starNum)/2;
            for (int j = 0; j < blankNum; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starNum; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }//제환왔다감
        for (int i = mid-1; i > 0; i--) {
            int starNum = i*2-1;
            blankNum = (length-starNum)/2;
            for (int j = 0; j < blankNum; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starNum; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }

}
