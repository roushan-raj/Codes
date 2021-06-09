#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void closest(vector<int>& vec, int x, int k){
    priority_queue<pair<int, int>> max_heap;

    for(int i=0; i<vec.size(); i++){
        max_heap.push({abs(vec[i]-x), vec[i]});
        if(max_heap.size() > k){
            max_heap.pop();
        }
    }
    while(max_heap.size() > 0){
        cout<<max_heap.top().second << " ";
        max_heap.pop();
    }
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(10);
    vec.push_back(200);
    vec.push_back(3);
    vec.push_back(45);
    vec.push_back(88);

    closest(vec, 100, 3);
    
    return 0;
}