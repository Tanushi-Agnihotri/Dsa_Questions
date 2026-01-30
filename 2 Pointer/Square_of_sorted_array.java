public class Square_of_sorted_array {
    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[position] = nums[left] * nums[left];
                left++;
            }
            else{
                res[position] = nums[right] * nums[right];
                right--;
            }
            position--;
        }

        return res;
    }
    public static void main(String[] args){
        Square_of_sorted_array o = new Square_of_sorted_array();
        int[] arr = {-4,-1,0,3,10};
        o.sortedSquares(arr);
    }
}
