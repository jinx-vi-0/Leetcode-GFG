class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=0;
        for(auto el : nums) {
            if(i < 2 || el > nums[i-2])
                nums[i++] = el;
        }
        return i;
    }
};