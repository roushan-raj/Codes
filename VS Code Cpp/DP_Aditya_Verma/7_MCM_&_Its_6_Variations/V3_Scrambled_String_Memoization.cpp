#include<iostream>
#include<bits/stdc++.h>
using namespace std;

unordered_map<string, bool> mp;

bool solve(string a, string b){

    if(a.length() != b.length()){  // base case
        return false;
    }
    if(a.empty() && b.empty()){   // base case
        return true;
    }
    if(a.compare(b) == 0){     // base case
        return true;
    }
    if(a.length() <= 1){     // base case
        return false;
    }

    string key = a;
    key.push_back(' ');
    key.append(b);

    if(mp.find(key) != mp.end()){  // memoization
        return mp[key];
    }

    int n = a.length();
    bool flag = false;

    for(int i=1; i<=n-1; i++){
        if((solve(a.substr(0, i), b.substr(n-i, i)) == true) && 
           (solve(a.substr(i, n-i), b.substr(0, n-i)) == true) || 
           (solve(a.substr(0, i), b.substr(0, i)) == true) && 
           (solve(a.substr(i, n-i), b.substr(i, n-i)) == true))  {
                flag = true;
                break;
        }
    }
    return mp[key] = flag;  // memoization
}
    
int main() {
    
    string a = "great";
    string b = "rgeat";
    mp.clear();

    cout<<solve(a, b);
    
    return 0;
}