public int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}

public double averageArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return (double) sum / arr.length;
}

public int findIndex(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == value) return i;
    }
    return -1;
}

public boolean contains(int[] arr, int value) {
    for (int num : arr) {
        if (num == value) return true;
    }
    return false;
}

public int[] removeElement(int[] arr, int value) {
    int count = 0;
    for (int num : arr) {
        if (num != value) count++;
    }
    int[] result = new int[count];
    int index = 0;
    for (int num : arr) {
        if (num != value) result[index++] = num;
    }
    return result;
}

public int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        copy[i] = arr[i];
    }
    return copy;
}

public int[] insertAt(int[] arr, int index, int value) {
    int[] result = new int[arr.length + 1];
    for (int i = 0, j = 0; i < result.length; i++) {
        if (i == index) {
            result[i] = value;
        } else {
            result[i] = arr[j++];
        }
    }
    return result;
}

public int[] minMax(int[] arr) {
    int min = arr[0], max = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
        if (num > max) max = num;
    }
    return new int[]{min, max};
}

public int[] reverseArray(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[arr.length - 1 - i];
    }
    return result;
}

public void findDuplicates(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println("Duplicate: " + arr[i]);
                break;
            }
        }
    }
}

public void commonValues(int[] a, int[] b) {
    for (int i : a) {
        for (int j : b) {
            if (i == j) {
                System.out.println("Common: " + i);
                break;
            }
        }
    }
}

public int[] removeDuplicates(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        if (!list.contains(arr[i])) {
            list.add(arr[i]);
        }
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < result.length; i++) {
        result[i] = list.get(i);
    }
    return result;
}

public int secondLargest(int[] arr) {
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num != first) {
            second = num;
        }
    }
    return second;
}

public int secondLargest(int[] arr) {
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num != first) {
            second = num;
        }
    }
    return second;
}

public void countEvenOdd(int[] arr) {
    int even = 0, odd = 0;
    for (int num : arr) {
        if (num % 2 == 0) even++;
        else odd++;
    }
    System.out.println("Even: " + even + ", Odd: " + odd);
}

public int diffMaxMin(int[] arr) {
    int min = arr[0], max = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
        if (num > max) max = num;
    }
    return max - min;
}

public boolean contains12and23(int[] arr) {
    boolean has12 = false, has23 = false;
    for (int num : arr) {
        if (num == 12) has12 = true;
        if (num == 23) has23 = true;
    }
    return has12 && has23;
}

public int[] removeDuplicates(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        if (!list.contains(arr[i])) {
            list.add(arr[i]);
        }
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < result.length; i++) {
        result[i] = list.get(i);
    }
    return result;
}

public int findMissingNumber(int[] arr) {
    int expectedSum = 100 * 101 / 2;
    int actualSum = 0;
    for (int num : arr) {
        actualSum += num;
    }
    return expectedSum - actualSum;
}


