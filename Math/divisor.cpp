#include<bits/stdc++.h>
using namespace std;

vector<int> allDivisor(int num){
    vector<int> divisor;
    for(int i=1; i*i<=num; i++){
        if(num % i == 0){
            divisor.push_back(i);
            if(i != (int)(num/i)){
                divisor.push_back((int)(num/i));
            }
        }
    }
    return divisor;
}

int main(){
    int num;
    cin >> num;
    vector<int> divisor = allDivisor(num);
    for(int i=0; i<divisor.size(); i++){
        cout << divisor[i] << " ";
    }
}
