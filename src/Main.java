import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int r1 = random.nextInt(1, 9);
        System.out.println("container 1 size " + r1);

        Container container1 = new Container();
        for (int i = 0; i < r1; i++) {
            container1.addBoxes(new Container.Box());
        }


//        for (Container.Box next : container1) {
//            System.out.printf("%s", next);
//        }


        int r2 = random.nextInt(1, 9);
        System.out.println("container 2 size " + r2);
        Container container2 = new Container();
        for (int i = 0; i < r2; i++) {
            container2.addBoxes(new Container.Box());
        }

        Container.ContainerCountComparator comparatorSize = new Container.ContainerCountComparator();
        System.out.println("container1 > container2 по количеству коробок на " + comparatorSize.compare(container1, container2));

        System.out.println();
        System.out.println("Вес container1 = " + Container.getWeight(container1));
        System.out.println("Вес container2 = " + Container.getWeight(container2));

        System.out.println("container1 > container2 по весу на " + container1.compareTo(container2));

//        Container.ContainerWeightComparator comparatorWeight = new Container.ContainerWeightComparator();
//        System.out.println(comparatorWeight.compare(container1,container2));
//    }
    }
}