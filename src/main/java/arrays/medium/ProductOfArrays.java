package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrays {
    public static void method1(List<Integer> array1) throws Exception {
        int product = 1;
        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (i < array1.size()) {
            for (int j = 0; j < array1.size(); j++) {
                if (j != i) {
                    product = product * array1.get(j);
                }
            }
            result.add(product);
            i++;
            product = 1;
        }
        System.out.println(result);
    }

    public static void method2(List<Integer> array1) throws Exception {
        int ltrProd = 1;
        int rtlProd = 1;
        List<Integer> ltr = new ArrayList<>();
        List<Integer> rtl = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            ltrProd = ltrProd * array1.get(i);
            ltr.add(ltrProd);
        }
        for (int j = array1.size() - 1; j >= 0; j--) {
            rtlProd = rtlProd * array1.get(j);
            rtl.add(rtlProd);
        }
        for (int i = 0; i < array1.size(); i++) {
            int lp = 1;
            int rp = 1;

            if (i > 0) {
                lp = ltr.get(i - 1);
            } else {
                lp = 1;
            }
            if (i < (array1.size() - 1)) {
                rp = rtl.get(array1.size() - 2 - i);
            } else {
                rp = 1;
            }
            result.add(lp * rp);
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Product of array except self output:");
        List<Integer> array1 = new ArrayList<>(List.of(1, 2, 3, 4));
        method2(array1);
    }
}
