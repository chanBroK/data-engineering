package kr.kmooc.dataEngineering.homework4_5;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSetIterator<E> implements Iterator<E> {

    private final LinkedList<E>[] hashTable;
    private int listIdx;
    private int tableIdx;

    public MyHashSetIterator(LinkedList<E>[] hashTable) {
        this.hashTable = hashTable;
        tableIdx = 0;
        listIdx = 0;
        while (true) {
            // tableIndex에 해당하는 LinkedList가 있는지 볼 것
            try {
                LinkedList<E> list = hashTable[tableIdx];
            } catch (Exception e) {
                tableIdx = -1;
                break;
            }

            try {
                hashTable[tableIdx].get(listIdx);
                break;
            } catch (Exception e) {
                tableIdx++;
                listIdx = 0;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return tableIdx != -1;
    }

    @Override
    public E next() {
        // 현재 tableIndex, listIndex에 해당하는 E를 얻고
        E item = hashTable[tableIdx].get(listIdx++);
        // null 이면 반환하며,
        if (item == null)
            return null;
        // null이 아니라면, 다음으로 tableIndex, listIndex를 이동시킬 예정
        // 더이상 요소가 없을 경우, tableIndex = -1;
        while (true) {
            // tableIndex에 해당하는 LinkedList가 있는지 볼 것
            try {
                LinkedList<E> list = hashTable[tableIdx];
            } catch (Exception e) {
                tableIdx = -1;
                break;
            }

            try {
                hashTable[tableIdx].get(listIdx);
                break;
            } catch (Exception e) {
                tableIdx++;
                listIdx = 0;
            }
        }
        return item;
    }
}
