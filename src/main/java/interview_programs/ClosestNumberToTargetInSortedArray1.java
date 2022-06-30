package interview_programs;

//Practice: Java program to find element closest to given target.
public class ClosestNumberToTargetInSortedArray1 {
    public static void main(String[] args) {
        // 2,5,6,7,8,8,9
        int[] inputs = {2,5,6,7,8,8,9};
        int target = 5;
        System.out.println(findClosest(inputs, target));
    }

    private static int findClosest(int[] a, int target) {

        int size = a.length;

        if(target <= a[0])
            return a[0];
        if(target >= a[size - 1])
            return a[size - 1];
        int i=0, j=size, mid=0;

        while(i < j) {
            mid = (i + j)/2;

            if(a[mid] == target)
                return a[mid];

            if(target < a[mid]) {
                if(mid > 0 && target > a[mid -1]) {
                    return getClosest(a[mid-1], a[mid], target);
                }

                j = mid;

            } else {
                if(mid < size - 1 && target < a[mid+1]) {
                    return getClosest(a[mid], a[mid+1], target);
                }
                i = mid + 1;
            }
        }
        return a[mid];

    }

    private static int getClosest(int val1, int i1, int target) {
        if(target - val1 >=  i1 - target ) {
            return i1;
        } else {
            return val1;
        }
    }
}
