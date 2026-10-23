class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int arr[] = new int[hs.size()];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
                arr[j] = nums[i];
                j++;
            }
        }
        Arrays.sort(arr);
        if(arr.length-1 >= 2){
            return arr[arr.length-3];
        }else{
            return arr[arr.length-1];
        }
    }
}