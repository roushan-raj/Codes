#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int lcs(string x, string y, int n, int m){
    int dp[n+1][m+1];

    for(int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }

    for(int j=0; j<m+1; j++){
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<m+1; j++){
            if(x[i-1] == y[j-1]){
                dp[i][j] = 1 + dp[i-1][j-1];
            }
            else{
                dp[i][j] = max(dp[i][j-1] , dp[i-1][j]);
            }
        }
    }
    return dp[n][m];
}
    
int main() {
    
    string x = "AXY";
    string y = "ADXCPY";
    int n = x.length();
    int m = y.length();

    int lc = lcs(x, y, n, m);

    if(lc == x.length()){
        cout<<true;
    } 
    else{
        cout<<false;
    }
    
    return 0;
}