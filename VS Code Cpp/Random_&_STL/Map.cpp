#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void mapOperations(map<char, int>& mymap){

    // map iterator to print all elements of map
    map<char,int> :: iterator it;
    for(it=mymap.begin(); it!=mymap.end(); it++){
        cout<< it->first << " => " << it->second<<'\n';
    
    }
    cout<<endl; 

    // map reverse_iterator to print all elements
    for(auto it=mymap.rbegin(); it!=mymap.rend(); it++){
        cout<< it->first << " => " << it->second<<'\n';
    }
    cout<<endl;

    map<string, int> secMap = {{"alpha", 10},
                                {"beta", 20},
                                {"theta", 30}};
    for(auto it=secMap.begin(); it!=secMap.end(); it++){
        cout<<it->first<<" => "<<it->second<<'\n';
    }                            
    cout<<endl;

    for(auto& it : secMap){
        cout<<it.first<< " => "<<it.second<<'\n';
    }
    cout<<endl;

}
    
int main() {
    
    map<char, int> mymap;
    mymap['a'] = 100;
    mymap['b'] = 200;
    mymap['c'] = 300;
    mymap['d'] = 400;

    mapOperations(mymap);
    
    return 0;
}