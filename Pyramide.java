import java.util.Arrays;
class CannotBuildPyramidException extends Exception {
    public CannotBuildPyramidException(String errorMessage) {
        super(errorMessage);
    }
}
public class Pyramide {

    public static void main(String args[]) {
        int[] input_array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(input_array);
        int x_dim = 1;
        int cur_x = 0;
        for (int x=0;x<input_array.length;x++)
        {
            if(cur_x == x_dim)
            {
                cur_x = 0;
                x_dim++;
            }
            cur_x++;
        }
        try
        {
            if(cur_x < x_dim){throw new CannotBuildPyramidException("Cannot build pyramid...");}
            int y_dim = x_dim*2 - 1;
            int[][] result = new int[x_dim][y_dim];

            int cur_pos = input_array.length - 1;
            for (int i = x_dim-1; i>=0; i-- )
            {
                boolean is_zero = false;
                int zero_count = x_dim - i-1;
                int cur_zero = 0;
                int val_count = 0;
                for (int j = y_dim-1; j>=0; j-- )
                {
                    if(cur_zero<zero_count){
                        cur_zero++;
                        continue;
                    }
                    if(is_zero){is_zero = false;}
                    else{
                        result[i][j] = input_array[cur_pos];
                        cur_pos--;
                        is_zero=true;
                        val_count++;
                    }
                    if(val_count >= i+1)
                    {
                        break;
                    }
                }
            }
            for (int i = 0; i<x_dim; i++ )
            {
                for (int j = 0; j<y_dim; j++ )
                {
                    System.out.print(result[i][j]);
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
        }
        catch(CannotBuildPyramidException ex)
        {
            System.out.println(ex.toString());
        }


    }
}
