//http://codealltheproblems.blogspot.com/2015/09/uva-10700-camel-trading.html
//沒研究這題，他arraylist的用法看不太懂
//之後再看看

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Pair {
        public BigInteger num;
        public char op;

        public Pair(BigInteger num, char op) {
            this.num = num;
            this.op = op;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        scanner.nextLine();
        for (int t = 0; t < tt; t++) {
            String line = scanner.nextLine();
            ArrayList<Pair> lista = new ArrayList<Pair>();
            ArrayList<Pair> listb = new ArrayList<Pair>();
            BigInteger num = BigInteger.ZERO;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                    num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(line.charAt(i) - '0'));
                } else if (line.charAt(i) == '*' || line.charAt(i) == '+') {
                    lista.add(new Pair(num, line.charAt(i)));
                    listb.add(new Pair(num, line.charAt(i)));
                    num = BigInteger.ZERO;
                }
            }
            lista.add(new Pair(num, ' '));
            listb.add(new Pair(num, ' '));
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).op == '+') {
                    lista.set(i, new Pair(lista.get(i).num.add(lista.get(i + 1).num), lista.get(i + 1).op));
                    lista.remove(i + 1);
                    i--;
                }
            }
            BigInteger max = BigInteger.ONE;
            for (int i = 0; i < lista.size(); i++) {
                max = max.multiply(lista.get(i).num);
            }
            for (int i = 0; i < listb.size(); i++) {
                if (listb.get(i).op == '*') {
                    listb.set(i, new Pair(listb.get(i).num.multiply(listb.get(i + 1).num), listb.get(i + 1).op));
                    listb.remove(i + 1);
                    i--;
                }
            }
            BigInteger min = BigInteger.ZERO;
            for (int i = 0; i < listb.size(); i++) {
                min = min.add(listb.get(i).num);
            }
            System.out.println("The maximum and minimum are " + max + " and " + min + ".");
        }
    }

}