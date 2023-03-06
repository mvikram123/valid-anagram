import java.util.*;

class Solution {
    static boolean areAnagram(String c1, String c2) {
        //Write your code here
        int n=c1.length();
        char[] ch1=c1.toCharArray();

        char[] ch2=c2.toCharArray();

        if(c1.length()!=c2.length())return false;

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0; i<ch1.length; i++)
        {
            if(ch1[i]!=ch2[i])
            {
                return false;
            }


        }
        return true;


    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();

        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
}