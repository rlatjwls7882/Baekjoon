#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    map<long long, int> diff;
    map<long long, int> ratio;
    long long A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
        if(i!=0) {
            if(A[i]>A[i-1]) diff[A[i]-A[i-1]]++;
            if(A[i]/A[i-1]*A[i-1]==A[i]) ratio[A[i]/A[i-1]]++;
        }
    }

    while(M-->0) {
        int i; long long x; cin >> i >> x;
        i--;
        if(i==0) {
            if(A[1]>A[0]) diff[A[1]-A[0]]--;
            if(A[1]/A[0]*A[0]==A[1]) ratio[A[1]/A[0]]--;
        } else if(i==N-1) {
            if(A[N-1]>A[N-2]) diff[A[N-1]-A[N-2]]--;
            if(A[N-1]/A[N-2]*A[N-2]==A[N-1]) ratio[A[N-1]/A[N-2]]--;
        } else {
            if(A[i]>A[i-1]) diff[A[i]-A[i-1]]--;
            if(A[i+1]>A[i]) diff[A[i+1]-A[i]]--;
            if(A[i]/A[i-1]*A[i-1]==A[i]) ratio[A[i]/A[i-1]]--;
            if(A[i+1]/A[i]*A[i]==A[i+1]) ratio[A[i+1]/A[i]]--;
        }
        A[i]=x;
        if(i==0) {
            if(A[1]>A[0]) diff[A[1]-A[0]]++;
            if(A[1]/A[0]*A[0]==A[1]) ratio[A[1]/A[0]]++;
        } else if(i==N-1) {
            if(A[N-1]>A[N-2]) diff[A[N-1]-A[N-2]]++;
            if(A[N-1]/A[N-2]*A[N-2]==A[N-1]) ratio[A[N-1]/A[N-2]]++;
        } else {
            if(A[i]>A[i-1]) diff[A[i]-A[i-1]]++;
            if(A[i+1]>A[i]) diff[A[i+1]-A[i]]++;
            if(A[i]/A[i-1]*A[i-1]==A[i]) ratio[A[i]/A[i-1]]++;
            if(A[i+1]/A[i]*A[i]==A[i+1]) ratio[A[i+1]/A[i]]++;
        }

        if(ratio[A[1]/A[0]]==N-1) cout << "*\n";
        else if(diff[A[1]-A[0]]==N-1) cout << "+\n";
        else cout << "?\n";
    }
}