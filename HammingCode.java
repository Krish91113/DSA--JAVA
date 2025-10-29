import java.util.Scanner;

public class HammingCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of data bits: ");
        int m = sc.nextInt();

        int[] data = new int[m + 1];
        System.out.print("Enter data bits (LSB first): ");
        for (int i = 1; i <= m; i++){
            data[i] = sc.nextInt();           
        }

        // Calculate number of parity bits
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)){
            r++;
        }

        int[] hamming = new int[m + r + 1];
        int j = 0;
        for (int i = 1; i <= m + r; i++) {
            if (isPowerOfTwo(i))
                hamming[i] = 0; // parity bit placeholder
            else
                hamming[i] = data[++j];
        }

        // Calculate parity bits
        for (int i = 0; i < r; i++) {
            int parityPos = (int) Math.pow(2, i);
            int parity = 0;
            for (int k = parityPos; k <= m + r; k++) {
                if (((k >> i) & 1) == 1)
                    parity ^= hamming[k];
            }
            hamming[parityPos] = parity;
        }

        System.out.print("\nGenerated Hamming code: ");
        for (int i = m + r; i >= 1; i--) {
            System.out.print(hamming[i]);
        }
        System.out.println();

        // Simulate error
        System.out.print("Enter position to introduce error (0 for none): ");
        int pos = sc.nextInt();
        if (pos != 0){
            hamming[pos] = (hamming[pos] == 0) ? 1 : 0;
        }
        System.out.print("Received Hamming code: ");
        for (int i = m + r; i >= 1; i--) {
            System.out.print(hamming[i]);
        }
        // Detect error
        int errorPos = 0;
        for (int i = 0; i < r; i++) {
            int parity = 0;
            for (int k = 1; k <= m + r; k++) {
                if (((k >> i) & 1) == 1) {
                    parity ^= hamming[k];
                }
            }
            errorPos += parity * Math.pow(2, i);
        }
        System.out.println();
        if (errorPos == 0)
            System.out.println("No error detected.");
        else
            System.out.println("Error detected at bit position: " + errorPos);

        sc.close();
    }

    static boolean isPowerOfTwo(int x) {
        return (x & (x - 1)) == 0;
    }
}
