#include<iostream>
#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;

void primsAlgorithm(int n, vector<pi> adj[], int src){
    int key[n];
    int parent[n];
    int mstSet[n];

    for(int i=0; i<n; i++){
        key[i] = INT_MAX, mstSet[i] = false;
    }

    priority_queue<pi, vector<pi>, greater<pi>> pq;

    key[src] = 0;
    parent[src] = -1;
    pq.push({0, src});

    for(int count = 0; count<n-1; count++){
        int u = pq.top().second;
        pq.pop();
        mstSet[u] = true;

        for(auto it : adj[u]){
            int v = it.first;
            int wt = it.second;

            if(mstSet[v] == false && wt < key[v]){
                parent[v] = u;
                key[v] = wt;
                pq.push({key[v], v});
            }
        }
    }

    for(int i=1; i<n; i++){
        cout<<parent[i]<< " -- "<< i << "\n";
    }

    int mstSum = 0;
    for(int i=0; i<n; i++){
        mstSum = mstSum + key[i];
    }
    cout<<"Minimum Spanning tree weight is : "<<mstSum;
}
    
int main() {
    
    int n = 5;
    vector<pi> adj[n+1];

    adj[0].push_back({3, 6});
    adj[3].push_back({0, 6});

    adj[0].push_back({1, 2});
    adj[1].push_back({0, 2});

    adj[3].push_back({1, 8});
    adj[1].push_back({3, 8});

    adj[1].push_back({2, 3});
    adj[2].push_back({1, 3});

    adj[1].push_back({4, 5});
    adj[4].push_back({1, 5});

    adj[4].push_back({2, 7});
    adj[2].push_back({4, 7});

    primsAlgorithm(n, adj, 0);
    
    return 0;
}