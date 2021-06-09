#include<iostream>
#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;

void dijkstraAlgo(int n, vector<pi> adj[], int src){
    priority_queue<pi, vector<pi>, greater<pi>> pq;
    vector<int> distTo(n+1, INT_MAX);

    distTo[src] = 0;
    pq.push({0, src});

    while(!pq.empty()){
        int dist = pq.top().first;
        int prev = pq.top().second;
        pq.pop();

        for(auto it : adj[prev]){
            if(distTo[prev] + it.second < distTo[it.first]){
                distTo[it.first] = distTo[prev] + it.second;
                pq.push({distTo[it.first], it.first});
            }
        }
    }

    for(int i=1; i<=n; i++){
        cout<<distTo[i]<<" ";
    }
}
    
int main() {
    
    int n = 5;
    vector<pi> adj[n+1];

    adj[1].push_back({2, 2});
    adj[2].push_back({1, 2});

    adj[1].push_back({4, 1});
    adj[4].push_back({1, 1});

    adj[4].push_back({3, 3});
    adj[3].push_back({4, 3});

    adj[2].push_back({3, 4});
    adj[3].push_back({2, 4});

    adj[2].push_back({5, 5});
    adj[5].push_back({2, 5});

    adj[3].push_back({5, 1});
    adj[5].push_back({3, 1});

    dijkstraAlgo(n, adj, 1);
    
    return 0;
}