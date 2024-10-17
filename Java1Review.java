

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}

	public static void toLowerCase(String[] strings) {
		
		for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toLowerCase();
		}
	}

	public static Object[] toLowerCaseCopy(String[] strings) {
		 String[] result = new String[strings.length];
	        for (int i = 0; i < strings.length; i++) {
	            result[i] = strings[i].toLowerCase();
	        }
	        return result;
	    }
	

	public static void removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] != 0) {
                    isDuplicate = true;
                    array[j] = 0; 
                }
            }
            if (isDuplicate) {
                array[i] = 0;
            }
        }
    }
		   
		
	

	public static double average(int[] array) {
		 int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return (double) sum / array.length;
	    }

	public static int findMin(int[] array) {
		int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
	}

	public static Integer findMin(int i, int j, int k) {
		return Math.min(i, Math.min(j, k));
	}

	public static Object main(String main) {
		return "Overloaded main method was passed \"" + main + "\".";
	}

	public static boolean isDivisibleBy7(int number) {
		return number % 7 == 0;
	}

	public static Integer divide(int i, int j) {
		return i / j;
	}

	public static Double divide(double d, double e) {
	
		return d / e;
	}

}
