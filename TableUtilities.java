 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        
        //String table = " ";
        StringBuilder sp = new StringBuilder();
        for (int i=1;i<=5;i++)
        {
            for (int j=1; j<=5;j++)
            {
            int k = i*j;
            sp.append(String.format("%3d |",k));
            
        }
        sp.append("\n");
        }
        return sp.toString();
    }

    public static String getLargeMultiplicationTable() {
         StringBuilder sp = new StringBuilder();
        for (int i=1;i<=10;i++)
        {
            for (int j=1; j<=10;j++)
            {
            int k = i*j;
            sp.append(String.format("%3d |",k));
            
        }
        sp.append("\n");
        }
        return sp.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sp = new StringBuilder();
        for (int i=1;i<=tableSize;i++)
        {
            for (int j=1; j<=tableSize;j++)
            {
            int k = i*j;
            sp.append(String.format("%3d |",k));
            
        }
        sp.append("\n");
        }
        return sp.toString();
    }
}
