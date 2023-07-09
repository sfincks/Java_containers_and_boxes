import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Container implements Iterable<Container.Box>, Comparable<Container> {

    private List<Box> boxes = new ArrayList<>();
    public void addBoxes(Box box){
        boxes.add(box);
    }

    public static int getWeight(Container boxes) {
        int weightSum = 0;
        for (Box box:boxes) {
            weightSum += box.weight;
        }
        return weightSum;
//        for (int i = 0; i < boxes.size(); i++) {
//
//        }
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    @Override
    public int compareTo(Container o) {
        return getWeight(this) - getWeight(o);
    }

//    public static class ContainerWeightComparator implements Comparator<Container>{
//
//        @Override
//        public int compare(Container o1, Container o2) {
//            return getWeight(o1) - getWeight(o2);
//        }
//    }

    public static class ContainerCountComparator implements Comparator<Container>{

        @Override
        public int compare(Container o1, Container o2) {
            return o1.boxes.size() - o2.boxes.size();
        }
    }


    public static class Box  {

        int weight = ThreadLocalRandom.current().nextInt(1,9);

        @Override
        public String toString() {
            return "[" + weight +']';
        }

        //        Random random = new Random();
//
//        private int weight; //= random.nextInt(1, 10);
//        public int boxes; //= random.nextInt(3, 9);
//
//        public Box(int weight) {
//            this.weight = weight;
//        }
//
//        public int getWeight() {
//            return weight;
//        }
//
//        @Override
//        public int compareTo(Box o) {
//            return weight - o.weight;
//        }
//
//        public int getBoxes() {
//            return boxes;
//        }

    }
}
