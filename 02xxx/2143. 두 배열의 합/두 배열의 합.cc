#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    int N; cin >> N;
    int A[N+1] = {0, };
    for(int i=1;i<=N;i++) {
        cin >> A[i];
        A[i] += A[i-1];
    }
    int M; cin >> M;
    int B[M+1] = {0, };
    for(int i=1;i<=M;i++) {
        cin >> B[i];
        B[i] += B[i-1];
    }

    vector<int> Anum;
    map<int, int> Acnt;
    for(int i=1;i<=N;i++) {
        for(int j=0;j<i;j++) {
            int Asum = A[i]-A[j];
            if(!Acnt[Asum]) Anum.push_back(Asum);
            Acnt[Asum]++;
        }
    }
    sort(Anum.begin(), Anum.end());

    long long cnt=0;
    for(int i=1;i<=M;i++) {
        for(int j=0;j<i;j++) {
            int find = T-(B[i]-B[j]);
            int left=0, right=Anum.size()-1;
            while(left<right) {
                int mid = (left+right+1)/2;
                if(Anum[mid]>find) right=mid-1;
                else left=mid;
            }
            if(Anum[left]==find) cnt += Acnt[Anum[left]];
        }
    }
    cout << cnt;
}