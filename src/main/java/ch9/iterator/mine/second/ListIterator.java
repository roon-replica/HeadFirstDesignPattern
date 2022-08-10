package ch9.iterator.mine.second;

import ch9.iterator.domain.MenuItem;
import ch9.iterator.domain.MenuList;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListIterator implements MenuIterator {
    private final MenuList menuList;
    private int nowIndex;

    @Override
    public boolean hasNext() {
        return nowIndex < menuList.getMenuItems().size();
    }

    @Override
    public MenuItem getNext() {
        return menuList.getMenuItems().get(nowIndex++);
    }
}
