#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// ****************** Minimum no.of coins ********************

int minNoofCoins(int coin[], int sum, int n){
    int dp[n+1][sum+1];

    for(int j=0; j<sum+1; j++){
        dp[0][j] = INT_MAX-1;
    }
    for(int i=1; i<n+1; i++){
        dp[i][0] = 0;
    } 

    // for(int j=1; j<sum+1; j++){
    //     if(j%coin[0] == 0){
    //         dp[1][j] = j/coin[0];
    //     }
    //     else{
    //         dp[1][j] = INT_MAX-1;
    //     }
    // }

    for(int j=1; j<sum+1; j++){
        for(int i=1; i<n+1; i++){
            if(coin[i-1] <= j){
                dp[i][j] = min(1 + dp[i][j-coin[i-1]], dp[i-1][j]);
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    return dp[n][sum];
}
    
int main() {
    
    int coin [] = {1, 2, 3};
    int sum = 5;
    int n = sizeof(coin) / sizeof(coin[0]);

    cout<<minNoofCoins(coin, sum, n);
    
    return 0;
}