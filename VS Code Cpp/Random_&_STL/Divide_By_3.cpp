#include<iostream>
#include<bits/stdc++.h>
using namespace std;
    
int main() {
    
    int t;
    cin>>t;
    while(t--){
        int a, b;
        cin>>a;
        cin>>b;

        int count = 0;

        for(int i=a; i<=b; i++){
            if(i%3 == 0){
                count++;
            }
        }
        cout<<count;
        cout<<endl;
    }
    
    return 0;
}