#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isCycle(int curr, vector<int> adj[], int vis[], int dfsVis[]){
    vis[curr] = 1;
    dfsVis[curr] = 1;

    for(auto it : adj[curr]){
        if(!vis[it]){
            if(isCycle(it, adj, vis, dfsVis)){
                return true;
            }
        }
        else if(dfsVis[it]){
            return true;
        }
    }
    dfsVis[curr] = 0;
    return false;
}

bool cycleDetection(int n, vector<int> adj[]){
    int vis[n+1];
    int dfsVis[n+1];
    memset(vis, 0, sizeof(vis));
    memset(dfsVis, 0, sizeof(dfsVis));

    for(int i=1; i<=n; i++){
        if(!vis[i]){
            if(isCycle(i, adj, vis, dfsVis)){
                return true;
            }
        }
    }
    return false;
}
    
int main() {
    
    int n = 9;
    vector<int> adj[n+1];

    adj[1].push_back(2);

    adj[2].push_back(3);

    adj[3].push_back(4);

    adj[3].push_back(6);

    adj[4].push_back(5);

    adj[6].push_back(5);

    adj[7].push_back(2);

    adj[7].push_back(8);

    adj[8].push_back(9);

    adj[9].push_back(7);

    if(cycleDetection(n, adj)){
        cout<<"Contains Cycle";
    }
    else{
        cout<<"Not Conains Cycle";
    }
    
    return 0;
}