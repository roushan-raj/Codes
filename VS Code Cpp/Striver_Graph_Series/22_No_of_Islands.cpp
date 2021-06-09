#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void dfs(vector<vector<int>>& grid, int i, int j){
    if(i>=0 && i<grid.size() && j>=0 && j<grid[0].size() && grid[i][j] == 1){

        grid[i][j] == 2;

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}

int countIslands(vector<vector<int>>& grid){
    int count = 0;
    for(int i=0; i<grid.size(); i++){
        for(int j=0; j<grid[0].size(); j++){
            if(grid[i][j] == 1){
                count++;
                dfs(grid, i, j);
            }
        }
    }
    return count;
}
    
int main() {
    
    vector<vector<int>> grid  = {{1, 1, 0, 0, 0},
                                 {1, 1, 0, 0, 0},
                                 {0, 0, 1, 0, 0},
                                 {0, 0, 0, 1, 1}};

    cout << countIslands(grid);
    
    return 0;
}