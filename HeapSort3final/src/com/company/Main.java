package com.company;

import com.sun.javafx.binding.StringFormatter;

public class HeapSort {

    public void sort(int arr[]) {

        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            Stack(arr, size, i);
        for (int i=size-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Stack(arr, i, 0);
        }
    }

    void Stack(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int rigth = 2*i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (rigth < n && arr[rigth] > arr[largest])
            largest = rigth;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            Stack(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {1884, 1964, 915, 1152, 1455, 1590, 1941, 2586, 1336, 369, 1543, 1462, 2685, 2673, 111, 1282, 2850, 2465, 2812, 1601, 450, 1655, 1360, 2231, 2063, 488, 439,
                1382, 694, 417, 2803, 1065, 453, 735, 928, 1426, 590, 1793, 1307, 1295, 1760, 1205, 33, 772, 454, 1116, 2633, 758, 2784, 1851, 1052, 1258, 1661, 1876, 798, 2133,
                1002, 95, 465, 420, 1011, 1936, 357, 2101, 1638, 1788, 2837, 164, 628, 756, 349, 1371, 1585, 2193, 1689, 96, 2042, 1515, 1494, 1356, 2086, 66, 343, 1933, 1817, 1082,
                1091, 1081, 1705, 15, 2425, 281, 2052, 1714, 976, 1948, 1514, 146, 1094, 1838, 1632, 1958, 2785, 2364, 986, 552, 1687, 1423, 2385, 2641, 2705, 1567, 2703, 2856, 2717,
                920, 1967, 2649, 2629, 1824, 2213, 1272, 201, 934, 176, 1306, 419, 2373, 2682, 998, 293, 2712, 1812, 2757, 1505, 1045, 2379, 2989, 951, 1875, 769, 815, 1347, 1249, 2670,
                2729, 1441, 2108, 1022, 1110, 545, 1407, 214, 1030, 135, 46, 785, 2198, 376, 361, 1861, 2730, 2182, 681, 1634, 901, 2010, 803, 259, 1375, 2078, 783, 1018, 779, 875, 1235,
                2891, 1078, 557, 818, 2756, 864, 2892, 144, 451, 2516, 2096, 2236, 29, 171, 941, 661, 2241, 1115, 567, 1334, 899, 1525, 2596, 56};
        int n = arr.length;
        System.out.println("El arreglo original es: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        HeapSort hp1 = new HeapSort();
        hp1.sort(arr);
        System.out.println("El arreglo final es: ");
        printArray(arr);
    }
}
