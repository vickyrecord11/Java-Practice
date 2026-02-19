public class PetrolSimulation {

    public static void main(String[] args) {

        int petrol = 2;

        String[] bunks = {"A", "B", "C"};
        int[] distance = {1, 5, 3};
        int[] capacity = {6, 4, 2};

        for (int i = 0; i < bunks.length; i++) {

            petrol = petrol - distance[i];

            if (petrol < 0) {
                System.out.println("Cannot travel further. Out of petrol!");
                return;
            }

            petrol = petrol + capacity[i];
        }

        System.out.println("Remaining petrol in car is " + petrol + " liters");
    }
}

