#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void findClosestPoints(vector<vector<int>>& vec, int k){
    priority_queue<pair<int, pair<int, int>>> max_heap;
    for(int i=0; i<vec.size(); i++){
        max_heap.push({vec[i][0]*vec[i][0] + vec[i][1]*vec[i][1], {vec[i][0], vec[i][1]}});
        if(max_heap.size() > k){
            max_heap.pop();
        }
    }
    while (!max_heap.empty()){
        pair<int, int> p = max_heap.top().second;
        cout<<p.first<<" "<<p.second<<endl;
        max_heap.pop();
    }
}
 
int main() {
    
    vector<vector<int>> vec = {{1, 3},{-2, 2},{5, 8}, {0, 1}};
    findClosestPoints(vec, 2);
    
    return 0;
}