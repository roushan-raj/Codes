#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int dfs(int node, int parent, vector<int>& timeIn, vector<int>& low, vector<int>& vis, vector<int> adj[], int &timer, int &bridgeCount){
    vis[node] = 1;
    timeIn[node] = low[node] = timer++;
    
    for(auto it : adj[node]){

        if(it == parent){
            continue;
        }

        if(!vis[it]){
            dfs(it, node, timeIn, low, vis, adj, timer, bridgeCount);
            low[node] = min(low[node], low[it]);
            if(low[it] > timeIn[node]){
                bridgeCount++;
                cout<< node << " -- " << it << endl;
            }
        }
        else{
            low[node] = min(low[node], timeIn[it]);
        }
    }
    return bridgeCount;
}


void findBridges(int n, vector<int> adj[]){
    vector<int> timeIn(n, -1);
    vector<int> low(n, -1);
    vector<int> vis(n, 0);
    int timer = 0;
    int bridgeCount = 0;

    for(int i=0; i<n; i++){
        if(!vis[i]){
            dfs(i, -1, timeIn, low, vis, adj, timer, bridgeCount);
        }
    }
    cout << "Total no of bridges is : " << bridgeCount;
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

    findBridges(n, adj);
    
    return 0;
}