#include<bits/stdc++.h>
using namespace std;

//This is the brute force approach to solve the reverse problem
int bfReverse(int num) {
    int dig = (int)(log10(num)+1);
    int n = 0;
    while(dig){
        n += (num%10) * pow(10,dig-1);
        num = num / 10;
        dig -= 1;
    }
    return n;
}

//This is the optimal approach to solve the reverse problem
int opReverse(int num) {
    int n = 0;
    while(num){
        n = (n*10) + (num%10);
        num = num/10;
    }
    return n;
}

int main(){
    int num;
    cin >> num;
    cout << bfReverse(num) << endl;
    cout << opReverse(num) << endl;
}
