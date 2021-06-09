#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001];

bool isPalindrome(string s, int i, int j){
    if(i==j){
        return true;
    }
    if(i>j){
        return true;
    }
    while(i <= j){
        if(s[i] == s[j]){
            i++, j--;
        }
        else{
            return false;
        }
    }
    return true;
}

int palindromePartitioning(string s, int i, int j){
    if(i>=j){
        return 0;
    }
    if(isPalindrome(s, i, j) == true){
        return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }

    int mn = INT_MAX;
    for(int k=i; k<=j-1; k++){
        int temp = 1+palindromePartitioning(s, i, k) + palindromePartitioning(s, k+1, j);

        if(temp < mn){
            mn = temp;
        }
    }
    return dp[i][j] = mn;
}
    
int main() {
    
    string s = "aabbccdd";
    int n = s.length();
    memset(dp, -1, sizeof(dp));

    cout<<palindromePartitioning(s, 0, n-1);
    
    return 0;
}