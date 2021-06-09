#include<iostream>
#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> p;

class myComparator{
    public:
       int operator()(p& p1, p& p2){
           if(p1.first < p2.first){
               return true;
           }
           else if(p1.first > p2.first){
               return false;
           }
           else{
               if(p1.second > p2.second){
                   return true;
               }
               else{
                   return false;
               }
           }
       }
};

void frequencySort(vector<int>& vec){
    unordered_map<int, int> map;
    for(int i=0; i<vec.size(); i++){
        map[vec[i]]++;
    }
    priority_queue<p, vector<p>, myComparator> max_heap;
    for(auto it=map.begin(); it!=map.end(); it++){
        max_heap.push({it->second, it->first});
    }

    vector<int> vec1;
    while (max_heap.size() > 0){
        int freq = max_heap.top().first;
        int ele = max_heap.top().second;
        max_heap.pop();
        for(int i=1; i<=freq; i++){
            vec1.push_back(ele);
        }
    }
    for(int i : vec1){
        cout<<i<<" ";
    }    
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(4);
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(1);

    frequencySort(vec);
    
    return 0;
}