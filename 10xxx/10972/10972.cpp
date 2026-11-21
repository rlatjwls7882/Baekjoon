#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int _size=1;
    for(int i=N-2;i>=0;i--) {
        if(arr[i]>arr[i+1]) {
            _size++;
        } else {
            break;
        }
    }

    if(_size==N) {
        cout << -1;
    } else {
        for(int i=N-1;i>N-_size-1;i--) {
            if(arr[i]>arr[N-_size-1]) {
                swap(arr[i], arr[N-_size-1]);
                break;
            }
        }
        sort(arr+N-_size, arr+N);
        
        for(int i=0;i<N;i++) {
            cout << arr[i] << ' ';
        }
    }
}