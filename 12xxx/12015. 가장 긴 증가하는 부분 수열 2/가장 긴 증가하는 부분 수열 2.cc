#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<int> list;
    while(N-->0) {
        int A; cin >> A;
        if(list.empty() || list.back()<A) {
            list.push_back(A);
        } else {
            int left=0, right=list.size()-1;
            while(left<right) {
                int mid = (left+right)/2;
                if(list[mid]>=A) right=mid;
                else left=mid+1;
            }
            if(list[left]>A) list[left]=A;
        }
    }
    cout << list.size();
}