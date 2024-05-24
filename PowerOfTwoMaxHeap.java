import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private List<Integer> heap;
    private int numChildren;

    public PowerOfTwoMaxHeap(int numChildren) {
        this.heap = new ArrayList<>();
        this.numChildren = numChildren;
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }

        int max = heap.get(0);
        int lastIdx = heap.size() - 1;
        heap.set(0, heap.get(lastIdx));
        heap.remove(lastIdx);

        heapifyDown(0);

        return max;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        int parentIdx = (index - 1) / numChildren;

        while (index > 0 && heap.get(index) > heap.get(parentIdx)) {
            swap(index, parentIdx);
            index = parentIdx;
            parentIdx = (index - 1) / numChildren;
        }
    }

    private void heapifyDown(int index) {
        int maxIdx = index;

        while (true) {
            int startIdx = numChildren * index + 1;
            int endIdx = Math.min(startIdx + numChildren, heap.size());

            for (int i = startIdx; i < endIdx; i++) {
                if (heap.get(i) > heap.get(maxIdx)) {
                    maxIdx = i;
                }
            }

            if (maxIdx == index) {
                break;
            }

            swap(index, maxIdx);
            index = maxIdx;
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

