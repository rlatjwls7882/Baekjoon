#include<bits/stdc++.h>

using namespace std;

struct Stu {
    string name;
    int lang, eng, math;
    Stu(string name, int lang, int eng, int math) {
        this->name=name;
        this->lang=lang;
        this->eng=eng;
        this->math=math;
    }

    bool operator<(Stu a) const {
        if(this->lang==a.lang) {
            if(this->eng==a.eng) {
                if(this->math==a.math) {
                    return this->name<a.name;
                }
                return this->math>a.math;
            }
            return this->eng<a.eng;
        }
        return this->lang>a.lang;
    }
};


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<Stu> v;
    for(int i=0;i<N;i++) {
        string name; int lang, eng, math; cin >> name >> lang >> eng >> math;
        v.push_back(Stu(name, lang, eng, math));
    }
    sort(v.begin(), v.end());

    for(Stu stus:v) {
        cout << stus.name << '\n';
    }
}