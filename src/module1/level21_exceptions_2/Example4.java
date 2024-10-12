package module1.level21_exceptions_2;

public class Example4 {
    public static void main(String[] args) {

        A a = new A();
        a.doNothingA();
    }
}

class A {
    public void doNothingA(){
        B b = new B();
        b.doNothingB();
    }
}

class B {
    public void doNothingB(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }
        StackTraceElement ste = stackTrace[1];
        System.out.println(ste.getClassName() + " " + ste.getMethodName() + " " + ste.getLineNumber());
    }
}
