public class Debugger
{
    public void run() {
        for (int a = 0; a < 10; a++) {
            if (a == 4) {
                System.out.println("a is 4");
            } else if (a == 2) {
                System.out.println("a is 2");
            } else {
                if (a % 2 == 0 && a % 3 == 0) {
                    System.out.println("a is a mult of 2 and 3");
                } else {
                    System.out.println("a is nothing special");
                }
            }
        }
    }

    public static void main(String[] args)
    {        
        Debugger hw = new Debugger();
        hw.run();
    }
}
