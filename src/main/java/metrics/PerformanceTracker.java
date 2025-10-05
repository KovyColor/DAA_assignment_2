package main.java.metrics;

public class PerformanceTracker {
    private long comparisons;
    private long arrayAccesses;

    public void reset() {
        comparisons = 0;
        arrayAccesses = 0;
    }

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementArrayAccess() {
        arrayAccesses++;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getArrayAccesses() {
        return arrayAccesses;
    }

    public void printMetrics() {
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Array Accesses: " + arrayAccesses);
    }
}
