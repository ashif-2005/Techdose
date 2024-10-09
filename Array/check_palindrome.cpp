#include<bits/stdc++.h>
using namespace std;

int reverseNum(int num){
    int rev = 0;
    while(num){
        rev = (rev*10) + (num%10);
        num = num/10;
    }
    return rev;
}

bool isPalindrome(int num){
    int rev = reverseNum(num);
    if(num == rev){
        return true;
    }
    return false;
}

int main(){
    int num;
    cin >> num;
    bool result = isPalindrome(num);
    if(result){
        cout << "Palindrome" << endl;
    }
    else{
        cout << "Not a Palindrome" << endl;
    }
}
