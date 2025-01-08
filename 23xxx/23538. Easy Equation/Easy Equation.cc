#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n; cin >> n;

    vector<long long> five, four, three, two;
    for(long long i=1;i*i*i*i*i<n;i++) five.push_back(i*i*i*i*i);
    for(long long i=1;i*i*i*i<n;i++) four.push_back(i*i*i*i);
    for(long long i=1;i*i*i<n;i++) three.push_back(i*i*i);
    for(long long i=1;i*i<n;i++) two.push_back(i*i);

    vector<long long> fiveAndTwo, fourAndThree;
    for(long long a:five) {
        for(long long b:two) {
            if(a+b<n) fiveAndTwo.push_back(a+b);
            else break;
        }
    }
    for(long long a:four) {
        for(long long b:three) {
            if(a+b<n) fourAndThree.push_back(a+b);
            else break;
        }
    }

    long long cnt=0;
    sort(fourAndThree.begin(), fourAndThree.end());
    for(long long a:fiveAndTwo) {
        int left=0, right=fourAndThree.size()-1;
        while(left<right) {
            int mid = (left+right+1)/2;
            if(fourAndThree[mid]+a<n) left=mid;
            else right=mid-1;
        }
        if(fourAndThree[left]+a<n) cnt += left+1;
    }
    cout << cnt;
}