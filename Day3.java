package day3.javaa;


public class Day3Javaa {

    public static void main(String[] args) {
        System.out.println("OPERATOR ARITMATIKA :");
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);
        
        System.out.println("OPERATOR PENUGASAN :");
        a += b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
        
        System.out.println("OPERATOR PERBANDINGAN :");
        int d = 15;
        int e = 5;
        boolean f = d > e;
        System.out.println(f);
        boolean w = d < e;
        System.out.println(w);
        boolean p = d >= e;
        System.out.println(p);
        boolean o = d <= e;
        System.out.println(o);
        boolean l = d == e;
        System.out.println(l);
        boolean q = d != e;
        System.out.println(q);
        
        System.out.println("OPERATOR LOGIKA :");
        boolean nu = true;
        boolean ba = true;
        boolean ca = nu && ba;
        System.out.println(ca);
        boolean ds = nu || ba;
        System.out.println(ds);
        boolean la = !nu;
        System.out.println(la);
        
        System.out.println("OPERATOR TERNARRY :");
        int as = 12;
        int ad = 6;
        String zz = as > ad ? "iya" : "tidak";
        System.out.println(zz);
        
        
        
        
    }
    
}
