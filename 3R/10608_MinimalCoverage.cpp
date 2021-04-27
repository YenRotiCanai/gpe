//https://knightzone.studio/2012/04/06/1689/uva%EF%BC%9A10020%EF%BC%8Dminimal-coverage/

#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
using namespace std;

int M;

struct Segment{
    int start;
    int end;
};

bool cmp(Segment a, Segment b){
    if(a.start < b.start) return true;
    return false;
}

int main(){
    int testcase;
    int tmp, left, right;
    Segment input;
    vector<Segment> lines, answer;

    while(scanf("%d", &testcase) != EOF){
        for(int i=0; i<testcase; i++){
            if(i) printf("\n");

            scanf("%d", &M);

            lines.clear();

            while(scanf("%d%d", &input.start, &input.end) != EOF && (input.start!=0 || input.end!=0)) lines.push_back(input);

            sort(lines.begin(), lines.end(), cmp);

            answer.clear();

            left = 0; right = 0;

            for(int i=0; i<lines.size(); i++){
                tmp = -1;

                for(; i<lines.size() && lines[i].start <= left; i++){
                    if(lines[i].end > right){
                        right = lines[i].end;
                        tmp = i;
                    }
                }

                if(tmp == -1) break;
                answer.push_back(lines[tmp]);

                if(right >= M) break;
                left = right;
                i--;
            }

            if(right < M){
                printf("0\n");
                continue;
            }

            printf("%d\n", answer.size());
            for(int i=0; i<answer.size(); i++){
                printf("%d %d\n", answer[i].start, answer[i].end);
            }
        }
    }
    return 0;
}