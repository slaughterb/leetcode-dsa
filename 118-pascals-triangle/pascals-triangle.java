class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int r = 0; r < numRows; r++) {
            Integer[] tmp = new Integer[r + 1];
            Arrays.fill(tmp, 1);
            res.add(Arrays.asList(tmp));
        }

        for (int r = 2; r < numRows; r++) {
            int numCols = res.get(r).size() - 1;
            for (int c = 1; c < numCols; c++) {
                res.get(r).set(c, res.get(r - 1).get(c - 1) + res.get(r - 1).get(c));
            }
        }

        return res;
    }
}