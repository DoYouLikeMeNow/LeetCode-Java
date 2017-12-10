public class t1 {

    public int minimumMoves(int[] a, int[] m){
        int cnt = 0;
        t1 t1Obj = new t1();

        if(a.length == m.length && a.length > 0 && a.length <= 100000) {
            for (int i = 0; i < a.length; i++) {
                if(m[i] > 0 && a[i] > 0 && m[i] <= 1000000000 && a[i] <= 1000000000) {
                    cnt += t1Obj.numMoves(m[i], a[i]);
                }
            }
        }

        return cnt;
    }

    public int numMoves(int target, int base){
        int cnt = 0;

        while(base > 0){
            if(base%10 != target%10){
                cnt += Math.abs(base%10 - target%10);
            }

            base = base/10;
            target = target/10;
        }

        return cnt;
    }
}
