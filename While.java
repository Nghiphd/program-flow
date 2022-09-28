public class While
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    int i = 0;
    int k = 6;
    
    public void run() {
        do {
            System.out.println(i);
            i++;
        } while (i < 15);
        do {
            System.out.println(k);
            k++;
        } while (k > 5);
        do {
            System.out.println(a);
            System.out.println(b);
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }
    
    
    public static void main(String[] args)
    {        
        While hw = new While();
        hw.run();
    }
}
