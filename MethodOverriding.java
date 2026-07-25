class A {
    void dis() {
        System.out.println("hello");
    }
}

class B extends A {
    @Override
    void dis() {
        System.out.println("h");
    }
}

class C extends B {
    @Override
    void dis() {
        System.out.println("world");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        C obj = new C();  // Creating an object of class C
        obj.dis();        // Calls overridden method in C
    }
}
