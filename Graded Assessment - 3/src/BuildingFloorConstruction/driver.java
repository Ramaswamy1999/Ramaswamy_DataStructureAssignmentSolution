package BuildingFloorConstruction;

import java.util.*;

public class driver {

	public static void main(String[] args) {
		System.out.println("------------Welcome to Building construction scheduling----------------\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of floors in the building: ");
		int floorsCount = scanner.nextInt();
		int[] floors = new int[floorsCount];
		for (int i = 0; i < floorsCount; i++) {
			System.out.println("Enter the floor number for day : " + (i + 1));
			floors[i] = scanner.nextInt();
		}
		// This list maintains the floors that will be assembled together
		List<Integer> floorsToAssemble = new ArrayList<>();
		System.out.println("The Order of Construction is as follows - ");
		System.out.println();
		for (int i = 0; i < floorsCount; i++) {
			int floor = floors[i];
			floorsToAssemble.add(floor);
			System.out.println("Day: " + (i + 1));
			if (!service.largerFloor(floors, i + 1, floor)) {
				// Print sorted floors in reverse order
				floorsToAssemble.stream().sorted(Collections.reverseOrder()).forEach(f -> System.out.print(f + " "));
				floorsToAssemble.clear();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------Thank You----------------");
		scanner.close();
	}

}
