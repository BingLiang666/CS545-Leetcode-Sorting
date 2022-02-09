import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class SolutionsTest {
    public int[] nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8;

    @BeforeEach
    void setUp() {
        nums1 = new int[] {2, 2, 1, 0, 0, 0, 2, 1, 2, 0, 0};
        nums2 = new int[] {0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2};
        nums3 = new int[] {2, 5, 10, 123, 0, 0, 0, 0, 0};
        nums4 = new int[] {1, 3, 8, 14, 100};
        nums5 = new int[] {1, 2, 3, 5, 8, 10, 14, 100, 123};
        nums6 = new int[] {12, 7, 15, 5, 9, 17, 4, 3, 1,19, 5, 27};
        nums7 = new int[] {2, 1, 0, 1};
        nums8 = new int[] {1, 2, 19, 100, 22, 81, 83};
    }

    @Test
    void testSortColors() {
        Solutions.sortColors(nums1);
        assertArrayEquals(nums1, nums2);
    }

    @Test
    void merge() {
        Solutions.merge(nums3, 4, nums4, 5);
        assertArrayEquals(nums3, nums5);
    }

    @Test
    void sortArray() {
        Solutions.sortArray(nums6);
        System.out.println(Arrays.toString(nums6));
    }

    @Test
    void mergeChunks() {
        Solutions.mergeChunks(nums8, 0, 6);
        System.out.println(Arrays.toString(nums8));
    }
}