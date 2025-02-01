
public class integer_to_roman {
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < values.length; i++) {
            if (num == 0) {
                break;
            }

            while (num >= values[i]) {
                res.append(symbols[i]);
                num -= values[i];

            }
        }

        return res.toString();

    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(intToRoman(num));
    }
}
