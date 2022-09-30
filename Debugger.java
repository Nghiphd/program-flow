public class Debugger
{
    public void run() {
       for (int k = 10; k != 0; k = k + (-3)) {
            System.out.println(k);
            //
        }
    }

    public static void main(String[] args)
    {        
        Debugger hw = new Debugger();
        hw.run();
    }
}
