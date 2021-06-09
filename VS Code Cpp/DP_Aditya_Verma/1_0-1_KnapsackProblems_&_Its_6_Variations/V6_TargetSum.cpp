#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int countSubsetSum(int arr [], int sum, int n){
    int dp [n+1][sum+1];

    for(int j=0; j<sum+1; j++){
        dp[0][j] = 0;
    }
    for(int i=0; i<n+1; i++){
        dp[i][0] = 1;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<sum+1; j++){
            if(arr[i-1] <= j){
                dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    return dp[n][sum];
}
    
int main() {
    
    int arr [] = {1, 1, 2, 3};
    int diff = 1;
    int n = sizeof(arr) / sizeof(arr[0]);
    int sum = 0;
    for(int i=0; i<n; i++){
        sum = sum + arr[i];
    }
    int sum1 = (diff + sum) / 2;
    
    cout<<countSubsetSum(arr, sum1, n);
    
    return 0;
}