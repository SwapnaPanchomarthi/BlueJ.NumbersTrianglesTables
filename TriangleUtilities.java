 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder sp = new StringBuilder();
        for (int i=0; i<numberOfStars; i++)
        {String b ="*";
            sp.append(b);
            
        }
        return sp.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder sp = new StringBuilder();
        for (int j=1; j<=numberOfRows; j++)
        {String c = getRow(j);
            sp.append(c+"\n");
        }
        
        return sp.toString();
    }


    public static String getSmallTriangle() {
        int smallTri =4;
        StringBuilder sp = new StringBuilder();
        for (int j=1; j<=smallTri; j++)
        {String c = getRow(j);
            sp.append(c+"\n");
        }
        
        return sp.toString();
        
    }

    public static String getLargeTriangle() {
        int largeTri =9;
        StringBuilder sp = new StringBuilder();
        for (int j=1; j<=largeTri; j++)
        {String c = getRow(j);
            sp.append(c+"\n");
        }
        
        return sp.toString();
    }
}
