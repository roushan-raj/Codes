#include<iostream>
#include<bits/stdc++.h>
using namespace std;

unordered_map<string, int> mp;

int solve(string s, int i, int j, bool isTrue){

    if(i>j){              // base case
        return false;
    }
    if(i==j){             // base case
        if(isTrue == true){    
            return s[i] == 'T';
        }
        else{
            return s[i] == 'F';
        }
    }

    string temp = to_string(i);
    temp.push_back(' ');
    temp.append(to_string(j));    // key formation
    temp.push_back(' ');
    temp.append(to_string(isTrue));

    if(mp.find(temp) != mp.end()){   // memoization
        return mp[temp];
    }

    int ans = 0;
    for(int k=i+1; k<=j-1; k=k+2){
        int lT = solve(s, i, k-1, true);
        int lF = solve(s, i, k-1, false);
        int rT = solve(s, k+1, j, true);
        int rF = solve(s, k+1, j, false);

        if(s[k] == '&'){
            if(isTrue == true){
                ans = ans + lT * rT;
            }
            else{
                ans = ans + lT*rF + lF*rT + lF*rF;
            }
        }
        else if(s[k] == '|'){
            if(isTrue == true){
                ans = ans + lT*rF + lF*rT + lT*rT;
            }
            else{
                ans= ans + lF*rF;
            }
        }
        else if(s[k] == '^'){
            if(isTrue == true){
                ans = ans + lT*rF + lF*rT;
            }
            else{
                ans = ans + lT*rT + lF*rF;
            }
        }
    }
    return mp[temp] = ans;  // memoization
}
    
int main() {
    
    string s = "T^F&T";
    int n = s.length();
    bool isTrue = true;
    mp.clear();

    cout<<solve(s, 0, n-1, isTrue);
    
    return 0;
}