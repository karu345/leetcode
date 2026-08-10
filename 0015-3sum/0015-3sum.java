class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            int curr = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while ((l < r)) {
                if (curr + nums[l] + nums[r] == 0) {
                    ans.add(Arrays.asList(curr, nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (curr + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }
}