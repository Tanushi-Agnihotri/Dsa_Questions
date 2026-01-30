public class Valid_Palindrome_2 {

        public boolean palindromeHelper(int left, int right, String s){
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public boolean validPalindrome(String s) {

            int left = 0;
            int right = s.length()-1;

            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return ((palindromeHelper(left+1,right,s) )|| palindromeHelper(left, right-1,s));
                }
                else{
                    left++;
                    right--;
                }
            }
            return true;

        }

        public static void main(String[]args){
            String s = "abbxa";
            Valid_Palindrome_2 ob = new Valid_Palindrome_2();
            ob.validPalindrome(s);
        }
}
