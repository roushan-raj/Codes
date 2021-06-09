#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int minSubsetSumDiff(int arr [], int range, int n){
    bool dp[n+1][range+1];

    for(int j=0; j<range+1; j++){
        dp[0][j] = false;
    }
    for(int i=0; i<n+1; i++){
        dp[i][0] = true;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<range+1; j++){
            if(arr[i-1] <= j){
                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    } 
    vector<int> vec;
    for(int j=0; j<(range+1)/2; j++){
        if(dp[n-1][j] == true){
            vec.push_back(j);
        }
    }

    int mn = INT_MAX;
    for(int i=0; i<vec.size(); i++){
        mn = min(mn, range - 2*vec[i]);
    }
    return mn;
}
    
int main() {
    
    int arr [] = {1, 6, 11, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int sum;
    for(int i=0; i<n; i++){
        sum = sum + arr[i];
    }
    cout<<minSubsetSumDiff(arr, sum, n);
    
    return 0;
}