package leetcode;

public class isomorphic_strings {
    public static boolean isIsomorphic(String s, String t) {
        int arrS[] = new int[256];
        int arrT[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (arrS[charS] != arrT[charT]) {
                return false;
            }

            arrS[charS] = i + 1;
            arrT[charT] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";

        System.out.println(isIsomorphic(s, t));
    }
}
