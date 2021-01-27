package ru.job4j.chess.firuges.black;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        assertThat(new BishopBlack(Cell.C1).position(), is(Cell.C1));
    }

    @Test
    public void testCopy() {
        assertThat(new BishopBlack(Cell.C1).copy(G5).position(), is(Cell.G5));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWay() {
        Cell[] cells = {D2, E3, F4, G5};
        assertThat(new BishopBlack(Cell.C1).way(G5), is(cells));
    }
}