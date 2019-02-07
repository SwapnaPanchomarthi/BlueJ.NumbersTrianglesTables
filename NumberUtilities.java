


public class NumberUtilities {

    public static String getRange(int stop) {
       
        StringBuilder sp = new StringBuilder();
        
        for (int i = 0; i < stop; i++){
            sp.append(i);
        }
        
        return sp.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sp = new StringBuilder();
        for(int i = start; i<stop; i++)
        {sp.append(i);
        }
        return sp.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sp = new StringBuilder();
        for(int i = start; i<stop; i+=step)
        {sp.append(i);
        }
        return sp.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sp = new StringBuilder();
        for (int i=start; i<stop; i++)
        {
            if(i%2==0)
            {sp.append(i);}
        }
        return sp.toString();
    }


    public static String getOddNumbers(int start, int stop) {
       StringBuilder sp = new StringBuilder();
        for (int i=start; i<stop; i++)
        {
            if(i%2==1)
            {sp.append(i);}
        }
        return sp.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder sp = new StringBuilder();
        for (int i=start; i<=stop; i++)
        {
            int b = (int)(Math.pow(i,exponent));
            sp.append(b);
        }
        return sp.toString();
    }
}
