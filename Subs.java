import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        int curPos = 0;
        for (int i=0;i<y.size();i++ )
        {
            String value =(String)y.get(i);
            String value2 =(String)x.get(curPos);
            if(value == value2)
            {
                curPos++;
            }
            if(curPos>=x.size()){return true;}
        }
        return false;
    }
}
public class Subs {
    public static void main(String args[]) {
        Subsequence s = new Subsequence();
        boolean b = s.find(Arrays.asList("A","B",  "C", "D"),
                Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));


        System.out.println(b);
    }
}