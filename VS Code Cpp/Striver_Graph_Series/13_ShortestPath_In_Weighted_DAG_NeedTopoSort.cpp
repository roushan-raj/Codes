#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void findTopoSort(int node, stack<int>& st, int vis[], vector<pair<int, int>> adj[]){
    vis[node] = 1;

    for(auto it : adj[node]){
        if(!vis[it.first]){
            findTopoSort(it.first, st, vis, adj);
        }
    }
    st.push(node);
}

void shortestDistance(int n, vector<pair<int, int>> adj[], int src){
    int vis[n] ;
    memset(vis, 0, sizeof(vis));
    stack<int> st;

    for(int i=0; i<n; i++){
        if(!vis[i]){
            findTopoSort(i, st, vis, adj);
        }
    }

    int dist[n];
    for(int i=0; i<n; i++){
        dist[i] = 1e9;
    }

    dist[src] = 0;
    
    while(!st.empty()){
        int curr = st.top();
        st.pop();

        if(dist[curr] != INFINITY){  // -> important step
            for(auto it : adj[curr]){
                if(dist[curr] + it.second < dist[it.first]){
                    dist[it.first] = dist[curr] + it.second;
                } 
            }
        }
    }

    for(int i=0; i<n; i++){
        if(dist[i] == 1e9){
            cout<<"INF"<<" ";
        }
        else{
            cout<<dist[i]<<" ";
        }
    }
}
    
int main() {
    
    int n = 6;
    vector<pair<int, int>> adj[n+1];

    adj[0].push_back({1, 2});

    adj[0].push_back({4, 1});

    adj[1].push_back({2, 3});

    adj[4].push_back({2, 2});
    
    adj[4].push_back({5, 4});

    adj[2].push_back({3, 6});

    adj[5].push_back({3, 1});

    shortestDistance(n, adj, 0);
    
    return 0;
}