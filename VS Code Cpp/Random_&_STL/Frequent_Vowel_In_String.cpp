#include<iostream>
#include<bits/stdc++.h>
using namespace std;

char findFrequentVowel(string str){
    int n = str.size();

    map<char, int> mp;
    for(auto ch : str){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            mp[ch]++;
        }
    }
    int freq = 0;
    char ans;
    for(auto it : mp){
        if(it.second > freq){
            freq = it.second;
            ans = it.first;
        }
    }
    return ans;
}
    
int main() {
    
    string str = "bcdsjbsfdaaiii";
    cout<< findFrequentVowel(str);
    
    return 0;
}