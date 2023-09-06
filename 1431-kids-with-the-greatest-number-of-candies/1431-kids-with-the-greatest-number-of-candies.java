class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i : candies) {
            max = Math.max(max, i);
        }
        for(int i : candies) {
            result.add(i + extraCandies >= max ? true : false);
        }
        return result;
    }
}