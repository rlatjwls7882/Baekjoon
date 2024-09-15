#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    vector<int> idx;
    vector<int> val;

    int M; cin >> M;
    while(M-->0) {
        int B; cin >> B;
        if(val.empty()) {
            for(int i=0;i<N;i++) {
                if(B==A[i]) {
                    val.push_back(B);
                    idx.push_back(i);
                    break;
                }
            }
        } else {
            bool end=false;
            for(int i=0;i<val.size() && !end;i++) {
                if(val[i]<B) {
                    int j=0;
                    if(i>=1) j=idx[i-1]+1;
                    for(;j<N && !end;j++) {
                        if(B==A[j]) {
                            val[i]=B;
                            idx[i]=j;
                            while(i+1<val.size()) {
                                val.pop_back();
                                idx.pop_back();
                            }
                            i=val.size();
                            end=true;
                        }
                    }
                }
            }
            if(!end) {
                for(int i=idx.back()+1;i<N;i++) {
                    if(B==A[i]) {
                        val.push_back(B);
                        idx.push_back(i);
                        break;
                    }
                }
            }
        }
    }
    cout << val.size() << '\n';
    for(int e:val) {
        cout << e << ' ';
    }
}