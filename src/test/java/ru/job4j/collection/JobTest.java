package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorByNameAscending() {
        Comparator<Job> cmp = new JobAscByName();
        int rsl = cmp.compare(new Job("cut", 2),
                              new Job("sweep", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameDescending() {
        Comparator<Job> cmp = new JobDescByName();
        int rsl = cmp.compare(new Job("cut", 2),
                              new Job("sweep", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityAscending() {
        Comparator<Job> cmp = new JobAscByPriority();
        int rsl = cmp.compare(new Job("wash", 5),
                              new Job("dry", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityDescending() {
        Comparator<Job> cmp = new JobDescByPriority();
        int rsl = cmp.compare(new Job("wash", 5),
                              new Job("dry", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByDescNameAndAscPrority() {
        Comparator<Job> cmp = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmp.compare(
                new Job("wash", 1),
                new Job("wash", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAscPriorityAndDescName() {
        Comparator<Job> cmp = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmp.compare(
                new Job("wash", 1),
                new Job("dry", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAscNameAndDescPriority() {
        Comparator<Job> cmp = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmp.compare(
                new Job("dry", 1),
                new Job("dry", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAscNameAndAscPriority() {
        Comparator<Job> cmp = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmp.compare(
                new Job("dry", 1),
                new Job("wash", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}