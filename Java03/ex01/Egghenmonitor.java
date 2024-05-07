public class Egghenmonitor {
	private boolean eggTurn = true;

		synchronized void printEgg() {
			try {
				while (!eggTurn) {
					wait();
				}
				System.out.println("Egg");
				eggTurn = false;
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		synchronized void printHen() {
			try {
				while (eggTurn) {
					wait();
				}
				System.out.println("Hen");
				eggTurn = true;
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
