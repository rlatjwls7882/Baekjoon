#include<bits/stdc++.h>
using namespace std;

int main(void) {
    int n; cin >> n;
    int sum=0, last=0;
    for(int i=0;i<n;i++) {
        int tmp; cin >> tmp;
        sum += last*tmp;
        last+=tmp;
    }
    cout << sum;
}