#include<bits/stdc++.h>
using namespace std;

//It will not work in code blocks it will work in online compiler
int main(){
    vector<vector<int>> pascal;
    int n;
    int r;
    cin >> n >> r;
    if(r > n){
        cout << 0 << endl;
    }
    else if(n == r){
        cout << 1 << endl;
    }
    else{
        for(int i=0; i<=n+1; i++){
                vector<int> temp;
            for(int j=0; j<i; j++){
                if(j == 0 || i == j){
                    temp.push_back(1);
                }
                else{
                    int val = pascal[i-1][j]+pascal[i-1][j-1];
                    temp.push_back(val);
                }
            }
            pascal.push_back(temp);
            temp.clear();
        }
        cout << pascal[n+1][r] << endl;
    }
}
