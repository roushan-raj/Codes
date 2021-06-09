#include<iostream>
#include<bits/stdc++.h>
using namespace std;

unordered_map<string, int> mp;

int wordBreak(string str, vector<string>& arr){
    int n = str.length();
    if(n == 0){
        return 1;
    }
    
    if(mp[str] != 0){
        return mp[str];
    }

    for(int i=1; i<=n; i++){
        int flag = 0;

        string ss = str.substr(0, i);
        for(int j=0; j<arr.size(); j++){
            if(ss.compare(arr[j]) == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1 && wordBreak(str.substr(i, n-i), arr) == 1){
            return mp[str] = 1;
        }
    }
    return mp[str] = -1;
}
    
int main() {
    
    string str = "ilike";
    vector<string> arr = { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango" };

    if(wordBreak(str, arr)){
        cout<<"Yes";
    }
    else{
        cout<<"No";
    }
    return 0;
}