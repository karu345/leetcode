class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int j = 0; j < nums.length - 3; j++) {
            if(j > 0){
                if(nums[j] == nums[j-1]){
                    continue;
                }
            }
            for (int i = j+1; i < nums.length - 2; i++) {
                if (i > 0) {
                    if (i > j+1 && nums[i] == nums[i - 1]) {
                        continue;
                    }
                }
                int curr = nums[j];
                int curr2 = nums[i];
                int l = i + 1;
                int r = nums.length - 1;
                while ((l < r)) {
                    long sum = (long)curr + curr2 + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(curr, curr2, nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1] && nums[r] == nums[r + 1]) {
                            l++;
                            r--;
                        }
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}