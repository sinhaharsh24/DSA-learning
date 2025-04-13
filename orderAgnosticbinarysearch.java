public class orderAgnosticbinarysearch {
    public static void main(String[] args) {
        int[] ascArr = {2, 4, 6, 9, 11, 15, 18};
        int[] descArr = {99, 85, 70, 42, 30, 15, 5};

        int target = 15;

        int ascIndex = orderAgnosticBinarySearch(ascArr, target);
        int descIndex = orderAgnosticBinarySearch(descArr, target);

        System.out.println("Found in ascending array at index: " + ascIndex);
        System.out.println("Found in descending array at index: " + descIndex);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // not found
    }
}
