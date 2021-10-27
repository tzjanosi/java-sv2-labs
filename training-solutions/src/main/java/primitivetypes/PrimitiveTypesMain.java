package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a=2;
        System.out.println(a);
        Integer b=2;
        System.out.println(b);
        Integer c=a;
        System.out.println(c);
        Integer d=b;
        System.out.println(d);
        Integer e= new Integer(2);
        System.out.println(e);
        int f= new Integer(2);
        System.out.println(f);
        int g=Integer.valueOf(a);
        System.out.println(g);
        int h=Integer.valueOf(c);
        System.out.println(h);
        int i=Integer.parseInt("2");
        System.out.println(i);
        Integer j=Integer.parseInt("2");
        System.out.println(j);
        System.out.println();

        boolean k=true;
        Boolean l=true;
        boolean m=new Boolean(true);
        Boolean n=new Boolean(true);
        boolean o=Boolean.parseBoolean("TrUe");
        Boolean p=Boolean.parseBoolean("TrUe");
        boolean q=Boolean.parseBoolean("TreU");
        Boolean r=Boolean.parseBoolean("TreU");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
