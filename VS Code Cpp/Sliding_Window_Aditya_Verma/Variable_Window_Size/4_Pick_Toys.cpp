#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findLargestSubstring(string s, int n, int k){

    int i=0, j=0, ans = INT_MIN;
    unordered_map<char, int> mp;

    while(j < n){

        mp[s[j]]++;

        if(mp.size() < k){
            j++;
        }

        else if(mp.size() == k){
            ans = max(ans, j-i+1);
            j++;
        }

        else if(mp.size() > k){
            while (mp.size() > k){
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
    
    string s = "abaccab";
    int k = 2;
    int n = s.length();

    cout<<findLargestSubstring(s, n, k);
    
    return 0;
}