class Solution {
    private static Map<Integer , Map<Integer , Integer>> mapGrid = new HashMap<>();

    private static Integer exist(int m , int n) {
        if (mapGrid.containsKey(m))
            return mapGrid.get(m).get(n);
        else if (mapGrid.containsKey(n))
            return mapGrid.get(n).get(m);
        return null;
    }

    private static void pushPath(int m , int n , int a) {
        if (mapGrid.get(m) != null)
            mapGrid.get(m).put(n, a);
        else {
            Map<Integer , Integer> mapLocal = new HashMap<>();
            mapLocal.put(n , a);
            mapGrid.put(m, mapLocal);
        }


        if (mapGrid.get(n) != null)
            mapGrid.get(n).put(m, a);
        else {
            Map<Integer , Integer> mapLocal = new HashMap<>();
            mapLocal.put(m , a);
            mapGrid.put(n, mapLocal);
        }
    }

    public int uniquePaths(int m, int n) {
        Integer get = exist(m, n);
        if (m == 1 || n == 1)
            return 1;
        else if (get != null)
            return get;
        else {
            Integer a = uniquePaths(m - 1 , n) + uniquePaths(m, n - 1);
            pushPath(m , n , a);
            return a;
        }
    }
}