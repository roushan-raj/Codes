#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001]; // dimensions depends on constraints given in que.

int maxPathSum(vector<vector<int>>& grid){
    int row = grid.size();
    int col = grid[0].size();

    if(row == 0){
        return 0;
    }

    dp[0][0] = grid[0][0];

    // initialisation of 1st column;
    for(int i=1; i<row; i++){
        dp[i][0] = grid[i][0] + dp[i-1][0];
    }

    // initialisation of 1st row;
    for(int j=1; j<col; j++){
        dp[0][j] = grid[0][j] + dp[0][j-1];
    }

    for(int i=1; i<row; i++){
        for(int j=1; j<col; j++){
            dp[i][j] = grid[i][j] + max(dp[i-1][j], dp[i][j-1]);
        }
    }
    return dp[row-1][col-1];
}
    
int main() {
    
    vector<vector<int>> grid = {{1, 3, 5},
                                {2, 1, 2},
                                {4, 3, 1}};

    cout<<maxPathSum(grid);                            
    
    return 0;
}