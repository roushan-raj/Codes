#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// ****************** Maximum no.of ways ********************

int totalWays(int coin[], int sum, int n){
    int dp[n+1][sum+1];

    for(int j=0; j<sum+1; j++){
        dp[0][j] = 0;
    }
    for(int i=0; i<n+1; i++){
        dp[i][0] = 1;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<sum+1; j++){
            if(coin[i-1] <= j){
                dp[i][j] = dp[i-1][j] + dp[i][j-coin[i-1]];
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

    cout<<totalWays(coin, sum, n);
    
    return 0;
}