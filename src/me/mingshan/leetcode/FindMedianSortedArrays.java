import java.text.DecimalFormat;
import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        DecimalFormat df = new DecimalFormat("0.0");
        int len1, len2;
        int[] a = null;
        if (nums1 == null) {
          len2 = nums2.length;
          a = new int[len2];
          System.arraycopy(nums2, 0, a, 0, len2);
        } else if (nums2 == null) {
          len1 = nums1.length;
          a = new int[len1];
          System.arraycopy(nums1, 0, a, 0, len1);
        } else {
          len1 = nums1.length;
          len2 = nums2.length;
          a = new int[len1 + len2];

          System.arraycopy(nums1, 0, a, 0, len1);
          System.arraycopy(nums2, 0, a, len1, len2);
        }

        Arrays.sort(a);

        String result;

        if (a.length % 2 == 0) {
          int lm = a.length / 2 - 1;
          int rm = a.length / 2;
          result = df.format((double)(a[lm] + a[rm]) / 2);
        } else {
          result = df.format((double)a[(a.length - 1) / 2]);
        }
        return Double.parseDouble(result);
    }
}
