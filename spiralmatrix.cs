public class Solution {
    public int[][] GenerateMatrix(int n) {
        int[][] result = Initialize(n);
        int num = 1;
        for (int i = 0, j = n - 1; i <= j; i++, j--)
        {
            for (int x = i; x <= j; x++)
            {
                result[i][x] = num++;
            }
            
            for (int x = i + 1; x <= j; x++)
            {
                result[x][j] = num++;
            }
            
            for (int x = j - 1; x >= i; x--)
            {
                result[j][x] = num++;
            }
            
            for (int x = j - 1; x > i; x--)
            {
                result[x][i] = num++;
            }
        }
        
        return result;
    }
    
    private int[][] Initialize(int n)
    {
        int[][] result = new int[n][];
        for (int i = 0; i < n; i++)
        {
            result[i] = new int[n];
        }
        
        return result;
    }
}
