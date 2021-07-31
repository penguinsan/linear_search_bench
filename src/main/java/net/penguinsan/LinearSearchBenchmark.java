package net.penguinsan;

import org.openjdk.jmh.annotations.*;

import java.security.SecureRandom;
import java.util.*;

@State(Scope.Thread)
public class LinearSearchBenchmark {

    private List<Integer> list, list3, list100, list200, list300, list400, list500, list1000;
    private Set<Integer> hash, hash3, hash100, hash200, hash300, hash400, hash500, hash1000;
    private Random random;

    @Setup(Level.Trial)
    public void setup() {
        list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        hash = new HashSet<>(list);
        list3 = list.subList(0, 3);
        list100 = list.subList(0, 100);
        list200 = list.subList(0, 200);
        list300 = list.subList(0, 300);
        list400 = list.subList(0, 400);
        list500 = list.subList(0, 500);
        list1000 = list.subList(0, 1000);
        hash3 = new HashSet<>(list3);
        hash100 = new HashSet<>(list100);
        hash200 = new HashSet<>(list200);
        hash300 = new HashSet<>(list300);
        hash400 = new HashSet<>(list400);
        hash500 = new HashSet<>(list500);
        hash1000 = new HashSet<>(list1000);
        random = new SecureRandom();
    }

    @Benchmark
    public void list10000byRandom() {
        list.contains(random.nextInt(10000));
    }

    @Benchmark
    public void hash10000byRandom() {
        hash.contains(random.nextInt(10000));
    }

    @Benchmark
    public void list3byRandom() {
        list3.contains(random.nextInt(3));
    }

    @Benchmark
    public void hash3byRandom() {
        hash3.contains(random.nextInt(3));
    }

    @Benchmark
    public void list100byRandom() {
        list100.contains(random.nextInt(100));
    }

    @Benchmark
    public void hash100byRandom() {
        hash100.contains(random.nextInt(100));
    }

    @Benchmark
    public void list200byRandom() {
        list200.contains(random.nextInt(200));
    }

    @Benchmark
    public void hash200byRandom() {
        hash200.contains(random.nextInt(200));
    }

    @Benchmark
    public void list300byRandom() {
        list300.contains(random.nextInt(300));
    }

    @Benchmark
    public void hash300byRandom() {
        hash300.contains(random.nextInt(300));
    }

    @Benchmark
    public void list400byRandom() {
        list400.contains(random.nextInt(400));
    }

    @Benchmark
    public void hash400byRandom() {
        hash400.contains(random.nextInt(400));
    }

    @Benchmark
    public void list500byRandom() {
        list500.contains(random.nextInt(500));
    }

    @Benchmark
    public void hash500byRandom() {
        hash500.contains(random.nextInt(500));
    }

    @Benchmark
    public void list1000byRandom() {
        list1000.contains(random.nextInt(1000));
    }

    @Benchmark
    public void hash1000byRandom() {
        hash1000.contains(random.nextInt(1000));
    }
}
