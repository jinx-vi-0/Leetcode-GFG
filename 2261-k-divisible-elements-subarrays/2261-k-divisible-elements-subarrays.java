class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        Set<ArrayList> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (nums[j] % p == 0) cnt++;
                if (cnt > k) break;
                list.add(nums[j]);
                set.add(new ArrayList<>(list));
            }
        }
        return set.size();
    }
}