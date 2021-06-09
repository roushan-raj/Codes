#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int cost = 0;
int minimiseCost(vector<int>& vec){
    priority_queue<int, vector<int>, greater<int>> min_heap;
    for(int i=0; i<vec.size(); i++){
        min_heap.push(vec[i]);
    }
    while(min_heap.size() > 1){
        int first = min_heap.top();
        min_heap.pop();
        int second = min_heap.top();
        min_heap.pop();
        int add = first + second;
        cost = cost + add;
        min_heap.push(add);
    }
    return cost;
}
    
int main() {
    
    vector<int> vec = {1, 2, 3, 4, 5};
    cout<<minimiseCost(vec);
    
    return 0;
}