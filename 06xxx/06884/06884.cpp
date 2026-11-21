#include<bits/stdc++.h>
using namespace std;

const int _size=10000;
bool notSosu[_size+1] = {true, true, false, };
vector<int> sosu;

bool isSosu(int num) {
    if(num<=_size) {
        if(!notSosu[num]) return true;
        else return false;
    }
    for(int primes:sosu) {
        if(num%primes==0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=2;i*i<=_size;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=_size;j+=i) {
                notSosu[j]=true;
            }
        }
    }
    for(int i=2;i<=_size;i++) {
        if(!notSosu[i]) {
            sosu.push_back(i);
        }
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int arr[n];
        for(int i=0;i<n;i++) {
            cin >> arr[i];
        }

        int preSum[n+1] = {0, };
        for(int i=0;i<n;i++) {
            preSum[i+1] = preSum[i]+arr[i];
        }

        bool chk=false;
        for(int diff=2;diff<=n && !chk;diff++) {
            for(int i=diff;i<=n && !chk;i++) {
                if(isSosu(preSum[i]-preSum[i-diff])) {
                    cout << "Shortest primed subsequence is length " << diff << ":";
                    for(int j=i-diff;j<i;j++) {
                        cout << " " << arr[j];
                    }
                    cout << '\n';
                    chk=true;
                }
            }
        }
        if(!chk) cout << "This sequence is anti-primed.\n";
    }
}
