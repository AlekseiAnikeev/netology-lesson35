package ru.agentche;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 23.10.2022
 */
public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min - 1;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return new Random().nextInt(min, max);
            }
        };
    }
}