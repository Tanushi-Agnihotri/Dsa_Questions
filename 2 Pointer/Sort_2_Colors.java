// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Sort_2_Colors {
    public static void main(String[] args) {

        int[]nums ={0,1,1,1,0,0,1,1};

        int i=0, j=nums.length-1;

        while(i<j){

            if(nums[i]==0){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        for(int k=0; k<nums.length; k++){
            System.out.println(nums[k]);
        }
    }
}