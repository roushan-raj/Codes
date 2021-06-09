#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxProfit(int wt[], int val[], int w, int n){
    // dimension of 2-d matrix will be of changing variable in question
    // here weight of bag and size of array is changing
    
    int static dp[102][1002];  // according to the constaints given in the question
    memset(dp, -1, sizeof(dp));

    if(n == 0 || w == 0){
        return 0;
    }
    if(dp[n][w] != -1){
        return dp[n][w];
    }

    if(wt[n-1] <= w){
        return dp[n][w] = max(val[n-1] +  maxProfit(wt, val, w-wt[n-1], n-1), maxProfit(wt, val, w, n-1));
    }
    else {  // if(wt[n-1] > w)
        return dp[n][w] = maxProfit(wt, val, w, n-1);
    }
}
    
int main() {
    
    int wt [] = {1, 3, 4, 5};
    int val [] = {1, 4, 5, 7};
    int w = 7;
    int n = sizeof(wt) / sizeof(wt[0]);

    cout<<maxProfit(wt, val, w, n);
    
    return 0;
}