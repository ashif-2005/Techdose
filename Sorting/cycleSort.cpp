#include<bits/stdc++.h>
using namespace std;

void printArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}

void cycleSort(int arr[], int n){
    int i = 0;
    while(i < n){
        int ind = arr[i] - 1;
        if(arr[i] != arr[ind]){
            swap(arr[i], arr[ind]);
        }
        else{
            i++;
        }
    }
}

int main(){
    int arr[] = {3,5,2,1,4};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Array before sorting: " << endl;
    printArray(arr, n);
    cycleSort(arr, n);
    cout << "Array after sorting: " << endl;
    printArray(arr, n);
}
