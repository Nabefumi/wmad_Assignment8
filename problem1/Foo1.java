package ca.ciccc.wmad202.assignment8.problem1;

public class Foo1 {
    private int bar1;

    public Foo1(int x) {
        bar1 = x;
    }

    public class Foo2 extends Foo1{

        public Foo2(int x){
            super(x * 10);
        }

        public void show(){
            System.out.println("bar1=" + bar1);
            System.out.println("((Foo1)this).bar1=" + ((Foo1)this).bar1);
            System.out.println("Foo1.this.bar1="+Foo1.this.bar1);
        }
    }
}

