package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class DecodeWays {
    public static ArrayList<String> decodeWays(String str) {
        int count=0;
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (str.charAt(0) == '0') {
            return new ArrayList<>();
        }

        char ch1 = str.charAt(0);

        ArrayList<String> myAns = new ArrayList<>();
        ArrayList<String> recAnsForLen1 =
                decodeWays(str.substring(1));

        for (String s : recAnsForLen1) {

            char letter = (char) ('a' + ch1 - '1');

            myAns.add(letter + s);
        }
        if (str.length() > 1) {

            char ch2 = str.charAt(1);

            int num = (ch1 - '0') * 10 + (ch2 - '0');

            if (num <= 26) {

                ArrayList<String> recAnsForLen2 =
                        decodeWays(str.substring(2));
                for (String s : recAnsForLen2) {
                    char letter = (char) ('a' + num - 1);
                    myAns.add(letter + s);
                }
            }
        }

        return myAns ;
    }

    public static int count (ArrayList<String> al) {
        int cnt = al.size();
        return  cnt;
    }

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        String str = scn.next();
//
//        ArrayList<String> ans = decodeWays(str);
//
//        System.out.println("Decoding ways:");
//
//        for (String s : ans) {
//            System.out.println(s);
//        }
//
//        System.out.println("Total ways = " + ans.size());
//
//        scn.close();

        System.out.println(count(decodeWays("1234")));
    }
}
