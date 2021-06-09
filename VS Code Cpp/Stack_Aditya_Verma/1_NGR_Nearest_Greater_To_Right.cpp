#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void NGR(int arr[], int n){
    vector<int> vec;
    stack<int> st;

    if(n==1){
        vec.push_back(-1);
        return;
    }

    for(int i=n-1; i>=0; i--){
        if(st.size()==0){
            vec.push_back(-1);
        }
        else if(st.size() > 0 && st.top() > arr[i]){
            vec.push_back(st.top());
        }
        else if(st.size() > 0 && st.top() <= arr[i]){
            while(st.size() > 0 && st.top() <= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                vec.push_back(-1);
            }
            else{
                vec.push_back(st.top());
            }
        }
        st.push(arr[i]);
    }

    reverse(vec.begin(), vec.end());
    for(int i : vec){
        cout<<i<<" ";
    }
}
    
int main() {
    
    int arr[] = {1, 3, 0, 0, 1, 2, 4};
    int n = sizeof(arr) / sizeof(arr[0]);

    NGR(arr, n);
    
    return 0;
}