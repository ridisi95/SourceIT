package fromnetwork;

public class TypesTutorial {
    public static void main(String... args) {
        A alpha = new B(0);
    }
}

class A {
    A(int x){            // - 1 -
        a(x);            // - 2 -
    }

    A(){}            // if delete default constructor we get exception in // - 3 -

    void a(int x) {      // never used in this example
        System.out.println("A-a: " + x);
    }
}

class B extends A {
    B(int x) {           // - 3 -
        a(x);            // - 4 -
    }

    void a(int x) {
        System.out.println("B-a: " + x);
    }
}
