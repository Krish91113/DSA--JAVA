class Solution {
    public int maxTask(int[] h, int[] l) {
        int n = h.length;
        if (n == 0) return 0;

        // Base states for day 0
        int noTask = 0;
        int low = l[0];
        int high = h[0];

        for (int i = 1; i < n; i++) {
            int prevNo = noTask;
            int prevLow = low;
            int prevHigh = high;

            // If we do no task today, yesterday could be anything
            noTask = Math.max(prevNo, Math.max(prevLow, prevHigh));

            // If we do a low task today, yesterday could be anything
            low = l[i] + Math.max(prevNo, Math.max(prevLow, prevHigh));

            // If we do a high task today, yesterday MUST have been "no task"
            high = h[i] + prevNo;
        }

        return Math.max(noTask, Math.max(low, high));
    }
    
}