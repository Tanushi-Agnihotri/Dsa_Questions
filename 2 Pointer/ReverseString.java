public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp = s[left];

        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
    public static void main(String[]args){
        char[] s = {'H','e','l','l','o','h'};
        ReverseString r = new ReverseString();
        r.reverseString(s);
        }
}

