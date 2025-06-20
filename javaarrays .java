public class AddArray {
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        System.out.println("Sum = " + sumArray(numbers));
    }
}

public class AverageArray {
    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length; // Integer division
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Average = " + average(numbers));
    }
}

public class FindIndex {
    public static int findIndex(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        int index = findIndex(numbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}

public class ContainsValueNoBool {
    public static int contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return 1;  // Found
            }
        }
        return 0;  // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15};
        int target = 12;

        int result = contains(numbers, target);
        if (result == 1) {
            System.out.println("Value found in the array.");
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}

public static int[] removeElement(int[] a, int value) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != value) {
            count++;
        }
    }

    int[] result = new int[count];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (a[i] != value) {
            result[j] = a[i];
            j++;
        }
    }
    return result;
}

public static int[] copyArray(int[] a) {
    int[] copy = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        copy[i] = a[i];
    }
    return copy;
  
}

public static void minMax(int[] a) {
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < a.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
}

public static int[] insertAt(int[] a, int index, int value) {
    int[] newa = new int[arr.length + 1];
    for (int i = 0, j = 0; i < newa.length; i++) {
        if (i == index) {
            newa[i] = value;
        } else {
            newa[i] = a[j];
            j++;
        }
    }
    return newa;
}

public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    for (; start < end; start++, end--) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

public static void findDuplicates(int[] a) {
    for (int i = 0; i < arr.length; i++) {
        int isDuplicate = 0;
        for (int j = 0; j < i; j++) {
            if (a[i] == a[j]) {
                isDuplicate = 1;
                break;
            }
        }
        if (isDuplicate == 0) { 
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] == a[k]) {
                    System.out.println("Duplicate: " + a[i]);
                    break;
                }
            }
        }
    }
}

public static void findCommonValues(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
        int found = 0;
        for (int j = 0; j < i; j++) {  // avoid duplicate printing
            if (arr1[i] == arr1[j]) {
                found = 1;
                break;
            }
        }
        if (found == 0) {
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    System.out.println("Common value: " + arr1[i]);
                    break;
                }
            }
        }
    }
}

public static int[] removeDuplicates(int[] a) {
    int[] temp = new int[a.length];
    int count = 0;

    for (int i = 0; i < a.length; i++) {
        int Dup = 0;
        for (int j = 0; j < count; j++) {
            if (a[i] == temp[j]) {
                Dup = 1;
                break;
            }
        }
        if (Dup == 0) {
            temp[count] = a[i];
            count++;
        }
    }

    int[] result = new int[count];
    for (int i = 0; i < count; i++) {
        result[i] = temp[i];
    }
    return result;
}

public static int secondLargest(int[] a) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
        if (a[i] > largest) {
            secondLargest = largest;
            largest = a[i];
        } else if (a[i] > secondLargest && a[i] < largest) {
            secondLargest = a[i];
        }
    }
    return secondLargest;
}

public static void countEvenOdd(int[] arr) {
    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    System.out.println("Even numbers: " + evenCount);
    System.out.println("Odd numbers: " + oddCount);
}

public static int diffLargestSmallest(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max - min;
}

public static int containsBoth(int[] a) {
    int el12 = 0;
    int el23 = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == 12) {
            el12 = 1;
        }
        if (a[i] == 23) {
            el23 = 1;
        }
    }
    if (el12 == 1 && el23 == 1) {
        return 1; 
    } else {
        return 0; 
    }
}

public static int[] removeDuplicates(int[] arr) {
    int[] temp = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        int isDuplicate = 0;
        for (int j = 0; j < count; j++) {
            if (arr[i] == temp[j]) {
                isDuplicate = 1;
                break;
            }
        }
        if (isDuplicate == 0) {
            temp[count] = arr[i];
            count++;
        }
    }
    int[] result = new int[count];
    for (int i = 0; i < count; i++) {
        result[i] = temp[i];
    }
    return result;
}

public static int findMissingNumber(int[] arr) {
    int expectedSum = (100 * 101) / 2;
    int actualSum = 0;
    for (int i = 0; i < arr.length; i++) {
        actualSum += arr[i];
    }
    return expectedSum - actualSum;
}









