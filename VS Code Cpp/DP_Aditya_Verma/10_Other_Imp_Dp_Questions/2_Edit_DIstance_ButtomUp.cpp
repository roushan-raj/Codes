#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001];

int editDistance(string a, string b, int n, int m){

    int ans = -1;

    for(int i=0; i<n+1; i++){
        for(int j=0; j<m+1; j++){

            if(i==0){
                dp[i][j] = j;
            }

            else if(j==0){
                dp[i][j] = i;
            }

            else{
                if(a[i-1] == b[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int insert = 1 + dp[i][j-1];
                    int delet = 1 + dp[i-1][j];
                    int remove = 1 + dp[i-1][j-1];

                    dp[i][j] = min(min(insert, delet), remove);
                }
            }
        }
    }
    return dp[n][m];
}
    
int main() {
    
    string a = "horse";
    string b = "ros";
    int n = a.length();
    int m = b.length();
    memset(dp, -1, sizeof(dp));

    cout<<editDistance(a, b, n, m);
    
    return 0;
}