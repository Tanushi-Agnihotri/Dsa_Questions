public class Append_Characters_to_String_to_Make_Subsequence {
        public int appendCharacters(String s, String t) {

            int i = 0, j = 0;

            while(j<t.length() && i<s.length()){

                if(s.charAt(i)==t.charAt(j)){
                    i++;
                    j++;
                }

                else{
                    i++;
                }
            }
            return t.length() - j;
        }

}
