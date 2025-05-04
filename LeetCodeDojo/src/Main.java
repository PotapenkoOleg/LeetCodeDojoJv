import java.util.*;

record Tuple2<T0, T1>(T0 t0, T1 t1) {
}

public class Main {
    public static void main(String[] args) {
        arrays();
        multiDimensionalArrays();
        theWrapperClasses();
        charSequence();
        strings();
        stringBuilders();
        mathClass();
        arrayList();
        collections();
        listInterface();
        setInterface();
        mapInterface();
        queueInterface();
        priorityQueue();
        stackClass();
        dequeInterface();
        collectionsClass();
        arraysClass();
    }

    private static void arrays() {
        int[] arr0 = new int[0];
        int[] arr1 = new int[10];
        Integer[] arr2 = new Integer[10];
        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,}; //initializer
        int[] arr4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,}; //anonymous array
        int[] arr5 = new int[10];
        int[] arr6 = {7, 3, 5, 8, 4};
        var len = arr1.length;
        var first = arr3[0];
        var last = arr3[arr3.length - 1];
        var clone = arr3.clone();
        Arrays.fill(arr1, 42);
        var found = Arrays.binarySearch(arr4, 5);
        var notFound = Arrays.binarySearch(arr4, 42);
        var eq = Arrays.compare(arr3, arr4);
        var notEq = Arrays.compare(arr4, arr5);
        var copy = Arrays.copyOf(arr4, 5);
        var rangeCopy = Arrays.copyOfRange(arr4, 2, 6);
        Arrays.sort(arr6, 0, 3);
        Integer[] arrInt = {5, 2, 1, 8, 10};
        Arrays.sort(arrInt, Collections.reverseOrder());
        // Covariance
        Object[] arrCov = new Integer[10];
        // arrCov[0] = new Object(); // not allowed
    }

    private static void multiDimensionalArrays() {
        // var arr = new [row][column]
        int[][] arr1 = new int[2][3];
        var numberOfRows = arr1.length;
        var numberOfColumnsInRow = arr1[0].length;
        int[][] matrix = {{1, 2}, {2, 1}};
        int[][] matrix2 = new int[][]{{1, 2}, {2, 1}};
    }

    private static void theWrapperClasses() {
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.TRUE;
        boolean b4 = b3.booleanValue();
        Integer i1 = Integer.parseInt("2023");
        boolean b5 = Character.isLetterOrDigit('a');
    }

    private static void charSequence() {
        String s1 = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});
        CharSequence charSequence = new String("Hello world");
        int len = charSequence.length();
        char ch = charSequence.charAt(0);
        boolean isEmpty = charSequence.isEmpty();
        CharSequence subSeq = charSequence.subSequence(1, 5);
        boolean result = charSequence.equals(s1);
    }

    private static void strings() {
        String s1 = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});
        String s2 = "Hello world";
        int len = s1.length();
        char ch1 = s1.charAt(4);
        char[] charArr = s1.toCharArray();
        char[] dest = new char[20];
        s1.getChars(1, 5, dest, 2);
        boolean eq1 = s1.equals(s2);
        int eq2 = s1.compareTo(s2);
        // concatenation
        String str1 = "Hello".concat("world");
        // join
        String str2 = String.join("-", "Hello", "world");
        // methods
        int firstL = s1.indexOf('l', 2);
        int lastL = s1.lastIndexOf('l');
        String str3 = s1.replace('l', 'L');
        boolean contains = s1.contains("Hell");
        boolean startWith = s1.startsWith("llo", 1);
        boolean endsWith = s1.endsWith("llo");
        // extracting
        boolean isBlank = "   ".isBlank();
        String strip = " a b ".strip();
        String stripLeading = " a b ".stripLeading();
        String stripTrailing = " a b ".stripTrailing();
        String trim = " a b ".trim();
        String[] split = " a b ".split(" ");
        // substrings
        String substring1 = s1.substring(5);
        String substring2 = s1.substring(5, 10);
    }

    private static void stringBuilders() {
        var sb1 = new StringBuilder("Hello world");
        var sb2 = new StringBuilder("Hello world");
        char ch1 = sb1.charAt(1);
        char[] dst1 = new char[20];
        sb1.getChars(1, 4, dst1, 3);
        int len1 = sb1.length();
        // substrings
        int indexOf = sb1.indexOf("llo", 1);
        int lastIndexOf = sb1.lastIndexOf("l");
        // substrings
        String substring = sb1.substring(2, 5);
        int eq1 = sb1.compareTo(sb2);
        sb2.append("append");
        sb2.insert(3, "newtest", 1, 3);
        sb1.replace(0, 3, "HELLO");
        sb1.deleteCharAt(0);
        sb1.delete(3, 5);
        sb2.reverse();
    }

    private static void mathClass() {
        int abs = Math.abs(-10);
        int min = Math.min(9, 10);
        int max = Math.max(9, 10);
        double ceil1 = Math.ceil(3.14);
        double ceil2 = Math.ceil(-3.14);
        double floor1 = Math.floor(3.14);
        double floor2 = Math.floor(-3.14);
        double round1 = Math.round(3.14);
        double round2 = Math.round(-3.14);
        double pow = Math.pow(2.0, 3.0);
        double sqrt = Math.sqrt(25.0);

        var random = new Random();
        int number = random.nextInt(11); // [0,10]
    }

    private static void arrayList() {
        ArrayList<Integer> al1 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> al2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> al3 = new ArrayList<>(al2);
        // immutable list with no nulls
        List<Integer> list1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = List.copyOf(al1);
        // array list operations
        int size = al1.size();
        boolean addAll = al3.addAll(2, al2);
        al2.add(4, 3);
        Integer e1 = al1.set(0, 100);
        al2.replaceAll(x -> x * 2);
        al1.clear();
        al2.clear();
        al3.clear();
        al1.addAll(list1);
        al2.addAll(list1);
        al3.addAll(list1);
        Integer e2 = al1.remove(2);
        boolean remove1 = al1.remove(Integer.valueOf(3));
        boolean removeAll1 = al2.removeAll(al1);
        boolean isEmpty1 = al1.isEmpty();
        Integer e3 = al1.get(3);
        boolean contains = al1.contains(Integer.valueOf(7));
        int indexOf = al1.indexOf(Integer.valueOf(7));
        int lastIndexOf = al1.lastIndexOf(Integer.valueOf(7));
        List<Integer> sublist1 = al1.subList(3, 8);
        sublist1.add(3);
        al1.clear();
        al2.clear();
        al1.addAll(list1);
        al2.addAll(list1);
        boolean equals1 = al1.equals(al2);
        Integer[] intArray = new Integer[100];
        Integer[] arr1 = al1.toArray(intArray); // creates new array if data not fit
        Integer[] arr2 = al1.toArray(new Integer[0]);
        // list views
        List<Integer> sublist2 = Arrays.asList(arr1);
        // sublist2.add(24); Unsupported
    }

    private static void collections() {
        // basic operations
        Collection<String> coll1 = new ArrayList<>(List.of("test1", "test2", "test3", "test1", "test2", "test3"));
        Collection<String> coll2 = new ArrayList<>(List.of("test1", "test2", "test3", "test4", "test5", "test6"));
        Collection<String> coll3 = new ArrayList<>();
        int size = coll1.size();
        boolean isEmpty = coll1.isEmpty();
        boolean contains = coll1.contains("test2");
        boolean remove = coll1.remove("test3");
        // bulk operations
        boolean containsAll = coll1.containsAll(coll2);
        boolean addAll = coll3.addAll(coll1); // sum
        boolean removeAll = coll2.removeAll(coll1); // minus
        boolean retainAll = coll3.retainAll(coll1); // intersection
        coll1.clear();
        coll2.forEach(x -> System.out.println(x.toLowerCase()));
        Iterator<String> col2Iterator = coll2.iterator();
        col2Iterator.next();
        col2Iterator.remove();
        col2Iterator.forEachRemaining(x -> System.out.println(x.toUpperCase()));
        // toArray works on all collections
        coll1.addAll(List.of("test1", "test2", "test3", "test4", "test5", "test6"));
        String[] arr1 = coll1.toArray(new String[0]);
        Object[] arr2 = coll1.toArray();
    }

    private static void listInterface() {
        List<String> list1 = new LinkedList<>(List.of("test1", "test2", "test3", "test4", "test5", "test6"));
        var splitIterator = list1.spliterator();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.addLast(3);
        list2.addLast(8);
    }

    private static void setInterface() {
        Set<String> set1 = new HashSet<>(Set.of("a", "b", "c", "d"));
        set1.add("a");
        boolean addAll = set1.addAll(Set.of("e", "f", "g")); // union
        boolean containsAll = set1.containsAll(Set.of("e", "f", "g")); // subset
        boolean removeAll = set1.removeAll(Set.of("a", "b", "c")); // difference
        boolean retainAll = set1.retainAll(Set.of("c", "d", "e", "f")); // intersection
        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(3, 8, 5, 4, 2));
        for (var e : linkedHashSet) {
            System.out.println(e);
        }
        System.out.println("--------------");
        // Sorted Set
        SortedSet<Integer> sortedSet = new TreeSet<>(List.of(3, 8, 5, 4, 2));
        for (var e : sortedSet) {
            System.out.println(e);
        }
        Integer first = sortedSet.first();
        Integer last = sortedSet.last();
        SortedSet<Integer> headSet = sortedSet.headSet(5);
        SortedSet<Integer> tailSet = sortedSet.tailSet(5);
        SortedSet<Integer> subSet = sortedSet.subSet(2, 5);
        // Navigable Set
        NavigableSet<Integer> navigableSet = new TreeSet<>(List.of(3, 8, 5, 4, 2));
        Integer first1 = navigableSet.pollFirst();
        Integer last1 = navigableSet.pollLast();
        NavigableSet<Integer> subset1 = navigableSet.subSet(3, true, 5, false);
        NavigableSet<Integer> navigableSet1 = new TreeSet<>(List.of(3, 8, 5, 4, 2));
        Integer ceiling = navigableSet1.ceiling(5);
        Integer floor = navigableSet1.floor(5);
        Integer higher = navigableSet1.higher(5);
        Integer lower = navigableSet1.lower(5);
        NavigableSet<Integer> descendingSet = navigableSet1.descendingSet();
        NavigableSet<String> stringTreeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        stringTreeSet.addAll(List.of("test1", "test2", "test3", "test4", "test5", "test6"));
        Set<String> set2 = new HashSet<>(stringTreeSet);
        {
            var p = Integer.toString(6);
            Set<Tuple2<Integer, Integer>> set = new HashSet<>();
            var t1 = new Tuple2<>(1, 2);
            var t2 = new Tuple2<>(1, 2);
            set.add(t1);
            var h1 = t1.hashCode();
            var h2 = t2.hashCode();
            var x = set.contains(t2);
            System.out.println(x);
        }
    }

    private static void mapInterface() {
        Map<Integer, String> staticMap1 = Map.ofEntries(
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three"),
                Map.entry(4, "four")
        );
        var staticMap2 = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        Map<Integer, String> map1 = new HashMap<>(staticMap1);
        {
            // put
            String put1 = map1.put(1, "one_updated");
            String put2 = map1.putIfAbsent(1, "one_absent");
            String put3 = map1.putIfAbsent(10, "ten");
            String put4 = map1.put(20, "twenty");
            String put5 = map1.put(20, "another_twenty");
        }
        {
            // get
            String get1 = map1.get(11);
            String get2 = map1.get(10);
            String get3 = map1.getOrDefault(11, "not found");
            String get4 = map1.getOrDefault(10, "not found");
        }
        {
            //remove
            String remove1 = map1.remove(1);
            String remove2 = map1.remove(11);
            boolean remove3 = map1.remove(2, "two");
            boolean remove4 = map1.remove(11, "eleven");
        }
        // reload
        Map<Integer, String> map2 = new HashMap<>(staticMap2);
        {
            // replace
            String replace1 = map2.replace(4, "new_four");
            String replace2 = map2.replace(11, "new_eleven");
            boolean replace3 = map2.replace(4, "new_four", "new_new_four");
            boolean replace4 = map2.replace(11, "new_eleven", "new_new_eleven");
            boolean b = 1 == 1;
        }
        {
            // containsKey
            boolean containsKey1 = map2.containsKey(4);
            boolean containsKey2 = map2.containsKey(11);
            boolean containsKey3 = map2.containsValue("one");
            boolean containsKey4 = map2.containsValue("eleven");
            boolean b = 1 == 1;
        }
        {
            // bulk Operations
            int size1 = map2.size();
            boolean isEmpty1 = map2.isEmpty();
            map2.clear();
            map2.putAll(staticMap2);
            map2.forEach((k, v) -> System.out.println("{ key = " + k + " | value = " + v + " }"));
            map2.replaceAll((k, v) -> (k % 2 == 0) ? v : v + "_updated");
            boolean b = 1 == 1;
        }
        {
            // collection view
            map2.clear();
            map2.putAll(staticMap2);
            Set<Integer> keySet1 = map2.keySet();
            Collection<String> values1 = map2.values();
            Set<Map.Entry<Integer, String>> entrySet1 = map2.entrySet();
            boolean b = 1 == 1;
        }
        {
            // Linked Hash Map
            Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
            linkedHashMap1.put(3, "three");
            linkedHashMap1.put(4, "four");
            linkedHashMap1.put(2, "two");
            linkedHashMap1.put(1, "one");
            System.out.println();
            linkedHashMap1.forEach((k, v) -> System.out.println("{ key = " + k + " | value = " + v + " }"));
            boolean b = 1 == 1;
        }
        {
            // Sorted Map
            SortedMap<Integer, String> sortedMap1 = new TreeMap<>(staticMap1);
            Integer firstKey = sortedMap1.firstKey();
            Integer lastKey = sortedMap1.lastKey();
            SortedMap<Integer, String> headMap = sortedMap1.headMap(3);
            SortedMap<Integer, String> tailMap = sortedMap1.tailMap(3);
            SortedMap<Integer, String> subMap = sortedMap1.subMap(2, 3);
            var comparator = sortedMap1.comparator();
            boolean b = 1 == 1;
        }
        {
            // Navigable Map
            NavigableMap<Integer, String> navigableMap1 = new TreeMap<>(staticMap1);

            Map.Entry<Integer, String> pollFirstEntry1 = navigableMap1.pollFirstEntry();
            Map.Entry<Integer, String> pollLastEntry1 = navigableMap1.pollLastEntry();

            Map.Entry<Integer, String> firstEntry1 = navigableMap1.firstEntry();
            Map.Entry<Integer, String> lastEntry1 = navigableMap1.lastEntry();

            navigableMap1.clear();
            navigableMap1.putAll(staticMap1);

            NavigableMap<Integer, String> headMap = navigableMap1.headMap(3, true);
            NavigableMap<Integer, String> tailMap = navigableMap1.tailMap(3, true);
            NavigableMap<Integer, String> subMap =
                    navigableMap1.subMap(2, true, 4, true);

            Map.Entry<Integer, String> ceilingEntry = navigableMap1.ceilingEntry(3);
            Integer ceilingKey = navigableMap1.ceilingKey(3);

            Map.Entry<Integer, String> floorEntry = navigableMap1.floorEntry(3);
            Integer floorKey = navigableMap1.floorKey(3);

            Map.Entry<Integer, String> higherEntry = navigableMap1.higherEntry(3);
            Integer higherKey = navigableMap1.higherKey(3);

            Map.Entry<Integer, String> lowerEntry = navigableMap1.lowerEntry(3);
            Integer lowerKey = navigableMap1.lowerKey(3);

            boolean b = 1 == 1;
        }
        {
            // views
            NavigableMap<Integer, String> navigableMap1 = new TreeMap<>(staticMap1);
            NavigableMap<Integer, String> descendingMap1 = navigableMap1.descendingMap();
            NavigableSet<Integer> descendingKeySet = navigableMap1.descendingKeySet();
            NavigableSet<Integer> navigableKeySet = navigableMap1.navigableKeySet();
            boolean b = 1 == 1;
        }
        {
            // advanced operations
            Map<Integer, String> map3 = new HashMap<>(staticMap1);
            map3.merge(4, "four_new", (o, n) -> n.toUpperCase());
            map3.merge(4, "four_new", (o, n) -> null);
            map3.merge(4, "four", (o, n) -> n.toUpperCase());
            Map<String, Integer> staticMap4 = Map.ofEntries(
                    Map.entry("one", 1),
                    Map.entry("two", 2),
                    Map.entry("three", 3),
                    Map.entry("four", 4)
            );
            Map<String, Integer> map4 = new HashMap<>(staticMap4);
            map4.merge("four", 4, Integer::sum);
            map4.merge("four", 4, (o, n) -> Integer.sum(o, n));

            map4.compute("no_key", (k, v) -> 42);
            map4.compute("no_key", (k, v) -> {
                System.out.println("{ key = " + k + " | value = " + v + " }");
                return 42;
            });

            map4.computeIfPresent("one", (k, v) -> ++v);
            map4.computeIfAbsent("no_key_2", (k) -> 42);

            boolean b = 1 == 1;
        }
        {
            // comparators
            SortedMap<Integer, String> sortedMap1 = new TreeMap<>((n1, n2) -> n1 - n2);
            NavigableMap<Integer, String> navigableMap1 = new TreeMap<>(Comparator.comparingInt(n -> n));
        }
    }

    private static void queueInterface() {
        Queue<Integer> queue1 = new LinkedList<>(List.of(3, 4, 6, 2, 7, 3, 7, 5));
        boolean add1 = queue1.add(10);
        Integer element1 = queue1.element(); // examine
        Integer element2 = queue1.remove();
        // special value methods
        boolean add2 = queue1.offer(42);
        Integer element3 = queue1.peek();
        Integer element4 = queue1.poll();

    }

    private static void priorityQueue() {
        {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(List.of(3, 4, 6, 2, 7, 3, 7, 5));
            ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(3, 4, 6, 2, 7, 3, 7, 5));
            Collections.sort(arrayList1);
            PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(List.of(3, 4, 6, 2, 7, 3, 7, 5));
            for (var element : priorityQueue1) {
                System.out.println(element);
            }
            System.out.println("---");
            priorityQueue1.forEach(System.out::println);
            System.out.println("---");
            Integer poll1;
            do {
                poll1 = priorityQueue1.poll();
                System.out.println(poll1);
            } while (poll1 != null);
        }
        {
            var staticList = List.of(3, 4, 6, 2, 7, 3, 7, 5);
            PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());
            priorityQueue1.addAll(staticList);
            System.out.println("---");
            Integer poll1;
            do {
                poll1 = priorityQueue1.poll();
                System.out.println(poll1);
            } while (poll1 != null);
        }
        {
            var nums = List.of(3, 4, 6, 2, 7, 3, 7, 5);
            Map<Integer, Integer> counts = new HashMap<>();
            for (int num : nums) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> counts.get(n1) - counts.get(n2));
        }
        {
            var nums = List.of(3, 4/*, 6, 2, 7, 3, 7, 5*/);
            PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2); // min heap
            for (int num : nums) {
                heap.offer(num);
            }
            while (!heap.isEmpty()) {
                System.out.println(heap.poll());
            }
        }
    }

    private static void stackClass() {
        {
            Stack<Integer> stack1 = new Stack<>();
            Integer push1 = stack1.push(10);
            Integer peek1 = stack1.peek();
            Integer pop1 = stack1.pop();
        }
        {
            Deque<Integer> stack2 = new ArrayDeque<>(); // faster
            //Deque<Integer> stack2 = new LinkedList<>();
            stack2.push(42);
            Integer peek2 = stack2.peek();
            Integer pop2 = stack2.pop();
        }
    }

    private static void dequeInterface() {
        var staticList = List.of(3, 4, 6, 2, 7, 3, 7, 5);
        Deque<Integer> deque1 = new ArrayDeque<>(staticList);
        Deque<Integer> d = new LinkedList<>();
        boolean offerFirst1 = deque1.offerFirst(10);
        boolean offerLast1 = deque1.offerLast(42);
        deque1.addFirst(11);
        deque1.addLast(43);
        deque1.push(100);
        // remove
        Integer removeFirst1 = deque1.removeFirst();
        Integer removeLast1 = deque1.removeLast();
        Integer pollFirst1 = deque1.pollFirst();
        Integer pollLast1 = deque1.pollLast();
        Integer pop1 = deque1.pop();
        boolean removeFirstOccurrence1 = deque1.removeFirstOccurrence(Integer.valueOf(7));
        boolean removeLastOccurrence1 = deque1.removeLastOccurrence(Integer.valueOf(3));
        // examine
        Integer getFirst1 = deque1.getFirst();
        Integer getLast1 = deque1.getLast();
        Integer peekFirst1 = deque1.peekFirst();
        Integer peekLast1 = deque1.peekLast();
        Integer peek1 = deque1.peek();
        var descendingIterator1 = deque1.descendingIterator();
    }

    private static void collectionsClass() {
        {
            // unmodifiable views
            var staticList = List.of(3, 4, 6, 2, 7, 3, 7, 5);
            ArrayList<Integer> arrayList1 = new ArrayList<>(staticList);
            List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList1);
            //boolean add1 = unmodifiableList.add(42); UnsupportedOperation exception
            Collections.sort(arrayList1, Comparator.reverseOrder());
            Collections.reverse(arrayList1);
            Collections.rotate(arrayList1, 2);
            Collections.shuffle(arrayList1);
            Collections.swap(arrayList1, 0, arrayList1.size() - 1);
            Collections.sort(arrayList1, Comparator.reverseOrder());
            int index1 = Collections.binarySearch(arrayList1, Integer.valueOf(5), Comparator.reverseOrder());
            int index2 = Collections.indexOfSubList(arrayList1, List.of(6, 5, 4));
            int index3 = Collections.lastIndexOfSubList(arrayList1, List.of(6, 5, 4));
            Collections.replaceAll(arrayList1, 7, 42);
            ArrayList<Integer> arrayList2 = new ArrayList<>(staticList);
            ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.stream(new Integer[arrayList2.size()]).toList());
            Collections.fill(arrayList3, 0);
            Collections.copy(arrayList3, arrayList2);
            ArrayList<Boolean> arrayList4 = new ArrayList<>(Collections.nCopies(10, Boolean.TRUE));
            Collections.fill(arrayList4, Boolean.TRUE);
            List<Integer> ummodifiable = Collections.nCopies(10, 42);
            boolean b = 1 == 1;
        }
        {
            var staticList = List.of(3, 4, 6, 2, 7, 3, 7, 5);
            Set<Integer> set1 = new HashSet<>(staticList);
            int min = Collections.min(set1);
            int max = Collections.max(set1);
            boolean b = 1 == 1;
        }
    }

    private static void arraysClass() {
        {
            var array1 = new int[]{3, 4, 6, 2, 7, 3, 7, 5};
            Arrays.sort(array1);
            var array2 = new int[]{3, 4, 6, 2, 7, 3, 7, 5};
            Arrays.sort(array2, 4, 7);
            var array3 = new Integer[]{3, 4, 6, 2, 7, 3, 7, 5};
            Arrays.sort(array3, Comparator.reverseOrder());
            int index1 = Arrays.binarySearch(array3, 5, Comparator.reverseOrder());
            boolean b = 1 == 1;
        }
        {
            var array1 = new int[]{3, 4, 6, 2, 7, 3, 7, 5};
            var array2 = new int[]{3, 4, 6, 2, 7, 3, 7, 5};
            boolean equals1 = Arrays.equals(array1, array2);
            int compare1 = Arrays.compare(array1, array2);
            var array3 = new int[]{3, 4, 8, 2, 7, 3, 7, 5};
            int index1 = Arrays.mismatch(array1, array3);
            boolean b = 1 == 1;
        }
        {
            var array1 = new Integer[]{3, 4, 6, 2, 7, 3, 7, 5};
            String string1 = Arrays.toString(array1);
            String string2 = Arrays.deepToString(array1);
            Arrays.fill(array1, 0, 3, 42);
            Arrays.setAll(array1, x -> x);
            boolean b = 1 == 1;
        }
    }
}