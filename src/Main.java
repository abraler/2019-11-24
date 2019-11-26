import java.util.*;

public class Main {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean []a=new boolean[n];
        for (int i = 0; i <n ; i++) {
            if(s.contains(p[i])){
                a[i]=true;
            }else{
                a[i]=false;
            }
        }
        return a;
    }
}