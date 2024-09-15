#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N);
    
    int cnt=0;
    for(int i=0;i<N;i++) {
        int left=0, right=N-1;
        
        while(left<right) {
            if(left==i) left++;
            if(right==i) right--;

            if(A[left]+A[right]<A[i]) left++;
            else if(A[left]+A[right]>A[i]) right--;
            else if(left<right) {
                cnt++;
                break;
            }
        }
    }
    cout << cnt;
}