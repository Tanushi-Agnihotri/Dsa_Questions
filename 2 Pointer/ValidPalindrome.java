class Solution {

    public boolean isAlphaNumeric(char c){
        if ((c>='a' && c<='z')|| (c>='A' && c<='Z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if(!isAlphaNumeric(c1)){
                left= left+1;
                continue;
            }

            if(!isAlphaNumeric(c2)){
                right=right-1;
                continue;
            }

            if(Character.toLowerCase(c1)!= Character.toLowerCase(c2)){
                return false;
            }

            left=left+1;
            right=right-1;
        }
            return true;
        
    }

    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";
        Solution sol = new Solution();
        boolean res = sol.isPalindrome(s);
        System.out.println(res);
    }
}