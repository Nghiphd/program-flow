public class While
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    int i = 0;
    int k = 6;
    
    public void run() {
        while (i < 15) {
            System.out.println(i);
            i++;
        }
        while (k > 5) {
            System.out.println(k);
            k++;
        }
        while (a < 10 && b <= 20) {
            System.out.println(a);
            System.out.println(b);
            a++;
            b++;
        }
    }
    
    
    public static void main(String[] args)
    {        
        While hw = new While();
        hw.run();
    }
}
