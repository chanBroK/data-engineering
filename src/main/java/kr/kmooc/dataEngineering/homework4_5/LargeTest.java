package kr.kmooc.dataEngineering.homework4_5;

import java.util.*;


public class LargeTest {
    public static void main(String[] args) {
        for (int j = 0; j < 10000; j++) {
            boolean isPass;
            List<Integer> arrayList = new ArrayList<Integer>();
            Random r = new Random();
            for (int i = 0; i < 1000; i++)
                arrayList.add(r.nextInt(1000));
            Set<Integer> testHashSet = new HashSet<Integer>();
            Set<Integer> yourHashSet = new MyHashSet<Integer>();
            isPass = true;
            for (Integer val : arrayList) {
                testHashSet.add(val);
                yourHashSet.add(val);
            }
            if (!testHashSet.equals(yourHashSet))
                isPass = false;
            if (!isPass) {
                System.out.println(testHashSet);
            }


            //size(),isEmpty() test
            isPass = testHashSet.size() == yourHashSet.size();
            if (!isPass) {
                System.out.println(testHashSet);
            }
            isPass = (testHashSet.size() == yourHashSet.size());
            if (!isPass) {
                System.out.println(testHashSet);
            }

            //remove() test
            isPass = true;
            for (int i = 0; i < 100; i++) {
                Integer removeNum = r.nextInt(1000);
                yourHashSet.remove(removeNum);
                testHashSet.remove(removeNum);
            }
            if (!testHashSet.equals(yourHashSet))
                isPass = false;
            if (!isPass) {
                System.out.println(testHashSet);
            }

            //contains() test
            isPass = true;
            for (int i = 0; i < 100; i++) {
                Integer randomNum = r.nextInt(1000);
                if (testHashSet.contains(randomNum) != yourHashSet.contains(randomNum)) {
                    isPass = false;
                    break;
                }
            }
            if (!isPass) {
                System.out.println(testHashSet);
            }


            //addAll() test
            isPass = true;
            try {
                Set<Integer> tmpSet = new HashSet<Integer>();
                tmpSet.addAll(testHashSet);
                tmpSet.addAll(yourHashSet);
                if (!tmpSet.equals(yourHashSet) && !tmpSet.equals(yourHashSet))
                    throw new Exception();
            } catch (Exception e) {
                isPass = false;
            }
            if (!isPass) {
                System.out.println(testHashSet);
            }

            //retainAll() test
            isPass = true;
            try {
                Set<Integer> tmpSet = new HashSet<Integer>();
                tmpSet.addAll(testHashSet);
                tmpSet.retainAll(yourHashSet);
                if (!tmpSet.equals(yourHashSet) && !tmpSet.equals(testHashSet))
                    throw new Exception();

            } catch (Exception e) {
                isPass = false;
            }
            if (!isPass) {
                System.out.println(testHashSet);
            }

            //iterator() test
            isPass = true;
            Iterator<Integer> setIterator = testHashSet.iterator();
            Iterator<Integer> yourIterator = yourHashSet.iterator();
            try {
                Set<Integer> testSet1 = new HashSet<>();
                Set<Integer> testSet2 = new HashSet<>();
                while (setIterator.hasNext())
                    testSet1.add(setIterator.next());
                while (yourIterator.hasNext())
                    testSet2.add(yourIterator.next());

                if (!testSet1.equals(testSet2))
                    throw new Exception();
            } catch (Exception e) {
                isPass = false;
            }
            if (!isPass) {
                System.out.println(testHashSet);
            }


            //removeAll() test
            isPass = true;
            try {
                Set<Integer> tmpSet = new HashSet<Integer>();
                tmpSet.addAll(testHashSet);
                tmpSet.removeAll(yourHashSet);

                if (tmpSet.size() != 0)
                    throw new Exception();

            } catch (Exception e) {
                isPass = false;

            }
            if (!isPass) {
                System.out.println(testHashSet);
            }

            //clear() test
            yourHashSet.clear();
            testHashSet.clear();
            isPass = yourHashSet.isEmpty() && testHashSet.isEmpty();
            if (!isPass) {
                System.out.println(testHashSet);
            }
        }
    }
}
