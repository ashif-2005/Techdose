#include<bits/stdc++.h>
using namespace std;

//This the optimal solution for the counting digits problem
int countDigit(int num){
    return (int)(log10(num)+1);
}

int main(){
    int num;
    cin >> num;
    cout << countDigit(num) << endl;
}
