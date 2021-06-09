#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int longestPalindromicSubstring(string x, string y, int n, int m){
    int dp [n+1][m+1];

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
                dp[i][j] = 0;
            }
        }
    }

    int mx = INT_MIN;
    for(int i=0; i<n+1; i++){
        for(int j=0; j<m+1; j++){
            mx = max(mx, dp[i][j]);
        }
    }
    return mx;
}
    
int main() {
    
    string x = "forgeeksskeegfor";
    string y = x;
    reverse(y.begin(), y.end());
    int n = x.length();
    int m = y.length();

    cout<<longestPalindromicSubstring(x, y, n, m);
    
    return 0;
}