class Solution {
    long sumOfSeries(long N) {
        if(N<=0){
            return 0;
        }
     return sumOfSeries(N-1)+N*N*N;
    }
}
