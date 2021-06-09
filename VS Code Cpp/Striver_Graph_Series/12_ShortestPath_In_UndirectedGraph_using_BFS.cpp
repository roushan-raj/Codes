#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void shortestDis(int n, vector<int> adj[], int src){
    int dist [n];
    for(int i=0; i<n; i++){
        dist[i] = INT_MAX;
    }

    queue<int> q;
    dist[src] = 0;
    q.push(src);

    while(!q.empty()){
        int node = q.front();
        q.pop();

        for(auto it : adj[node]){
            if(dist[node] + 1 < dist[it]){
                dist[it] = dist[node]+1;
                q.push(it);
            }
        }
    }

    for(int i=0; i<n; i++){
        cout<<dist[i]<<" ";
    }
}
    
int main() {
    
    int n = 9;
    vector<int> adj[n+1];

    adj[0].push_back(1);
    adj[1].push_back(0);

    adj[0].push_back(3);
    adj[3].push_back(0);

    adj[1].push_back(3);
    adj[3].push_back(1);

    adj[1].push_back(2);
    adj[2].push_back(1);

    adj[3].push_back(4);
    adj[4].push_back(3);

    adj[4].push_back(5);
    adj[5].push_back(4);

    adj[5].push_back(6);
    adj[6].push_back(5);

    adj[2].push_back(6);
    adj[6].push_back(2);

    adj[6].push_back(7);
    adj[7].push_back(6);

    adj[6].push_back(8);
    adj[8].push_back(6);

    adj[7].push_back(8);
    adj[8].push_back(7);

    shortestDis(n, adj, 0);
    
    return 0;
}