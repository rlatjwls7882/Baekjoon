#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int c[N];
    for(int i=0;i<N;i++) {
        cin >> c[i];
    }
    int x[N];
    for(int i=0;i<N;i++) {
        cin >> x[i];
    }

    vector<int> mid;
    long long score[2] = {0};
    int first=-1, last=1000000;
    for(int i=0;i<N;i++) {
        if(c[i]) {
            score[c[i]-1]+=x[i];
            if(first==-1) {
                first=i;
                last=i;
            } else {
                if(c[last]!=c[i]) {
                    if((i-1-last)%2==1) mid.push_back(x[(last+i)/2]);
                    else if(i-1-last!=0) score[c[last]-1]+=x[(last+i)/2];
                    for(int j=last+1;j<(last+i)/2;j++) {
                        score[c[last]-1]+=x[j];
                    }
                    for(int j=(last+i)/2+1;j<i;j++) {
                        score[c[i]-1]+=x[j];
                    }
                } else {
                    for(int j=last+1;j<i;j++) {
                        score[c[i]-1]+=x[j];
                    }
                }
                last=i;
            }
        }
    }
    if(first!=-1 && (first!=0 || last!=N-1)) {
        if(c[last]==c[first]) {
            for(int i=last+1;i<N;i++) {
                score[c[last]-1]+=x[i];
            }
            for(int i=0;i<first;i++) {
                score[c[last]-1]+=x[i];
            }
        } else {
            int cnt = (N-1-last+first);
            if(cnt%2==1) mid.push_back(x[(last+first+N)/2%N]);
            else score[c[last]-1]+=x[(last+first+N)/2%N];
            for(int i=last+1;i<(last+first+N)/2;i++) {
                score[c[last]-1]+=x[i%N];
            }
            for(int i=(last+first+N)/2+1;i<first+N;i++) {
                score[c[first]-1]+=x[i%N];
            }
        }
    }

    sort(mid.begin(), mid.end(), greater<int>());
    for(int i=0;i<mid.size();i++) {
        score[i%2]+=mid[i];
    }

    cout << score[0] << ' ' << score[1];
}