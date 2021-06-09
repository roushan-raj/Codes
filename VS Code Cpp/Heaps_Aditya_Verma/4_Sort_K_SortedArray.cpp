#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int j = 0;
void sort(vector<int>& vec, int k){
    priority_queue<int, vector<int>, greater<int>> min_heap;
    for(int i=0; i<vec.size(); i++){
        min_heap.push(vec[i]);
        if(min_heap.size() > k){
            vec[j] = min_heap.top();
            min_heap.pop();
            j++;
        }
    }
    while(min_heap.size() > 0){
        vec[j] = min_heap.top();
        min_heap.pop();
        j++;
    }
    for(auto it=vec.begin(); it!=vec.end(); it++){
        cout<<*it<<" ";
    }
    cout<<'\n';
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(10);
    vec.push_back(200);
    vec.push_back(3);
    vec.push_back(45);
    vec.push_back(88);

    sort(vec, 3);
    
    return 0;
}