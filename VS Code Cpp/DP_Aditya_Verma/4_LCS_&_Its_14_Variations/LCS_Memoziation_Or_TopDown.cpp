#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp [1001][1001];   // dimentions depends on the given constraints in question

int lcs(string x, string y, int n, int m){   

    if(n==0 || m==0){
        return 0;
    }

    if(dp[n][m] != -1){
        return dp[n][m];
    }

    if(x[n-1] == y[m-1]){
        return dp[n][m] = 1 + lcs(x, y, n-1, m-1);
    }
    else{
        return dp[n][m] = max(lcs(x, y, n, m-1), lcs(x, y, n-1, m));
    }
}
    
int main() {
    
    string x = "abcdgh";
    string y = "abedfhr";
    int n = x.length();
    int m = y.length();

    memset(dp, -1, sizeof(dp));

    cout<<lcs(x, y, n, m);
    
    return 0;
}