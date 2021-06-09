#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[101][101];

int solve(int e, int f){
    if(e == 1){
        return f;
    }
    if(f == 0 || f == 1){
        return f;
    }
    if(dp[e][f] != -1){
        return dp[e][f];
    }

    int mn = INT_MAX;
    for(int k=1; k<=f; k++){
        int temp = 1 + max(solve(e-1, k-1), solve(e, f-k));

        mn = min(mn, temp);
    }
    return dp[e][f] = mn;
}
    
int main() {
    
    int e = 3;
    int f = 5;
    memset(dp, -1, sizeof(dp));

    cout<<solve(e, f);
    
    return 0;
}