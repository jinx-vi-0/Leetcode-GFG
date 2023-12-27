class Solution {
public:
    int minOperations(string s) {
        int cnt = 0, n = s.length();
        for (int i = 0; i < n; ++i)
            if (s[i] - '0' != i % 2)
                cnt++;
        return min(cnt, n - cnt);
    }
};