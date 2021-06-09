#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int countAnagrams(string str, string ptr, int n, int k){

    unordered_map<char, int> mp;
    for(int i=0; i<ptr.length(); i++){
        mp[ptr[i]]++;
    }
    int count = mp.size();

    int i=0, j=0, ans = 0;

    while(j < n){
   
        mp[str[j]]--;
        if(mp[str[j]] == 0){
            count--;
        }

        if(j-i+1 < k){
            j++;
        }

        else if(j-i+1 == k){

            if(count == 0){
                ans++;
            }

            mp[str[i]]++;
            if(mp[str[i]] == 1){
                count++;
            }
            i++, j++;
        }
    }
    return ans;
}
    
int main() {
    
    string str = "forxxorfxdofr";
    string ptr = "for";

    int n = str.length();
    int k = ptr.length();

    cout<<countAnagrams(str, ptr, n, k);
    
    return 0;
}