#include<iostream>
#include<bits/stdc++.h>
#define ll long long
using namespace std;

    
int main() {
    
    int t;
    cin>>t;
    while(t-- > 0){
        ll x ;
        cin >> x;

        bool flag = false;
        for(ll i=1; i<= cbrt(x); i++){
            ll a = i*i*i;
            ll b = (long) cbrt(x-a);
            if(a+(b*b*b) == x && b != 0){
                flag = true;
            }
        }
        
        if(flag){
            cout<<"YES\n";
        }
        else{
            cout<<"NO\n";
        }
    }
    return 0;
}