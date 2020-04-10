package NewTest;

import java.util.Scanner;

public class TheFirst {
    Scanner sc = new Scanner(System.in);
        while(sc.hasNext())

    {
        String str1 = sc.nextLine();
        String shuchu;
        int lastindex = str1.lastIndexOf(",");
        String str2 = str1.substring(0, lastindex);
        StringBuffer sb = new StringBuffer("[");
        int lastsecondindex = str2.lastIndexOf(",");
        String str = str1.substring(0, lastsecondindex);
        String m = str1.substring(lastsecondindex + 1, lastindex);
        str = str.substring(1, str.length() - 1);
        String[] s = str.split("]");
        for (int i = 0; i < Integer.parseInt(m); i++) {
            if (i == 0) {
                s[0] = s[0].substring(1, s[0].length());
            } else {
                s[i] = s[i].substring(2, s[i].length());
            }
            if (i % 2 == 1) {
                s[i] = fanzhuan(s[i]);
                sb.append(",");
            }
            sb.append(s[i]);
        }
        if ((Integer.valueOf(m)) % 2 == 0) {
            shuchu = sb.substring(0, sb.length() - 1);
        } else {
            shuchu = sb.toString();
        }
        System.out.println(shuchu + "]");
    }
        sc.close();
}

    public static String fanzhuan(String s) {
        StringBuffer sb = new StringBuffer();
        String[] str1 = s.split(",");
        String[] str2 = new String[str1.length];
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[str2.length - 1 - i];
            sb.append(str2[i]).append(",");
        }
        return sb.toString();
    }


}
