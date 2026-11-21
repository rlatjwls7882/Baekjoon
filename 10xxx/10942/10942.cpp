#include <bits/stdc++.h>
using namespace std;

bool isPalindrome[2000][2000] = {false, };
int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    for(int i=0;i<N;i++) {
        isPalindrome[i][i]=true;
        if(i+1<N) isPalindrome[i+1][i]=true;
    }

    for(int i=N-2;i>=0;i--) {
        for(int j=i+1;j<N;j++) {
            if(arr[i]==arr[j] && isPalindrome[i+1][j-1]) {
                isPalindrome[i][j]=true;
            }
        }
    }

    int M; cin >> M;
    while(M-->0) {
        int s, e; cin >> s >> e;
        if(isPalindrome[s-1][e-1]) cout << "1\n";
        else cout << "0\n";
    }
}