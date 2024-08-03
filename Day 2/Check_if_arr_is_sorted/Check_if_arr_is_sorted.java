import java.util.*;

class Check_if_arr_is_sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read number of test cases
        String inputLine = scanner.nextLine();
        int t;
        try {
            t = Integer.parseInt(inputLine.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of test cases.");
            scanner.close();
            return;
        }

        // Process each test case
        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Invalid input line.");
                continue;
            }

            String[] numStrings = line.split("\\s+");
            List<Integer> nums = new ArrayList<>();
            try {
                for (String numString : numStrings) {
                    nums.add(Integer.parseInt(numString));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer in input line.");
                continue;
            }

            Check_if_arr_is_sorted ob = new Check_if_arr_is_sorted();
            boolean ans = ob.arraySortedOrNot(nums);
            System.out.println(ans);
        }
        scanner.close();
    }

    public boolean arraySortedOrNot(List<Integer> arr) {
        if (arr == null || arr.size() <= 1) {
            return true;
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
