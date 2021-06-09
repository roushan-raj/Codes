#include<iostream>
#include<bits/stdc++.h>
using namespace std;

        // ************* Exact same code as of unbounded knapsack ***************

int rodCutting(int length[], int price[], int maxLen, int n){
    int dp[n+1][maxLen+1];

    for(int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }
    for(int j=0; j<maxLen+1; j++){
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<maxLen+1; j++){
            if(length[i-1] <= j){
                dp[i][j] = max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    return dp[n][maxLen];
}
    
int main() {
    
    int length [] = {1, 2, 3, 4, 5, 6, 7, 8};
    int price [] = {1, 5, 8, 9, 10, 17, 17, 20};
    int maxLen = 8;

    int n = sizeof(length) / sizeof(length[0]);
    cout<<rodCutting(length, price, maxLen, n);
    
    return 0;
}