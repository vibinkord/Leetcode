class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] arr = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int mul = n1 * n2;
                int sum = mul + arr[i + j + 1];

                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.toString();
    }
}
