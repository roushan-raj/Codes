#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isPalindrome(string s, int i, int j){
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

    if(i >= j){
        return 0;
    }
    if(isPalindrome(s, i, j) == true){
        return 0;
    }
    int mn = INT_MAX;
    for(int k=i; k<=j-1; k++){
        int temp = 1 + palindromePartitioning(s, i, k) + palindromePartitioning(s, k+1, j);

        if(temp < mn){
            mn = temp;
        }
    }
    return mn;
}
    
int main() {
    
    string s = "nitim";
    int n = s.length();

    cout<<palindromePartitioning(s, 0, n-1);
    
    return 0;
}