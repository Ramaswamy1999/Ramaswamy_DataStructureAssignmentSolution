package BuildingFloorConstruction;

public class service {
	static boolean largerFloor(int[] floors, int start, int floor) {
		boolean result = false;
		for (int i = start; i < floors.length; i++) {
			if (floors[i] > floor) {
				result = true;
				break;
			}
		}
		return result;
	}
}
