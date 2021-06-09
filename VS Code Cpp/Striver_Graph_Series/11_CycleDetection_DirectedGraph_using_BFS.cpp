#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool topologicalSort(int n, vector<int> adj[]){
    queue<int> q;
    vector<int> indegree(n, 0);

    for(int i=0; i<n; i++){
        for(auto it : adj[i]){
            indegree[it]++;
        }
    }

    for(int i=0; i<n; i++){
        if(indegree[i] == 0){
            q.push(i);
        }
    }

    int count = 0;
    while(!q.empty()){
        int node = q.front();
        q.pop();
        count++;

        for(auto it : adj[node]){
            indegree[it]--;
            if(indegree[it] == 0){
                q.push(it);
            }
        }
    }
    if(count == n){
        return false;
    }
    return true;
}
    
int main() {
    
    int n = 4;
    vector<int> adj[n+1];

    adj[1].push_back(2);

    adj[2].push_back(3);

    adj[3].push_back(4);

    adj[4].push_back(2);

    cout<<topologicalSort(n, adj);

    // if(topologicalSort(n, adj)){
    //     cout<<"Contains Cycle";
    // }
    // else{
    //     cout<<"Does not contains Cycle";
    // }
    
    return 0;
}