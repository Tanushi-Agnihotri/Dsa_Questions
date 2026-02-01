public class Reverse_Words_in_a_String {

        public String reverseWords(String s) {

            // "  hello    world   "
            //.   l            r

            //trimming the array

            int l=0, r=s.length()-1;

            while(l<s.length()){
                if(s.charAt(l)==' '){
                    l++;
                }
                else{
                    break;
                }
            }

            while(r<s.length()){
                if(s.charAt(r)==' '){
                    r--;
                }
                else{
                    break;
                }
            }

            // "hello    world"
            //               l            r

            //cleaning data and storing in string builder

            StringBuilder sb = new StringBuilder();

            while(l<=r){
                if(s.charAt(l) != ' '){
                    sb.append(s.charAt(l));
                    l++;
                }
                else if(s.charAt(l) == ' '){
                    if(sb.charAt(sb.length()-1)!=' '){
                        sb.append(' ');
                    }
                    else{
                        l++;
                    }
                }
            }


            //. "hello world"
            //.  i         j

            //reverse the String

            int i=0, j =sb.length()-1;

            while(i<j){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }


            // world olleh
            //       p
            //       k



            int start=0,end = 0;

            //reversing word by word

            while(start<sb.length()){
                while(end<sb.length() && sb.charAt(end)!=' '){
                    end++;
                }

                int p = start;
                int k = end-1;

                while(p<k){
                    char temp = sb.charAt(p);
                    sb.setCharAt(p,sb.charAt(k));
                    sb.setCharAt(k,temp);
                    p++;
                    k--;
                }

                start = end+1;
                end = start;
            }

            return sb.toString();
        }
}
