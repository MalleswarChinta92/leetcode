lass Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] sol = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            sol[j] = nums[i];
            j = j+2;
        }
        j = 1;
        for (int i = n; i < 2*n; i++) {
            sol[j] = nums[i];
            j = j+2;
        }
        
        return sol;
    }
}