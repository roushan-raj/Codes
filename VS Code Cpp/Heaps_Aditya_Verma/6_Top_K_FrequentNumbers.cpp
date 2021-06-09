#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void topFrequentElements(vector<int>& vec, int k){
    unordered_map<int, int> map; // unordered_map is generally efficient that map
    for(int i=0; i<vec.size(); i++){
        map[vec[i]]++;
    }

    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> min_heap;
    for(auto it=map.begin(); it!= map.end(); it++){
        min_heap.push({it->second, it->first});
        if(min_heap.size() > k){
            min_heap.pop();
        }
    }
    while(min_heap.size() > 0){
        cout<<min_heap.top().second<<" ";
        min_heap.pop();
    }
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(2);
    vec.push_back(4);
    vec.push_back(1);

    topFrequentElements(vec, 2);
    
    return 0;
}