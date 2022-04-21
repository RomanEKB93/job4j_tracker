package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
        @Test
        public void whenHigherPriority() {
            var queue = new PriorityQueue();
            queue.put(new Task("low", 5));
            queue.put(new Task("urgent", 1));
            queue.put(new Task("middle", 3));
            var result = queue.take();
            assertThat(result.getDesc(), is("urgent"));
        }

    @Test
    public void whenPriority3() {
        var queue = new PriorityQueue();
        queue.put(new Task("priority3", 3));
        queue.put(new Task("priority5", 5));
        queue.put(new Task("priority2", 2));
        queue.put(new Task("priority1", 1));
        queue.put(new Task("priority4", 4));
        queue.take();
        queue.take();
        var result = queue.take();
        assertThat(result.getDesc(), is("priority3"));
    }
}