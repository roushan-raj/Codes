#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void operation(vector<int>& vec){
    cout<<"Simply printing elements"<<endl;
    for(int i=0; i<vec.size(); i++){
        cout<<vec[i]<<" ";
    }
    cout<<endl;

    // ************************** iterator ******************************

    // iterator in vector -> through this we can change the value of vector elements
    cout<<"Simply printing elements using iterator"<<endl;
    vector<int> :: iterator i;
    for(i=vec.begin(); i<vec.end(); i++){
        *i = *i+1;  // it will increase all elements of vector by 1
        cout<< *i << " ";
    }
    cout<<endl;

    // iterator using "auto" keyword
    cout<<"Simply printing elements using iterator using 'auto' keyword"<<endl;
     for(auto itr=vec.begin(); itr<vec.end(); itr++){
        *itr = *itr+1;  // it will increase all elements of vector by 1
        cout<< *itr << " ";
    }
    cout<<endl;

    // ********************** reverse_iterator ***************************

    cout<<"Simply printing elements using reverse_iterator"<<endl;
    vector<int> :: reverse_iterator it;
    for(it=vec.rbegin(); it!=vec.rend(); it++){
        cout<< *it << " ";
    }
    cout<<endl;

    cout<<"Simply printing elements using reverse_iterator using 'auto' keyword"<<endl;
    // reverse_iterator using "auto" keyword
    for(auto rit=vec.rbegin(); rit<vec.rend(); rit++){
        cout<< *rit << " ";
    }
    cout<<endl;

    // ****************** const_iterator ********************************

    // const_iterator in vector -> through this we can only iterate on vector elements but we can't
    // change the value of elemnts
    cout<<"Simply printing elements using const_iterator"<<endl;
    vector<int> :: const_iterator ci;
    for(ci=vec.begin(); ci<vec.end(); ci++){
        //*ci = *ci+1   // it give error as we can't change the value of element through const_iterator
        cout<<*ci<<" ";
    }
    cout<<endl;

    // ****************************** capacity **************************

    // size()
    cout<<"Size of vector is : "<<vec.size();
    cout<<endl;

    // max_size()
    cout<<"Max size of vector is : "<<vec.max_size();
    cout<<endl;

    // resize()
    vec.resize(10);
    vec.resize(12, 100);
    vec.resize(15);
    for(int k : vec){
        cout<<k<<" ";
    }
    cout<<endl;

    // empty
    cout<<"Is vector empty? : "<<vec.empty();
    cout<<endl;

    // revrse()
    cout<<"Reversing the vector elements using recerse() function : "<<endl;
    reverse(vec.begin(), vec.end());
    for(int i : vec){
        cout<<i<<" ";
    }
    cout<<endl;

    // ************************ vector element access *****************

    // at()
    for(int i=0; i<vec.size(); i++){
        cout<<vec.at(i)<<" ";
    }
    cout<<endl;

    // front();
    cout<<vec.front()<<endl;

    // back();
    cout<<vec.back()<<endl;

    // **************************** Modifiers *************************
    // assign( , );
    vector<int> first;
    first.assign(10, 101);
    for(int i : first){
        cout<<i<<" ";
    }
    cout<<endl;
    
    // push_back()
    first.push_back(102);

    // pop_back()
    first.pop_back();

    // insert()
    vector<int> :: iterator a;
    a = first.begin();
    first.insert(a, 500);

    first.insert(a, 4, 10); // insert 10, four times at front in vector

    vector<int> second;
    second.insert(second.begin(), first.begin(), first.end());

    for(int i : first){
        cout<<i<< " ";
    }
    cout<<endl;

    for(int i : second){
        cout<<i<< " ";
    }
    cout<<endl;

    // erase()
    second.erase(second.begin()+3); // erase the 3rd element from start
     for(int i : second){
        cout<<i<< " ";
    }
    cout<<endl;
    
    // erase( , )
    second.erase(second.begin(), second.begin()+4); // erase 1st 4 elements
     for(int i : second){
        cout<<i<< " ";
    }
    cout<<endl;

    // swap()
    cout<<"first and second vectors after swap : "<<endl;
    first.swap(second);
     for(int i : first){
        cout<<i<< " ";
    }
    cout<<endl;

     for(int i : second){
        cout<<i<< " ";
    }
    cout<<endl;

    // clear() // clear all elements of vector
    first.clear();
     for(int i : first){
        cout<<i<< " ";
    }
    cout<<endl;
    cout<<first.front();






    // ****************** vector constructors ***************************

    // vector constructors and how to initialize
    vector<int> empty_vec; // empty vector of type int
    vector<int> empty_vec2(10); //  empty vector of size 10 type int
    vector<int> preFilled_vec(4, 10); // pre filled vector with 10 of size 4
    vector<int> copy_vec (preFilled_vec); // copy of pre filled vector


}
    
int main() {
    
    int n;
    // cin>>n;
    // vector<int> vec(n);
    
    // for(int i=0; i<n; i++){
    //     cin>>vec[i];
    // }

    vector<int> vec;
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(4);
    vec.push_back(5);

    operation(vec);
    return 0;
}