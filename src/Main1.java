
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class person{
    String name;
    int gp;
    public person(String name, int gp) {
        this.name = name;
        this.gp = gp;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            List<person>list=new ArrayList<>();
            for (int i = 0; i <a ; i++) {
                String h=in.next();
                int f=in.nextInt();
                person p=new person(h,f);
                list.add(p);
            }
            //排序链表
//            if(b==0) {
//                Sort(list);
//            }else{
//                Sort1(list);
//            }
            Sort2(list,b);
            for (int i = 0; i <list.size() ; i++) {
                System.out.print(list.get(i).name+" "+list.get(i).gp);
                System.out.println();
            }
        }
    }

    private static void Sort(List<person> list) {
        for (int i = 1; i <list.size() ; i++) {
            person p=list.get(i);
            int j=i-1;
            for (; j>=0&&list.get(j).gp<p.gp; j--) {
                list.set(j+1,list.get(j));
            }
            list.set(j+1,p);

        }
    }
    private static void Sort1(List<person> list) {
        for (int i = 1; i <list.size() ; i++) {
            person p=list.get(i);
            int j=i-1;
            for (; j>=0&&list.get(j).gp>p.gp; j--) {
                list.set(j+1,list.get(j));
            }
            list.set(j+1,p);

        }
    }
    private static void Sort2(List<person>list,int b){
        for (int i = 1; i <list.size() ; i++) {
            person p=list.get(i);
            int j=i-1;
            for (; j>=0&&new Conpare(b==0).compare(list.get(j),p)>0; j--) {
                list.set(j+1,list.get(j));
            }
            list.set(j+1,p);

        }
    }
    static class Conpare implements Comparator<person> {
        boolean a;

        public Conpare(boolean a) {
            this.a = a;
        }

        @Override
        public int compare(person o1, person o2) {
            if(a==true){
                return o2.gp-o1.gp;
            }else{
                return o1.gp-o2.gp;
            }
        }
    }
}
