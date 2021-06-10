class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer , Employee> hm = new HashMap<>();
        for (Employee emp : employees)
            hm.put(emp.id , emp);

        Employee man = hm.get(id);
        if (man == null)
            return 0;

        Queue<Employee> q = new LinkedList<>();
        q.offer(man);

        int val = 0;
        while (!q.isEmpty()) {
            Employee empTemp = q.poll();
            val += empTemp.importance;

            for (Integer sub : empTemp.subordinates)
                q.offer(hm.get(sub));
        }

        return val;
    }
}