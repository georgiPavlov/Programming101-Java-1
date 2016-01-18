package wednesday;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FunnyArraySorter {

	private int pivot;

	public FunnyArraySorter(int piv) {
		pivot = piv;
	}

	public void reverseSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {
			// Check the behaviour !!!!
			// Read comparator docs!!!
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if (arg0 < arg1) {
					return -1;
				} else {
					return 1;
				}
			}

		});

	}

	public void pivotSubtractionSort(List<Integer> list) {

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int result = 0;
				if (o1 - pivot > o2) {
					result = 1;
				} else if (o1 - pivot == o2) {
					result = 0;
				} else if (o1 - pivot < o2) {
					result = -1;
				}
				return result;
			}

		});

	}

	public void pivotDivisionSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int result = 0;
				if (o1 == 0 || o2 == 0) {
					try {
						throw new Exception("IllegalArgumentException");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (o1 / pivot > o2) {
					result = 1;
				} else if (o1 / pivot == o2) {
					result = 0;
				} else if (o1 / pivot < o2) {
					result = -1;
				}
				return result;
			}

		});
	}

}