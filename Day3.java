import java.util.*;

public class Day3 {
    static public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long prev = row.get(i - 1);
            long curr = prev * (rowIndex - i + 1) / i;
            row.add((int) curr);
        }

        return row;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(getRow(N));
    }
}
