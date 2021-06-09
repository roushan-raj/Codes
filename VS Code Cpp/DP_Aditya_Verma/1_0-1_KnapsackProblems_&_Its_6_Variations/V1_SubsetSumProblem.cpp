#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool checkSubsetSum(int arr[], int sum, int n){

    bool dp [n+1][sum+1];
    
    for(int j=0; j<sum+1; j++){
        dp[0][j] = false;
    }

    for(int i=0; i<n+1; i++){
        dp[i][0] = true;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<sum+1; j++){
            if(arr[i-1] <= j){
                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    return dp[n][sum];
}
    
int main() {
    
    int arr [] = {2, 3, 7, 8, 10};
    int sum = 11;
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<checkSubsetSum(arr, sum, n);
    
    return 0;
}