package JavaCore17.task_1_5;

public class Main {

	public static void main(String[] args) {
		
		Integer[] array = { 1, 42, -3, 30, 9, 18, -54, 1, 6, 69 };
		
		Collection collection = new Collection(array);
		
		System.out.println();
		Iterator iteratorForward = collection.createForwardIterator();
		
		while (iteratorForward.hasNext()) {
			Integer next = iteratorForward.next();
			
			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}

		System.out.println();

		System.out.println("Выводим на экран массив через один элемент от конца до начала:");
		Iterator iteratorBackward = collection.createBackwardIterator();

		while (iteratorBackward.hasNext()) {
			Integer next = iteratorBackward.next();

			System.out.println(next);
		}

		System.out.println();

		System.out.println("Выводим на экран каждый третий нечетный элемент массива от конца до начала:");
		Iterator iteratorAnonymous = collection.createAnonymousIterator();

		int i = 1;
		while (iteratorAnonymous.hasNext()) {
			Integer next = iteratorAnonymous.next();

			if (i % 3 == 0) {
				if (next % 2 != 0) {
					System.out.println(next);
				}
			}

			i++;
		}

		System.out.println();

		System.out.println("Выводим на экран каждый пятый четный элемент минус 100 массива от начала до конца:");
		Iterator iteratorLocal = collection.createLocalIterator();

		int j = 1;
		while (iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();

			if (j % 5 == 0) {
				if (next % 2 == 0) {
					System.out.println(next - 100);
				}
			}

			j++;
		}

		System.out.println();

		System.out.println("Выводим на экран нечетным каждый второй четный элемент массива от начала до конца:");
		Iterator iteratorStatic = Collection.createStaticIterator();

		int k = 1;
		while (iteratorStatic.hasNext()) {
			Integer next = iteratorStatic.next();

			if (k % 2 == 0) {
				if (next % 2 == 0) {
					System.out.println(next + 1);
				}
			}

			k++;
		}

	}			
}
