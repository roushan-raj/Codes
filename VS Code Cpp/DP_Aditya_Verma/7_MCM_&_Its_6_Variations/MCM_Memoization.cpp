#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001];
int mcm(int arr[], int i, int j){

    if(i>=j){
        return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }

    int mn = INT_MAX;
    for(int k=i; k<=j-1; k++){
        int temp = mcm(arr, i, k) + mcm(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);

        if(temp < mn){
            mn = temp;
        }
    }
    return dp[i][j] = mn;
}
    
int main() {
    
    int arr [] = {40, 20, 30, 10, 30};
    int n = sizeof(arr) / sizeof(arr[0]);
    memset(dp, -1, sizeof(dp));

    cout<<mcm(arr, 1, n-1);
    
    return 0;
}