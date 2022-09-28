public class if_statements
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        if (a==5) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (b==2) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (c!=1) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (d==-8 && a==4) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
    
    
    public static void main(String[] args)
    {        
        if_statements hw = new if_statements();
        hw.run();
    }
}