#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void dfs(int node, int parent, vector<int>& timeIn, vector<int>& low, vector<int>& vis, 
                            vector<int> adj[], int &timer, vector<int>& isArticulation) {
    
    vis[node] = 1;
    timeIn[node] = low[node] = timer++;
    int child = 0;

    for(auto it : adj[node]){
        if(it == parent) continue;

        if(!vis[it]){
            dfs(it, node, timeIn, low, vis, adj, timer, isArticulation);
            low[node] = min(low[node], low[it]);
            if(low[it] >= timeIn[node] && parent != -1){
                isArticulation[node] = 1;
            }
            child++;
        }
        else {
            low[node] = min(low[node], timeIn[it]);
        }
    }

    if(child > 1 && parent == -1){
        isArticulation[node] = 1;
    }
 }

void articulationPoint(int n, vector<int> adj[]){
    vector<int> timeIn(n, -1);
    vector<int> low(n, -1);
    vector<int> vis(n, 0);
    vector<int> isArticulation(n, 0);
    int timer = 0;

    for(int i=0; i<n; i++){
        if(!vis[i]){
            dfs(i, -1, timeIn, low, vis, adj, timer, isArticulation);
        }
    }

    for(int i=0; i<n; i++){
        if(isArticulation[i] == 1){
            cout << i << endl;
        }
    }
}
    
int main() {
    
    int n = 12;
    vector<int> adj[n+1];

    adj[1].push_back(2);
    adj[2].push_back(1);

    adj[2].push_back(3);
    adj[3].push_back(2);

    adj[1].push_back(4);
    adj[4].push_back(1);

    adj[3].push_back(4);
    adj[4].push_back(3);

    adj[4].push_back(5);
    adj[5].push_back(4);

    adj[5].push_back(6);
    adj[6].push_back(5);

    adj[6].push_back(7);
    adj[7].push_back(6);

    adj[6].push_back(9);
    adj[9].push_back(6);

    adj[7].push_back(8);
    adj[8].push_back(7);

    adj[9].push_back(8);
    adj[8].push_back(9);

    adj[8].push_back(10);
    adj[10].push_back(8);

    adj[10].push_back(11);
    adj[11].push_back(10);

    adj[11].push_back(12);
    adj[12].push_back(11);

    adj[10].push_back(12);
    adj[12].push_back(10);

    articulationPoint(n, adj);
    
    return 0;
}