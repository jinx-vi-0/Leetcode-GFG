class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& mat) {
        int n = mat.size(), m = mat[0].size();
        vector<vector<int>> tmat(m, vector<int> (n,0));
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                tmat[i][j] = mat[j][i];
        return tmat;
    }
};