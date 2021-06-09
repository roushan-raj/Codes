#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int unboundedKnapsack(int wt[], int val[], int w, int n){
    int dp[n+1][w+1];

    for(int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }
    for(int j=0; j<w+1; j++){
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<w+1; j++){
            if(wt[i-1] <= j){          // dp[i][j-wt[i-1]] -> point to remember for unbounded knapsack
                                       // dp[i-1][j-wt[i-1]] -> point to remember for 0-1 knapsack
                dp[i][j] = max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);   
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    return dp[n][w];
}
    
int main() {
    
    int wt [] = {1, 3, 4, 5};
    int val[] = {1, 4, 5, 7};
    int w = 14;
    int n = sizeof(wt) / sizeof(wt[0]);

    cout<<unboundedKnapsack(wt, val, w, n);
    
    return 0;
}