#include<iostream>
#include<bits/stdc++.h>
using namespace std;

vector<int> topologicalSort(int n, vector<int> adj[]){
    vector<int> topo;
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

    while(!q.empty()){
        int node = q.front();
        q.pop();
        topo.push_back(node);

        for(auto it : adj[node]){
            indegree[it]--;
            if(indegree[it] == 0){
                q.push(it);
            }
        }
    }
    return topo;
}
    
int main() {
    
    int n = 6;
    vector<int> adj[n+1];

    adj[5].push_back(0);

    adj[4].push_back(0);

    adj[5].push_back(2);

    adj[2].push_back(3);

    adj[3].push_back(1);

    adj[4].push_back(1);

    vector<int> ans = topologicalSort(n, adj);
    for(int i : ans){
        cout<<i<<" ";
    }
    
    return 0;
}