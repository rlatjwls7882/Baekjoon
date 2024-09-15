#include<bits/stdc++.h>
using namespace std;

int N;
int arr[200001];

int gcd(int a, int b) {
    while(b!=0) {
        int tmp = a%b;
        a = b;
        b = tmp;
    }
    return a;
}

int sum(int left, int right) {
    if(left==right) return arr[left];

    int leftLen = (right-left+1)/2;
    int rightLen = right-left+1-leftLen;

    int leftGcd=arr[left];
    for(int i=1;i<leftLen;i++) {
        leftGcd = gcd(leftGcd, arr[left+i]);
    }

    int rightGcd=arr[right];
    for(int i=1;i<rightLen;i++) {
        rightGcd = gcd(rightGcd, arr[right-i]);
    }

    leftGcd += sum(left+leftLen, right);
    rightGcd += sum(left, right-rightLen);
    
    return max(leftGcd, rightGcd);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;

    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    cout << sum(0, N-1);
}
