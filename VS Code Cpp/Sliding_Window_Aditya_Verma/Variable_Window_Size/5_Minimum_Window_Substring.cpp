#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void findMinimumWindow(string s, string p, int n, int m){
    
    int i=0, j=0, mx = INT_MAX;
    string ans = "";
    unordered_map<char, int> mp;
    for(int k=0; i<m; k++){
        mp[s[j]]++;
    }
    int count = mp.size();

    while(j < n){

       if(mp.find(s[j]) != mp.end()){
           mp[s[j]]--;

            if(mp[s[j]] == 0){
                count--;
            }
       }

       while(count == 0 and i<=j){
           if(mx > (j-i+1)){
               mx = j-i+1;
               ans = s.substr(i, j-i+1);
           }

           if(mp.find(s[i]) != mp.end()){
               mp[s[i]]++;

               if(mp[s[i]] == 1){
                   count++;
               }
           }
           i++;
       }
       j++;
    } 
    cout<<ans<<" "<<mx;  
}
    
int main() {
    
    string s = "TOTMTAPTAT";
    string p = "TTA";
    int n = s.length();
    int m = p.length();

    findMinimumWindow(s, p, n, m);
    
    return 0;
}