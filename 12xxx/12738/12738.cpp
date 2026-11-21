#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<int> sequence;

    while(N-->0) {
        int A; cin >> A;
        if(sequence.empty() || sequence.back()<A) sequence.push_back(A);
        else {
            int left=0, right=sequence.size()-1;
            while(left<right) {
                int mid = (left+right)/2;
                if(sequence[mid]<A) left=mid+1;
                else right=mid;
            }
            if(sequence[left]>A) sequence[left]=A;
        }
    }
    cout << sequence.size();
}