package ch9.iterator.mine.second;

import ch9.iterator.domain.MenuArray;
import ch9.iterator.domain.MenuItem;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArrayIterator implements MenuIterator{
    private final MenuArray menuArray;
    private int nowIndex;

    @Override
    public boolean hasNext() {
        return nowIndex < menuArray.getItemCount();
    }

    @Override
    public MenuItem getNext() {
        return menuArray.getMenuItems()[nowIndex++];
    }
}
