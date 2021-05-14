<<<<<<< HEAD
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Homework10 {
    static List<String> NAMES = Arrays.asList("Artem", "Vasiliy", "Petr", "Alexandr", "Fedor", "Anastasiya", "Valentina", "Zahar");
    static String[] TESTING_ARRAY = {"1, 2, 0", "4, 5"};
    static Stream FIRST_TEST_STREAM = Stream.of(2, 5, 7, 9);
    static Stream SECOND_TEST_STREAM = Stream.of(11, 44, 23, 94, 75, 67, 32);
    static long SEAD = 23456987L;

    public static String ex1(List<String> list) {
        return list.stream()
                .filter(name -> list.indexOf(name) % 2 == 0)
                .map(name -> "" + (list.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.toList()).toString();
    }

    public static List<String> ex2(List<String> list) {
        return list.stream()
                .map(name -> name.toUpperCase())
                .sorted((nameA, nameB) -> Arrays.compare(nameB.toCharArray(), nameA.toCharArray()))
                .collect(Collectors.toList());

    }

    public static String ex3(String[] array) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(array).flatMap(entry -> Arrays.stream(entry.split(",\\s")))
                .map(Integer::valueOf)
                .sorted()
                .forEach(x -> builder.append(x).append(", "));
        return builder.substring(0, builder.length() - 2);
    }

    public static Stream<Long> ex4(long a, long c, long m, long sead) {
        return Stream.iterate(sead, n -> ((n * a + c) % m));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> toReturn = Stream.ofNullable(null);
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            toReturn = Stream.concat
                    (toReturn, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(ex1(NAMES));
        System.out.println(Arrays.toString(ex2(NAMES).toArray()));
        System.out.println(ex3(TESTING_ARRAY));
        Stream s = ex4(25214903917l, 11, (long) Math.pow(2, 24), SEAD);
        s.limit(12)
                .forEach(System.out::println);
        Stream t = zip(FIRST_TEST_STREAM, SECOND_TEST_STREAM);
        t.forEach(System.out::println);

    }

=======
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Homework10 {
    static List<String> NAMES = Arrays.asList("Artem", "Vasiliy", "Petr", "Alexandr", "Fedor", "Anastasiya", "Valentina", "Zahar");
    static String[] TESTING_ARRAY = {"1, 2, 0", "4, 5"};
    static Stream FIRST_TEST_STREAM = Stream.of(2, 5, 7, 9);
    static Stream SECOND_TEST_STREAM = Stream.of(11, 44, 23, 94, 75, 67, 32);
    static long SEAD = 23456987L;

    public static String ex1(List<String> list) {
        return list.stream()
                .filter(name -> list.indexOf(name) % 2 == 0)
                .map(name -> "" + (list.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.toList()).toString();
    }

    public static List<String> ex2(List<String> list) {
        return list.stream()
                .map(name -> name.toUpperCase())
                .sorted((nameA, nameB) -> Arrays.compare(nameB.toCharArray(), nameA.toCharArray()))
                .collect(Collectors.toList());

    }

    public static String ex3(String[] array) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(array).flatMap(entry -> Arrays.stream(entry.split(",\\s")))
                .map(Integer::valueOf)
                .sorted()
                .forEach(x -> builder.append(x).append(", "));
        return builder.substring(0, builder.length() - 2);
    }

    public static Stream<Long> ex4(long a, long c, long m, long sead) {
        return Stream.iterate(sead, n -> ((n * a + c) % m));
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> toReturn = Stream.ofNullable(null);
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            toReturn = Stream.concat
                    (toReturn, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(ex1(NAMES));
        System.out.println(Arrays.toString(ex2(NAMES).toArray()));
        System.out.println(ex3(TESTING_ARRAY));
        Stream s = ex4(25214903917l, 11, (long) Math.pow(2, 24), SEAD);
        s.limit(12)
                .forEach(System.out::println);
        Stream t = zip(FIRST_TEST_STREAM, SECOND_TEST_STREAM);
        t.forEach(System.out::println);

    }

>>>>>>> 314d45bb8b5998f06a4e159fe11715bcf501ad50
}