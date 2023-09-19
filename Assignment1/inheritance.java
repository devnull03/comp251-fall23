class A {
    int x = 1;

    public void setIt(int y) {
        x = y;
    }

    public int getIt() {
        return x;
    }
}

class B extends A {
    int x = 2;

    public void setIt(int y) {
        x = y;
    }

    public int getIt() {
        return x;
    }

    public void superSetIt(int y) {
        super.x = y;
    }

    public int superGetIt() {
        return super.x;
    }
}

class C extends B {
    int x = 3;

    public void setIt(int y) {
        x = y;
    }

    public int getIt() {
        return x;
    }

    public void superSetIt(int y) {
        super.x = y;
    }

    public int superGetIt() {
        return super.x;
    }

    public void superDuperSetIt(int y) {
        super.superSetIt(y);
    }

    public int superDuperGetIt() {
        return super.superGetIt();
    }
    public static void main(String[] args) {
        C c = new C();
        c.superDuperSetIt(4);
        System.out.println("C’s is " + c.getIt());
        System.out.println("B’s is " + c.superGetIt());
        System.out.println("A’s is " + c.superDuperGetIt());
    }

}


// System.out.println("C’s is " + c.getIt()); prints the value of C's x,
// which is 3 because it's from class C.
//
//System.out.println("B’s is " + c.superGetIt()); prints the value of B's x
// , which is 2 because it's from class B.
//
//System.out.println("A’s is " + c.superDuperGetIt()); prints the
// value of A's x, which is 4 because it was set by superDuperSetIt(4)
// other wise it would be 1