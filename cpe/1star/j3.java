import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> st2 = new TreeSet<String>();
        st2.add("wearer");
        st2.add("waxers");
        st2.add("weaves");
        st2.add("weaver");
        st2.add("a");
        st2.add("abs");
        st2.add("axd");

        for(String s:st2) System.out.println(s);
    }
}