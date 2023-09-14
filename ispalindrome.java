class Solution {
    public boolean isPalindrome(int x) 
    {
        String y = Integer.toString(x);
        String z = "";
        char a;

        for(int i = y.length()-1; i >= 0; i--)
        {
            a = y.charAt(i);
            z += a;
        }

       // System.out.println(y);
        // System.out.println(z);
        return z.equals(y);
    }
}
