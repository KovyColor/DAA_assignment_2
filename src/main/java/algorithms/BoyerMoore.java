package main.java.algorithms;
import main.java.metrics.PerformanceTracker;

public class BoyerMoore {

    private final PerformanceTracker tracker = new PerformanceTracker();

    public Integer findMajorityElement(int[] nums) {
        tracker.reset();

        if (nums == null || nums.length == 0) {
            System.out.println("Input array is empty.");
            return null;
        }

        int candidate = 0;
        int count = 0;

        // Фаза 1: Поиск кандидата
        for (int num : nums) {
            tracker.incrementArrayAccess();
            if (count == 0) {
                candidate = num;
                tracker.incrementComparisons();
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            tracker.incrementComparisons();
        }

        // Фаза 2: Проверка кандидата
        count = 0;
        for (int num : nums) {
            tracker.incrementArrayAccess();
            if (num == candidate) {
                count++;
            }
            tracker.incrementComparisons();
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return null;
        }
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }
}
