#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findLargestSubstring(string s, int n){

    int i=0, j=0, ans = INT_MIN;
    unordered_map<char, int> mp;

    while(j < n){

        mp[s[j]]++;

        if(mp.size() > j-i+1){
            j++;
        }

        else if(mp.size() == j-i+1){
            ans = max(ans, j-i+1);
            j++;
        }

        else if(mp.size() < j-i+1){
            while (mp.size() < j-i+1){
                mp[s[i]]--;

                if(mp[s[i]] == 0){
                    mp.erase(s[i]);
                }
                i++;
            }
            j++;   
        }
    }
    return ans;
}
    
int main() {
    
    string s = "pwwkew";
    int n = s.length();

    cout<<findLargestSubstring(s, n);
    
    return 0;
}