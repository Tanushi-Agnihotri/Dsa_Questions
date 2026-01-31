public class Valid_Word_Abreviation {
        public boolean validWordAbbreviation(String word, String abbr) {

            int first = 0, second = 0, sum = 0;

            while(second<abbr.length()&& first<word.length()){
                char w_c = word.charAt(first);
                char a_c = abbr.charAt(second);

                if(Character.isDigit(a_c)){

                    if (a_c =='0' && sum==0){return false;}

                    sum = (10*sum)+(a_c-'0');
                    second++;
                    continue;
                }
                else{

                    first = first + sum;
                    sum=0;

                    if(first>=word.length() || word.charAt(first)!=a_c){return false;}

                    first++;
                    second++;
                }

            }
            return first+sum == word.length();

        }

        public static void main(String[]args){
            String s = "implementation";
            String a ="14";
            Valid_Word_Abreviation ob = new Valid_Word_Abreviation();
            ob.validWordAbbreviation(s,a);
        }
}


